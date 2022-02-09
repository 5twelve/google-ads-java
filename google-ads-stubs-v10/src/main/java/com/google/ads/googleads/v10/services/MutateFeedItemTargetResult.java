// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/feed_item_target_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * The result for the feed item target mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.MutateFeedItemTargetResult}
 */
public final class MutateFeedItemTargetResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.MutateFeedItemTargetResult)
    MutateFeedItemTargetResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateFeedItemTargetResult.newBuilder() to construct.
  private MutateFeedItemTargetResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateFeedItemTargetResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateFeedItemTargetResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateFeedItemTargetResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v10.resources.FeedItemTarget.Builder subBuilder = null;
            if (feedItemTarget_ != null) {
              subBuilder = feedItemTarget_.toBuilder();
            }
            feedItemTarget_ = input.readMessage(com.google.ads.googleads.v10.resources.FeedItemTarget.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(feedItemTarget_);
              feedItemTarget_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.FeedItemTargetServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedItemTargetResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.FeedItemTargetServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedItemTargetResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.class, com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
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

  public static final int FEED_ITEM_TARGET_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.FeedItemTarget feedItemTarget_;
  /**
   * <pre>
   * The mutated feed item target with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
   * @return Whether the feedItemTarget field is set.
   */
  @java.lang.Override
  public boolean hasFeedItemTarget() {
    return feedItemTarget_ != null;
  }
  /**
   * <pre>
   * The mutated feed item target with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
   * @return The feedItemTarget.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedItemTarget getFeedItemTarget() {
    return feedItemTarget_ == null ? com.google.ads.googleads.v10.resources.FeedItemTarget.getDefaultInstance() : feedItemTarget_;
  }
  /**
   * <pre>
   * The mutated feed item target with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedItemTargetOrBuilder getFeedItemTargetOrBuilder() {
    return getFeedItemTarget();
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
    if (feedItemTarget_ != null) {
      output.writeMessage(2, getFeedItemTarget());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (feedItemTarget_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFeedItemTarget());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.services.MutateFeedItemTargetResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.MutateFeedItemTargetResult other = (com.google.ads.googleads.v10.services.MutateFeedItemTargetResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasFeedItemTarget() != other.hasFeedItemTarget()) return false;
    if (hasFeedItemTarget()) {
      if (!getFeedItemTarget()
          .equals(other.getFeedItemTarget())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasFeedItemTarget()) {
      hash = (37 * hash) + FEED_ITEM_TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getFeedItemTarget().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.MutateFeedItemTargetResult prototype) {
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
   * The result for the feed item target mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.MutateFeedItemTargetResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.MutateFeedItemTargetResult)
      com.google.ads.googleads.v10.services.MutateFeedItemTargetResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.FeedItemTargetServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedItemTargetResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.FeedItemTargetServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedItemTargetResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.class, com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      if (feedItemTargetBuilder_ == null) {
        feedItemTarget_ = null;
      } else {
        feedItemTarget_ = null;
        feedItemTargetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.FeedItemTargetServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedItemTargetResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedItemTargetResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedItemTargetResult build() {
      com.google.ads.googleads.v10.services.MutateFeedItemTargetResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedItemTargetResult buildPartial() {
      com.google.ads.googleads.v10.services.MutateFeedItemTargetResult result = new com.google.ads.googleads.v10.services.MutateFeedItemTargetResult(this);
      result.resourceName_ = resourceName_;
      if (feedItemTargetBuilder_ == null) {
        result.feedItemTarget_ = feedItemTarget_;
      } else {
        result.feedItemTarget_ = feedItemTargetBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v10.services.MutateFeedItemTargetResult) {
        return mergeFrom((com.google.ads.googleads.v10.services.MutateFeedItemTargetResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.MutateFeedItemTargetResult other) {
      if (other == com.google.ads.googleads.v10.services.MutateFeedItemTargetResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasFeedItemTarget()) {
        mergeFeedItemTarget(other.getFeedItemTarget());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v10.services.MutateFeedItemTargetResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.MutateFeedItemTargetResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.FeedItemTarget feedItemTarget_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.FeedItemTarget, com.google.ads.googleads.v10.resources.FeedItemTarget.Builder, com.google.ads.googleads.v10.resources.FeedItemTargetOrBuilder> feedItemTargetBuilder_;
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     * @return Whether the feedItemTarget field is set.
     */
    public boolean hasFeedItemTarget() {
      return feedItemTargetBuilder_ != null || feedItemTarget_ != null;
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     * @return The feedItemTarget.
     */
    public com.google.ads.googleads.v10.resources.FeedItemTarget getFeedItemTarget() {
      if (feedItemTargetBuilder_ == null) {
        return feedItemTarget_ == null ? com.google.ads.googleads.v10.resources.FeedItemTarget.getDefaultInstance() : feedItemTarget_;
      } else {
        return feedItemTargetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public Builder setFeedItemTarget(com.google.ads.googleads.v10.resources.FeedItemTarget value) {
      if (feedItemTargetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feedItemTarget_ = value;
        onChanged();
      } else {
        feedItemTargetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public Builder setFeedItemTarget(
        com.google.ads.googleads.v10.resources.FeedItemTarget.Builder builderForValue) {
      if (feedItemTargetBuilder_ == null) {
        feedItemTarget_ = builderForValue.build();
        onChanged();
      } else {
        feedItemTargetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public Builder mergeFeedItemTarget(com.google.ads.googleads.v10.resources.FeedItemTarget value) {
      if (feedItemTargetBuilder_ == null) {
        if (feedItemTarget_ != null) {
          feedItemTarget_ =
            com.google.ads.googleads.v10.resources.FeedItemTarget.newBuilder(feedItemTarget_).mergeFrom(value).buildPartial();
        } else {
          feedItemTarget_ = value;
        }
        onChanged();
      } else {
        feedItemTargetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public Builder clearFeedItemTarget() {
      if (feedItemTargetBuilder_ == null) {
        feedItemTarget_ = null;
        onChanged();
      } else {
        feedItemTarget_ = null;
        feedItemTargetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.FeedItemTarget.Builder getFeedItemTargetBuilder() {
      
      onChanged();
      return getFeedItemTargetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.FeedItemTargetOrBuilder getFeedItemTargetOrBuilder() {
      if (feedItemTargetBuilder_ != null) {
        return feedItemTargetBuilder_.getMessageOrBuilder();
      } else {
        return feedItemTarget_ == null ?
            com.google.ads.googleads.v10.resources.FeedItemTarget.getDefaultInstance() : feedItemTarget_;
      }
    }
    /**
     * <pre>
     * The mutated feed item target with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedItemTarget feed_item_target = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.FeedItemTarget, com.google.ads.googleads.v10.resources.FeedItemTarget.Builder, com.google.ads.googleads.v10.resources.FeedItemTargetOrBuilder> 
        getFeedItemTargetFieldBuilder() {
      if (feedItemTargetBuilder_ == null) {
        feedItemTargetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.FeedItemTarget, com.google.ads.googleads.v10.resources.FeedItemTarget.Builder, com.google.ads.googleads.v10.resources.FeedItemTargetOrBuilder>(
                getFeedItemTarget(),
                getParentForChildren(),
                isClean());
        feedItemTarget_ = null;
      }
      return feedItemTargetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.MutateFeedItemTargetResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.MutateFeedItemTargetResult)
  private static final com.google.ads.googleads.v10.services.MutateFeedItemTargetResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.MutateFeedItemTargetResult();
  }

  public static com.google.ads.googleads.v10.services.MutateFeedItemTargetResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateFeedItemTargetResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateFeedItemTargetResult>() {
    @java.lang.Override
    public MutateFeedItemTargetResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateFeedItemTargetResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateFeedItemTargetResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateFeedItemTargetResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.MutateFeedItemTargetResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

