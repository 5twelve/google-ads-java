// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/enums/asset_group_primary_status_reason.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.enums;

/**
 * <pre>
 * Container for enum describing possible asset group primary status reasons.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum}
 */
public final class AssetGroupPrimaryStatusReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)
    AssetGroupPrimaryStatusReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetGroupPrimaryStatusReasonEnum.newBuilder() to construct.
  private AssetGroupPrimaryStatusReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetGroupPrimaryStatusReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetGroupPrimaryStatusReasonEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonProto.internal_static_google_ads_googleads_v19_enums_AssetGroupPrimaryStatusReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonProto.internal_static_google_ads_googleads_v19_enums_AssetGroupPrimaryStatusReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.class, com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the possible asset group primary status reasons. Provides
   * reasons into why an asset group is not serving or not serving optimally.
   * It will be empty when the asset group is serving without issues.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.AssetGroupPrimaryStatusReason}
   */
  public enum AssetGroupPrimaryStatusReason
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
     * The user-specified asset group status is paused. Contributes to
     * AssetGroupPrimaryStatus.PAUSED
     * </pre>
     *
     * <code>ASSET_GROUP_PAUSED = 2;</code>
     */
    ASSET_GROUP_PAUSED(2),
    /**
     * <pre>
     * The user-specified asset group status is removed. Contributes to
     * AssetGroupPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>ASSET_GROUP_REMOVED = 3;</code>
     */
    ASSET_GROUP_REMOVED(3),
    /**
     * <pre>
     * The user-specified campaign status is removed. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 4;</code>
     */
    CAMPAIGN_REMOVED(4),
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 5;</code>
     */
    CAMPAIGN_PAUSED(5),
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 6;</code>
     */
    CAMPAIGN_PENDING(6),
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 7;</code>
     */
    CAMPAIGN_ENDED(7),
    /**
     * <pre>
     * The asset group is approved but only serves in limited capacity due to
     * policies. Contributes to AssetGroupPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>ASSET_GROUP_LIMITED = 8;</code>
     */
    ASSET_GROUP_LIMITED(8),
    /**
     * <pre>
     * The asset group has been marked as disapproved. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>ASSET_GROUP_DISAPPROVED = 9;</code>
     */
    ASSET_GROUP_DISAPPROVED(9),
    /**
     * <pre>
     * The asset group has not completed policy review. Contributes to
     * AssetGroupPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>ASSET_GROUP_UNDER_REVIEW = 10;</code>
     */
    ASSET_GROUP_UNDER_REVIEW(10),
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
     * The user-specified asset group status is paused. Contributes to
     * AssetGroupPrimaryStatus.PAUSED
     * </pre>
     *
     * <code>ASSET_GROUP_PAUSED = 2;</code>
     */
    public static final int ASSET_GROUP_PAUSED_VALUE = 2;
    /**
     * <pre>
     * The user-specified asset group status is removed. Contributes to
     * AssetGroupPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>ASSET_GROUP_REMOVED = 3;</code>
     */
    public static final int ASSET_GROUP_REMOVED_VALUE = 3;
    /**
     * <pre>
     * The user-specified campaign status is removed. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 4;</code>
     */
    public static final int CAMPAIGN_REMOVED_VALUE = 4;
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 5;</code>
     */
    public static final int CAMPAIGN_PAUSED_VALUE = 5;
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 6;</code>
     */
    public static final int CAMPAIGN_PENDING_VALUE = 6;
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 7;</code>
     */
    public static final int CAMPAIGN_ENDED_VALUE = 7;
    /**
     * <pre>
     * The asset group is approved but only serves in limited capacity due to
     * policies. Contributes to AssetGroupPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>ASSET_GROUP_LIMITED = 8;</code>
     */
    public static final int ASSET_GROUP_LIMITED_VALUE = 8;
    /**
     * <pre>
     * The asset group has been marked as disapproved. Contributes to
     * AssetGroupPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>ASSET_GROUP_DISAPPROVED = 9;</code>
     */
    public static final int ASSET_GROUP_DISAPPROVED_VALUE = 9;
    /**
     * <pre>
     * The asset group has not completed policy review. Contributes to
     * AssetGroupPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>ASSET_GROUP_UNDER_REVIEW = 10;</code>
     */
    public static final int ASSET_GROUP_UNDER_REVIEW_VALUE = 10;


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
    public static AssetGroupPrimaryStatusReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetGroupPrimaryStatusReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ASSET_GROUP_PAUSED;
        case 3: return ASSET_GROUP_REMOVED;
        case 4: return CAMPAIGN_REMOVED;
        case 5: return CAMPAIGN_PAUSED;
        case 6: return CAMPAIGN_PENDING;
        case 7: return CAMPAIGN_ENDED;
        case 8: return ASSET_GROUP_LIMITED;
        case 9: return ASSET_GROUP_DISAPPROVED;
        case 10: return ASSET_GROUP_UNDER_REVIEW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetGroupPrimaryStatusReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetGroupPrimaryStatusReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetGroupPrimaryStatusReason>() {
            public AssetGroupPrimaryStatusReason findValueByNumber(int number) {
              return AssetGroupPrimaryStatusReason.forNumber(number);
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
      return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetGroupPrimaryStatusReason[] VALUES = values();

    public static AssetGroupPrimaryStatusReason valueOf(
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

    private AssetGroupPrimaryStatusReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.AssetGroupPrimaryStatusReason)
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
    if (!(obj instanceof com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum other = (com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum) obj;

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

  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum prototype) {
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
   * Container for enum describing possible asset group primary status reasons.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)
      com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonProto.internal_static_google_ads_googleads_v19_enums_AssetGroupPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonProto.internal_static_google_ads_googleads_v19_enums_AssetGroupPrimaryStatusReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.class, com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.newBuilder()
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
      return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonProto.internal_static_google_ads_googleads_v19_enums_AssetGroupPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum build() {
      com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum buildPartial() {
      com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum result = new com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum other) {
      if (other == com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum)
  private static final com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum();
  }

  public static com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetGroupPrimaryStatusReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetGroupPrimaryStatusReasonEnum>() {
    @java.lang.Override
    public AssetGroupPrimaryStatusReasonEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetGroupPrimaryStatusReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetGroupPrimaryStatusReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.enums.AssetGroupPrimaryStatusReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

