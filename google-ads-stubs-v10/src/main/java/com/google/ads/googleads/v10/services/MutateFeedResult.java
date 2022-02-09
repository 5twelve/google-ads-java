// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/feed_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * The result for the feed mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.MutateFeedResult}
 */
public final class MutateFeedResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.MutateFeedResult)
    MutateFeedResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateFeedResult.newBuilder() to construct.
  private MutateFeedResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateFeedResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateFeedResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateFeedResult(
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
            com.google.ads.googleads.v10.resources.Feed.Builder subBuilder = null;
            if (feed_ != null) {
              subBuilder = feed_.toBuilder();
            }
            feed_ = input.readMessage(com.google.ads.googleads.v10.resources.Feed.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(feed_);
              feed_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.services.FeedServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.FeedServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.MutateFeedResult.class, com.google.ads.googleads.v10.services.MutateFeedResult.Builder.class);
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

  public static final int FEED_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.Feed feed_;
  /**
   * <pre>
   * The mutated feed with only mutable fields after mutate. The field will only
   * be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
   * @return Whether the feed field is set.
   */
  @java.lang.Override
  public boolean hasFeed() {
    return feed_ != null;
  }
  /**
   * <pre>
   * The mutated feed with only mutable fields after mutate. The field will only
   * be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
   * @return The feed.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.Feed getFeed() {
    return feed_ == null ? com.google.ads.googleads.v10.resources.Feed.getDefaultInstance() : feed_;
  }
  /**
   * <pre>
   * The mutated feed with only mutable fields after mutate. The field will only
   * be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedOrBuilder getFeedOrBuilder() {
    return getFeed();
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
    if (feed_ != null) {
      output.writeMessage(2, getFeed());
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
    if (feed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFeed());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.MutateFeedResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.MutateFeedResult other = (com.google.ads.googleads.v10.services.MutateFeedResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasFeed() != other.hasFeed()) return false;
    if (hasFeed()) {
      if (!getFeed()
          .equals(other.getFeed())) return false;
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
    if (hasFeed()) {
      hash = (37 * hash) + FEED_FIELD_NUMBER;
      hash = (53 * hash) + getFeed().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateFeedResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.MutateFeedResult prototype) {
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
   * The result for the feed mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.MutateFeedResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.MutateFeedResult)
      com.google.ads.googleads.v10.services.MutateFeedResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.FeedServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.FeedServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.MutateFeedResult.class, com.google.ads.googleads.v10.services.MutateFeedResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.MutateFeedResult.newBuilder()
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

      if (feedBuilder_ == null) {
        feed_ = null;
      } else {
        feed_ = null;
        feedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.FeedServiceProto.internal_static_google_ads_googleads_v10_services_MutateFeedResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.MutateFeedResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedResult build() {
      com.google.ads.googleads.v10.services.MutateFeedResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateFeedResult buildPartial() {
      com.google.ads.googleads.v10.services.MutateFeedResult result = new com.google.ads.googleads.v10.services.MutateFeedResult(this);
      result.resourceName_ = resourceName_;
      if (feedBuilder_ == null) {
        result.feed_ = feed_;
      } else {
        result.feed_ = feedBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.MutateFeedResult) {
        return mergeFrom((com.google.ads.googleads.v10.services.MutateFeedResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.MutateFeedResult other) {
      if (other == com.google.ads.googleads.v10.services.MutateFeedResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasFeed()) {
        mergeFeed(other.getFeed());
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
      com.google.ads.googleads.v10.services.MutateFeedResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.MutateFeedResult) e.getUnfinishedMessage();
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

    private com.google.ads.googleads.v10.resources.Feed feed_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Feed, com.google.ads.googleads.v10.resources.Feed.Builder, com.google.ads.googleads.v10.resources.FeedOrBuilder> feedBuilder_;
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     * @return Whether the feed field is set.
     */
    public boolean hasFeed() {
      return feedBuilder_ != null || feed_ != null;
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     * @return The feed.
     */
    public com.google.ads.googleads.v10.resources.Feed getFeed() {
      if (feedBuilder_ == null) {
        return feed_ == null ? com.google.ads.googleads.v10.resources.Feed.getDefaultInstance() : feed_;
      } else {
        return feedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public Builder setFeed(com.google.ads.googleads.v10.resources.Feed value) {
      if (feedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        feed_ = value;
        onChanged();
      } else {
        feedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public Builder setFeed(
        com.google.ads.googleads.v10.resources.Feed.Builder builderForValue) {
      if (feedBuilder_ == null) {
        feed_ = builderForValue.build();
        onChanged();
      } else {
        feedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public Builder mergeFeed(com.google.ads.googleads.v10.resources.Feed value) {
      if (feedBuilder_ == null) {
        if (feed_ != null) {
          feed_ =
            com.google.ads.googleads.v10.resources.Feed.newBuilder(feed_).mergeFrom(value).buildPartial();
        } else {
          feed_ = value;
        }
        onChanged();
      } else {
        feedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public Builder clearFeed() {
      if (feedBuilder_ == null) {
        feed_ = null;
        onChanged();
      } else {
        feed_ = null;
        feedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.Feed.Builder getFeedBuilder() {
      
      onChanged();
      return getFeedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.FeedOrBuilder getFeedOrBuilder() {
      if (feedBuilder_ != null) {
        return feedBuilder_.getMessageOrBuilder();
      } else {
        return feed_ == null ?
            com.google.ads.googleads.v10.resources.Feed.getDefaultInstance() : feed_;
      }
    }
    /**
     * <pre>
     * The mutated feed with only mutable fields after mutate. The field will only
     * be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Feed feed = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Feed, com.google.ads.googleads.v10.resources.Feed.Builder, com.google.ads.googleads.v10.resources.FeedOrBuilder> 
        getFeedFieldBuilder() {
      if (feedBuilder_ == null) {
        feedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.Feed, com.google.ads.googleads.v10.resources.Feed.Builder, com.google.ads.googleads.v10.resources.FeedOrBuilder>(
                getFeed(),
                getParentForChildren(),
                isClean());
        feed_ = null;
      }
      return feedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.MutateFeedResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.MutateFeedResult)
  private static final com.google.ads.googleads.v10.services.MutateFeedResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.MutateFeedResult();
  }

  public static com.google.ads.googleads.v10.services.MutateFeedResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateFeedResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateFeedResult>() {
    @java.lang.Override
    public MutateFeedResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateFeedResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateFeedResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateFeedResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.MutateFeedResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

