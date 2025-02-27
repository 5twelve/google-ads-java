// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * Request message for
 * [KeywordPlanIdeaService.GenerateAdGroupThemes][google.ads.googleads.v19.services.KeywordPlanIdeaService.GenerateAdGroupThemes].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.GenerateAdGroupThemesRequest}
 */
public final class GenerateAdGroupThemesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)
    GenerateAdGroupThemesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateAdGroupThemesRequest.newBuilder() to construct.
  private GenerateAdGroupThemesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateAdGroupThemesRequest() {
    customerId_ = "";
    keywords_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    adGroups_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateAdGroupThemesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_GenerateAdGroupThemesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_GenerateAdGroupThemesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.class, com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEYWORDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList keywords_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the keywords.
   */
  public com.google.protobuf.ProtocolStringList
      getKeywordsList() {
    return keywords_;
  }
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of keywords.
   */
  public int getKeywordsCount() {
    return keywords_.size();
  }
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  public java.lang.String getKeywords(int index) {
    return keywords_.get(index);
  }
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  public com.google.protobuf.ByteString
      getKeywordsBytes(int index) {
    return keywords_.getByteString(index);
  }

  public static final int AD_GROUPS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList adGroups_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the adGroups.
   */
  public com.google.protobuf.ProtocolStringList
      getAdGroupsList() {
    return adGroups_;
  }
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of adGroups.
   */
  public int getAdGroupsCount() {
    return adGroups_.size();
  }
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The adGroups at the given index.
   */
  public java.lang.String getAdGroups(int index) {
    return adGroups_.get(index);
  }
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the adGroups at the given index.
   */
  public com.google.protobuf.ByteString
      getAdGroupsBytes(int index) {
    return adGroups_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    for (int i = 0; i < keywords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keywords_.getRaw(i));
    }
    for (int i = 0; i < adGroups_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, adGroups_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keywords_.size(); i++) {
        dataSize += computeStringSizeNoTag(keywords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeywordsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < adGroups_.size(); i++) {
        dataSize += computeStringSizeNoTag(adGroups_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdGroupsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest other = (com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getKeywordsList()
        .equals(other.getKeywordsList())) return false;
    if (!getAdGroupsList()
        .equals(other.getAdGroupsList())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (getKeywordsCount() > 0) {
      hash = (37 * hash) + KEYWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordsList().hashCode();
    }
    if (getAdGroupsCount() > 0) {
      hash = (37 * hash) + AD_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest prototype) {
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
   * Request message for
   * [KeywordPlanIdeaService.GenerateAdGroupThemes][google.ads.googleads.v19.services.KeywordPlanIdeaService.GenerateAdGroupThemes].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.GenerateAdGroupThemesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)
      com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_GenerateAdGroupThemesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_GenerateAdGroupThemesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.class, com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.newBuilder()
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
      customerId_ = "";
      keywords_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      adGroups_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v19_services_GenerateAdGroupThemesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest build() {
      com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest buildPartial() {
      com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest result = new com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        keywords_.makeImmutable();
        result.keywords_ = keywords_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        adGroups_.makeImmutable();
        result.adGroups_ = adGroups_;
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
      if (other instanceof com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest) {
        return mergeFrom((com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest other) {
      if (other == com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.keywords_.isEmpty()) {
        if (keywords_.isEmpty()) {
          keywords_ = other.keywords_;
          bitField0_ |= 0x00000002;
        } else {
          ensureKeywordsIsMutable();
          keywords_.addAll(other.keywords_);
        }
        onChanged();
      }
      if (!other.adGroups_.isEmpty()) {
        if (adGroups_.isEmpty()) {
          adGroups_ = other.adGroups_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAdGroupsIsMutable();
          adGroups_.addAll(other.adGroups_);
        }
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
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureKeywordsIsMutable();
              keywords_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAdGroupsIsMutable();
              adGroups_.add(s);
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList keywords_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureKeywordsIsMutable() {
      if (!keywords_.isModifiable()) {
        keywords_ = new com.google.protobuf.LazyStringArrayList(keywords_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the keywords.
     */
    public com.google.protobuf.ProtocolStringList
        getKeywordsList() {
      keywords_.makeImmutable();
      return keywords_;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of keywords.
     */
    public int getKeywordsCount() {
      return keywords_.size();
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The keywords at the given index.
     */
    public java.lang.String getKeywords(int index) {
      return keywords_.get(index);
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the keywords at the given index.
     */
    public com.google.protobuf.ByteString
        getKeywordsBytes(int index) {
      return keywords_.getByteString(index);
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The keywords to set.
     * @return This builder for chaining.
     */
    public Builder setKeywords(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeywordsIsMutable();
      keywords_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywords(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeywordsIsMutable();
      keywords_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The keywords to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeywords(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeywordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keywords_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywords() {
      keywords_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of keywords to group into the provided AdGroups.
     * </pre>
     *
     * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the keywords to add.
     * @return This builder for chaining.
     */
    public Builder addKeywordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureKeywordsIsMutable();
      keywords_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList adGroups_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAdGroupsIsMutable() {
      if (!adGroups_.isModifiable()) {
        adGroups_ = new com.google.protobuf.LazyStringArrayList(adGroups_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the adGroups.
     */
    public com.google.protobuf.ProtocolStringList
        getAdGroupsList() {
      adGroups_.makeImmutable();
      return adGroups_;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of adGroups.
     */
    public int getAdGroupsCount() {
      return adGroups_.size();
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The adGroups at the given index.
     */
    public java.lang.String getAdGroups(int index) {
      return adGroups_.get(index);
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the adGroups at the given index.
     */
    public com.google.protobuf.ByteString
        getAdGroupsBytes(int index) {
      return adGroups_.getByteString(index);
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The adGroups to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroups(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdGroupsIsMutable();
      adGroups_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The adGroups to add.
     * @return This builder for chaining.
     */
    public Builder addAdGroups(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAdGroupsIsMutable();
      adGroups_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The adGroups to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdGroups(
        java.lang.Iterable<java.lang.String> values) {
      ensureAdGroupsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, adGroups_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdGroups() {
      adGroups_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A list of resource names of AdGroups to group keywords into.
     *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the adGroups to add.
     * @return This builder for chaining.
     */
    public Builder addAdGroupsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAdGroupsIsMutable();
      adGroups_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.GenerateAdGroupThemesRequest)
  private static final com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest();
  }

  public static com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAdGroupThemesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateAdGroupThemesRequest>() {
    @java.lang.Override
    public GenerateAdGroupThemesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAdGroupThemesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAdGroupThemesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.GenerateAdGroupThemesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

