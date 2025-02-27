// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/content_creator_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * A collection of audience attributes that describe an audience of viewers.
 * This is used to search for topics trending for the defined audience.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.SearchAudience}
 */
public final class SearchAudience extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.SearchAudience)
    SearchAudienceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchAudience.newBuilder() to construct.
  private SearchAudience(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchAudience() {
    audienceAttributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchAudience();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v19_services_SearchAudience_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v19_services_SearchAudience_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.SearchAudience.class, com.google.ads.googleads.v19.services.SearchAudience.Builder.class);
  }

  public static final int AUDIENCE_ATTRIBUTES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsAttribute> audienceAttributes_;
  /**
   * <pre>
   * Required. Audience attributes that describe an audience of viewers. This is
   * used to search for topics trending for the defined audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsAttribute> getAudienceAttributesList() {
    return audienceAttributes_;
  }
  /**
   * <pre>
   * Required. Audience attributes that describe an audience of viewers. This is
   * used to search for topics trending for the defined audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder> 
      getAudienceAttributesOrBuilderList() {
    return audienceAttributes_;
  }
  /**
   * <pre>
   * Required. Audience attributes that describe an audience of viewers. This is
   * used to search for topics trending for the defined audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getAudienceAttributesCount() {
    return audienceAttributes_.size();
  }
  /**
   * <pre>
   * Required. Audience attributes that describe an audience of viewers. This is
   * used to search for topics trending for the defined audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.AudienceInsightsAttribute getAudienceAttributes(int index) {
    return audienceAttributes_.get(index);
  }
  /**
   * <pre>
   * Required. Audience attributes that describe an audience of viewers. This is
   * used to search for topics trending for the defined audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder getAudienceAttributesOrBuilder(
      int index) {
    return audienceAttributes_.get(index);
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
    for (int i = 0; i < audienceAttributes_.size(); i++) {
      output.writeMessage(1, audienceAttributes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < audienceAttributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, audienceAttributes_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.SearchAudience)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.SearchAudience other = (com.google.ads.googleads.v19.services.SearchAudience) obj;

    if (!getAudienceAttributesList()
        .equals(other.getAudienceAttributesList())) return false;
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
    if (getAudienceAttributesCount() > 0) {
      hash = (37 * hash) + AUDIENCE_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAudienceAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.SearchAudience parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.SearchAudience parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.SearchAudience parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.SearchAudience prototype) {
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
   * A collection of audience attributes that describe an audience of viewers.
   * This is used to search for topics trending for the defined audience.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.SearchAudience}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.SearchAudience)
      com.google.ads.googleads.v19.services.SearchAudienceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v19_services_SearchAudience_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v19_services_SearchAudience_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.SearchAudience.class, com.google.ads.googleads.v19.services.SearchAudience.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.SearchAudience.newBuilder()
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
      if (audienceAttributesBuilder_ == null) {
        audienceAttributes_ = java.util.Collections.emptyList();
      } else {
        audienceAttributes_ = null;
        audienceAttributesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v19_services_SearchAudience_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SearchAudience getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.SearchAudience.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SearchAudience build() {
      com.google.ads.googleads.v19.services.SearchAudience result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SearchAudience buildPartial() {
      com.google.ads.googleads.v19.services.SearchAudience result = new com.google.ads.googleads.v19.services.SearchAudience(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v19.services.SearchAudience result) {
      if (audienceAttributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          audienceAttributes_ = java.util.Collections.unmodifiableList(audienceAttributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.audienceAttributes_ = audienceAttributes_;
      } else {
        result.audienceAttributes_ = audienceAttributesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.SearchAudience result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v19.services.SearchAudience) {
        return mergeFrom((com.google.ads.googleads.v19.services.SearchAudience)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.SearchAudience other) {
      if (other == com.google.ads.googleads.v19.services.SearchAudience.getDefaultInstance()) return this;
      if (audienceAttributesBuilder_ == null) {
        if (!other.audienceAttributes_.isEmpty()) {
          if (audienceAttributes_.isEmpty()) {
            audienceAttributes_ = other.audienceAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAudienceAttributesIsMutable();
            audienceAttributes_.addAll(other.audienceAttributes_);
          }
          onChanged();
        }
      } else {
        if (!other.audienceAttributes_.isEmpty()) {
          if (audienceAttributesBuilder_.isEmpty()) {
            audienceAttributesBuilder_.dispose();
            audienceAttributesBuilder_ = null;
            audienceAttributes_ = other.audienceAttributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            audienceAttributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAudienceAttributesFieldBuilder() : null;
          } else {
            audienceAttributesBuilder_.addAllMessages(other.audienceAttributes_);
          }
        }
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
              com.google.ads.googleads.v19.common.AudienceInsightsAttribute m =
                  input.readMessage(
                      com.google.ads.googleads.v19.common.AudienceInsightsAttribute.parser(),
                      extensionRegistry);
              if (audienceAttributesBuilder_ == null) {
                ensureAudienceAttributesIsMutable();
                audienceAttributes_.add(m);
              } else {
                audienceAttributesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsAttribute> audienceAttributes_ =
      java.util.Collections.emptyList();
    private void ensureAudienceAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        audienceAttributes_ = new java.util.ArrayList<com.google.ads.googleads.v19.common.AudienceInsightsAttribute>(audienceAttributes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.AudienceInsightsAttribute, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder> audienceAttributesBuilder_;

    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsAttribute> getAudienceAttributesList() {
      if (audienceAttributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(audienceAttributes_);
      } else {
        return audienceAttributesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getAudienceAttributesCount() {
      if (audienceAttributesBuilder_ == null) {
        return audienceAttributes_.size();
      } else {
        return audienceAttributesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.common.AudienceInsightsAttribute getAudienceAttributes(int index) {
      if (audienceAttributesBuilder_ == null) {
        return audienceAttributes_.get(index);
      } else {
        return audienceAttributesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAudienceAttributes(
        int index, com.google.ads.googleads.v19.common.AudienceInsightsAttribute value) {
      if (audienceAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.set(index, value);
        onChanged();
      } else {
        audienceAttributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAudienceAttributes(
        int index, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder builderForValue) {
      if (audienceAttributesBuilder_ == null) {
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        audienceAttributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAudienceAttributes(com.google.ads.googleads.v19.common.AudienceInsightsAttribute value) {
      if (audienceAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.add(value);
        onChanged();
      } else {
        audienceAttributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAudienceAttributes(
        int index, com.google.ads.googleads.v19.common.AudienceInsightsAttribute value) {
      if (audienceAttributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.add(index, value);
        onChanged();
      } else {
        audienceAttributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAudienceAttributes(
        com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder builderForValue) {
      if (audienceAttributesBuilder_ == null) {
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.add(builderForValue.build());
        onChanged();
      } else {
        audienceAttributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAudienceAttributes(
        int index, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder builderForValue) {
      if (audienceAttributesBuilder_ == null) {
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        audienceAttributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllAudienceAttributes(
        java.lang.Iterable<? extends com.google.ads.googleads.v19.common.AudienceInsightsAttribute> values) {
      if (audienceAttributesBuilder_ == null) {
        ensureAudienceAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, audienceAttributes_);
        onChanged();
      } else {
        audienceAttributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAudienceAttributes() {
      if (audienceAttributesBuilder_ == null) {
        audienceAttributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        audienceAttributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeAudienceAttributes(int index) {
      if (audienceAttributesBuilder_ == null) {
        ensureAudienceAttributesIsMutable();
        audienceAttributes_.remove(index);
        onChanged();
      } else {
        audienceAttributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder getAudienceAttributesBuilder(
        int index) {
      return getAudienceAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder getAudienceAttributesOrBuilder(
        int index) {
      if (audienceAttributesBuilder_ == null) {
        return audienceAttributes_.get(index);  } else {
        return audienceAttributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder> 
         getAudienceAttributesOrBuilderList() {
      if (audienceAttributesBuilder_ != null) {
        return audienceAttributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(audienceAttributes_);
      }
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder addAudienceAttributesBuilder() {
      return getAudienceAttributesFieldBuilder().addBuilder(
          com.google.ads.googleads.v19.common.AudienceInsightsAttribute.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder addAudienceAttributesBuilder(
        int index) {
      return getAudienceAttributesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Audience attributes that describe an audience of viewers. This is
     * used to search for topics trending for the defined audience.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsAttribute audience_attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder> 
         getAudienceAttributesBuilderList() {
      return getAudienceAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.AudienceInsightsAttribute, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder> 
        getAudienceAttributesFieldBuilder() {
      if (audienceAttributesBuilder_ == null) {
        audienceAttributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v19.common.AudienceInsightsAttribute, com.google.ads.googleads.v19.common.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v19.common.AudienceInsightsAttributeOrBuilder>(
                audienceAttributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        audienceAttributes_ = null;
      }
      return audienceAttributesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.SearchAudience)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.SearchAudience)
  private static final com.google.ads.googleads.v19.services.SearchAudience DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.SearchAudience();
  }

  public static com.google.ads.googleads.v19.services.SearchAudience getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAudience>
      PARSER = new com.google.protobuf.AbstractParser<SearchAudience>() {
    @java.lang.Override
    public SearchAudience parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchAudience> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAudience> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.SearchAudience getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

