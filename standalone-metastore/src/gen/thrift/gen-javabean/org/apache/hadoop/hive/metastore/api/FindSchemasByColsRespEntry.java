/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class FindSchemasByColsRespEntry implements org.apache.thrift.TBase<FindSchemasByColsRespEntry, FindSchemasByColsRespEntry._Fields>, java.io.Serializable, Cloneable, Comparable<FindSchemasByColsRespEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FindSchemasByColsRespEntry");

  private static final org.apache.thrift.protocol.TField SCHEMA_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("schemaName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FindSchemasByColsRespEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FindSchemasByColsRespEntryTupleSchemeFactory());
  }

  private String schemaName; // required
  private int version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEMA_NAME((short)1, "schemaName"),
    VERSION((short)2, "version");

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
        case 1: // SCHEMA_NAME
          return SCHEMA_NAME;
        case 2: // VERSION
          return VERSION;
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
  private static final int __VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEMA_NAME, new org.apache.thrift.meta_data.FieldMetaData("schemaName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FindSchemasByColsRespEntry.class, metaDataMap);
  }

  public FindSchemasByColsRespEntry() {
  }

  public FindSchemasByColsRespEntry(
    String schemaName,
    int version)
  {
    this();
    this.schemaName = schemaName;
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FindSchemasByColsRespEntry(FindSchemasByColsRespEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSchemaName()) {
      this.schemaName = other.schemaName;
    }
    this.version = other.version;
  }

  public FindSchemasByColsRespEntry deepCopy() {
    return new FindSchemasByColsRespEntry(this);
  }

  @Override
  public void clear() {
    this.schemaName = null;
    setVersionIsSet(false);
    this.version = 0;
  }

  public String getSchemaName() {
    return this.schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public void unsetSchemaName() {
    this.schemaName = null;
  }

  /** Returns true if field schemaName is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaName() {
    return this.schemaName != null;
  }

  public void setSchemaNameIsSet(boolean value) {
    if (!value) {
      this.schemaName = null;
    }
  }

  public int getVersion() {
    return this.version;
  }

  public void setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEMA_NAME:
      if (value == null) {
        unsetSchemaName();
      } else {
        setSchemaName((String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA_NAME:
      return getSchemaName();

    case VERSION:
      return getVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEMA_NAME:
      return isSetSchemaName();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FindSchemasByColsRespEntry)
      return this.equals((FindSchemasByColsRespEntry)that);
    return false;
  }

  public boolean equals(FindSchemasByColsRespEntry that) {
    if (that == null)
      return false;

    boolean this_present_schemaName = true && this.isSetSchemaName();
    boolean that_present_schemaName = true && that.isSetSchemaName();
    if (this_present_schemaName || that_present_schemaName) {
      if (!(this_present_schemaName && that_present_schemaName))
        return false;
      if (!this.schemaName.equals(that.schemaName))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_schemaName = true && (isSetSchemaName());
    list.add(present_schemaName);
    if (present_schemaName)
      list.add(schemaName);

    boolean present_version = true;
    list.add(present_version);
    if (present_version)
      list.add(version);

    return list.hashCode();
  }

  @Override
  public int compareTo(FindSchemasByColsRespEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSchemaName()).compareTo(other.isSetSchemaName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schemaName, other.schemaName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FindSchemasByColsRespEntry(");
    boolean first = true;

    sb.append("schemaName:");
    if (this.schemaName == null) {
      sb.append("null");
    } else {
      sb.append(this.schemaName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FindSchemasByColsRespEntryStandardSchemeFactory implements SchemeFactory {
    public FindSchemasByColsRespEntryStandardScheme getScheme() {
      return new FindSchemasByColsRespEntryStandardScheme();
    }
  }

  private static class FindSchemasByColsRespEntryStandardScheme extends StandardScheme<FindSchemasByColsRespEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FindSchemasByColsRespEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.schemaName = iprot.readString();
              struct.setSchemaNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FindSchemasByColsRespEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schemaName != null) {
        oprot.writeFieldBegin(SCHEMA_NAME_FIELD_DESC);
        oprot.writeString(struct.schemaName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FindSchemasByColsRespEntryTupleSchemeFactory implements SchemeFactory {
    public FindSchemasByColsRespEntryTupleScheme getScheme() {
      return new FindSchemasByColsRespEntryTupleScheme();
    }
  }

  private static class FindSchemasByColsRespEntryTupleScheme extends TupleScheme<FindSchemasByColsRespEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FindSchemasByColsRespEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSchemaName()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSchemaName()) {
        oprot.writeString(struct.schemaName);
      }
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FindSchemasByColsRespEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.schemaName = iprot.readString();
        struct.setSchemaNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
    }
  }

}

