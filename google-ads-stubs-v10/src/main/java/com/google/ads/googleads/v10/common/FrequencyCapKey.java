// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/frequency_cap.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * A group of fields used as keys for a frequency cap.
 * There can be no more than one frequency cap with the same key.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.FrequencyCapKey}
 */
public final class FrequencyCapKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.FrequencyCapKey)
    FrequencyCapKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyCapKey.newBuilder() to construct.
  private FrequencyCapKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyCapKey() {
    level_ = 0;
    eventType_ = 0;
    timeUnit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyCapKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FrequencyCapKey(
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
          case 8: {
            int rawValue = input.readEnum();

            level_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            timeUnit_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            eventType_ = rawValue;
            break;
          }
          case 40: {
            bitField0_ |= 0x00000001;
            timeLength_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.google.ads.googleads.v10.common.FrequencyCapProto.internal_static_google_ads_googleads_v10_common_FrequencyCapKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.FrequencyCapProto.internal_static_google_ads_googleads_v10_common_FrequencyCapKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.FrequencyCapKey.class, com.google.ads.googleads.v10.common.FrequencyCapKey.Builder.class);
  }

  private int bitField0_;
  public static final int LEVEL_FIELD_NUMBER = 1;
  private int level_;
  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  @java.lang.Override public int getLevelValue() {
    return level_;
  }
  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   * @return The level.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel getLevel() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel result = com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.valueOf(level_);
    return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.UNRECOGNIZED : result;
  }

  public static final int EVENT_TYPE_FIELD_NUMBER = 3;
  private int eventType_;
  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   * @return The enum numeric value on the wire for eventType.
   */
  @java.lang.Override public int getEventTypeValue() {
    return eventType_;
  }
  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   * @return The eventType.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType getEventType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType result = com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.valueOf(eventType_);
    return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.UNRECOGNIZED : result;
  }

  public static final int TIME_UNIT_FIELD_NUMBER = 2;
  private int timeUnit_;
  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  @java.lang.Override public int getTimeUnitValue() {
    return timeUnit_;
  }
  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   * @return The timeUnit.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.valueOf(timeUnit_);
    return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
  }

  public static final int TIME_LENGTH_FIELD_NUMBER = 5;
  private int timeLength_;
  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>optional int32 time_length = 5;</code>
   * @return Whether the timeLength field is set.
   */
  @java.lang.Override
  public boolean hasTimeLength() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>optional int32 time_length = 5;</code>
   * @return The timeLength.
   */
  @java.lang.Override
  public int getTimeLength() {
    return timeLength_;
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
    if (level_ != com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, level_);
    }
    if (timeUnit_ != com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, timeUnit_);
    }
    if (eventType_ != com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, eventType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(5, timeLength_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (level_ != com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, level_);
    }
    if (timeUnit_ != com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, timeUnit_);
    }
    if (eventType_ != com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, eventType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, timeLength_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.FrequencyCapKey)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.FrequencyCapKey other = (com.google.ads.googleads.v10.common.FrequencyCapKey) obj;

    if (level_ != other.level_) return false;
    if (eventType_ != other.eventType_) return false;
    if (timeUnit_ != other.timeUnit_) return false;
    if (hasTimeLength() != other.hasTimeLength()) return false;
    if (hasTimeLength()) {
      if (getTimeLength()
          != other.getTimeLength()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + eventType_;
    hash = (37 * hash) + TIME_UNIT_FIELD_NUMBER;
    hash = (53 * hash) + timeUnit_;
    if (hasTimeLength()) {
      hash = (37 * hash) + TIME_LENGTH_FIELD_NUMBER;
      hash = (53 * hash) + getTimeLength();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.FrequencyCapKey parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.FrequencyCapKey prototype) {
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
   * A group of fields used as keys for a frequency cap.
   * There can be no more than one frequency cap with the same key.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.FrequencyCapKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.FrequencyCapKey)
      com.google.ads.googleads.v10.common.FrequencyCapKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.FrequencyCapProto.internal_static_google_ads_googleads_v10_common_FrequencyCapKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.FrequencyCapProto.internal_static_google_ads_googleads_v10_common_FrequencyCapKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.FrequencyCapKey.class, com.google.ads.googleads.v10.common.FrequencyCapKey.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.FrequencyCapKey.newBuilder()
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
      level_ = 0;

      eventType_ = 0;

      timeUnit_ = 0;

      timeLength_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.FrequencyCapProto.internal_static_google_ads_googleads_v10_common_FrequencyCapKey_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.FrequencyCapKey getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.FrequencyCapKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.FrequencyCapKey build() {
      com.google.ads.googleads.v10.common.FrequencyCapKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.FrequencyCapKey buildPartial() {
      com.google.ads.googleads.v10.common.FrequencyCapKey result = new com.google.ads.googleads.v10.common.FrequencyCapKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.level_ = level_;
      result.eventType_ = eventType_;
      result.timeUnit_ = timeUnit_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeLength_ = timeLength_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v10.common.FrequencyCapKey) {
        return mergeFrom((com.google.ads.googleads.v10.common.FrequencyCapKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.FrequencyCapKey other) {
      if (other == com.google.ads.googleads.v10.common.FrequencyCapKey.getDefaultInstance()) return this;
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
      }
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (other.timeUnit_ != 0) {
        setTimeUnitValue(other.getTimeUnitValue());
      }
      if (other.hasTimeLength()) {
        setTimeLength(other.getTimeLength());
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
      com.google.ads.googleads.v10.common.FrequencyCapKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.FrequencyCapKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int level_ = 0;
    /**
     * <pre>
     * The level on which the cap is to be applied (e.g. ad group ad, ad group).
     * The cap is applied to all the entities of this level.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
     * @return The enum numeric value on the wire for level.
     */
    @java.lang.Override public int getLevelValue() {
      return level_;
    }
    /**
     * <pre>
     * The level on which the cap is to be applied (e.g. ad group ad, ad group).
     * The cap is applied to all the entities of this level.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
     * @param value The enum numeric value on the wire for level to set.
     * @return This builder for chaining.
     */
    public Builder setLevelValue(int value) {
      
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The level on which the cap is to be applied (e.g. ad group ad, ad group).
     * The cap is applied to all the entities of this level.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel getLevel() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel result = com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.valueOf(level_);
      return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The level on which the cap is to be applied (e.g. ad group ad, ad group).
     * The cap is applied to all the entities of this level.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(com.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The level on which the cap is to be applied (e.g. ad group ad, ad group).
     * The cap is applied to all the entities of this level.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = 0;
      onChanged();
      return this;
    }

    private int eventType_ = 0;
    /**
     * <pre>
     * The type of event that the cap applies to (e.g. impression).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <pre>
     * The type of event that the cap applies to (e.g. impression).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
     * @param value The enum numeric value on the wire for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeValue(int value) {
      
      eventType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of event that the cap applies to (e.g. impression).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType getEventType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType result = com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.valueOf(eventType_);
      return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of event that the cap applies to (e.g. impression).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of event that the cap applies to (e.g. impression).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      
      eventType_ = 0;
      onChanged();
      return this;
    }

    private int timeUnit_ = 0;
    /**
     * <pre>
     * Unit of time the cap is defined at (e.g. day, week).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
     * @return The enum numeric value on the wire for timeUnit.
     */
    @java.lang.Override public int getTimeUnitValue() {
      return timeUnit_;
    }
    /**
     * <pre>
     * Unit of time the cap is defined at (e.g. day, week).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
     * @param value The enum numeric value on the wire for timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnitValue(int value) {
      
      timeUnit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unit of time the cap is defined at (e.g. day, week).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
     * @return The timeUnit.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.valueOf(timeUnit_);
      return result == null ? com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Unit of time the cap is defined at (e.g. day, week).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
     * @param value The timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnit(com.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      timeUnit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unit of time the cap is defined at (e.g. day, week).
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeUnit() {
      
      timeUnit_ = 0;
      onChanged();
      return this;
    }

    private int timeLength_ ;
    /**
     * <pre>
     * Number of time units the cap lasts.
     * </pre>
     *
     * <code>optional int32 time_length = 5;</code>
     * @return Whether the timeLength field is set.
     */
    @java.lang.Override
    public boolean hasTimeLength() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of time units the cap lasts.
     * </pre>
     *
     * <code>optional int32 time_length = 5;</code>
     * @return The timeLength.
     */
    @java.lang.Override
    public int getTimeLength() {
      return timeLength_;
    }
    /**
     * <pre>
     * Number of time units the cap lasts.
     * </pre>
     *
     * <code>optional int32 time_length = 5;</code>
     * @param value The timeLength to set.
     * @return This builder for chaining.
     */
    public Builder setTimeLength(int value) {
      bitField0_ |= 0x00000001;
      timeLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of time units the cap lasts.
     * </pre>
     *
     * <code>optional int32 time_length = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeLength() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeLength_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.FrequencyCapKey)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.FrequencyCapKey)
  private static final com.google.ads.googleads.v10.common.FrequencyCapKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.FrequencyCapKey();
  }

  public static com.google.ads.googleads.v10.common.FrequencyCapKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyCapKey>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyCapKey>() {
    @java.lang.Override
    public FrequencyCapKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FrequencyCapKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FrequencyCapKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyCapKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.FrequencyCapKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

