// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/campaign_search_term_insight.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

/**
 * <pre>
 * A Campaign search term view.
 * Historical data is available starting March 2023.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.resources.CampaignSearchTermInsight}
 */
public final class CampaignSearchTermInsight extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.resources.CampaignSearchTermInsight)
    CampaignSearchTermInsightOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignSearchTermInsight.newBuilder() to construct.
  private CampaignSearchTermInsight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignSearchTermInsight() {
    resourceName_ = "";
    categoryLabel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignSearchTermInsight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.resources.CampaignSearchTermInsightProto.internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.resources.CampaignSearchTermInsightProto.internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.class, com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Output only. The resource name of the campaign level search term insight.
   * Campaign level search term insight resource names have the form:
   *
   * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the campaign level search term insight.
   * Campaign level search term insight resource names have the form:
   *
   * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int CATEGORY_LABEL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object categoryLabel_ = "";
  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryLabel field is set.
   */
  @java.lang.Override
  public boolean hasCategoryLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryLabel.
   */
  @java.lang.Override
  public java.lang.String getCategoryLabel() {
    java.lang.Object ref = categoryLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      categoryLabel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for categoryLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryLabelBytes() {
    java.lang.Object ref = categoryLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      categoryLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 3;
  private long id_ = 0L;
  /**
   * <pre>
   * Output only. The ID of the insight.
   * </pre>
   *
   * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. The ID of the insight.
   * </pre>
   *
   * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CAMPAIGN_ID_FIELD_NUMBER = 4;
  private long campaignId_ = 0L;
  /**
   * <pre>
   * Output only. The ID of the campaign.
   * </pre>
   *
   * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the campaignId field is set.
   */
  @java.lang.Override
  public boolean hasCampaignId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Output only. The ID of the campaign.
   * </pre>
   *
   * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignId.
   */
  @java.lang.Override
  public long getCampaignId() {
    return campaignId_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, categoryLabel_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(3, id_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(4, campaignId_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, categoryLabel_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, id_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, campaignId_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.resources.CampaignSearchTermInsight)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.resources.CampaignSearchTermInsight other = (com.google.ads.googleads.v19.resources.CampaignSearchTermInsight) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCategoryLabel() != other.hasCategoryLabel()) return false;
    if (hasCategoryLabel()) {
      if (!getCategoryLabel()
          .equals(other.getCategoryLabel())) return false;
    }
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasCampaignId() != other.hasCampaignId()) return false;
    if (hasCampaignId()) {
      if (getCampaignId()
          != other.getCampaignId()) return false;
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
    if (hasCategoryLabel()) {
      hash = (37 * hash) + CATEGORY_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryLabel().hashCode();
    }
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasCampaignId()) {
      hash = (37 * hash) + CAMPAIGN_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCampaignId());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.resources.CampaignSearchTermInsight prototype) {
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
   * A Campaign search term view.
   * Historical data is available starting March 2023.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.resources.CampaignSearchTermInsight}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.resources.CampaignSearchTermInsight)
      com.google.ads.googleads.v19.resources.CampaignSearchTermInsightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.resources.CampaignSearchTermInsightProto.internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.resources.CampaignSearchTermInsightProto.internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.class, com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.newBuilder()
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
      resourceName_ = "";
      categoryLabel_ = "";
      id_ = 0L;
      campaignId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.resources.CampaignSearchTermInsightProto.internal_static_google_ads_googleads_v19_resources_CampaignSearchTermInsight_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.CampaignSearchTermInsight getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.CampaignSearchTermInsight build() {
      com.google.ads.googleads.v19.resources.CampaignSearchTermInsight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.CampaignSearchTermInsight buildPartial() {
      com.google.ads.googleads.v19.resources.CampaignSearchTermInsight result = new com.google.ads.googleads.v19.resources.CampaignSearchTermInsight(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.resources.CampaignSearchTermInsight result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.categoryLabel_ = categoryLabel_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.campaignId_ = campaignId_;
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
      if (other instanceof com.google.ads.googleads.v19.resources.CampaignSearchTermInsight) {
        return mergeFrom((com.google.ads.googleads.v19.resources.CampaignSearchTermInsight)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.resources.CampaignSearchTermInsight other) {
      if (other == com.google.ads.googleads.v19.resources.CampaignSearchTermInsight.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCategoryLabel()) {
        categoryLabel_ = other.categoryLabel_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasCampaignId()) {
        setCampaignId(other.getCampaignId());
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
              categoryLabel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              campaignId_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * Output only. The resource name of the campaign level search term insight.
     * Campaign level search term insight resource names have the form:
     *
     * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the campaign level search term insight.
     * Campaign level search term insight resource names have the form:
     *
     * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the campaign level search term insight.
     * Campaign level search term insight resource names have the form:
     *
     * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the campaign level search term insight.
     * Campaign level search term insight resource names have the form:
     *
     * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the campaign level search term insight.
     * Campaign level search term insight resource names have the form:
     *
     * `customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{category_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object categoryLabel_ = "";
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the categoryLabel field is set.
     */
    public boolean hasCategoryLabel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The categoryLabel.
     */
    public java.lang.String getCategoryLabel() {
      java.lang.Object ref = categoryLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        categoryLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for categoryLabel.
     */
    public com.google.protobuf.ByteString
        getCategoryLabelBytes() {
      java.lang.Object ref = categoryLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        categoryLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The categoryLabel to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      categoryLabel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryLabel() {
      categoryLabel_ = getDefaultInstance().getCategoryLabel();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The label for the search category. An empty string denotes the
     * catch-all category for search terms that didn't fit into another category.
     * </pre>
     *
     * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for categoryLabel to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      categoryLabel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * Output only. The ID of the insight.
     * </pre>
     *
     * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. The ID of the insight.
     * </pre>
     *
     * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Output only. The ID of the insight.
     * </pre>
     *
     * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the insight.
     * </pre>
     *
     * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      id_ = 0L;
      onChanged();
      return this;
    }

    private long campaignId_ ;
    /**
     * <pre>
     * Output only. The ID of the campaign.
     * </pre>
     *
     * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the campaignId field is set.
     */
    @java.lang.Override
    public boolean hasCampaignId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Output only. The ID of the campaign.
     * </pre>
     *
     * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The campaignId.
     */
    @java.lang.Override
    public long getCampaignId() {
      return campaignId_;
    }
    /**
     * <pre>
     * Output only. The ID of the campaign.
     * </pre>
     *
     * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The campaignId to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignId(long value) {

      campaignId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the campaign.
     * </pre>
     *
     * <code>optional int64 campaign_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      campaignId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.resources.CampaignSearchTermInsight)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.resources.CampaignSearchTermInsight)
  private static final com.google.ads.googleads.v19.resources.CampaignSearchTermInsight DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.resources.CampaignSearchTermInsight();
  }

  public static com.google.ads.googleads.v19.resources.CampaignSearchTermInsight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignSearchTermInsight>
      PARSER = new com.google.protobuf.AbstractParser<CampaignSearchTermInsight>() {
    @java.lang.Override
    public CampaignSearchTermInsight parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignSearchTermInsight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignSearchTermInsight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.resources.CampaignSearchTermInsight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

