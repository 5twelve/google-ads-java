// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/text_label.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

/**
 * <pre>
 * A type of label displaying text on a colored background.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.common.TextLabel}
 */
public final class TextLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.common.TextLabel)
    TextLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextLabel.newBuilder() to construct.
  private TextLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextLabel() {
    backgroundColor_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextLabel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.common.TextLabelProto.internal_static_google_ads_googleads_v20_common_TextLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.common.TextLabelProto.internal_static_google_ads_googleads_v20_common_TextLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.common.TextLabel.class, com.google.ads.googleads.v20.common.TextLabel.Builder.class);
  }

  private int bitField0_;
  public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object backgroundColor_ = "";
  /**
   * <pre>
   * Background color of the label in HEX format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return Whether the backgroundColor field is set.
   */
  @java.lang.Override
  public boolean hasBackgroundColor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Background color of the label in HEX format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return The backgroundColor.
   */
  @java.lang.Override
  public java.lang.String getBackgroundColor() {
    java.lang.Object ref = backgroundColor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backgroundColor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Background color of the label in HEX format. This string must match the
   * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
   * Note: The background color may not be visible for manager accounts.
   * </pre>
   *
   * <code>optional string background_color = 3;</code>
   * @return The bytes for backgroundColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBackgroundColorBytes() {
    java.lang.Object ref = backgroundColor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backgroundColor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A short description of the label. The length must be no more than 200
   * characters.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, backgroundColor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, backgroundColor_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.common.TextLabel)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.common.TextLabel other = (com.google.ads.googleads.v20.common.TextLabel) obj;

    if (hasBackgroundColor() != other.hasBackgroundColor()) return false;
    if (hasBackgroundColor()) {
      if (!getBackgroundColor()
          .equals(other.getBackgroundColor())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
    if (hasBackgroundColor()) {
      hash = (37 * hash) + BACKGROUND_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getBackgroundColor().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.common.TextLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.common.TextLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.TextLabel parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.common.TextLabel prototype) {
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
   * A type of label displaying text on a colored background.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.common.TextLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.common.TextLabel)
      com.google.ads.googleads.v20.common.TextLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.TextLabelProto.internal_static_google_ads_googleads_v20_common_TextLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.common.TextLabelProto.internal_static_google_ads_googleads_v20_common_TextLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.common.TextLabel.class, com.google.ads.googleads.v20.common.TextLabel.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.common.TextLabel.newBuilder()
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
      backgroundColor_ = "";
      description_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.common.TextLabelProto.internal_static_google_ads_googleads_v20_common_TextLabel_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TextLabel getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.common.TextLabel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TextLabel build() {
      com.google.ads.googleads.v20.common.TextLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.TextLabel buildPartial() {
      com.google.ads.googleads.v20.common.TextLabel result = new com.google.ads.googleads.v20.common.TextLabel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.common.TextLabel result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backgroundColor_ = backgroundColor_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v20.common.TextLabel) {
        return mergeFrom((com.google.ads.googleads.v20.common.TextLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.common.TextLabel other) {
      if (other == com.google.ads.googleads.v20.common.TextLabel.getDefaultInstance()) return this;
      if (other.hasBackgroundColor()) {
        backgroundColor_ = other.backgroundColor_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDescription()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
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
            case 26: {
              backgroundColor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
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

    private java.lang.Object backgroundColor_ = "";
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @return Whether the backgroundColor field is set.
     */
    public boolean hasBackgroundColor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @return The backgroundColor.
     */
    public java.lang.String getBackgroundColor() {
      java.lang.Object ref = backgroundColor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backgroundColor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @return The bytes for backgroundColor.
     */
    public com.google.protobuf.ByteString
        getBackgroundColorBytes() {
      java.lang.Object ref = backgroundColor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backgroundColor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @param value The backgroundColor to set.
     * @return This builder for chaining.
     */
    public Builder setBackgroundColor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      backgroundColor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackgroundColor() {
      backgroundColor_ = getDefaultInstance().getBackgroundColor();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Background color of the label in HEX format. This string must match the
     * regular expression '^&#92;#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$'.
     * Note: The background color may not be visible for manager accounts.
     * </pre>
     *
     * <code>optional string background_color = 3;</code>
     * @param value The bytes for backgroundColor to set.
     * @return This builder for chaining.
     */
    public Builder setBackgroundColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      backgroundColor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A short description of the label. The length must be no more than 200
     * characters.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.common.TextLabel)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.common.TextLabel)
  private static final com.google.ads.googleads.v20.common.TextLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.common.TextLabel();
  }

  public static com.google.ads.googleads.v20.common.TextLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextLabel>
      PARSER = new com.google.protobuf.AbstractParser<TextLabel>() {
    @java.lang.Override
    public TextLabel parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.common.TextLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

