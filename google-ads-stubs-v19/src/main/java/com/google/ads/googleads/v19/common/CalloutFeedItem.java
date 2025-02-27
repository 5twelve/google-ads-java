// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/extensions.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * Represents a callout extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.CalloutFeedItem}
 */
public final class CalloutFeedItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.CalloutFeedItem)
    CalloutFeedItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalloutFeedItem.newBuilder() to construct.
  private CalloutFeedItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalloutFeedItem() {
    calloutText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalloutFeedItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.ExtensionsProto.internal_static_google_ads_googleads_v19_common_CalloutFeedItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.ExtensionsProto.internal_static_google_ads_googleads_v19_common_CalloutFeedItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.CalloutFeedItem.class, com.google.ads.googleads.v19.common.CalloutFeedItem.Builder.class);
  }

  private int bitField0_;
  public static final int CALLOUT_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object calloutText_ = "";
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string callout_text = 2;</code>
   * @return Whether the calloutText field is set.
   */
  @java.lang.Override
  public boolean hasCalloutText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string callout_text = 2;</code>
   * @return The calloutText.
   */
  @java.lang.Override
  public java.lang.String getCalloutText() {
    java.lang.Object ref = calloutText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      calloutText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The callout text.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>optional string callout_text = 2;</code>
   * @return The bytes for calloutText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCalloutTextBytes() {
    java.lang.Object ref = calloutText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      calloutText_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, calloutText_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, calloutText_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.CalloutFeedItem)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.CalloutFeedItem other = (com.google.ads.googleads.v19.common.CalloutFeedItem) obj;

    if (hasCalloutText() != other.hasCalloutText()) return false;
    if (hasCalloutText()) {
      if (!getCalloutText()
          .equals(other.getCalloutText())) return false;
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
    if (hasCalloutText()) {
      hash = (37 * hash) + CALLOUT_TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getCalloutText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.CalloutFeedItem parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.CalloutFeedItem prototype) {
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
   * Represents a callout extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.CalloutFeedItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.CalloutFeedItem)
      com.google.ads.googleads.v19.common.CalloutFeedItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.ExtensionsProto.internal_static_google_ads_googleads_v19_common_CalloutFeedItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.ExtensionsProto.internal_static_google_ads_googleads_v19_common_CalloutFeedItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.CalloutFeedItem.class, com.google.ads.googleads.v19.common.CalloutFeedItem.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.CalloutFeedItem.newBuilder()
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
      calloutText_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.ExtensionsProto.internal_static_google_ads_googleads_v19_common_CalloutFeedItem_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.CalloutFeedItem getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.CalloutFeedItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.CalloutFeedItem build() {
      com.google.ads.googleads.v19.common.CalloutFeedItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.CalloutFeedItem buildPartial() {
      com.google.ads.googleads.v19.common.CalloutFeedItem result = new com.google.ads.googleads.v19.common.CalloutFeedItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.CalloutFeedItem result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.calloutText_ = calloutText_;
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
      if (other instanceof com.google.ads.googleads.v19.common.CalloutFeedItem) {
        return mergeFrom((com.google.ads.googleads.v19.common.CalloutFeedItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.CalloutFeedItem other) {
      if (other == com.google.ads.googleads.v19.common.CalloutFeedItem.getDefaultInstance()) return this;
      if (other.hasCalloutText()) {
        calloutText_ = other.calloutText_;
        bitField0_ |= 0x00000001;
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
            case 18: {
              calloutText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object calloutText_ = "";
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @return Whether the calloutText field is set.
     */
    public boolean hasCalloutText() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @return The calloutText.
     */
    public java.lang.String getCalloutText() {
      java.lang.Object ref = calloutText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        calloutText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @return The bytes for calloutText.
     */
    public com.google.protobuf.ByteString
        getCalloutTextBytes() {
      java.lang.Object ref = calloutText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        calloutText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @param value The calloutText to set.
     * @return This builder for chaining.
     */
    public Builder setCalloutText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      calloutText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCalloutText() {
      calloutText_ = getDefaultInstance().getCalloutText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The callout text.
     * The length of this string should be between 1 and 25, inclusive.
     * </pre>
     *
     * <code>optional string callout_text = 2;</code>
     * @param value The bytes for calloutText to set.
     * @return This builder for chaining.
     */
    public Builder setCalloutTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      calloutText_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.CalloutFeedItem)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.CalloutFeedItem)
  private static final com.google.ads.googleads.v19.common.CalloutFeedItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.CalloutFeedItem();
  }

  public static com.google.ads.googleads.v19.common.CalloutFeedItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalloutFeedItem>
      PARSER = new com.google.protobuf.AbstractParser<CalloutFeedItem>() {
    @java.lang.Override
    public CalloutFeedItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<CalloutFeedItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalloutFeedItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.CalloutFeedItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

