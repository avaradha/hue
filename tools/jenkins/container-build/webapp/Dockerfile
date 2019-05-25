FROM ubuntu1604:base

LABEL description="Hue Project https://github.com/cloudera/hue"

COPY hue-build/hue /opt/hue
RUN mkdir -p /etc/hue/conf

ENV HUE_CONF_DIR /etc/hue/conf
COPY conf /opt/hue/desktop/conf

COPY startup.sh /opt/hue

EXPOSE 8888
CMD ["/opt/hue/startup.sh"]
