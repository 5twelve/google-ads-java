// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/dates.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * Year month.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.YearMonth}
 */
public final class YearMonth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.YearMonth)
    YearMonthOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YearMonth.newBuilder() to construct.
  private YearMonth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YearMonth() {
    month_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YearMonth();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.DatesProto.internal_static_google_ads_googleads_v18_common_YearMonth_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.DatesProto.internal_static_google_ads_googleads_v18_common_YearMonth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.YearMonth.class, com.google.ads.googleads.v18.common.YearMonth.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private long year_ = 0L;
  /**
   * <pre>
   * The year (for example, 2020).
   * </pre>
   *
   * <code>int64 year = 1;</code>
   * @return The year.
   */
  @java.lang.Override
  public long getYear() {
    return year_;
  }

  public static final int MONTH_FIELD_NUMBER = 2;
  private int month_ = 0;
  /**
   * <pre>
   * The month of the year. (for example, FEBRUARY).
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The enum numeric value on the wire for month.
   */
  @java.lang.Override public int getMonthValue() {
    return month_;
  }
  /**
   * <pre>
   * The month of the year. (for example, FEBRUARY).
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The month.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear getMonth() {
    com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear result = com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.forNumber(month_);
    return result == null ? com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.UNRECOGNIZED : result;
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
    if (year_ != 0L) {
      output.writeInt64(1, year_);
    }
    if (month_ != com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, month_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (year_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, year_);
    }
    if (month_ != com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, month_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.YearMonth)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.YearMonth other = (com.google.ads.googleads.v18.common.YearMonth) obj;

    if (getYear()
        != other.getYear()) return false;
    if (month_ != other.month_) return false;
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
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getYear());
    hash = (37 * hash) + MONTH_FIELD_NUMBER;
    hash = (53 * hash) + month_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.YearMonth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.YearMonth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.YearMonth parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.YearMonth prototype) {
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
   * Year month.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.YearMonth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.YearMonth)
      com.google.ads.googleads.v18.common.YearMonthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.DatesProto.internal_static_google_ads_googleads_v18_common_YearMonth_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.DatesProto.internal_static_google_ads_googleads_v18_common_YearMonth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.YearMonth.class, com.google.ads.googleads.v18.common.YearMonth.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.YearMonth.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      year_ = 0L;
      month_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.DatesProto.internal_static_google_ads_googleads_v18_common_YearMonth_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.YearMonth getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.YearMonth.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.YearMonth build() {
      com.google.ads.googleads.v18.common.YearMonth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.YearMonth buildPartial() {
      com.google.ads.googleads.v18.common.YearMonth result = new com.google.ads.googleads.v18.common.YearMonth(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.YearMonth result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.year_ = year_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.month_ = month_;
      }
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
      if (other instanceof com.google.ads.googleads.v18.common.YearMonth) {
        return mergeFrom((com.google.ads.googleads.v18.common.YearMonth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.YearMonth other) {
      if (other == com.google.ads.googleads.v18.common.YearMonth.getDefaultInstance()) return this;
      if (other.getYear() != 0L) {
        setYear(other.getYear());
      }
      if (other.month_ != 0) {
        setMonthValue(other.getMonthValue());
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
              year_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              month_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long year_ ;
    /**
     * <pre>
     * The year (for example, 2020).
     * </pre>
     *
     * <code>int64 year = 1;</code>
     * @return The year.
     */
    @java.lang.Override
    public long getYear() {
      return year_;
    }
    /**
     * <pre>
     * The year (for example, 2020).
     * </pre>
     *
     * <code>int64 year = 1;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(long value) {

      year_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The year (for example, 2020).
     * </pre>
     *
     * <code>int64 year = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      bitField0_ = (bitField0_ & ~0x00000001);
      year_ = 0L;
      onChanged();
      return this;
    }

    private int month_ = 0;
    /**
     * <pre>
     * The month of the year. (for example, FEBRUARY).
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
     * @return The enum numeric value on the wire for month.
     */
    @java.lang.Override public int getMonthValue() {
      return month_;
    }
    /**
     * <pre>
     * The month of the year. (for example, FEBRUARY).
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
     * @param value The enum numeric value on the wire for month to set.
     * @return This builder for chaining.
     */
    public Builder setMonthValue(int value) {
      month_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The month of the year. (for example, FEBRUARY).
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
     * @return The month.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear getMonth() {
      com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear result = com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.forNumber(month_);
      return result == null ? com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The month of the year. (for example, FEBRUARY).
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
     * @param value The month to set.
     * @return This builder for chaining.
     */
    public Builder setMonth(com.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      month_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The month of the year. (for example, FEBRUARY).
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMonth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      month_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.YearMonth)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.YearMonth)
  private static final com.google.ads.googleads.v18.common.YearMonth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.YearMonth();
  }

  public static com.google.ads.googleads.v18.common.YearMonth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YearMonth>
      PARSER = new com.google.protobuf.AbstractParser<YearMonth>() {
    @java.lang.Override
    public YearMonth parsePartialFrom(
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

  public static com.google.protobuf.Parser<YearMonth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YearMonth> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.YearMonth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

