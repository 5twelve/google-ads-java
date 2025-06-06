// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/enums/brand_safety_suitability.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.enums;

/**
 * <pre>
 * Container for enum with 3-Tier brand safety suitability control.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum}
 */
public final class BrandSafetySuitabilityEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)
    BrandSafetySuitabilityEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BrandSafetySuitabilityEnum.newBuilder() to construct.
  private BrandSafetySuitabilityEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BrandSafetySuitabilityEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BrandSafetySuitabilityEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityProto.internal_static_google_ads_googleads_v20_enums_BrandSafetySuitabilityEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityProto.internal_static_google_ads_googleads_v20_enums_BrandSafetySuitabilityEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.class, com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.Builder.class);
  }

  /**
   * <pre>
   * 3-Tier brand safety suitability control.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.BrandSafetySuitability}
   */
  public enum BrandSafetySuitability
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * This option lets you show ads across all inventory on YouTube and video
     * partners that meet our standards for monetization. This option may be an
     * appropriate choice for brands that want maximum access to the full
     * breadth of videos eligible for ads, including, for example, videos that
     * have strong profanity in the context of comedy or a documentary, or
     * excessive violence as featured in video games.
     * </pre>
     *
     * <code>EXPANDED_INVENTORY = 2;</code>
     */
    EXPANDED_INVENTORY(2),
    /**
     * <pre>
     * This option lets you show ads across a wide range of content that's
     * appropriate for most brands, such as popular music videos, documentaries,
     * and movie trailers. The content you can show ads on is based on YouTube's
     * advertiser-friendly content guidelines that take into account, for
     * example, the strength or frequency of profanity, or the appropriateness
     * of subject matter like sensitive events. Ads won't show, for example, on
     * content with repeated strong profanity, strong sexual content, or graphic
     * violence.
     * </pre>
     *
     * <code>STANDARD_INVENTORY = 3;</code>
     */
    STANDARD_INVENTORY(3),
    /**
     * <pre>
     * This option lets you show ads on a reduced range of content that's
     * appropriate for brands with particularly strict guidelines around
     * inappropriate language and sexual suggestiveness; above and beyond what
     * YouTube's advertiser-friendly content guidelines address. The videos
     * accessible in this sensitive category meet heightened requirements,
     * especially for inappropriate language and sexual suggestiveness. For
     * example, your ads will be excluded from showing on some of YouTube's most
     * popular music videos and other pop culture content across YouTube and
     * Google video partners.
     * </pre>
     *
     * <code>LIMITED_INVENTORY = 4;</code>
     */
    LIMITED_INVENTORY(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * This option lets you show ads across all inventory on YouTube and video
     * partners that meet our standards for monetization. This option may be an
     * appropriate choice for brands that want maximum access to the full
     * breadth of videos eligible for ads, including, for example, videos that
     * have strong profanity in the context of comedy or a documentary, or
     * excessive violence as featured in video games.
     * </pre>
     *
     * <code>EXPANDED_INVENTORY = 2;</code>
     */
    public static final int EXPANDED_INVENTORY_VALUE = 2;
    /**
     * <pre>
     * This option lets you show ads across a wide range of content that's
     * appropriate for most brands, such as popular music videos, documentaries,
     * and movie trailers. The content you can show ads on is based on YouTube's
     * advertiser-friendly content guidelines that take into account, for
     * example, the strength or frequency of profanity, or the appropriateness
     * of subject matter like sensitive events. Ads won't show, for example, on
     * content with repeated strong profanity, strong sexual content, or graphic
     * violence.
     * </pre>
     *
     * <code>STANDARD_INVENTORY = 3;</code>
     */
    public static final int STANDARD_INVENTORY_VALUE = 3;
    /**
     * <pre>
     * This option lets you show ads on a reduced range of content that's
     * appropriate for brands with particularly strict guidelines around
     * inappropriate language and sexual suggestiveness; above and beyond what
     * YouTube's advertiser-friendly content guidelines address. The videos
     * accessible in this sensitive category meet heightened requirements,
     * especially for inappropriate language and sexual suggestiveness. For
     * example, your ads will be excluded from showing on some of YouTube's most
     * popular music videos and other pop culture content across YouTube and
     * Google video partners.
     * </pre>
     *
     * <code>LIMITED_INVENTORY = 4;</code>
     */
    public static final int LIMITED_INVENTORY_VALUE = 4;


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
    public static BrandSafetySuitability valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BrandSafetySuitability forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return EXPANDED_INVENTORY;
        case 3: return STANDARD_INVENTORY;
        case 4: return LIMITED_INVENTORY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BrandSafetySuitability>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BrandSafetySuitability> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BrandSafetySuitability>() {
            public BrandSafetySuitability findValueByNumber(int number) {
              return BrandSafetySuitability.forNumber(number);
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
      return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BrandSafetySuitability[] VALUES = values();

    public static BrandSafetySuitability valueOf(
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

    private BrandSafetySuitability(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.BrandSafetySuitability)
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
    if (!(obj instanceof com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum other = (com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum) obj;

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

  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum prototype) {
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
   * Container for enum with 3-Tier brand safety suitability control.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)
      com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityProto.internal_static_google_ads_googleads_v20_enums_BrandSafetySuitabilityEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityProto.internal_static_google_ads_googleads_v20_enums_BrandSafetySuitabilityEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.class, com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.newBuilder()
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
      return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityProto.internal_static_google_ads_googleads_v20_enums_BrandSafetySuitabilityEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum build() {
      com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum buildPartial() {
      com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum result = new com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum(this);
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
      if (other instanceof com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum) {
        return mergeFrom((com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum other) {
      if (other == com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum)
  private static final com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum();
  }

  public static com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BrandSafetySuitabilityEnum>
      PARSER = new com.google.protobuf.AbstractParser<BrandSafetySuitabilityEnum>() {
    @java.lang.Override
    public BrandSafetySuitabilityEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<BrandSafetySuitabilityEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BrandSafetySuitabilityEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.enums.BrandSafetySuitabilityEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

