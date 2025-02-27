// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/bidding_seasonality_adjustment_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * The result for the seasonality adjustment mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult}
 */
public final class MutateBiddingSeasonalityAdjustmentsResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)
    MutateBiddingSeasonalityAdjustmentsResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateBiddingSeasonalityAdjustmentsResult.newBuilder() to construct.
  private MutateBiddingSeasonalityAdjustmentsResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateBiddingSeasonalityAdjustmentsResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateBiddingSeasonalityAdjustmentsResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.BiddingSeasonalityAdjustmentServiceProto.internal_static_google_ads_googleads_v19_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.BiddingSeasonalityAdjustmentServiceProto.internal_static_google_ads_googleads_v19_services_MutateBiddingSeasonalityAdjustmentsResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.class, com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIDDING_SEASONALITY_ADJUSTMENT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment biddingSeasonalityAdjustment_;
  /**
   * <pre>
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   * @return Whether the biddingSeasonalityAdjustment field is set.
   */
  @java.lang.Override
  public boolean hasBiddingSeasonalityAdjustment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   * @return The biddingSeasonalityAdjustment.
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment() {
    return biddingSeasonalityAdjustment_ == null ? com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.getDefaultInstance() : biddingSeasonalityAdjustment_;
  }
  /**
   * <pre>
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustmentOrBuilder getBiddingSeasonalityAdjustmentOrBuilder() {
    return biddingSeasonalityAdjustment_ == null ? com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.getDefaultInstance() : biddingSeasonalityAdjustment_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getBiddingSeasonalityAdjustment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBiddingSeasonalityAdjustment());
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult other = (com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasBiddingSeasonalityAdjustment() != other.hasBiddingSeasonalityAdjustment()) return false;
    if (hasBiddingSeasonalityAdjustment()) {
      if (!getBiddingSeasonalityAdjustment()
          .equals(other.getBiddingSeasonalityAdjustment())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasBiddingSeasonalityAdjustment()) {
      hash = (37 * hash) + BIDDING_SEASONALITY_ADJUSTMENT_FIELD_NUMBER;
      hash = (53 * hash) + getBiddingSeasonalityAdjustment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult prototype) {
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
   * The result for the seasonality adjustment mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)
      com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.BiddingSeasonalityAdjustmentServiceProto.internal_static_google_ads_googleads_v19_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.BiddingSeasonalityAdjustmentServiceProto.internal_static_google_ads_googleads_v19_services_MutateBiddingSeasonalityAdjustmentsResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.class, com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.newBuilder()
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
        getBiddingSeasonalityAdjustmentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      biddingSeasonalityAdjustment_ = null;
      if (biddingSeasonalityAdjustmentBuilder_ != null) {
        biddingSeasonalityAdjustmentBuilder_.dispose();
        biddingSeasonalityAdjustmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.BiddingSeasonalityAdjustmentServiceProto.internal_static_google_ads_googleads_v19_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult build() {
      com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult buildPartial() {
      com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult result = new com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.biddingSeasonalityAdjustment_ = biddingSeasonalityAdjustmentBuilder_ == null
            ? biddingSeasonalityAdjustment_
            : biddingSeasonalityAdjustmentBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult) {
        return mergeFrom((com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult other) {
      if (other == com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBiddingSeasonalityAdjustment()) {
        mergeBiddingSeasonalityAdjustment(other.getBiddingSeasonalityAdjustment());
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getBiddingSeasonalityAdjustmentFieldBuilder().getBuilder(),
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment biddingSeasonalityAdjustment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.Builder, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustmentOrBuilder> biddingSeasonalityAdjustmentBuilder_;
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     * @return Whether the biddingSeasonalityAdjustment field is set.
     */
    public boolean hasBiddingSeasonalityAdjustment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     * @return The biddingSeasonalityAdjustment.
     */
    public com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment() {
      if (biddingSeasonalityAdjustmentBuilder_ == null) {
        return biddingSeasonalityAdjustment_ == null ? com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.getDefaultInstance() : biddingSeasonalityAdjustment_;
      } else {
        return biddingSeasonalityAdjustmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public Builder setBiddingSeasonalityAdjustment(com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment value) {
      if (biddingSeasonalityAdjustmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        biddingSeasonalityAdjustment_ = value;
      } else {
        biddingSeasonalityAdjustmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public Builder setBiddingSeasonalityAdjustment(
        com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.Builder builderForValue) {
      if (biddingSeasonalityAdjustmentBuilder_ == null) {
        biddingSeasonalityAdjustment_ = builderForValue.build();
      } else {
        biddingSeasonalityAdjustmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public Builder mergeBiddingSeasonalityAdjustment(com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment value) {
      if (biddingSeasonalityAdjustmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          biddingSeasonalityAdjustment_ != null &&
          biddingSeasonalityAdjustment_ != com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.getDefaultInstance()) {
          getBiddingSeasonalityAdjustmentBuilder().mergeFrom(value);
        } else {
          biddingSeasonalityAdjustment_ = value;
        }
      } else {
        biddingSeasonalityAdjustmentBuilder_.mergeFrom(value);
      }
      if (biddingSeasonalityAdjustment_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public Builder clearBiddingSeasonalityAdjustment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      biddingSeasonalityAdjustment_ = null;
      if (biddingSeasonalityAdjustmentBuilder_ != null) {
        biddingSeasonalityAdjustmentBuilder_.dispose();
        biddingSeasonalityAdjustmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.Builder getBiddingSeasonalityAdjustmentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBiddingSeasonalityAdjustmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    public com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustmentOrBuilder getBiddingSeasonalityAdjustmentOrBuilder() {
      if (biddingSeasonalityAdjustmentBuilder_ != null) {
        return biddingSeasonalityAdjustmentBuilder_.getMessageOrBuilder();
      } else {
        return biddingSeasonalityAdjustment_ == null ?
            com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.getDefaultInstance() : biddingSeasonalityAdjustment_;
      }
    }
    /**
     * <pre>
     * The mutated bidding seasonality adjustment with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.Builder, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustmentOrBuilder> 
        getBiddingSeasonalityAdjustmentFieldBuilder() {
      if (biddingSeasonalityAdjustmentBuilder_ == null) {
        biddingSeasonalityAdjustmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustment.Builder, com.google.ads.googleads.v19.resources.BiddingSeasonalityAdjustmentOrBuilder>(
                getBiddingSeasonalityAdjustment(),
                getParentForChildren(),
                isClean());
        biddingSeasonalityAdjustment_ = null;
      }
      return biddingSeasonalityAdjustmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult)
  private static final com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult();
  }

  public static com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateBiddingSeasonalityAdjustmentsResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateBiddingSeasonalityAdjustmentsResult>() {
    @java.lang.Override
    public MutateBiddingSeasonalityAdjustmentsResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateBiddingSeasonalityAdjustmentsResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateBiddingSeasonalityAdjustmentsResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.MutateBiddingSeasonalityAdjustmentsResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

