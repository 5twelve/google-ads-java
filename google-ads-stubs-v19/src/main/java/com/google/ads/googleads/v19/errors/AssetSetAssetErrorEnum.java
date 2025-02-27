// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/errors/asset_set_asset_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.errors;

/**
 * <pre>
 * Container for enum describing possible asset set asset errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.errors.AssetSetAssetErrorEnum}
 */
public final class AssetSetAssetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)
    AssetSetAssetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSetAssetErrorEnum.newBuilder() to construct.
  private AssetSetAssetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSetAssetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSetAssetErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.errors.AssetSetAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetSetAssetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.errors.AssetSetAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetSetAssetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.class, com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset set asset errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.AssetSetAssetError}
   */
  public enum AssetSetAssetError
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
     * The asset type is not eligible to be linked to the specific type of asset
     * set.
     * </pre>
     *
     * <code>INVALID_ASSET_TYPE = 2;</code>
     */
    INVALID_ASSET_TYPE(2),
    /**
     * <pre>
     * The asset set type is not eligible to contain the specified type of
     * assets.
     * </pre>
     *
     * <code>INVALID_ASSET_SET_TYPE = 3;</code>
     */
    INVALID_ASSET_SET_TYPE(3),
    /**
     * <pre>
     * The asset contains duplicate external key with another asset in the asset
     * set.
     * </pre>
     *
     * <code>DUPLICATE_EXTERNAL_KEY = 4;</code>
     */
    DUPLICATE_EXTERNAL_KEY(4),
    /**
     * <pre>
     * When attaching a Location typed Asset to a LocationGroup typed AssetSet,
     * the AssetSetAsset linkage between the parent LocationSync AssetSet and
     * the Asset doesn't exist.
     * </pre>
     *
     * <code>PARENT_LINKAGE_DOES_NOT_EXIST = 5;</code>
     */
    PARENT_LINKAGE_DOES_NOT_EXIST(5),
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
     * The asset type is not eligible to be linked to the specific type of asset
     * set.
     * </pre>
     *
     * <code>INVALID_ASSET_TYPE = 2;</code>
     */
    public static final int INVALID_ASSET_TYPE_VALUE = 2;
    /**
     * <pre>
     * The asset set type is not eligible to contain the specified type of
     * assets.
     * </pre>
     *
     * <code>INVALID_ASSET_SET_TYPE = 3;</code>
     */
    public static final int INVALID_ASSET_SET_TYPE_VALUE = 3;
    /**
     * <pre>
     * The asset contains duplicate external key with another asset in the asset
     * set.
     * </pre>
     *
     * <code>DUPLICATE_EXTERNAL_KEY = 4;</code>
     */
    public static final int DUPLICATE_EXTERNAL_KEY_VALUE = 4;
    /**
     * <pre>
     * When attaching a Location typed Asset to a LocationGroup typed AssetSet,
     * the AssetSetAsset linkage between the parent LocationSync AssetSet and
     * the Asset doesn't exist.
     * </pre>
     *
     * <code>PARENT_LINKAGE_DOES_NOT_EXIST = 5;</code>
     */
    public static final int PARENT_LINKAGE_DOES_NOT_EXIST_VALUE = 5;


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
    public static AssetSetAssetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetSetAssetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_ASSET_TYPE;
        case 3: return INVALID_ASSET_SET_TYPE;
        case 4: return DUPLICATE_EXTERNAL_KEY;
        case 5: return PARENT_LINKAGE_DOES_NOT_EXIST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetSetAssetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetSetAssetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetSetAssetError>() {
            public AssetSetAssetError findValueByNumber(int number) {
              return AssetSetAssetError.forNumber(number);
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
      return com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetSetAssetError[] VALUES = values();

    public static AssetSetAssetError valueOf(
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

    private AssetSetAssetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.AssetSetAssetError)
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
    if (!(obj instanceof com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum other = (com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum) obj;

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

  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum prototype) {
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
   * Container for enum describing possible asset set asset errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.errors.AssetSetAssetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)
      com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.AssetSetAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetSetAssetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.errors.AssetSetAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetSetAssetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.class, com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v19.errors.AssetSetAssetErrorProto.internal_static_google_ads_googleads_v19_errors_AssetSetAssetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum build() {
      com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum buildPartial() {
      com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum result = new com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum other) {
      if (other == com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.errors.AssetSetAssetErrorEnum)
  private static final com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum();
  }

  public static com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSetAssetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetSetAssetErrorEnum>() {
    @java.lang.Override
    public AssetSetAssetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetSetAssetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSetAssetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.errors.AssetSetAssetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

