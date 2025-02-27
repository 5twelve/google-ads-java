// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/errors/asset_group_asset_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.errors;

/**
 * <pre>
 * Container for enum describing possible asset group asset errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum}
 */
public final class AssetGroupAssetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)
    AssetGroupAssetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetGroupAssetErrorEnum.newBuilder() to construct.
  private AssetGroupAssetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetGroupAssetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetGroupAssetErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetGroupAssetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetGroupAssetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.class, com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset group asset errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.AssetGroupAssetError}
   */
  public enum AssetGroupAssetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Cannot add duplicated asset group asset.
     * </pre>
     *
     * <code>DUPLICATE_RESOURCE = 2;</code>
     */
    DUPLICATE_RESOURCE(2),
    /**
     * <pre>
     * Expandable tags are not allowed in description assets.
     * </pre>
     *
     * <code>EXPANDABLE_TAGS_NOT_ALLOWED_IN_DESCRIPTION = 3;</code>
     */
    EXPANDABLE_TAGS_NOT_ALLOWED_IN_DESCRIPTION(3),
    /**
     * <pre>
     * Ad customizers are not supported in assetgroup's text assets.
     * </pre>
     *
     * <code>AD_CUSTOMIZER_NOT_SUPPORTED = 4;</code>
     */
    AD_CUSTOMIZER_NOT_SUPPORTED(4),
    /**
     * <pre>
     * Cannot add a HotelPropertyAsset to an AssetGroup that isn't linked
     * to the parent campaign's hotel_property_asset_set field.
     * </pre>
     *
     * <code>HOTEL_PROPERTY_ASSET_NOT_LINKED_TO_CAMPAIGN = 5;</code>
     */
    HOTEL_PROPERTY_ASSET_NOT_LINKED_TO_CAMPAIGN(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Cannot add duplicated asset group asset.
     * </pre>
     *
     * <code>DUPLICATE_RESOURCE = 2;</code>
     */
    public static final int DUPLICATE_RESOURCE_VALUE = 2;
    /**
     * <pre>
     * Expandable tags are not allowed in description assets.
     * </pre>
     *
     * <code>EXPANDABLE_TAGS_NOT_ALLOWED_IN_DESCRIPTION = 3;</code>
     */
    public static final int EXPANDABLE_TAGS_NOT_ALLOWED_IN_DESCRIPTION_VALUE = 3;
    /**
     * <pre>
     * Ad customizers are not supported in assetgroup's text assets.
     * </pre>
     *
     * <code>AD_CUSTOMIZER_NOT_SUPPORTED = 4;</code>
     */
    public static final int AD_CUSTOMIZER_NOT_SUPPORTED_VALUE = 4;
    /**
     * <pre>
     * Cannot add a HotelPropertyAsset to an AssetGroup that isn't linked
     * to the parent campaign's hotel_property_asset_set field.
     * </pre>
     *
     * <code>HOTEL_PROPERTY_ASSET_NOT_LINKED_TO_CAMPAIGN = 5;</code>
     */
    public static final int HOTEL_PROPERTY_ASSET_NOT_LINKED_TO_CAMPAIGN_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssetGroupAssetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetGroupAssetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_RESOURCE;
        case 3: return EXPANDABLE_TAGS_NOT_ALLOWED_IN_DESCRIPTION;
        case 4: return AD_CUSTOMIZER_NOT_SUPPORTED;
        case 5: return HOTEL_PROPERTY_ASSET_NOT_LINKED_TO_CAMPAIGN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetGroupAssetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetGroupAssetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetGroupAssetError>() {
            public AssetGroupAssetError findValueByNumber(int number) {
              return AssetGroupAssetError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetGroupAssetError[] VALUES = values();

    public static AssetGroupAssetError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AssetGroupAssetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.AssetGroupAssetError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum other = (com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum prototype) {
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
   * Container for enum describing possible asset group asset errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)
      com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetGroupAssetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetGroupAssetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.class, com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetGroupAssetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum build() {
      com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum buildPartial() {
      com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum result = new com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum other) {
      if (other == com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum)
  private static final com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum();
  }

  public static com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetGroupAssetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetGroupAssetErrorEnum>() {
    @java.lang.Override
    public AssetGroupAssetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetGroupAssetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetGroupAssetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.errors.AssetGroupAssetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

