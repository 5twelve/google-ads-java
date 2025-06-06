// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/simulation.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * Projected metrics for a specific percent CPC amount. Only Hotel advertising
 * channel type supports this field.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.PercentCpcBidSimulationPoint}
 */
public final class PercentCpcBidSimulationPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)
    PercentCpcBidSimulationPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PercentCpcBidSimulationPoint.newBuilder() to construct.
  private PercentCpcBidSimulationPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PercentCpcBidSimulationPoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PercentCpcBidSimulationPoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.SimulationProto.internal_static_google_ads_googleads_v19_common_PercentCpcBidSimulationPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.SimulationProto.internal_static_google_ads_googleads_v19_common_PercentCpcBidSimulationPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.class, com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.Builder.class);
  }

  private int bitField0_;
  public static final int PERCENT_CPC_BID_MICROS_FIELD_NUMBER = 1;
  private long percentCpcBidMicros_ = 0L;
  /**
   * <pre>
   * The simulated percent CPC upon which projected metrics are based. Percent
   * CPC expressed as fraction of the advertised price for some good or service.
   * The value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>optional int64 percent_cpc_bid_micros = 1;</code>
   * @return Whether the percentCpcBidMicros field is set.
   */
  @java.lang.Override
  public boolean hasPercentCpcBidMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The simulated percent CPC upon which projected metrics are based. Percent
   * CPC expressed as fraction of the advertised price for some good or service.
   * The value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>optional int64 percent_cpc_bid_micros = 1;</code>
   * @return The percentCpcBidMicros.
   */
  @java.lang.Override
  public long getPercentCpcBidMicros() {
    return percentCpcBidMicros_;
  }

  public static final int BIDDABLE_CONVERSIONS_FIELD_NUMBER = 2;
  private double biddableConversions_ = 0D;
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 2;</code>
   * @return Whether the biddableConversions field is set.
   */
  @java.lang.Override
  public boolean hasBiddableConversions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 2;</code>
   * @return The biddableConversions.
   */
  @java.lang.Override
  public double getBiddableConversions() {
    return biddableConversions_;
  }

  public static final int BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER = 3;
  private double biddableConversionsValue_ = 0D;
  /**
   * <pre>
   * Projected total value of biddable conversions in local currency.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 3;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  @java.lang.Override
  public boolean hasBiddableConversionsValue() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Projected total value of biddable conversions in local currency.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 3;</code>
   * @return The biddableConversionsValue.
   */
  @java.lang.Override
  public double getBiddableConversionsValue() {
    return biddableConversionsValue_;
  }

  public static final int CLICKS_FIELD_NUMBER = 4;
  private long clicks_ = 0L;
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 4;</code>
   * @return Whether the clicks field is set.
   */
  @java.lang.Override
  public boolean hasClicks() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 4;</code>
   * @return The clicks.
   */
  @java.lang.Override
  public long getClicks() {
    return clicks_;
  }

  public static final int COST_MICROS_FIELD_NUMBER = 5;
  private long costMicros_ = 0L;
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return Whether the costMicros field is set.
   */
  @java.lang.Override
  public boolean hasCostMicros() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return The costMicros.
   */
  @java.lang.Override
  public long getCostMicros() {
    return costMicros_;
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 6;
  private long impressions_ = 0L;
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 6;</code>
   * @return Whether the impressions field is set.
   */
  @java.lang.Override
  public boolean hasImpressions() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 6;</code>
   * @return The impressions.
   */
  @java.lang.Override
  public long getImpressions() {
    return impressions_;
  }

  public static final int TOP_SLOT_IMPRESSIONS_FIELD_NUMBER = 7;
  private long topSlotImpressions_ = 0L;
  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 7;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  @java.lang.Override
  public boolean hasTopSlotImpressions() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 7;</code>
   * @return The topSlotImpressions.
   */
  @java.lang.Override
  public long getTopSlotImpressions() {
    return topSlotImpressions_;
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
      output.writeInt64(1, percentCpcBidMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, biddableConversions_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(3, biddableConversionsValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(4, clicks_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(5, costMicros_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      output.writeInt64(6, impressions_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      output.writeInt64(7, topSlotImpressions_);
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
        .computeInt64Size(1, percentCpcBidMicros_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, biddableConversions_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, biddableConversionsValue_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, clicks_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, costMicros_);
    }
    if (((bitField0_ & 0x00000020) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, impressions_);
    }
    if (((bitField0_ & 0x00000040) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, topSlotImpressions_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint other = (com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint) obj;

    if (hasPercentCpcBidMicros() != other.hasPercentCpcBidMicros()) return false;
    if (hasPercentCpcBidMicros()) {
      if (getPercentCpcBidMicros()
          != other.getPercentCpcBidMicros()) return false;
    }
    if (hasBiddableConversions() != other.hasBiddableConversions()) return false;
    if (hasBiddableConversions()) {
      if (java.lang.Double.doubleToLongBits(getBiddableConversions())
          != java.lang.Double.doubleToLongBits(
              other.getBiddableConversions())) return false;
    }
    if (hasBiddableConversionsValue() != other.hasBiddableConversionsValue()) return false;
    if (hasBiddableConversionsValue()) {
      if (java.lang.Double.doubleToLongBits(getBiddableConversionsValue())
          != java.lang.Double.doubleToLongBits(
              other.getBiddableConversionsValue())) return false;
    }
    if (hasClicks() != other.hasClicks()) return false;
    if (hasClicks()) {
      if (getClicks()
          != other.getClicks()) return false;
    }
    if (hasCostMicros() != other.hasCostMicros()) return false;
    if (hasCostMicros()) {
      if (getCostMicros()
          != other.getCostMicros()) return false;
    }
    if (hasImpressions() != other.hasImpressions()) return false;
    if (hasImpressions()) {
      if (getImpressions()
          != other.getImpressions()) return false;
    }
    if (hasTopSlotImpressions() != other.hasTopSlotImpressions()) return false;
    if (hasTopSlotImpressions()) {
      if (getTopSlotImpressions()
          != other.getTopSlotImpressions()) return false;
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
    if (hasPercentCpcBidMicros()) {
      hash = (37 * hash) + PERCENT_CPC_BID_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPercentCpcBidMicros());
    }
    if (hasBiddableConversions()) {
      hash = (37 * hash) + BIDDABLE_CONVERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getBiddableConversions()));
    }
    if (hasBiddableConversionsValue()) {
      hash = (37 * hash) + BIDDABLE_CONVERSIONS_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getBiddableConversionsValue()));
    }
    if (hasClicks()) {
      hash = (37 * hash) + CLICKS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getClicks());
    }
    if (hasCostMicros()) {
      hash = (37 * hash) + COST_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCostMicros());
    }
    if (hasImpressions()) {
      hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getImpressions());
    }
    if (hasTopSlotImpressions()) {
      hash = (37 * hash) + TOP_SLOT_IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTopSlotImpressions());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint prototype) {
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
   * Projected metrics for a specific percent CPC amount. Only Hotel advertising
   * channel type supports this field.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.PercentCpcBidSimulationPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)
      com.google.ads.googleads.v19.common.PercentCpcBidSimulationPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.SimulationProto.internal_static_google_ads_googleads_v19_common_PercentCpcBidSimulationPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.SimulationProto.internal_static_google_ads_googleads_v19_common_PercentCpcBidSimulationPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.class, com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.newBuilder()
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
      percentCpcBidMicros_ = 0L;
      biddableConversions_ = 0D;
      biddableConversionsValue_ = 0D;
      clicks_ = 0L;
      costMicros_ = 0L;
      impressions_ = 0L;
      topSlotImpressions_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.SimulationProto.internal_static_google_ads_googleads_v19_common_PercentCpcBidSimulationPoint_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint build() {
      com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint buildPartial() {
      com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint result = new com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.percentCpcBidMicros_ = percentCpcBidMicros_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.biddableConversions_ = biddableConversions_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.biddableConversionsValue_ = biddableConversionsValue_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.clicks_ = clicks_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.costMicros_ = costMicros_;
        to_bitField0_ |= 0x00000010;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.impressions_ = impressions_;
        to_bitField0_ |= 0x00000020;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.topSlotImpressions_ = topSlotImpressions_;
        to_bitField0_ |= 0x00000040;
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
      if (other instanceof com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint) {
        return mergeFrom((com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint other) {
      if (other == com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint.getDefaultInstance()) return this;
      if (other.hasPercentCpcBidMicros()) {
        setPercentCpcBidMicros(other.getPercentCpcBidMicros());
      }
      if (other.hasBiddableConversions()) {
        setBiddableConversions(other.getBiddableConversions());
      }
      if (other.hasBiddableConversionsValue()) {
        setBiddableConversionsValue(other.getBiddableConversionsValue());
      }
      if (other.hasClicks()) {
        setClicks(other.getClicks());
      }
      if (other.hasCostMicros()) {
        setCostMicros(other.getCostMicros());
      }
      if (other.hasImpressions()) {
        setImpressions(other.getImpressions());
      }
      if (other.hasTopSlotImpressions()) {
        setTopSlotImpressions(other.getTopSlotImpressions());
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
              percentCpcBidMicros_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 17: {
              biddableConversions_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              biddableConversionsValue_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 32: {
              clicks_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              costMicros_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              impressions_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              topSlotImpressions_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
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

    private long percentCpcBidMicros_ ;
    /**
     * <pre>
     * The simulated percent CPC upon which projected metrics are based. Percent
     * CPC expressed as fraction of the advertised price for some good or service.
     * The value stored here is 1,000,000 * [fraction].
     * </pre>
     *
     * <code>optional int64 percent_cpc_bid_micros = 1;</code>
     * @return Whether the percentCpcBidMicros field is set.
     */
    @java.lang.Override
    public boolean hasPercentCpcBidMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The simulated percent CPC upon which projected metrics are based. Percent
     * CPC expressed as fraction of the advertised price for some good or service.
     * The value stored here is 1,000,000 * [fraction].
     * </pre>
     *
     * <code>optional int64 percent_cpc_bid_micros = 1;</code>
     * @return The percentCpcBidMicros.
     */
    @java.lang.Override
    public long getPercentCpcBidMicros() {
      return percentCpcBidMicros_;
    }
    /**
     * <pre>
     * The simulated percent CPC upon which projected metrics are based. Percent
     * CPC expressed as fraction of the advertised price for some good or service.
     * The value stored here is 1,000,000 * [fraction].
     * </pre>
     *
     * <code>optional int64 percent_cpc_bid_micros = 1;</code>
     * @param value The percentCpcBidMicros to set.
     * @return This builder for chaining.
     */
    public Builder setPercentCpcBidMicros(long value) {

      percentCpcBidMicros_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The simulated percent CPC upon which projected metrics are based. Percent
     * CPC expressed as fraction of the advertised price for some good or service.
     * The value stored here is 1,000,000 * [fraction].
     * </pre>
     *
     * <code>optional int64 percent_cpc_bid_micros = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPercentCpcBidMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      percentCpcBidMicros_ = 0L;
      onChanged();
      return this;
    }

    private double biddableConversions_ ;
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>optional double biddable_conversions = 2;</code>
     * @return Whether the biddableConversions field is set.
     */
    @java.lang.Override
    public boolean hasBiddableConversions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>optional double biddable_conversions = 2;</code>
     * @return The biddableConversions.
     */
    @java.lang.Override
    public double getBiddableConversions() {
      return biddableConversions_;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>optional double biddable_conversions = 2;</code>
     * @param value The biddableConversions to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversions(double value) {

      biddableConversions_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of biddable conversions.
     * </pre>
     *
     * <code>optional double biddable_conversions = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      biddableConversions_ = 0D;
      onChanged();
      return this;
    }

    private double biddableConversionsValue_ ;
    /**
     * <pre>
     * Projected total value of biddable conversions in local currency.
     * </pre>
     *
     * <code>optional double biddable_conversions_value = 3;</code>
     * @return Whether the biddableConversionsValue field is set.
     */
    @java.lang.Override
    public boolean hasBiddableConversionsValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Projected total value of biddable conversions in local currency.
     * </pre>
     *
     * <code>optional double biddable_conversions_value = 3;</code>
     * @return The biddableConversionsValue.
     */
    @java.lang.Override
    public double getBiddableConversionsValue() {
      return biddableConversionsValue_;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions in local currency.
     * </pre>
     *
     * <code>optional double biddable_conversions_value = 3;</code>
     * @param value The biddableConversionsValue to set.
     * @return This builder for chaining.
     */
    public Builder setBiddableConversionsValue(double value) {

      biddableConversionsValue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected total value of biddable conversions in local currency.
     * </pre>
     *
     * <code>optional double biddable_conversions_value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBiddableConversionsValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      biddableConversionsValue_ = 0D;
      onChanged();
      return this;
    }

    private long clicks_ ;
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>optional int64 clicks = 4;</code>
     * @return Whether the clicks field is set.
     */
    @java.lang.Override
    public boolean hasClicks() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>optional int64 clicks = 4;</code>
     * @return The clicks.
     */
    @java.lang.Override
    public long getClicks() {
      return clicks_;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>optional int64 clicks = 4;</code>
     * @param value The clicks to set.
     * @return This builder for chaining.
     */
    public Builder setClicks(long value) {

      clicks_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of clicks.
     * </pre>
     *
     * <code>optional int64 clicks = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClicks() {
      bitField0_ = (bitField0_ & ~0x00000008);
      clicks_ = 0L;
      onChanged();
      return this;
    }

    private long costMicros_ ;
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>optional int64 cost_micros = 5;</code>
     * @return Whether the costMicros field is set.
     */
    @java.lang.Override
    public boolean hasCostMicros() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>optional int64 cost_micros = 5;</code>
     * @return The costMicros.
     */
    @java.lang.Override
    public long getCostMicros() {
      return costMicros_;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>optional int64 cost_micros = 5;</code>
     * @param value The costMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCostMicros(long value) {

      costMicros_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>optional int64 cost_micros = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCostMicros() {
      bitField0_ = (bitField0_ & ~0x00000010);
      costMicros_ = 0L;
      onChanged();
      return this;
    }

    private long impressions_ ;
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>optional int64 impressions = 6;</code>
     * @return Whether the impressions field is set.
     */
    @java.lang.Override
    public boolean hasImpressions() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>optional int64 impressions = 6;</code>
     * @return The impressions.
     */
    @java.lang.Override
    public long getImpressions() {
      return impressions_;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>optional int64 impressions = 6;</code>
     * @param value The impressions to set.
     * @return This builder for chaining.
     */
    public Builder setImpressions(long value) {

      impressions_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>optional int64 impressions = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearImpressions() {
      bitField0_ = (bitField0_ & ~0x00000020);
      impressions_ = 0L;
      onChanged();
      return this;
    }

    private long topSlotImpressions_ ;
    /**
     * <pre>
     * Projected number of top slot impressions.
     * </pre>
     *
     * <code>optional int64 top_slot_impressions = 7;</code>
     * @return Whether the topSlotImpressions field is set.
     */
    @java.lang.Override
    public boolean hasTopSlotImpressions() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * </pre>
     *
     * <code>optional int64 top_slot_impressions = 7;</code>
     * @return The topSlotImpressions.
     */
    @java.lang.Override
    public long getTopSlotImpressions() {
      return topSlotImpressions_;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * </pre>
     *
     * <code>optional int64 top_slot_impressions = 7;</code>
     * @param value The topSlotImpressions to set.
     * @return This builder for chaining.
     */
    public Builder setTopSlotImpressions(long value) {

      topSlotImpressions_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Projected number of top slot impressions.
     * </pre>
     *
     * <code>optional int64 top_slot_impressions = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopSlotImpressions() {
      bitField0_ = (bitField0_ & ~0x00000040);
      topSlotImpressions_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)
  private static final com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint();
  }

  public static com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PercentCpcBidSimulationPoint>
      PARSER = new com.google.protobuf.AbstractParser<PercentCpcBidSimulationPoint>() {
    @java.lang.Override
    public PercentCpcBidSimulationPoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<PercentCpcBidSimulationPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PercentCpcBidSimulationPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.PercentCpcBidSimulationPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

