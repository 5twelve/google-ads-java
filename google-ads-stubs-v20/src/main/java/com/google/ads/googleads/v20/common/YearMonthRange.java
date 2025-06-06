// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/dates.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

/**
 * <pre>
 * The year month range inclusive of the start and end months.
 * Eg: A year month range to represent Jan 2020 would be: (Jan 2020, Jan 2020).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.common.YearMonthRange}
 */
public final class YearMonthRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.common.YearMonthRange)
    YearMonthRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YearMonthRange.newBuilder() to construct.
  private YearMonthRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YearMonthRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YearMonthRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.common.DatesProto.internal_static_google_ads_googleads_v20_common_YearMonthRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.common.DatesProto.internal_static_google_ads_googleads_v20_common_YearMonthRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.common.YearMonthRange.class, com.google.ads.googleads.v20.common.YearMonthRange.Builder.class);
  }

  private int bitField0_;
  public static final int START_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v20.common.YearMonth start_;
  /**
   * <pre>
   * The inclusive start year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
   * @return Whether the start field is set.
   */
  @java.lang.Override
  public boolean hasStart() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The inclusive start year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.YearMonth getStart() {
    return start_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : start_;
  }
  /**
   * <pre>
   * The inclusive start year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.YearMonthOrBuilder getStartOrBuilder() {
    return start_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v20.common.YearMonth end_;
  /**
   * <pre>
   * The inclusive end year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
   * @return Whether the end field is set.
   */
  @java.lang.Override
  public boolean hasEnd() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The inclusive end year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.YearMonth getEnd() {
    return end_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : end_;
  }
  /**
   * <pre>
   * The inclusive end year month.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.common.YearMonthOrBuilder getEndOrBuilder() {
    return end_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : end_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getStart());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getEnd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStart());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEnd());
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
    if (!(obj instanceof com.google.ads.googleads.v20.common.YearMonthRange)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.common.YearMonthRange other = (com.google.ads.googleads.v20.common.YearMonthRange) obj;

    if (hasStart() != other.hasStart()) return false;
    if (hasStart()) {
      if (!getStart()
          .equals(other.getStart())) return false;
    }
    if (hasEnd() != other.hasEnd()) return false;
    if (hasEnd()) {
      if (!getEnd()
          .equals(other.getEnd())) return false;
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
    if (hasStart()) {
      hash = (37 * hash) + START_FIELD_NUMBER;
      hash = (53 * hash) + getStart().hashCode();
    }
    if (hasEnd()) {
      hash = (37 * hash) + END_FIELD_NUMBER;
      hash = (53 * hash) + getEnd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.common.YearMonthRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.common.YearMonthRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.YearMonthRange parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.common.YearMonthRange prototype) {
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
   * The year month range inclusive of the start and end months.
   * Eg: A year month range to represent Jan 2020 would be: (Jan 2020, Jan 2020).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.common.YearMonthRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.common.YearMonthRange)
      com.google.ads.googleads.v20.common.YearMonthRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.DatesProto.internal_static_google_ads_googleads_v20_common_YearMonthRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.common.DatesProto.internal_static_google_ads_googleads_v20_common_YearMonthRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.common.YearMonthRange.class, com.google.ads.googleads.v20.common.YearMonthRange.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.common.YearMonthRange.newBuilder()
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
        getStartFieldBuilder();
        getEndFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.common.DatesProto.internal_static_google_ads_googleads_v20_common_YearMonthRange_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.YearMonthRange getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.common.YearMonthRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.YearMonthRange build() {
      com.google.ads.googleads.v20.common.YearMonthRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.YearMonthRange buildPartial() {
      com.google.ads.googleads.v20.common.YearMonthRange result = new com.google.ads.googleads.v20.common.YearMonthRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.common.YearMonthRange result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.start_ = startBuilder_ == null
            ? start_
            : startBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.end_ = endBuilder_ == null
            ? end_
            : endBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v20.common.YearMonthRange) {
        return mergeFrom((com.google.ads.googleads.v20.common.YearMonthRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.common.YearMonthRange other) {
      if (other == com.google.ads.googleads.v20.common.YearMonthRange.getDefaultInstance()) return this;
      if (other.hasStart()) {
        mergeStart(other.getStart());
      }
      if (other.hasEnd()) {
        mergeEnd(other.getEnd());
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
            case 10: {
              input.readMessage(
                  getStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndFieldBuilder().getBuilder(),
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

    private com.google.ads.googleads.v20.common.YearMonth start_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder> startBuilder_;
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     * @return Whether the start field is set.
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     * @return The start.
     */
    public com.google.ads.googleads.v20.common.YearMonth getStart() {
      if (startBuilder_ == null) {
        return start_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : start_;
      } else {
        return startBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public Builder setStart(com.google.ads.googleads.v20.common.YearMonth value) {
      if (startBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        start_ = value;
      } else {
        startBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public Builder setStart(
        com.google.ads.googleads.v20.common.YearMonth.Builder builderForValue) {
      if (startBuilder_ == null) {
        start_ = builderForValue.build();
      } else {
        startBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public Builder mergeStart(com.google.ads.googleads.v20.common.YearMonth value) {
      if (startBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          start_ != null &&
          start_ != com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance()) {
          getStartBuilder().mergeFrom(value);
        } else {
          start_ = value;
        }
      } else {
        startBuilder_.mergeFrom(value);
      }
      if (start_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public Builder clearStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      start_ = null;
      if (startBuilder_ != null) {
        startBuilder_.dispose();
        startBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public com.google.ads.googleads.v20.common.YearMonth.Builder getStartBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    public com.google.ads.googleads.v20.common.YearMonthOrBuilder getStartOrBuilder() {
      if (startBuilder_ != null) {
        return startBuilder_.getMessageOrBuilder();
      } else {
        return start_ == null ?
            com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : start_;
      }
    }
    /**
     * <pre>
     * The inclusive start year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth start = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder> 
        getStartFieldBuilder() {
      if (startBuilder_ == null) {
        startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder>(
                getStart(),
                getParentForChildren(),
                isClean());
        start_ = null;
      }
      return startBuilder_;
    }

    private com.google.ads.googleads.v20.common.YearMonth end_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder> endBuilder_;
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     * @return Whether the end field is set.
     */
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     * @return The end.
     */
    public com.google.ads.googleads.v20.common.YearMonth getEnd() {
      if (endBuilder_ == null) {
        return end_ == null ? com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : end_;
      } else {
        return endBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public Builder setEnd(com.google.ads.googleads.v20.common.YearMonth value) {
      if (endBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        end_ = value;
      } else {
        endBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public Builder setEnd(
        com.google.ads.googleads.v20.common.YearMonth.Builder builderForValue) {
      if (endBuilder_ == null) {
        end_ = builderForValue.build();
      } else {
        endBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public Builder mergeEnd(com.google.ads.googleads.v20.common.YearMonth value) {
      if (endBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          end_ != null &&
          end_ != com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance()) {
          getEndBuilder().mergeFrom(value);
        } else {
          end_ = value;
        }
      } else {
        endBuilder_.mergeFrom(value);
      }
      if (end_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public Builder clearEnd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      end_ = null;
      if (endBuilder_ != null) {
        endBuilder_.dispose();
        endBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public com.google.ads.googleads.v20.common.YearMonth.Builder getEndBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    public com.google.ads.googleads.v20.common.YearMonthOrBuilder getEndOrBuilder() {
      if (endBuilder_ != null) {
        return endBuilder_.getMessageOrBuilder();
      } else {
        return end_ == null ?
            com.google.ads.googleads.v20.common.YearMonth.getDefaultInstance() : end_;
      }
    }
    /**
     * <pre>
     * The inclusive end year month.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.common.YearMonth end = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder> 
        getEndFieldBuilder() {
      if (endBuilder_ == null) {
        endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v20.common.YearMonth, com.google.ads.googleads.v20.common.YearMonth.Builder, com.google.ads.googleads.v20.common.YearMonthOrBuilder>(
                getEnd(),
                getParentForChildren(),
                isClean());
        end_ = null;
      }
      return endBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.common.YearMonthRange)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.common.YearMonthRange)
  private static final com.google.ads.googleads.v20.common.YearMonthRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.common.YearMonthRange();
  }

  public static com.google.ads.googleads.v20.common.YearMonthRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YearMonthRange>
      PARSER = new com.google.protobuf.AbstractParser<YearMonthRange>() {
    @java.lang.Override
    public YearMonthRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<YearMonthRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YearMonthRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.common.YearMonthRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

