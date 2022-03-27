// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secondUser.proto

package login_service2;

/**
 * Protobuf type {@code CalculateRequest}
 */
public  final class CalcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CalculateRequest)
    CalcRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateRequest.newBuilder() to construct.
  private CalcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalcRequest() {
    number1_ = 0F;
    number2_ = 0F;
    operation_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalcRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            number1_ = input.readFloat();
            break;
          }
          case 21: {

            number2_ = input.readFloat();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            operation_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return login_service2.MathServiceImpl.internal_static_CalculateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return login_service2.MathServiceImpl.internal_static_CalculateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            login_service2.CalcRequest.class, login_service2.CalcRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code CalculateRequest.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ADDITION = 0;</code>
     */
    ADDITION(0),
    /**
     * <code>SUBTRACTION = 1;</code>
     */
    SUBTRACTION(1),
    /**
     * <code>MULTIPLICATION = 2;</code>
     */
    MULTIPLICATION(2),
    /**
     * <code>DIVISION = 3;</code>
     */
    DIVISION(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ADDITION = 0;</code>
     */
    public static final int ADDITION_VALUE = 0;
    /**
     * <code>SUBTRACTION = 1;</code>
     */
    public static final int SUBTRACTION_VALUE = 1;
    /**
     * <code>MULTIPLICATION = 2;</code>
     */
    public static final int MULTIPLICATION_VALUE = 2;
    /**
     * <code>DIVISION = 3;</code>
     */
    public static final int DIVISION_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return ADDITION;
        case 1: return SUBTRACTION;
        case 2: return MULTIPLICATION;
        case 3: return DIVISION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return login_service2.CalcRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CalculateRequest.Operation)
  }

  public static final int NUMBER1_FIELD_NUMBER = 1;
  private float number1_;
  /**
   * <code>float number1 = 1;</code>
   */
  public float getNumber1() {
    return number1_;
  }

  public static final int NUMBER2_FIELD_NUMBER = 2;
  private float number2_;
  /**
   * <code>float number2 = 2;</code>
   */
  public float getNumber2() {
    return number2_;
  }

  public static final int OPERATION_FIELD_NUMBER = 3;
  private int operation_;
  /**
   * <code>.CalculateRequest.Operation operation = 3;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.CalculateRequest.Operation operation = 3;</code>
   */
  public login_service2.CalcRequest.Operation getOperation() {
    @SuppressWarnings("deprecation")
    login_service2.CalcRequest.Operation result = login_service2.CalcRequest.Operation.valueOf(operation_);
    return result == null ? login_service2.CalcRequest.Operation.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (number1_ != 0F) {
      output.writeFloat(1, number1_);
    }
    if (number2_ != 0F) {
      output.writeFloat(2, number2_);
    }
    if (operation_ != login_service2.CalcRequest.Operation.ADDITION.getNumber()) {
      output.writeEnum(3, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number1_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, number1_);
    }
    if (number2_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, number2_);
    }
    if (operation_ != login_service2.CalcRequest.Operation.ADDITION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, operation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof login_service2.CalcRequest)) {
      return super.equals(obj);
    }
    login_service2.CalcRequest other = (login_service2.CalcRequest) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getNumber1())
        == java.lang.Float.floatToIntBits(
            other.getNumber1()));
    result = result && (
        java.lang.Float.floatToIntBits(getNumber2())
        == java.lang.Float.floatToIntBits(
            other.getNumber2()));
    result = result && operation_ == other.operation_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER1_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNumber1());
    hash = (37 * hash) + NUMBER2_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNumber2());
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static login_service2.CalcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static login_service2.CalcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static login_service2.CalcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static login_service2.CalcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static login_service2.CalcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static login_service2.CalcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static login_service2.CalcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static login_service2.CalcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static login_service2.CalcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static login_service2.CalcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static login_service2.CalcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static login_service2.CalcRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(login_service2.CalcRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CalculateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CalculateRequest)
      login_service2.CalcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return login_service2.MathServiceImpl.internal_static_CalculateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return login_service2.MathServiceImpl.internal_static_CalculateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              login_service2.CalcRequest.class, login_service2.CalcRequest.Builder.class);
    }

    // Construct using login_service2.CalculateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      number1_ = 0F;

      number2_ = 0F;

      operation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return login_service2.MathServiceImpl.internal_static_CalculateRequest_descriptor;
    }

    @java.lang.Override
    public login_service2.CalcRequest getDefaultInstanceForType() {
      return login_service2.CalcRequest.getDefaultInstance();
    }

    @java.lang.Override
    public login_service2.CalcRequest build() {
      login_service2.CalcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public login_service2.CalcRequest buildPartial() {
      login_service2.CalcRequest result = new login_service2.CalcRequest(this);
      result.number1_ = number1_;
      result.number2_ = number2_;
      result.operation_ = operation_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof login_service2.CalcRequest) {
        return mergeFrom((login_service2.CalcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(login_service2.CalcRequest other) {
      if (other == login_service2.CalcRequest.getDefaultInstance()) return this;
      if (other.getNumber1() != 0F) {
        setNumber1(other.getNumber1());
      }
      if (other.getNumber2() != 0F) {
        setNumber2(other.getNumber2());
      }
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      login_service2.CalcRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (login_service2.CalcRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float number1_ ;
    /**
     * <code>float number1 = 1;</code>
     */
    public float getNumber1() {
      return number1_;
    }
    /**
     * <code>float number1 = 1;</code>
     */
    public Builder setNumber1(float value) {
      
      number1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float number1 = 1;</code>
     */
    public Builder clearNumber1() {
      
      number1_ = 0F;
      onChanged();
      return this;
    }

    private float number2_ ;
    /**
     * <code>float number2 = 2;</code>
     */
    public float getNumber2() {
      return number2_;
    }
    /**
     * <code>float number2 = 2;</code>
     */
    public Builder setNumber2(float value) {
      
      number2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float number2 = 2;</code>
     */
    public Builder clearNumber2() {
      
      number2_ = 0F;
      onChanged();
      return this;
    }

    private int operation_ = 0;
    /**
     * <code>.CalculateRequest.Operation operation = 3;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.CalculateRequest.Operation operation = 3;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.CalculateRequest.Operation operation = 3;</code>
     */
    public login_service2.CalcRequest.Operation getOperation() {
      @SuppressWarnings("deprecation")
      login_service2.CalcRequest.Operation result = login_service2.CalcRequest.Operation.valueOf(operation_);
      return result == null ? login_service2.CalcRequest.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.CalculateRequest.Operation operation = 3;</code>
     */
    public Builder setOperation(login_service2.CalcRequest.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.CalculateRequest.Operation operation = 3;</code>
     */
    public Builder clearOperation() {
      
      operation_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CalculateRequest)
  }

  // @@protoc_insertion_point(class_scope:CalculateRequest)
  private static final login_service2.CalcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new login_service2.CalcRequest();
  }

  public static login_service2.CalcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalcRequest>
      PARSER = new com.google.protobuf.AbstractParser<CalcRequest>() {
    @java.lang.Override
    public CalcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalcRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalcRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public login_service2.CalcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
