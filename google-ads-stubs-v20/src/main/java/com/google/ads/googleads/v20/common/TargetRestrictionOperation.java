// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/targeting_setting.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

/**
 * <pre>
 * Operation to be performed on a target restriction list in a mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.common.TargetRestrictionOperation}
 */
public final class TargetRestrictionOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.common.TargetRestrictionOperation)
    TargetRestrictionOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetRestrictionOperation.newBuilder() to construct.
  private TargetRestrictionOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetRestrictionOperation() {
    operator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetRestrictionOperation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.common.TargetingSettingProto.internal_static_google_ads_googleads_v20_common_TargetRestrictionOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.common.TargetingSettingProto.internal_static_google_ads_googleads_v20_common_TargetRestrictionOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.common.TargetRestrictionOperation.class, com.google.ads.googleads.v20.common.TargetRestrictionOperation.Builder.class);
  }

  /**
   * <pre>
   * The operator.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v20.common.TargetRestrictionOperation.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Add the restriction to the existing restrictions.
     * </pre>
     *
     * <code>ADD = 2;</code>
     */
    ADD(2),
    /**
     * <pre>
     * Remove the restriction from the existing restrictions.
     * </pre>
     *
     * <code>REMOVE = 3;</code>
     */
    REMOVE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Add the restriction to the existing restrictions.
     * </pre>
     *
     * <code>ADD = 2;</code>
     */
    public static final int ADD_VALUE = 2;
    /**
     * <pre>
     * Remove the restriction from the existing restrictions.
     * </pre>
     *
     * <code>REMOVE = 3;</code>
     */
    public static final int REMOVE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ADD;
        case 3: return REMOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.TargetRestrictionOperation.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
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

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v20.common.TargetRestrictionOperation.Operator)
  }

  private int bitField0_;
  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_ = 0;
  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator getOperator() {
    com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator result = com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.forNumber(operator_);
    return result == null ? com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v20.common.TargetRestriction value_;
  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.TargetRestriction getValue() {
    return value_ == null ? com.google.ads.googleads.v20.common.TargetRestriction.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The target restriction being added to or removed from the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.TargetRestrictionOrBuilder getValueOrBuilder() {
    return value_ == null ? com.google.ads.googleads.v20.common.TargetRestriction.getDefaultInstance() : value_;
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
    if (operator_ != com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v20.common.TargetRestrictionOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.common.TargetRestrictionOperation other = (com.google.ads.googleads.v20.common.TargetRestrictionOperation) obj;

    if (operator_ != other.operator_) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.common.TargetRestrictionOperation prototype) {
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
   * <pre>
   * Operation to be performed on a target restriction list in a mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.common.TargetRestrictionOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.common.TargetRestrictionOperation)
      com.google.ads.googleads.v20.common.TargetRestrictionOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.TargetingSettingProto.internal_static_google_ads_googleads_v20_common_TargetRestrictionOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.common.TargetingSettingProto.internal_static_google_ads_googleads_v20_common_TargetRestrictionOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.common.TargetRestrictionOperation.class, com.google.ads.googleads.v20.common.TargetRestrictionOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.common.TargetRestrictionOperation.newBuilder()
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
        getValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      operator_ = 0;
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.common.TargetingSettingProto.internal_static_google_ads_googleads_v20_common_TargetRestrictionOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TargetRestrictionOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.common.TargetRestrictionOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TargetRestrictionOperation build() {
      com.google.ads.googleads.v20.common.TargetRestrictionOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TargetRestrictionOperation buildPartial() {
      com.google.ads.googleads.v20.common.TargetRestrictionOperation result = new com.google.ads.googleads.v20.common.TargetRestrictionOperation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.common.TargetRestrictionOperation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operator_ = operator_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v20.common.TargetRestrictionOperation) {
        return mergeFrom((com.google.ads.googleads.v20.common.TargetRestrictionOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.common.TargetRestrictionOperation other) {
      if (other == com.google.ads.googleads.v20.common.TargetRestrictionOperation.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              operator_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int operator_ = 0;
    /**
     * <pre>
     * Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      operator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator getOperator() {
      com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator result = com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.forNumber(operator_);
      return result == null ? com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestrictionOperation.Operator operator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operator_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v20.common.TargetRestriction value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.TargetRestriction, com.google.ads.googleads.v20.common.TargetRestriction.Builder, com.google.ads.googleads.v20.common.TargetRestrictionOrBuilder> valueBuilder_;
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     * @return The value.
     */
    public com.google.ads.googleads.v20.common.TargetRestriction getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.ads.googleads.v20.common.TargetRestriction.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public Builder setValue(com.google.ads.googleads.v20.common.TargetRestriction value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public Builder setValue(
        com.google.ads.googleads.v20.common.TargetRestriction.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public Builder mergeValue(com.google.ads.googleads.v20.common.TargetRestriction value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          value_ != null &&
          value_ != com.google.ads.googleads.v20.common.TargetRestriction.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      if (value_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public com.google.ads.googleads.v20.common.TargetRestriction.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    public com.google.ads.googleads.v20.common.TargetRestrictionOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.ads.googleads.v20.common.TargetRestriction.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * The target restriction being added to or removed from the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.TargetRestriction value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.TargetRestriction, com.google.ads.googleads.v20.common.TargetRestriction.Builder, com.google.ads.googleads.v20.common.TargetRestrictionOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v20.common.TargetRestriction, com.google.ads.googleads.v20.common.TargetRestriction.Builder, com.google.ads.googleads.v20.common.TargetRestrictionOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.common.TargetRestrictionOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.common.TargetRestrictionOperation)
  private static final com.google.ads.googleads.v20.common.TargetRestrictionOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.common.TargetRestrictionOperation();
  }

  public static com.google.ads.googleads.v20.common.TargetRestrictionOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetRestrictionOperation>
      PARSER = new com.google.protobuf.AbstractParser<TargetRestrictionOperation>() {
    @java.lang.Override
    public TargetRestrictionOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TargetRestrictionOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetRestrictionOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.common.TargetRestrictionOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

