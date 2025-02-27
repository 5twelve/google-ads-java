// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * Maximize Clicks Bidding Strategy.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy}
 */
public final class MaximizeClicksBiddingStrategy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)
    MaximizeClicksBiddingStrategyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MaximizeClicksBiddingStrategy.newBuilder() to construct.
  private MaximizeClicksBiddingStrategy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MaximizeClicksBiddingStrategy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MaximizeClicksBiddingStrategy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_MaximizeClicksBiddingStrategy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_MaximizeClicksBiddingStrategy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.class, com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.Builder.class);
  }

  private int bitField0_;
  public static final int DAILY_TARGET_SPEND_MICROS_FIELD_NUMBER = 1;
  private long dailyTargetSpendMicros_ = 0L;
  /**
   * <pre>
   * Required. The daily target spend in micros to be used for estimation. A
   * minimum value is enforced for the local currency used in the campaign. An
   * error will occur showing the minimum value if this field is set too low.
   * </pre>
   *
   * <code>int64 daily_target_spend_micros = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dailyTargetSpendMicros.
   */
  @java.lang.Override
  public long getDailyTargetSpendMicros() {
    return dailyTargetSpendMicros_;
  }

  public static final int MAX_CPC_BID_CEILING_MICROS_FIELD_NUMBER = 2;
  private long maxCpcBidCeilingMicros_ = 0L;
  /**
   * <pre>
   * Ceiling on max CPC bids in micros.
   * </pre>
   *
   * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
   * @return Whether the maxCpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasMaxCpcBidCeilingMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Ceiling on max CPC bids in micros.
   * </pre>
   *
   * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
   * @return The maxCpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getMaxCpcBidCeilingMicros() {
    return maxCpcBidCeilingMicros_;
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
    if (dailyTargetSpendMicros_ != 0L) {
      output.writeInt64(1, dailyTargetSpendMicros_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, maxCpcBidCeilingMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dailyTargetSpendMicros_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, dailyTargetSpendMicros_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, maxCpcBidCeilingMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy other = (com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy) obj;

    if (getDailyTargetSpendMicros()
        != other.getDailyTargetSpendMicros()) return false;
    if (hasMaxCpcBidCeilingMicros() != other.hasMaxCpcBidCeilingMicros()) return false;
    if (hasMaxCpcBidCeilingMicros()) {
      if (getMaxCpcBidCeilingMicros()
          != other.getMaxCpcBidCeilingMicros()) return false;
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
    hash = (37 * hash) + DAILY_TARGET_SPEND_MICROS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDailyTargetSpendMicros());
    if (hasMaxCpcBidCeilingMicros()) {
      hash = (37 * hash) + MAX_CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxCpcBidCeilingMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy prototype) {
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
   * Maximize Clicks Bidding Strategy.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)
      com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_MaximizeClicksBiddingStrategy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_MaximizeClicksBiddingStrategy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.class, com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.newBuilder()
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
      dailyTargetSpendMicros_ = 0L;
      maxCpcBidCeilingMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_MaximizeClicksBiddingStrategy_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy build() {
      com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy buildPartial() {
      com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy result = new com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dailyTargetSpendMicros_ = dailyTargetSpendMicros_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxCpcBidCeilingMicros_ = maxCpcBidCeilingMicros_;
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
      if (other instanceof com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy) {
        return mergeFrom((com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy other) {
      if (other == com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy.getDefaultInstance()) return this;
      if (other.getDailyTargetSpendMicros() != 0L) {
        setDailyTargetSpendMicros(other.getDailyTargetSpendMicros());
      }
      if (other.hasMaxCpcBidCeilingMicros()) {
        setMaxCpcBidCeilingMicros(other.getMaxCpcBidCeilingMicros());
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
              dailyTargetSpendMicros_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              maxCpcBidCeilingMicros_ = input.readInt64();
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

    private long dailyTargetSpendMicros_ ;
    /**
     * <pre>
     * Required. The daily target spend in micros to be used for estimation. A
     * minimum value is enforced for the local currency used in the campaign. An
     * error will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>int64 daily_target_spend_micros = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dailyTargetSpendMicros.
     */
    @java.lang.Override
    public long getDailyTargetSpendMicros() {
      return dailyTargetSpendMicros_;
    }
    /**
     * <pre>
     * Required. The daily target spend in micros to be used for estimation. A
     * minimum value is enforced for the local currency used in the campaign. An
     * error will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>int64 daily_target_spend_micros = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The dailyTargetSpendMicros to set.
     * @return This builder for chaining.
     */
    public Builder setDailyTargetSpendMicros(long value) {

      dailyTargetSpendMicros_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The daily target spend in micros to be used for estimation. A
     * minimum value is enforced for the local currency used in the campaign. An
     * error will occur showing the minimum value if this field is set too low.
     * </pre>
     *
     * <code>int64 daily_target_spend_micros = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyTargetSpendMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dailyTargetSpendMicros_ = 0L;
      onChanged();
      return this;
    }

    private long maxCpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Ceiling on max CPC bids in micros.
     * </pre>
     *
     * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
     * @return Whether the maxCpcBidCeilingMicros field is set.
     */
    @java.lang.Override
    public boolean hasMaxCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Ceiling on max CPC bids in micros.
     * </pre>
     *
     * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
     * @return The maxCpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getMaxCpcBidCeilingMicros() {
      return maxCpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Ceiling on max CPC bids in micros.
     * </pre>
     *
     * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
     * @param value The maxCpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCpcBidCeilingMicros(long value) {

      maxCpcBidCeilingMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ceiling on max CPC bids in micros.
     * </pre>
     *
     * <code>optional int64 max_cpc_bid_ceiling_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxCpcBidCeilingMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy)
  private static final com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy();
  }

  public static com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MaximizeClicksBiddingStrategy>
      PARSER = new com.google.protobuf.AbstractParser<MaximizeClicksBiddingStrategy>() {
    @java.lang.Override
    public MaximizeClicksBiddingStrategy parsePartialFrom(
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

  public static com.google.protobuf.Parser<MaximizeClicksBiddingStrategy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MaximizeClicksBiddingStrategy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.MaximizeClicksBiddingStrategy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

