// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/campaign_customizer_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

/**
 * <pre>
 * The result for the campaign customizer mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.services.MutateCampaignCustomizerResult}
 */
public final class MutateCampaignCustomizerResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.services.MutateCampaignCustomizerResult)
    MutateCampaignCustomizerResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignCustomizerResult.newBuilder() to construct.
  private MutateCampaignCustomizerResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignCustomizerResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignCustomizerResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.services.CampaignCustomizerServiceProto.internal_static_google_ads_googleads_v20_services_MutateCampaignCustomizerResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.services.CampaignCustomizerServiceProto.internal_static_google_ads_googleads_v20_services_MutateCampaignCustomizerResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.class, com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.Builder.class);
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

  public static final int CAMPAIGN_CUSTOMIZER_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v20.resources.CampaignCustomizer campaignCustomizer_;
  /**
   * <pre>
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
   * @return Whether the campaignCustomizer field is set.
   */
  @java.lang.Override
  public boolean hasCampaignCustomizer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
   * @return The campaignCustomizer.
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.resources.CampaignCustomizer getCampaignCustomizer() {
    return campaignCustomizer_ == null ? com.google.ads.googleads.v20.resources.CampaignCustomizer.getDefaultInstance() : campaignCustomizer_;
  }
  /**
   * <pre>
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.resources.CampaignCustomizerOrBuilder getCampaignCustomizerOrBuilder() {
    return campaignCustomizer_ == null ? com.google.ads.googleads.v20.resources.CampaignCustomizer.getDefaultInstance() : campaignCustomizer_;
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
      output.writeMessage(2, getCampaignCustomizer());
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
        .computeMessageSize(2, getCampaignCustomizer());
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
    if (!(obj instanceof com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult other = (com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignCustomizer() != other.hasCampaignCustomizer()) return false;
    if (hasCampaignCustomizer()) {
      if (!getCampaignCustomizer()
          .equals(other.getCampaignCustomizer())) return false;
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
    if (hasCampaignCustomizer()) {
      hash = (37 * hash) + CAMPAIGN_CUSTOMIZER_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignCustomizer().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult prototype) {
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
   * The result for the campaign customizer mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.services.MutateCampaignCustomizerResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.services.MutateCampaignCustomizerResult)
      com.google.ads.googleads.v20.services.MutateCampaignCustomizerResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.services.CampaignCustomizerServiceProto.internal_static_google_ads_googleads_v20_services_MutateCampaignCustomizerResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.services.CampaignCustomizerServiceProto.internal_static_google_ads_googleads_v20_services_MutateCampaignCustomizerResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.class, com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.newBuilder()
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
        getCampaignCustomizerFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      campaignCustomizer_ = null;
      if (campaignCustomizerBuilder_ != null) {
        campaignCustomizerBuilder_.dispose();
        campaignCustomizerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.services.CampaignCustomizerServiceProto.internal_static_google_ads_googleads_v20_services_MutateCampaignCustomizerResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult build() {
      com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult buildPartial() {
      com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult result = new com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaignCustomizer_ = campaignCustomizerBuilder_ == null
            ? campaignCustomizer_
            : campaignCustomizerBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult) {
        return mergeFrom((com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult other) {
      if (other == com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCampaignCustomizer()) {
        mergeCampaignCustomizer(other.getCampaignCustomizer());
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
                  getCampaignCustomizerFieldBuilder().getBuilder(),
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

    private com.google.ads.googleads.v20.resources.CampaignCustomizer campaignCustomizer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.resources.CampaignCustomizer, com.google.ads.googleads.v20.resources.CampaignCustomizer.Builder, com.google.ads.googleads.v20.resources.CampaignCustomizerOrBuilder> campaignCustomizerBuilder_;
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     * @return Whether the campaignCustomizer field is set.
     */
    public boolean hasCampaignCustomizer() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     * @return The campaignCustomizer.
     */
    public com.google.ads.googleads.v20.resources.CampaignCustomizer getCampaignCustomizer() {
      if (campaignCustomizerBuilder_ == null) {
        return campaignCustomizer_ == null ? com.google.ads.googleads.v20.resources.CampaignCustomizer.getDefaultInstance() : campaignCustomizer_;
      } else {
        return campaignCustomizerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public Builder setCampaignCustomizer(com.google.ads.googleads.v20.resources.CampaignCustomizer value) {
      if (campaignCustomizerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignCustomizer_ = value;
      } else {
        campaignCustomizerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public Builder setCampaignCustomizer(
        com.google.ads.googleads.v20.resources.CampaignCustomizer.Builder builderForValue) {
      if (campaignCustomizerBuilder_ == null) {
        campaignCustomizer_ = builderForValue.build();
      } else {
        campaignCustomizerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public Builder mergeCampaignCustomizer(com.google.ads.googleads.v20.resources.CampaignCustomizer value) {
      if (campaignCustomizerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          campaignCustomizer_ != null &&
          campaignCustomizer_ != com.google.ads.googleads.v20.resources.CampaignCustomizer.getDefaultInstance()) {
          getCampaignCustomizerBuilder().mergeFrom(value);
        } else {
          campaignCustomizer_ = value;
        }
      } else {
        campaignCustomizerBuilder_.mergeFrom(value);
      }
      if (campaignCustomizer_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public Builder clearCampaignCustomizer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      campaignCustomizer_ = null;
      if (campaignCustomizerBuilder_ != null) {
        campaignCustomizerBuilder_.dispose();
        campaignCustomizerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public com.google.ads.googleads.v20.resources.CampaignCustomizer.Builder getCampaignCustomizerBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCampaignCustomizerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    public com.google.ads.googleads.v20.resources.CampaignCustomizerOrBuilder getCampaignCustomizerOrBuilder() {
      if (campaignCustomizerBuilder_ != null) {
        return campaignCustomizerBuilder_.getMessageOrBuilder();
      } else {
        return campaignCustomizer_ == null ?
            com.google.ads.googleads.v20.resources.CampaignCustomizer.getDefaultInstance() : campaignCustomizer_;
      }
    }
    /**
     * <pre>
     * The mutated CampaignCustomizer with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v20.resources.CampaignCustomizer campaign_customizer = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v20.resources.CampaignCustomizer, com.google.ads.googleads.v20.resources.CampaignCustomizer.Builder, com.google.ads.googleads.v20.resources.CampaignCustomizerOrBuilder> 
        getCampaignCustomizerFieldBuilder() {
      if (campaignCustomizerBuilder_ == null) {
        campaignCustomizerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v20.resources.CampaignCustomizer, com.google.ads.googleads.v20.resources.CampaignCustomizer.Builder, com.google.ads.googleads.v20.resources.CampaignCustomizerOrBuilder>(
                getCampaignCustomizer(),
                getParentForChildren(),
                isClean());
        campaignCustomizer_ = null;
      }
      return campaignCustomizerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.services.MutateCampaignCustomizerResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.services.MutateCampaignCustomizerResult)
  private static final com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult();
  }

  public static com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignCustomizerResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignCustomizerResult>() {
    @java.lang.Override
    public MutateCampaignCustomizerResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateCampaignCustomizerResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignCustomizerResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.services.MutateCampaignCustomizerResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

