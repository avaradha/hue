#!/bin/bash

set -e
set -x

BINDIR=$(dirname $(readlink -f $0))
ROOT=${BINDIR%/*/*/*}
BUILD_LOG=/var/log/hue-build.log

BASEOS="ubuntu1604"
BASEIMAGE="${BASEOS}:base"
DOCKER_REGISTRY=${DOCKER_REGISTRY:-"docker-registry.infra.cloudera.com/huecontainer"}
BASEDOCKER=${DOCKER_REGISTRY}/${BASEIMAGE}

docker pull $BASEDOCKER 1>$BUILD_LOG 2>&1

WEBAPP_DIR=$BINDIR/container-build/webapp
HUE_LOCAL_SRC=$ROOT/hue
HUE_DOCKER_SRC=/hue
HUE_BUILD_DIR=$WEBAPP_DIR/hue-build
HUE_DOCKER_DEPLOY_DIR=/opt
mkdir -p $HUE_BUILD_DIR

docker pull $BASEDOCKER
docker tag $BASEDOCKER $BASEIMAGE

cd $WEBAPP_DIR

docker run -it -v $HUE_LOCAL_SRC:$HUE_DOCKER_SRC -v $HUE_BUILD_DIR:$HUE_DOCKER_DEPLOY_DIR $BASEDOCKER bash -c "cd /hue; PREFIX=$HUE_DOCKER_DEPLOY_DIR make install"
docker run -it -v $HUE_LOCAL_SRC:$HUE_DOCKER_SRC -v $HUE_BUILD_DIR:$HUE_DOCKER_DEPLOY_DIR $BASEDOCKER bash -c "cd $HUE_DOCKER_DEPLOY_DIR/hue; $HUE_DOCKER_DEPLOY_DIR/hue/build/env/bin/hue collectstatic --noinput"
docker run -it -v $HUE_LOCAL_SRC:$HUE_DOCKER_SRC -v $HUE_BUILD_DIR:$HUE_DOCKER_DEPLOY_DIR $BASEDOCKER bash -c "cd $HUE_DOCKER_DEPLOY_DIR/hue; $HUE_DOCKER_DEPLOY_DIR/hue/build/env/bin/pip install psycopg2-binary"


cd $WEBAPP_DIR
mkdir -p hue-conf 
cp -a $HUE_LOCAL_SRC/desktop/conf.dist/* hue-conf
GBN=$(curl http://gbn.infra.cloudera.com/)
WEBAPPIMAGE="webapp:$GBN"
docker tag $DOCKER_REGISTRY/$BASEIMAGE $BASEIMAGE
docker build -f $WEBAPP_DIR/Dockerfile -t $WEBAPPIMAGE .
docker tag $WEBAPPIMAGE $DOCKER_REGISTRY/$WEBAPPIMAGE 
docker push $DOCKER_REGISTRY/$WEBAPPIMAGE
