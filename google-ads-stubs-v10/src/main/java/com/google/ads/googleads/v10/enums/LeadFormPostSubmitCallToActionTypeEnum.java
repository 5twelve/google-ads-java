// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/lead_form_post_submit_call_to_action_type.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Describes the type of post-submit call-to-action phrases for a lead form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum}
 */
public final class LeadFormPostSubmitCallToActionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)
    LeadFormPostSubmitCallToActionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormPostSubmitCallToActionTypeEnum.newBuilder() to construct.
  private LeadFormPostSubmitCallToActionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormPostSubmitCallToActionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormPostSubmitCallToActionTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LeadFormPostSubmitCallToActionTypeEnum(
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
    return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeProto.internal_static_google_ads_googleads_v10_enums_LeadFormPostSubmitCallToActionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeProto.internal_static_google_ads_googleads_v10_enums_LeadFormPostSubmitCallToActionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.class, com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the type of post-submit call-to-action phrases for a lead
   * form.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType}
   */
  public enum LeadFormPostSubmitCallToActionType
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
     * Visit site.
     * </pre>
     *
     * <code>VISIT_SITE = 2;</code>
     */
    VISIT_SITE(2),
    /**
     * <pre>
     * Download.
     * </pre>
     *
     * <code>DOWNLOAD = 3;</code>
     */
    DOWNLOAD(3),
    /**
     * <pre>
     * Learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 4;</code>
     */
    LEARN_MORE(4),
    /**
     * <pre>
     * Shop now.
     * </pre>
     *
     * <code>SHOP_NOW = 5;</code>
     */
    SHOP_NOW(5),
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
     * Visit site.
     * </pre>
     *
     * <code>VISIT_SITE = 2;</code>
     */
    public static final int VISIT_SITE_VALUE = 2;
    /**
     * <pre>
     * Download.
     * </pre>
     *
     * <code>DOWNLOAD = 3;</code>
     */
    public static final int DOWNLOAD_VALUE = 3;
    /**
     * <pre>
     * Learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 4;</code>
     */
    public static final int LEARN_MORE_VALUE = 4;
    /**
     * <pre>
     * Shop now.
     * </pre>
     *
     * <code>SHOP_NOW = 5;</code>
     */
    public static final int SHOP_NOW_VALUE = 5;


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
    public static LeadFormPostSubmitCallToActionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LeadFormPostSubmitCallToActionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return VISIT_SITE;
        case 3: return DOWNLOAD;
        case 4: return LEARN_MORE;
        case 5: return SHOP_NOW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LeadFormPostSubmitCallToActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LeadFormPostSubmitCallToActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LeadFormPostSubmitCallToActionType>() {
            public LeadFormPostSubmitCallToActionType findValueByNumber(int number) {
              return LeadFormPostSubmitCallToActionType.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final LeadFormPostSubmitCallToActionType[] VALUES = values();

    public static LeadFormPostSubmitCallToActionType valueOf(
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

    private LeadFormPostSubmitCallToActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum other = (com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum prototype) {
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
   * Describes the type of post-submit call-to-action phrases for a lead form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)
      com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeProto.internal_static_google_ads_googleads_v10_enums_LeadFormPostSubmitCallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeProto.internal_static_google_ads_googleads_v10_enums_LeadFormPostSubmitCallToActionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.class, com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeProto.internal_static_google_ads_googleads_v10_enums_LeadFormPostSubmitCallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum build() {
      com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum buildPartial() {
      com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum result = new com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum other) {
      if (other == com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum)
  private static final com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum();
  }

  public static com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormPostSubmitCallToActionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormPostSubmitCallToActionTypeEnum>() {
    @java.lang.Override
    public LeadFormPostSubmitCallToActionTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LeadFormPostSubmitCallToActionTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeadFormPostSubmitCallToActionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormPostSubmitCallToActionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.LeadFormPostSubmitCallToActionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

