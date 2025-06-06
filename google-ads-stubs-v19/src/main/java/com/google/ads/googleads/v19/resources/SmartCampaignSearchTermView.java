// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/smart_campaign_search_term_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

/**
 * <pre>
 * A Smart campaign search term view.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.resources.SmartCampaignSearchTermView}
 */
public final class SmartCampaignSearchTermView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.resources.SmartCampaignSearchTermView)
    SmartCampaignSearchTermViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartCampaignSearchTermView.newBuilder() to construct.
  private SmartCampaignSearchTermView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartCampaignSearchTermView() {
    resourceName_ = "";
    searchTerm_ = "";
    campaign_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartCampaignSearchTermView();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewProto.internal_static_google_ads_googleads_v19_resources_SmartCampaignSearchTermView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewProto.internal_static_google_ads_googleads_v19_resources_SmartCampaignSearchTermView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.class, com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Output only. The resource name of the Smart campaign search term view.
   * Smart campaign search term view resource names have the form:
   *
   * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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
   * Output only. The resource name of the Smart campaign search term view.
   * Smart campaign search term view resource names have the form:
   *
   * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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

  public static final int SEARCH_TERM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object searchTerm_ = "";
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchTerm.
   */
  @java.lang.Override
  public java.lang.String getSearchTerm() {
    java.lang.Object ref = searchTerm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchTerm_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for searchTerm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSearchTermBytes() {
    java.lang.Object ref = searchTerm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      searchTerm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object campaign_ = "";
  /**
   * <pre>
   * Output only. The Smart campaign the search term served in.
   * </pre>
   *
   * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  @java.lang.Override
  public java.lang.String getCampaign() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The Smart campaign the search term served in.
   * </pre>
   *
   * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignBytes() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchTerm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, searchTerm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, campaign_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(searchTerm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, searchTerm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, campaign_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView other = (com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getSearchTerm()
        .equals(other.getSearchTerm())) return false;
    if (!getCampaign()
        .equals(other.getCampaign())) return false;
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
    hash = (37 * hash) + SEARCH_TERM_FIELD_NUMBER;
    hash = (53 * hash) + getSearchTerm().hashCode();
    hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
    hash = (53 * hash) + getCampaign().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView prototype) {
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
   * A Smart campaign search term view.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.resources.SmartCampaignSearchTermView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.resources.SmartCampaignSearchTermView)
      com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewProto.internal_static_google_ads_googleads_v19_resources_SmartCampaignSearchTermView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewProto.internal_static_google_ads_googleads_v19_resources_SmartCampaignSearchTermView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.class, com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.newBuilder()
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
      searchTerm_ = "";
      campaign_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermViewProto.internal_static_google_ads_googleads_v19_resources_SmartCampaignSearchTermView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView build() {
      com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView buildPartial() {
      com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView result = new com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchTerm_ = searchTerm_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.campaign_ = campaign_;
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
      if (other instanceof com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView) {
        return mergeFrom((com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView other) {
      if (other == com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSearchTerm().isEmpty()) {
        searchTerm_ = other.searchTerm_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCampaign().isEmpty()) {
        campaign_ = other.campaign_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              searchTerm_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              campaign_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * Output only. The resource name of the Smart campaign search term view.
     * Smart campaign search term view resource names have the form:
     *
     * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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
     * Output only. The resource name of the Smart campaign search term view.
     * Smart campaign search term view resource names have the form:
     *
     * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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
     * Output only. The resource name of the Smart campaign search term view.
     * Smart campaign search term view resource names have the form:
     *
     * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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
     * Output only. The resource name of the Smart campaign search term view.
     * Smart campaign search term view resource names have the form:
     *
     * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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
     * Output only. The resource name of the Smart campaign search term view.
     * Smart campaign search term view resource names have the form:
     *
     * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
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

    private java.lang.Object searchTerm_ = "";
    /**
     * <pre>
     * Output only. The search term.
     * </pre>
     *
     * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The searchTerm.
     */
    public java.lang.String getSearchTerm() {
      java.lang.Object ref = searchTerm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchTerm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The search term.
     * </pre>
     *
     * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for searchTerm.
     */
    public com.google.protobuf.ByteString
        getSearchTermBytes() {
      java.lang.Object ref = searchTerm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        searchTerm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The search term.
     * </pre>
     *
     * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The searchTerm to set.
     * @return This builder for chaining.
     */
    public Builder setSearchTerm(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      searchTerm_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The search term.
     * </pre>
     *
     * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearSearchTerm() {
      searchTerm_ = getDefaultInstance().getSearchTerm();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The search term.
     * </pre>
     *
     * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for searchTerm to set.
     * @return This builder for chaining.
     */
    public Builder setSearchTermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      searchTerm_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * Output only. The Smart campaign the search term served in.
     * </pre>
     *
     * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The campaign.
     */
    public java.lang.String getCampaign() {
      java.lang.Object ref = campaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Smart campaign the search term served in.
     * </pre>
     *
     * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for campaign.
     */
    public com.google.protobuf.ByteString
        getCampaignBytes() {
      java.lang.Object ref = campaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The Smart campaign the search term served in.
     * </pre>
     *
     * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      campaign_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Smart campaign the search term served in.
     * </pre>
     *
     * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      campaign_ = getDefaultInstance().getCampaign();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The Smart campaign the search term served in.
     * </pre>
     *
     * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      campaign_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.resources.SmartCampaignSearchTermView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.resources.SmartCampaignSearchTermView)
  private static final com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView();
  }

  public static com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartCampaignSearchTermView>
      PARSER = new com.google.protobuf.AbstractParser<SmartCampaignSearchTermView>() {
    @java.lang.Override
    public SmartCampaignSearchTermView parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmartCampaignSearchTermView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartCampaignSearchTermView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.resources.SmartCampaignSearchTermView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

