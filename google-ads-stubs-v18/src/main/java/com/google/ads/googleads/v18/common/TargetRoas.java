// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/bidding.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * An automated bidding strategy that helps you maximize revenue while
 * averaging a specific target return on ad spend (ROAS).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.TargetRoas}
 */
public final class TargetRoas extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.TargetRoas)
    TargetRoasOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetRoas.newBuilder() to construct.
  private TargetRoas(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetRoas() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetRoas();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.BiddingProto.internal_static_google_ads_googleads_v18_common_TargetRoas_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.BiddingProto.internal_static_google_ads_googleads_v18_common_TargetRoas_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.TargetRoas.class, com.google.ads.googleads.v18.common.TargetRoas.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_ROAS_FIELD_NUMBER = 4;
  private double targetRoas_ = 0D;
  /**
   * <pre>
   * Required. The chosen revenue (based on conversion data) per unit of spend.
   * Value must be between 0.01 and 1000.0, inclusive.
   * </pre>
   *
   * <code>optional double target_roas = 4;</code>
   * @return Whether the targetRoas field is set.
   */
  @java.lang.Override
  public boolean hasTargetRoas() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The chosen revenue (based on conversion data) per unit of spend.
   * Value must be between 0.01 and 1000.0, inclusive.
   * </pre>
   *
   * <code>optional double target_roas = 4;</code>
   * @return The targetRoas.
   */
  @java.lang.Override
  public double getTargetRoas() {
    return targetRoas_;
  }

  public static final int CPC_BID_CEILING_MICROS_FIELD_NUMBER = 5;
  private long cpcBidCeilingMicros_ = 0L;
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidCeilingMicros() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  @java.lang.Override
  public long getCpcBidCeilingMicros() {
    return cpcBidCeilingMicros_;
  }

  public static final int CPC_BID_FLOOR_MICROS_FIELD_NUMBER = 6;
  private long cpcBidFloorMicros_ = 0L;
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return Whether the cpcBidFloorMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpcBidFloorMicros() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return The cpcBidFloorMicros.
   */
  @java.lang.Override
  public long getCpcBidFloorMicros() {
    return cpcBidFloorMicros_;
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
      output.writeDouble(4, targetRoas_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, cpcBidCeilingMicros_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(6, cpcBidFloorMicros_);
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
        .computeDoubleSize(4, targetRoas_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, cpcBidCeilingMicros_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, cpcBidFloorMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.TargetRoas)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.TargetRoas other = (com.google.ads.googleads.v18.common.TargetRoas) obj;

    if (hasTargetRoas() != other.hasTargetRoas()) return false;
    if (hasTargetRoas()) {
      if (java.lang.Double.doubleToLongBits(getTargetRoas())
          != java.lang.Double.doubleToLongBits(
              other.getTargetRoas())) return false;
    }
    if (hasCpcBidCeilingMicros() != other.hasCpcBidCeilingMicros()) return false;
    if (hasCpcBidCeilingMicros()) {
      if (getCpcBidCeilingMicros()
          != other.getCpcBidCeilingMicros()) return false;
    }
    if (hasCpcBidFloorMicros() != other.hasCpcBidFloorMicros()) return false;
    if (hasCpcBidFloorMicros()) {
      if (getCpcBidFloorMicros()
          != other.getCpcBidFloorMicros()) return false;
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
    if (hasTargetRoas()) {
      hash = (37 * hash) + TARGET_ROAS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getTargetRoas()));
    }
    if (hasCpcBidCeilingMicros()) {
      hash = (37 * hash) + CPC_BID_CEILING_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidCeilingMicros());
    }
    if (hasCpcBidFloorMicros()) {
      hash = (37 * hash) + CPC_BID_FLOOR_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCpcBidFloorMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.TargetRoas parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.TargetRoas parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.TargetRoas parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.TargetRoas prototype) {
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
   * An automated bidding strategy that helps you maximize revenue while
   * averaging a specific target return on ad spend (ROAS).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.TargetRoas}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.TargetRoas)
      com.google.ads.googleads.v18.common.TargetRoasOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.BiddingProto.internal_static_google_ads_googleads_v18_common_TargetRoas_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.BiddingProto.internal_static_google_ads_googleads_v18_common_TargetRoas_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.TargetRoas.class, com.google.ads.googleads.v18.common.TargetRoas.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.TargetRoas.newBuilder()
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
      targetRoas_ = 0D;
      cpcBidCeilingMicros_ = 0L;
      cpcBidFloorMicros_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.BiddingProto.internal_static_google_ads_googleads_v18_common_TargetRoas_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.TargetRoas getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.TargetRoas.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.TargetRoas build() {
      com.google.ads.googleads.v18.common.TargetRoas result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.TargetRoas buildPartial() {
      com.google.ads.googleads.v18.common.TargetRoas result = new com.google.ads.googleads.v18.common.TargetRoas(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.TargetRoas result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetRoas_ = targetRoas_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpcBidCeilingMicros_ = cpcBidCeilingMicros_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cpcBidFloorMicros_ = cpcBidFloorMicros_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.ads.googleads.v18.common.TargetRoas) {
        return mergeFrom((com.google.ads.googleads.v18.common.TargetRoas)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.TargetRoas other) {
      if (other == com.google.ads.googleads.v18.common.TargetRoas.getDefaultInstance()) return this;
      if (other.hasTargetRoas()) {
        setTargetRoas(other.getTargetRoas());
      }
      if (other.hasCpcBidCeilingMicros()) {
        setCpcBidCeilingMicros(other.getCpcBidCeilingMicros());
      }
      if (other.hasCpcBidFloorMicros()) {
        setCpcBidFloorMicros(other.getCpcBidFloorMicros());
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
            case 33: {
              targetRoas_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 33
            case 40: {
              cpcBidCeilingMicros_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 40
            case 48: {
              cpcBidFloorMicros_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 48
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

    private double targetRoas_ ;
    /**
     * <pre>
     * Required. The chosen revenue (based on conversion data) per unit of spend.
     * Value must be between 0.01 and 1000.0, inclusive.
     * </pre>
     *
     * <code>optional double target_roas = 4;</code>
     * @return Whether the targetRoas field is set.
     */
    @java.lang.Override
    public boolean hasTargetRoas() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The chosen revenue (based on conversion data) per unit of spend.
     * Value must be between 0.01 and 1000.0, inclusive.
     * </pre>
     *
     * <code>optional double target_roas = 4;</code>
     * @return The targetRoas.
     */
    @java.lang.Override
    public double getTargetRoas() {
      return targetRoas_;
    }
    /**
     * <pre>
     * Required. The chosen revenue (based on conversion data) per unit of spend.
     * Value must be between 0.01 and 1000.0, inclusive.
     * </pre>
     *
     * <code>optional double target_roas = 4;</code>
     * @param value The targetRoas to set.
     * @return This builder for chaining.
     */
    public Builder setTargetRoas(double value) {

      targetRoas_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The chosen revenue (based on conversion data) per unit of spend.
     * Value must be between 0.01 and 1000.0, inclusive.
     * </pre>
     *
     * <code>optional double target_roas = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetRoas() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetRoas_ = 0D;
      onChanged();
      return this;
    }

    private long cpcBidCeilingMicros_ ;
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return Whether the cpcBidCeilingMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidCeilingMicros() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return The cpcBidCeilingMicros.
     */
    @java.lang.Override
    public long getCpcBidCeilingMicros() {
      return cpcBidCeilingMicros_;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @param value The cpcBidCeilingMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidCeilingMicros(long value) {

      cpcBidCeilingMicros_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidCeilingMicros() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpcBidCeilingMicros_ = 0L;
      onChanged();
      return this;
    }

    private long cpcBidFloorMicros_ ;
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_floor_micros = 6;</code>
     * @return Whether the cpcBidFloorMicros field is set.
     */
    @java.lang.Override
    public boolean hasCpcBidFloorMicros() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_floor_micros = 6;</code>
     * @return The cpcBidFloorMicros.
     */
    @java.lang.Override
    public long getCpcBidFloorMicros() {
      return cpcBidFloorMicros_;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_floor_micros = 6;</code>
     * @param value The cpcBidFloorMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCpcBidFloorMicros(long value) {

      cpcBidFloorMicros_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum bid limit that can be set by the bid strategy.
     * The limit applies to all keywords managed by the strategy.
     * This should only be set for portfolio bid strategies.
     * </pre>
     *
     * <code>optional int64 cpc_bid_floor_micros = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpcBidFloorMicros() {
      bitField0_ = (bitField0_ & ~0x00000004);
      cpcBidFloorMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.TargetRoas)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.TargetRoas)
  private static final com.google.ads.googleads.v18.common.TargetRoas DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.TargetRoas();
  }

  public static com.google.ads.googleads.v18.common.TargetRoas getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetRoas>
      PARSER = new com.google.protobuf.AbstractParser<TargetRoas>() {
    @java.lang.Override
    public TargetRoas parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetRoas> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetRoas> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.TargetRoas getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

