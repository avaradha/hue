/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * Representation of a file block in HDFS
 * 
 * Modelled after org.apache.hadoop.hdfs.protocol.LocatedBlock
 */
public class Block implements TBase<Block, Block._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Block");

  private static final TField BLOCK_ID_FIELD_DESC = new TField("blockId", TType.I64, (short)1);
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRING, (short)2);
  private static final TField NUM_BYTES_FIELD_DESC = new TField("numBytes", TType.I64, (short)3);
  private static final TField GEN_STAMP_FIELD_DESC = new TField("genStamp", TType.I64, (short)4);
  private static final TField NODES_FIELD_DESC = new TField("nodes", TType.LIST, (short)5);
  private static final TField START_OFFSET_FIELD_DESC = new TField("startOffset", TType.I64, (short)6);
  private static final TField TOKEN_FIELD_DESC = new TField("token", TType.STRING, (short)7);

  /**
   * Block ID (unique among all blocks in a filesystem).
   */
  public long blockId;
  /**
   * Path of the file which this block belongs to.
   */
  public String path;
  /**
   * Length of this block.
   */
  public long numBytes;
  /**
   * Generational stamp of this block.
   */
  public long genStamp;
  /**
   * List of data nodes with copies  of this block.
   */
  public List<DatanodeInfo> nodes;
  /**
   * Offset of the first byte of the block relative to the start of the file
   */
  public long startOffset;
  /**
   * The serialized token associated with this block.
   */
  public String token;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * Block ID (unique among all blocks in a filesystem).
     */
    BLOCK_ID((short)1, "blockId"),
    /**
     * Path of the file which this block belongs to.
     */
    PATH((short)2, "path"),
    /**
     * Length of this block.
     */
    NUM_BYTES((short)3, "numBytes"),
    /**
     * Generational stamp of this block.
     */
    GEN_STAMP((short)4, "genStamp"),
    /**
     * List of data nodes with copies  of this block.
     */
    NODES((short)5, "nodes"),
    /**
     * Offset of the first byte of the block relative to the start of the file
     */
    START_OFFSET((short)6, "startOffset"),
    /**
     * The serialized token associated with this block.
     */
    TOKEN((short)7, "token");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BLOCK_ID
          return BLOCK_ID;
        case 2: // PATH
          return PATH;
        case 3: // NUM_BYTES
          return NUM_BYTES;
        case 4: // GEN_STAMP
          return GEN_STAMP;
        case 5: // NODES
          return NODES;
        case 6: // START_OFFSET
          return START_OFFSET;
        case 7: // TOKEN
          return TOKEN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BLOCKID_ISSET_ID = 0;
  private static final int __NUMBYTES_ISSET_ID = 1;
  private static final int __GENSTAMP_ISSET_ID = 2;
  private static final int __STARTOFFSET_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLOCK_ID, new FieldMetaData("blockId", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NUM_BYTES, new FieldMetaData("numBytes", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.GEN_STAMP, new FieldMetaData("genStamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.NODES, new FieldMetaData("nodes", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, DatanodeInfo.class))));
    tmpMap.put(_Fields.START_OFFSET, new FieldMetaData("startOffset", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.TOKEN, new FieldMetaData("token", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Block.class, metaDataMap);
  }

  public Block() {
  }

  public Block(
    long blockId,
    String path,
    long numBytes,
    long genStamp,
    List<DatanodeInfo> nodes,
    long startOffset,
    String token)
  {
    this();
    this.blockId = blockId;
    setBlockIdIsSet(true);
    this.path = path;
    this.numBytes = numBytes;
    setNumBytesIsSet(true);
    this.genStamp = genStamp;
    setGenStampIsSet(true);
    this.nodes = nodes;
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    this.token = token;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Block(Block other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.blockId = other.blockId;
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.numBytes = other.numBytes;
    this.genStamp = other.genStamp;
    if (other.isSetNodes()) {
      List<DatanodeInfo> __this__nodes = new ArrayList<DatanodeInfo>();
      for (DatanodeInfo other_element : other.nodes) {
        __this__nodes.add(new DatanodeInfo(other_element));
      }
      this.nodes = __this__nodes;
    }
    this.startOffset = other.startOffset;
    if (other.isSetToken()) {
      this.token = other.token;
    }
  }

  public Block deepCopy() {
    return new Block(this);
  }

  @Override
  public void clear() {
    setBlockIdIsSet(false);
    this.blockId = 0;
    this.path = null;
    setNumBytesIsSet(false);
    this.numBytes = 0;
    setGenStampIsSet(false);
    this.genStamp = 0;
    this.nodes = null;
    setStartOffsetIsSet(false);
    this.startOffset = 0;
    this.token = null;
  }

  /**
   * Block ID (unique among all blocks in a filesystem).
   */
  public long getBlockId() {
    return this.blockId;
  }

  /**
   * Block ID (unique among all blocks in a filesystem).
   */
  public Block setBlockId(long blockId) {
    this.blockId = blockId;
    setBlockIdIsSet(true);
    return this;
  }

  public void unsetBlockId() {
    __isset_bit_vector.clear(__BLOCKID_ISSET_ID);
  }

  /** Returns true if field blockId is set (has been asigned a value) and false otherwise */
  public boolean isSetBlockId() {
    return __isset_bit_vector.get(__BLOCKID_ISSET_ID);
  }

  public void setBlockIdIsSet(boolean value) {
    __isset_bit_vector.set(__BLOCKID_ISSET_ID, value);
  }

  /**
   * Path of the file which this block belongs to.
   */
  public String getPath() {
    return this.path;
  }

  /**
   * Path of the file which this block belongs to.
   */
  public Block setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been asigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  /**
   * Length of this block.
   */
  public long getNumBytes() {
    return this.numBytes;
  }

  /**
   * Length of this block.
   */
  public Block setNumBytes(long numBytes) {
    this.numBytes = numBytes;
    setNumBytesIsSet(true);
    return this;
  }

  public void unsetNumBytes() {
    __isset_bit_vector.clear(__NUMBYTES_ISSET_ID);
  }

  /** Returns true if field numBytes is set (has been asigned a value) and false otherwise */
  public boolean isSetNumBytes() {
    return __isset_bit_vector.get(__NUMBYTES_ISSET_ID);
  }

  public void setNumBytesIsSet(boolean value) {
    __isset_bit_vector.set(__NUMBYTES_ISSET_ID, value);
  }

  /**
   * Generational stamp of this block.
   */
  public long getGenStamp() {
    return this.genStamp;
  }

  /**
   * Generational stamp of this block.
   */
  public Block setGenStamp(long genStamp) {
    this.genStamp = genStamp;
    setGenStampIsSet(true);
    return this;
  }

  public void unsetGenStamp() {
    __isset_bit_vector.clear(__GENSTAMP_ISSET_ID);
  }

  /** Returns true if field genStamp is set (has been asigned a value) and false otherwise */
  public boolean isSetGenStamp() {
    return __isset_bit_vector.get(__GENSTAMP_ISSET_ID);
  }

  public void setGenStampIsSet(boolean value) {
    __isset_bit_vector.set(__GENSTAMP_ISSET_ID, value);
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  public java.util.Iterator<DatanodeInfo> getNodesIterator() {
    return (this.nodes == null) ? null : this.nodes.iterator();
  }

  public void addToNodes(DatanodeInfo elem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<DatanodeInfo>();
    }
    this.nodes.add(elem);
  }

  /**
   * List of data nodes with copies  of this block.
   */
  public List<DatanodeInfo> getNodes() {
    return this.nodes;
  }

  /**
   * List of data nodes with copies  of this block.
   */
  public Block setNodes(List<DatanodeInfo> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been asigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  /**
   * Offset of the first byte of the block relative to the start of the file
   */
  public long getStartOffset() {
    return this.startOffset;
  }

  /**
   * Offset of the first byte of the block relative to the start of the file
   */
  public Block setStartOffset(long startOffset) {
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    return this;
  }

  public void unsetStartOffset() {
    __isset_bit_vector.clear(__STARTOFFSET_ISSET_ID);
  }

  /** Returns true if field startOffset is set (has been asigned a value) and false otherwise */
  public boolean isSetStartOffset() {
    return __isset_bit_vector.get(__STARTOFFSET_ISSET_ID);
  }

  public void setStartOffsetIsSet(boolean value) {
    __isset_bit_vector.set(__STARTOFFSET_ISSET_ID, value);
  }

  /**
   * The serialized token associated with this block.
   */
  public String getToken() {
    return this.token;
  }

  /**
   * The serialized token associated with this block.
   */
  public Block setToken(String token) {
    this.token = token;
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been asigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLOCK_ID:
      if (value == null) {
        unsetBlockId();
      } else {
        setBlockId((Long)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case NUM_BYTES:
      if (value == null) {
        unsetNumBytes();
      } else {
        setNumBytes((Long)value);
      }
      break;

    case GEN_STAMP:
      if (value == null) {
        unsetGenStamp();
      } else {
        setGenStamp((Long)value);
      }
      break;

    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((List<DatanodeInfo>)value);
      }
      break;

    case START_OFFSET:
      if (value == null) {
        unsetStartOffset();
      } else {
        setStartOffset((Long)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLOCK_ID:
      return new Long(getBlockId());

    case PATH:
      return getPath();

    case NUM_BYTES:
      return new Long(getNumBytes());

    case GEN_STAMP:
      return new Long(getGenStamp());

    case NODES:
      return getNodes();

    case START_OFFSET:
      return new Long(getStartOffset());

    case TOKEN:
      return getToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLOCK_ID:
      return isSetBlockId();
    case PATH:
      return isSetPath();
    case NUM_BYTES:
      return isSetNumBytes();
    case GEN_STAMP:
      return isSetGenStamp();
    case NODES:
      return isSetNodes();
    case START_OFFSET:
      return isSetStartOffset();
    case TOKEN:
      return isSetToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Block)
      return this.equals((Block)that);
    return false;
  }

  public boolean equals(Block that) {
    if (that == null)
      return false;

    boolean this_present_blockId = true;
    boolean that_present_blockId = true;
    if (this_present_blockId || that_present_blockId) {
      if (!(this_present_blockId && that_present_blockId))
        return false;
      if (this.blockId != that.blockId)
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_numBytes = true;
    boolean that_present_numBytes = true;
    if (this_present_numBytes || that_present_numBytes) {
      if (!(this_present_numBytes && that_present_numBytes))
        return false;
      if (this.numBytes != that.numBytes)
        return false;
    }

    boolean this_present_genStamp = true;
    boolean that_present_genStamp = true;
    if (this_present_genStamp || that_present_genStamp) {
      if (!(this_present_genStamp && that_present_genStamp))
        return false;
      if (this.genStamp != that.genStamp)
        return false;
    }

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    boolean this_present_startOffset = true;
    boolean that_present_startOffset = true;
    if (this_present_startOffset || that_present_startOffset) {
      if (!(this_present_startOffset && that_present_startOffset))
        return false;
      if (this.startOffset != that.startOffset)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Block other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Block typedOther = (Block)other;

    lastComparison = Boolean.valueOf(isSetBlockId()).compareTo(typedOther.isSetBlockId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockId()) {
      lastComparison = TBaseHelper.compareTo(this.blockId, typedOther.blockId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(typedOther.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = TBaseHelper.compareTo(this.path, typedOther.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumBytes()).compareTo(typedOther.isSetNumBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumBytes()) {
      lastComparison = TBaseHelper.compareTo(this.numBytes, typedOther.numBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGenStamp()).compareTo(typedOther.isSetGenStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGenStamp()) {
      lastComparison = TBaseHelper.compareTo(this.genStamp, typedOther.genStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(typedOther.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = TBaseHelper.compareTo(this.nodes, typedOther.nodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartOffset()).compareTo(typedOther.isSetStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartOffset()) {
      lastComparison = TBaseHelper.compareTo(this.startOffset, typedOther.startOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToken()).compareTo(typedOther.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = TBaseHelper.compareTo(this.token, typedOther.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // BLOCK_ID
          if (field.type == TType.I64) {
            this.blockId = iprot.readI64();
            setBlockIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PATH
          if (field.type == TType.STRING) {
            this.path = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NUM_BYTES
          if (field.type == TType.I64) {
            this.numBytes = iprot.readI64();
            setNumBytesIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // GEN_STAMP
          if (field.type == TType.I64) {
            this.genStamp = iprot.readI64();
            setGenStampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // NODES
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.nodes = new ArrayList<DatanodeInfo>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                DatanodeInfo _elem2;
                _elem2 = new DatanodeInfo();
                _elem2.read(iprot);
                this.nodes.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // START_OFFSET
          if (field.type == TType.I64) {
            this.startOffset = iprot.readI64();
            setStartOffsetIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // TOKEN
          if (field.type == TType.STRING) {
            this.token = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(BLOCK_ID_FIELD_DESC);
    oprot.writeI64(this.blockId);
    oprot.writeFieldEnd();
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NUM_BYTES_FIELD_DESC);
    oprot.writeI64(this.numBytes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GEN_STAMP_FIELD_DESC);
    oprot.writeI64(this.genStamp);
    oprot.writeFieldEnd();
    if (this.nodes != null) {
      oprot.writeFieldBegin(NODES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.nodes.size()));
        for (DatanodeInfo _iter3 : this.nodes)
        {
          _iter3.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(START_OFFSET_FIELD_DESC);
    oprot.writeI64(this.startOffset);
    oprot.writeFieldEnd();
    if (this.token != null) {
      oprot.writeFieldBegin(TOKEN_FIELD_DESC);
      oprot.writeString(this.token);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Block(");
    boolean first = true;

    sb.append("blockId:");
    sb.append(this.blockId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("numBytes:");
    sb.append(this.numBytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("genStamp:");
    sb.append(this.genStamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodes:");
    if (this.nodes == null) {
      sb.append("null");
    } else {
      sb.append(this.nodes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startOffset:");
    sb.append(this.startOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      sb.append(this.token);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

