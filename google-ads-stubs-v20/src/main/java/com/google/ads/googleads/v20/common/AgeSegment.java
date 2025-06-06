// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/audiences.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

/**
 * <pre>
 * Contiguous age range.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.common.AgeSegment}
 */
public final class AgeSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.common.AgeSegment)
    AgeSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeSegment.newBuilder() to construct.
  private AgeSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.common.AudiencesProto.internal_static_google_ads_googleads_v20_common_AgeSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.common.AudiencesProto.internal_static_google_ads_googleads_v20_common_AgeSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.common.AgeSegment.class, com.google.ads.googleads.v20.common.AgeSegment.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_AGE_FIELD_NUMBER = 1;
  private int minAge_ = 0;
  /**
   * <pre>
   * Minimum age to include. A minimum age must be specified and must be at
   * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
   * </pre>
   *
   * <code>optional int32 min_age = 1;</code>
   * @return Whether the minAge field is set.
   */
  @java.lang.Override
  public boolean hasMinAge() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Minimum age to include. A minimum age must be specified and must be at
   * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
   * </pre>
   *
   * <code>optional int32 min_age = 1;</code>
   * @return The minAge.
   */
  @java.lang.Override
  public int getMinAge() {
    return minAge_;
  }

  public static final int MAX_AGE_FIELD_NUMBER = 2;
  private int maxAge_ = 0;
  /**
   * <pre>
   * Maximum age to include. A maximum age need not be specified. If specified,
   * max_age must be greater than min_age, and allowed values are 24, 34, 44,
   * 54, and 64.
   * </pre>
   *
   * <code>optional int32 max_age = 2;</code>
   * @return Whether the maxAge field is set.
   */
  @java.lang.Override
  public boolean hasMaxAge() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Maximum age to include. A maximum age need not be specified. If specified,
   * max_age must be greater than min_age, and allowed values are 24, 34, 44,
   * 54, and 64.
   * </pre>
   *
   * <code>optional int32 max_age = 2;</code>
   * @return The maxAge.
   */
  @java.lang.Override
  public int getMaxAge() {
    return maxAge_;
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
      output.writeInt32(1, minAge_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, maxAge_);
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
        .computeInt32Size(1, minAge_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxAge_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.common.AgeSegment)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.common.AgeSegment other = (com.google.ads.googleads.v20.common.AgeSegment) obj;

    if (hasMinAge() != other.hasMinAge()) return false;
    if (hasMinAge()) {
      if (getMinAge()
          != other.getMinAge()) return false;
    }
    if (hasMaxAge() != other.hasMaxAge()) return false;
    if (hasMaxAge()) {
      if (getMaxAge()
          != other.getMaxAge()) return false;
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
    if (hasMinAge()) {
      hash = (37 * hash) + MIN_AGE_FIELD_NUMBER;
      hash = (53 * hash) + getMinAge();
    }
    if (hasMaxAge()) {
      hash = (37 * hash) + MAX_AGE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxAge();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.common.AgeSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.common.AgeSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.AgeSegment parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.common.AgeSegment prototype) {
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
   * Contiguous age range.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.common.AgeSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.common.AgeSegment)
      com.google.ads.googleads.v20.common.AgeSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.AudiencesProto.internal_static_google_ads_googleads_v20_common_AgeSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.common.AudiencesProto.internal_static_google_ads_googleads_v20_common_AgeSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.common.AgeSegment.class, com.google.ads.googleads.v20.common.AgeSegment.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.common.AgeSegment.newBuilder()
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
      minAge_ = 0;
      maxAge_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.common.AudiencesProto.internal_static_google_ads_googleads_v20_common_AgeSegment_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AgeSegment getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.common.AgeSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AgeSegment build() {
      com.google.ads.googleads.v20.common.AgeSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AgeSegment buildPartial() {
      com.google.ads.googleads.v20.common.AgeSegment result = new com.google.ads.googleads.v20.common.AgeSegment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.common.AgeSegment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minAge_ = minAge_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxAge_ = maxAge_;
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
      if (other instanceof com.google.ads.googleads.v20.common.AgeSegment) {
        return mergeFrom((com.google.ads.googleads.v20.common.AgeSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.common.AgeSegment other) {
      if (other == com.google.ads.googleads.v20.common.AgeSegment.getDefaultInstance()) return this;
      if (other.hasMinAge()) {
        setMinAge(other.getMinAge());
      }
      if (other.hasMaxAge()) {
        setMaxAge(other.getMaxAge());
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
              minAge_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxAge_ = input.readInt32();
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

    private int minAge_ ;
    /**
     * <pre>
     * Minimum age to include. A minimum age must be specified and must be at
     * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
     * </pre>
     *
     * <code>optional int32 min_age = 1;</code>
     * @return Whether the minAge field is set.
     */
    @java.lang.Override
    public boolean hasMinAge() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Minimum age to include. A minimum age must be specified and must be at
     * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
     * </pre>
     *
     * <code>optional int32 min_age = 1;</code>
     * @return The minAge.
     */
    @java.lang.Override
    public int getMinAge() {
      return minAge_;
    }
    /**
     * <pre>
     * Minimum age to include. A minimum age must be specified and must be at
     * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
     * </pre>
     *
     * <code>optional int32 min_age = 1;</code>
     * @param value The minAge to set.
     * @return This builder for chaining.
     */
    public Builder setMinAge(int value) {

      minAge_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum age to include. A minimum age must be specified and must be at
     * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
     * </pre>
     *
     * <code>optional int32 min_age = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinAge() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minAge_ = 0;
      onChanged();
      return this;
    }

    private int maxAge_ ;
    /**
     * <pre>
     * Maximum age to include. A maximum age need not be specified. If specified,
     * max_age must be greater than min_age, and allowed values are 24, 34, 44,
     * 54, and 64.
     * </pre>
     *
     * <code>optional int32 max_age = 2;</code>
     * @return Whether the maxAge field is set.
     */
    @java.lang.Override
    public boolean hasMaxAge() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Maximum age to include. A maximum age need not be specified. If specified,
     * max_age must be greater than min_age, and allowed values are 24, 34, 44,
     * 54, and 64.
     * </pre>
     *
     * <code>optional int32 max_age = 2;</code>
     * @return The maxAge.
     */
    @java.lang.Override
    public int getMaxAge() {
      return maxAge_;
    }
    /**
     * <pre>
     * Maximum age to include. A maximum age need not be specified. If specified,
     * max_age must be greater than min_age, and allowed values are 24, 34, 44,
     * 54, and 64.
     * </pre>
     *
     * <code>optional int32 max_age = 2;</code>
     * @param value The maxAge to set.
     * @return This builder for chaining.
     */
    public Builder setMaxAge(int value) {

      maxAge_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum age to include. A maximum age need not be specified. If specified,
     * max_age must be greater than min_age, and allowed values are 24, 34, 44,
     * 54, and 64.
     * </pre>
     *
     * <code>optional int32 max_age = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxAge() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxAge_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.common.AgeSegment)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.common.AgeSegment)
  private static final com.google.ads.googleads.v20.common.AgeSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.common.AgeSegment();
  }

  public static com.google.ads.googleads.v20.common.AgeSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeSegment>
      PARSER = new com.google.protobuf.AbstractParser<AgeSegment>() {
    @java.lang.Override
    public AgeSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgeSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.common.AgeSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

