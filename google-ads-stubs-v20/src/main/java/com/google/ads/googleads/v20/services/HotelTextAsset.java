// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

/**
 * <pre>
 * A single text asset suggestion for a hotel.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.services.HotelTextAsset}
 */
public final class HotelTextAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.services.HotelTextAsset)
    HotelTextAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelTextAsset.newBuilder() to construct.
  private HotelTextAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelTextAsset() {
    text_ = "";
    assetFieldType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelTextAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_HotelTextAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_HotelTextAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.services.HotelTextAsset.class, com.google.ads.googleads.v20.services.HotelTextAsset.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * Asset text in requested language.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Asset text in requested language.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_TYPE_FIELD_NUMBER = 2;
  private int assetFieldType_ = 0;
  /**
   * <pre>
   * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
   * @return The enum numeric value on the wire for assetFieldType.
   */
  @java.lang.Override public int getAssetFieldTypeValue() {
    return assetFieldType_;
  }
  /**
   * <pre>
   * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
   * @return The assetFieldType.
   */
  @java.lang.Override public com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType() {
    com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(assetFieldType_);
    return result == null ? com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (assetFieldType_ != com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, assetFieldType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (assetFieldType_ != com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, assetFieldType_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.services.HotelTextAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.services.HotelTextAsset other = (com.google.ads.googleads.v20.services.HotelTextAsset) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (assetFieldType_ != other.assetFieldType_) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + ASSET_FIELD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + assetFieldType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.services.HotelTextAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.services.HotelTextAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.HotelTextAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.services.HotelTextAsset prototype) {
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
   * A single text asset suggestion for a hotel.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.services.HotelTextAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.services.HotelTextAsset)
      com.google.ads.googleads.v20.services.HotelTextAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_HotelTextAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_HotelTextAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.services.HotelTextAsset.class, com.google.ads.googleads.v20.services.HotelTextAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.services.HotelTextAsset.newBuilder()
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
      text_ = "";
      assetFieldType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_HotelTextAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.HotelTextAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.services.HotelTextAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.HotelTextAsset build() {
      com.google.ads.googleads.v20.services.HotelTextAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.HotelTextAsset buildPartial() {
      com.google.ads.googleads.v20.services.HotelTextAsset result = new com.google.ads.googleads.v20.services.HotelTextAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.services.HotelTextAsset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetFieldType_ = assetFieldType_;
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
      if (other instanceof com.google.ads.googleads.v20.services.HotelTextAsset) {
        return mergeFrom((com.google.ads.googleads.v20.services.HotelTextAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.services.HotelTextAsset other) {
      if (other == com.google.ads.googleads.v20.services.HotelTextAsset.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.assetFieldType_ != 0) {
        setAssetFieldTypeValue(other.getAssetFieldTypeValue());
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
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              assetFieldType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * Asset text in requested language.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Asset text in requested language.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Asset text in requested language.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Asset text in requested language.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Asset text in requested language.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int assetFieldType_ = 0;
    /**
     * <pre>
     * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
     * @return The enum numeric value on the wire for assetFieldType.
     */
    @java.lang.Override public int getAssetFieldTypeValue() {
      return assetFieldType_;
    }
    /**
     * <pre>
     * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
     * @param value The enum numeric value on the wire for assetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetFieldTypeValue(int value) {
      assetFieldType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
     * @return The assetFieldType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType() {
      com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(assetFieldType_);
      return result == null ? com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
     * @param value The assetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetFieldType(com.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      assetFieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text asset type. For example, HEADLINE, DESCRIPTION, etc.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetFieldType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assetFieldType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.services.HotelTextAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.services.HotelTextAsset)
  private static final com.google.ads.googleads.v20.services.HotelTextAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.services.HotelTextAsset();
  }

  public static com.google.ads.googleads.v20.services.HotelTextAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelTextAsset>
      PARSER = new com.google.protobuf.AbstractParser<HotelTextAsset>() {
    @java.lang.Override
    public HotelTextAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelTextAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelTextAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.services.HotelTextAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

