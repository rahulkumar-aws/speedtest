/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package api.thrift;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-18")
public class JResults implements org.apache.thrift.TBase<JResults, JResults._Fields>, java.io.Serializable, Cloneable, Comparable<JResults> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JResults");

  private static final org.apache.thrift.protocol.TField SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("schema", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("JResults", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new resultsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new resultsTupleSchemeFactory());
  }

  public List<String> schema; // required
  public List<List<String>> results; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEMA((short)1, "schema"),
    RESULTS((short)2, "JResults");

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
        case 1: // SCHEMA
          return SCHEMA;
        case 2: // RESULTS
          return RESULTS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("schema", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RESULTS, new org.apache.thrift.meta_data.FieldMetaData("JResults", org.apache.thrift.TFieldRequirementType.DEFAULT,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JResults.class, metaDataMap);
  }

  public JResults() {
  }

  public JResults(
          List<String> schema,
          List<List<String>> results)
  {
    this();
    this.schema = schema;
    this.results = results;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JResults(JResults other) {
    if (other.isSetSchema()) {
      List<String> __this__schema = new ArrayList<String>(other.schema);
      this.schema = __this__schema;
    }
    if (other.isSetResults()) {
      List<List<String>> __this__results = new ArrayList<List<String>>(other.results.size());
      for (List<String> other_element : other.results) {
        List<String> __this__results_copy = new ArrayList<String>(other_element);
        __this__results.add(__this__results_copy);
      }
      this.results = __this__results;
    }
  }

  public JResults deepCopy() {
    return new JResults(this);
  }

  @Override
  public void clear() {
    this.schema = null;
    this.results = null;
  }

  public int getSchemaSize() {
    return (this.schema == null) ? 0 : this.schema.size();
  }

  public Iterator<String> getSchemaIterator() {
    return (this.schema == null) ? null : this.schema.iterator();
  }

  public void addToSchema(String elem) {
    if (this.schema == null) {
      this.schema = new ArrayList<String>();
    }
    this.schema.add(elem);
  }

  public List<String> getSchema() {
    return this.schema;
  }

  public JResults setSchema(List<String> schema) {
    this.schema = schema;
    return this;
  }

  public void unsetSchema() {
    this.schema = null;
  }

  /** Returns true if field schema is set (has been assigned a value) and false otherwise */
  public boolean isSetSchema() {
    return this.schema != null;
  }

  public void setSchemaIsSet(boolean value) {
    if (!value) {
      this.schema = null;
    }
  }

  public int getResultsSize() {
    return (this.results == null) ? 0 : this.results.size();
  }

  public Iterator<List<String>> getResultsIterator() {
    return (this.results == null) ? null : this.results.iterator();
  }

  public void addToResults(List<String> elem) {
    if (this.results == null) {
      this.results = new ArrayList<List<String>>();
    }
    this.results.add(elem);
  }

  public List<List<String>> getResults() {
    return this.results;
  }

  public JResults setResults(List<List<String>> results) {
    this.results = results;
    return this;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field JResults is set (has been assigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCHEMA:
      if (value == null) {
        unsetSchema();
      } else {
        setSchema((List<String>)value);
      }
      break;

    case RESULTS:
      if (value == null) {
        unsetResults();
      } else {
        setResults((List<List<String>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA:
      return getSchema();

    case RESULTS:
      return getResults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCHEMA:
      return isSetSchema();
    case RESULTS:
      return isSetResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JResults)
      return this.equals((JResults)that);
    return false;
  }

  public boolean equals(JResults that) {
    if (that == null)
      return false;

    boolean this_present_schema = true && this.isSetSchema();
    boolean that_present_schema = true && that.isSetSchema();
    if (this_present_schema || that_present_schema) {
      if (!(this_present_schema && that_present_schema))
        return false;
      if (!this.schema.equals(that.schema))
        return false;
    }

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_schema = true && (isSetSchema());
    list.add(present_schema);
    if (present_schema)
      list.add(schema);

    boolean present_results = true && (isSetResults());
    list.add(present_results);
    if (present_results)
      list.add(results);

    return list.hashCode();
  }

  @Override
  public int compareTo(JResults other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSchema()).compareTo(other.isSetSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema, other.schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResults()).compareTo(other.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, other.results);
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
    StringBuilder sb = new StringBuilder("JResults(");
    boolean first = true;

    sb.append("schema:");
    if (this.schema == null) {
      sb.append("null");
    } else {
      sb.append(this.schema);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("JResults:");
    if (this.results == null) {
      sb.append("null");
    } else {
      sb.append(this.results);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class resultsStandardSchemeFactory implements SchemeFactory {
    public resultsStandardScheme getScheme() {
      return new resultsStandardScheme();
    }
  }

  private static class resultsStandardScheme extends StandardScheme<JResults> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JResults struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.schema = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.schema.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setSchemaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.results = new ArrayList<List<String>>(_list3.size);
                List<String> _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  {
                    org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                    _elem4 = new ArrayList<String>(_list6.size);
                    String _elem7;
                    for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                    {
                      _elem7 = iprot.readString();
                      _elem4.add(_elem7);
                    }
                    iprot.readListEnd();
                  }
                  struct.results.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setResultsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JResults struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schema != null) {
        oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.schema.size()));
          for (String _iter9 : struct.schema)
          {
            oprot.writeString(_iter9);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.results != null) {
        oprot.writeFieldBegin(RESULTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.results.size()));
          for (List<String> _iter10 : struct.results)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter10.size()));
              for (String _iter11 : _iter10)
              {
                oprot.writeString(_iter11);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class resultsTupleSchemeFactory implements SchemeFactory {
    public resultsTupleScheme getScheme() {
      return new resultsTupleScheme();
    }
  }

  private static class resultsTupleScheme extends TupleScheme<JResults> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JResults struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSchema()) {
        optionals.set(0);
      }
      if (struct.isSetResults()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSchema()) {
        {
          oprot.writeI32(struct.schema.size());
          for (String _iter12 : struct.schema)
          {
            oprot.writeString(_iter12);
          }
        }
      }
      if (struct.isSetResults()) {
        {
          oprot.writeI32(struct.results.size());
          for (List<String> _iter13 : struct.results)
          {
            {
              oprot.writeI32(_iter13.size());
              for (String _iter14 : _iter13)
              {
                oprot.writeString(_iter14);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JResults struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.schema = new ArrayList<String>(_list15.size);
          String _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = iprot.readString();
            struct.schema.add(_elem16);
          }
        }
        struct.setSchemaIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.results = new ArrayList<List<String>>(_list18.size);
          List<String> _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            {
              org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _elem19 = new ArrayList<String>(_list21.size);
              String _elem22;
              for (int _i23 = 0; _i23 < _list21.size; ++_i23)
              {
                _elem22 = iprot.readString();
                _elem19.add(_elem22);
              }
            }
            struct.results.add(_elem19);
          }
        }
        struct.setResultsIsSet(true);
      }
    }
  }

}

