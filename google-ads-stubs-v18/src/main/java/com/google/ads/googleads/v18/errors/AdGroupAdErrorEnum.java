// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/ad_group_ad_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible ad group ad errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.AdGroupAdErrorEnum}
 */
public final class AdGroupAdErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.AdGroupAdErrorEnum)
    AdGroupAdErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupAdErrorEnum.newBuilder() to construct.
  private AdGroupAdErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupAdErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupAdErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.AdGroupAdErrorProto.internal_static_google_ads_googleads_v18_errors_AdGroupAdErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.AdGroupAdErrorProto.internal_static_google_ads_googleads_v18_errors_AdGroupAdErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.class, com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible ad group ad errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.AdGroupAdErrorEnum.AdGroupAdError}
   */
  public enum AdGroupAdError
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
     * No link found between the adgroup ad and the label.
     * </pre>
     *
     * <code>AD_GROUP_AD_LABEL_DOES_NOT_EXIST = 2;</code>
     */
    AD_GROUP_AD_LABEL_DOES_NOT_EXIST(2),
    /**
     * <pre>
     * The label has already been attached to the adgroup ad.
     * </pre>
     *
     * <code>AD_GROUP_AD_LABEL_ALREADY_EXISTS = 3;</code>
     */
    AD_GROUP_AD_LABEL_ALREADY_EXISTS(3),
    /**
     * <pre>
     * The specified ad was not found in the adgroup
     * </pre>
     *
     * <code>AD_NOT_UNDER_ADGROUP = 4;</code>
     */
    AD_NOT_UNDER_ADGROUP(4),
    /**
     * <pre>
     * Removed ads may not be modified
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_ADGROUPAD = 5;</code>
     */
    CANNOT_OPERATE_ON_REMOVED_ADGROUPAD(5),
    /**
     * <pre>
     * An ad of this type is deprecated and cannot be created. Only deletions
     * are permitted.
     * </pre>
     *
     * <code>CANNOT_CREATE_DEPRECATED_ADS = 6;</code>
     */
    CANNOT_CREATE_DEPRECATED_ADS(6),
    /**
     * <pre>
     * Text ads are deprecated and cannot be created. Use expanded text ads
     * instead.
     * </pre>
     *
     * <code>CANNOT_CREATE_TEXT_ADS = 7;</code>
     */
    CANNOT_CREATE_TEXT_ADS(7),
    /**
     * <pre>
     * A required field was not specified or is an empty string.
     * </pre>
     *
     * <code>EMPTY_FIELD = 8;</code>
     */
    EMPTY_FIELD(8),
    /**
     * <pre>
     * An ad may only be modified once per call
     * </pre>
     *
     * <code>RESOURCE_REFERENCED_IN_MULTIPLE_OPS = 9;</code>
     */
    RESOURCE_REFERENCED_IN_MULTIPLE_OPS(9),
    /**
     * <pre>
     * AdGroupAds with the given ad type cannot be paused.
     * </pre>
     *
     * <code>AD_TYPE_CANNOT_BE_PAUSED = 10;</code>
     */
    AD_TYPE_CANNOT_BE_PAUSED(10),
    /**
     * <pre>
     * AdGroupAds with the given ad type cannot be removed.
     * </pre>
     *
     * <code>AD_TYPE_CANNOT_BE_REMOVED = 11;</code>
     */
    AD_TYPE_CANNOT_BE_REMOVED(11),
    /**
     * <pre>
     * An ad of this type is deprecated and cannot be updated. Only removals
     * are permitted.
     * </pre>
     *
     * <code>CANNOT_UPDATE_DEPRECATED_ADS = 12;</code>
     */
    CANNOT_UPDATE_DEPRECATED_ADS(12),
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
     * No link found between the adgroup ad and the label.
     * </pre>
     *
     * <code>AD_GROUP_AD_LABEL_DOES_NOT_EXIST = 2;</code>
     */
    public static final int AD_GROUP_AD_LABEL_DOES_NOT_EXIST_VALUE = 2;
    /**
     * <pre>
     * The label has already been attached to the adgroup ad.
     * </pre>
     *
     * <code>AD_GROUP_AD_LABEL_ALREADY_EXISTS = 3;</code>
     */
    public static final int AD_GROUP_AD_LABEL_ALREADY_EXISTS_VALUE = 3;
    /**
     * <pre>
     * The specified ad was not found in the adgroup
     * </pre>
     *
     * <code>AD_NOT_UNDER_ADGROUP = 4;</code>
     */
    public static final int AD_NOT_UNDER_ADGROUP_VALUE = 4;
    /**
     * <pre>
     * Removed ads may not be modified
     * </pre>
     *
     * <code>CANNOT_OPERATE_ON_REMOVED_ADGROUPAD = 5;</code>
     */
    public static final int CANNOT_OPERATE_ON_REMOVED_ADGROUPAD_VALUE = 5;
    /**
     * <pre>
     * An ad of this type is deprecated and cannot be created. Only deletions
     * are permitted.
     * </pre>
     *
     * <code>CANNOT_CREATE_DEPRECATED_ADS = 6;</code>
     */
    public static final int CANNOT_CREATE_DEPRECATED_ADS_VALUE = 6;
    /**
     * <pre>
     * Text ads are deprecated and cannot be created. Use expanded text ads
     * instead.
     * </pre>
     *
     * <code>CANNOT_CREATE_TEXT_ADS = 7;</code>
     */
    public static final int CANNOT_CREATE_TEXT_ADS_VALUE = 7;
    /**
     * <pre>
     * A required field was not specified or is an empty string.
     * </pre>
     *
     * <code>EMPTY_FIELD = 8;</code>
     */
    public static final int EMPTY_FIELD_VALUE = 8;
    /**
     * <pre>
     * An ad may only be modified once per call
     * </pre>
     *
     * <code>RESOURCE_REFERENCED_IN_MULTIPLE_OPS = 9;</code>
     */
    public static final int RESOURCE_REFERENCED_IN_MULTIPLE_OPS_VALUE = 9;
    /**
     * <pre>
     * AdGroupAds with the given ad type cannot be paused.
     * </pre>
     *
     * <code>AD_TYPE_CANNOT_BE_PAUSED = 10;</code>
     */
    public static final int AD_TYPE_CANNOT_BE_PAUSED_VALUE = 10;
    /**
     * <pre>
     * AdGroupAds with the given ad type cannot be removed.
     * </pre>
     *
     * <code>AD_TYPE_CANNOT_BE_REMOVED = 11;</code>
     */
    public static final int AD_TYPE_CANNOT_BE_REMOVED_VALUE = 11;
    /**
     * <pre>
     * An ad of this type is deprecated and cannot be updated. Only removals
     * are permitted.
     * </pre>
     *
     * <code>CANNOT_UPDATE_DEPRECATED_ADS = 12;</code>
     */
    public static final int CANNOT_UPDATE_DEPRECATED_ADS_VALUE = 12;


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
    public static AdGroupAdError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupAdError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AD_GROUP_AD_LABEL_DOES_NOT_EXIST;
        case 3: return AD_GROUP_AD_LABEL_ALREADY_EXISTS;
        case 4: return AD_NOT_UNDER_ADGROUP;
        case 5: return CANNOT_OPERATE_ON_REMOVED_ADGROUPAD;
        case 6: return CANNOT_CREATE_DEPRECATED_ADS;
        case 7: return CANNOT_CREATE_TEXT_ADS;
        case 8: return EMPTY_FIELD;
        case 9: return RESOURCE_REFERENCED_IN_MULTIPLE_OPS;
        case 10: return AD_TYPE_CANNOT_BE_PAUSED;
        case 11: return AD_TYPE_CANNOT_BE_REMOVED;
        case 12: return CANNOT_UPDATE_DEPRECATED_ADS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupAdError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupAdError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupAdError>() {
            public AdGroupAdError findValueByNumber(int number) {
              return AdGroupAdError.forNumber(number);
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
      return com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupAdError[] VALUES = values();

    public static AdGroupAdError valueOf(
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

    private AdGroupAdError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.AdGroupAdErrorEnum.AdGroupAdError)
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
    if (!(obj instanceof com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum other = (com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum) obj;

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

  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum prototype) {
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
   * Container for enum describing possible ad group ad errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.AdGroupAdErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.AdGroupAdErrorEnum)
      com.google.ads.googleads.v18.errors.AdGroupAdErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.AdGroupAdErrorProto.internal_static_google_ads_googleads_v18_errors_AdGroupAdErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.AdGroupAdErrorProto.internal_static_google_ads_googleads_v18_errors_AdGroupAdErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.class, com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v18.errors.AdGroupAdErrorProto.internal_static_google_ads_googleads_v18_errors_AdGroupAdErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum build() {
      com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum result = new com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.AdGroupAdErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.AdGroupAdErrorEnum)
  private static final com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupAdErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupAdErrorEnum>() {
    @java.lang.Override
    public AdGroupAdErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupAdErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupAdErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.AdGroupAdErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

