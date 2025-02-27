// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/errors/label_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.errors;

/**
 * <pre>
 * Container for enum describing possible label errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.errors.LabelErrorEnum}
 */
public final class LabelErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.errors.LabelErrorEnum)
    LabelErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelErrorEnum.newBuilder() to construct.
  private LabelErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.errors.LabelErrorProto.internal_static_google_ads_googleads_v19_errors_LabelErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.errors.LabelErrorProto.internal_static_google_ads_googleads_v19_errors_LabelErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.errors.LabelErrorEnum.class, com.google.ads.googleads.v19.errors.LabelErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible label errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.errors.LabelErrorEnum.LabelError}
   */
  public enum LabelError
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
     * An inactive label cannot be applied.
     * </pre>
     *
     * <code>CANNOT_APPLY_INACTIVE_LABEL = 2;</code>
     */
    CANNOT_APPLY_INACTIVE_LABEL(2),
    /**
     * <pre>
     * A label cannot be applied to a disabled ad group criterion.
     * </pre>
     *
     * <code>CANNOT_APPLY_LABEL_TO_DISABLED_AD_GROUP_CRITERION = 3;</code>
     */
    CANNOT_APPLY_LABEL_TO_DISABLED_AD_GROUP_CRITERION(3),
    /**
     * <pre>
     * A label cannot be applied to a negative ad group criterion.
     * </pre>
     *
     * <code>CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_CRITERION = 4;</code>
     */
    CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_CRITERION(4),
    /**
     * <pre>
     * Cannot apply more than 50 labels per resource.
     * </pre>
     *
     * <code>EXCEEDED_LABEL_LIMIT_PER_TYPE = 5;</code>
     */
    EXCEEDED_LABEL_LIMIT_PER_TYPE(5),
    /**
     * <pre>
     * Labels from a manager account cannot be applied to campaign, ad group,
     * ad group ad, or ad group criterion resources.
     * </pre>
     *
     * <code>INVALID_RESOURCE_FOR_MANAGER_LABEL = 6;</code>
     */
    INVALID_RESOURCE_FOR_MANAGER_LABEL(6),
    /**
     * <pre>
     * Label names must be unique.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 7;</code>
     */
    DUPLICATE_NAME(7),
    /**
     * <pre>
     * Label names cannot be empty.
     * </pre>
     *
     * <code>INVALID_LABEL_NAME = 8;</code>
     */
    INVALID_LABEL_NAME(8),
    /**
     * <pre>
     * Labels cannot be applied to a draft.
     * </pre>
     *
     * <code>CANNOT_ATTACH_LABEL_TO_DRAFT = 9;</code>
     */
    CANNOT_ATTACH_LABEL_TO_DRAFT(9),
    /**
     * <pre>
     * Labels not from a manager account cannot be applied to the customer
     * resource.
     * </pre>
     *
     * <code>CANNOT_ATTACH_NON_MANAGER_LABEL_TO_CUSTOMER = 10;</code>
     */
    CANNOT_ATTACH_NON_MANAGER_LABEL_TO_CUSTOMER(10),
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
     * An inactive label cannot be applied.
     * </pre>
     *
     * <code>CANNOT_APPLY_INACTIVE_LABEL = 2;</code>
     */
    public static final int CANNOT_APPLY_INACTIVE_LABEL_VALUE = 2;
    /**
     * <pre>
     * A label cannot be applied to a disabled ad group criterion.
     * </pre>
     *
     * <code>CANNOT_APPLY_LABEL_TO_DISABLED_AD_GROUP_CRITERION = 3;</code>
     */
    public static final int CANNOT_APPLY_LABEL_TO_DISABLED_AD_GROUP_CRITERION_VALUE = 3;
    /**
     * <pre>
     * A label cannot be applied to a negative ad group criterion.
     * </pre>
     *
     * <code>CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_CRITERION = 4;</code>
     */
    public static final int CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_CRITERION_VALUE = 4;
    /**
     * <pre>
     * Cannot apply more than 50 labels per resource.
     * </pre>
     *
     * <code>EXCEEDED_LABEL_LIMIT_PER_TYPE = 5;</code>
     */
    public static final int EXCEEDED_LABEL_LIMIT_PER_TYPE_VALUE = 5;
    /**
     * <pre>
     * Labels from a manager account cannot be applied to campaign, ad group,
     * ad group ad, or ad group criterion resources.
     * </pre>
     *
     * <code>INVALID_RESOURCE_FOR_MANAGER_LABEL = 6;</code>
     */
    public static final int INVALID_RESOURCE_FOR_MANAGER_LABEL_VALUE = 6;
    /**
     * <pre>
     * Label names must be unique.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 7;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 7;
    /**
     * <pre>
     * Label names cannot be empty.
     * </pre>
     *
     * <code>INVALID_LABEL_NAME = 8;</code>
     */
    public static final int INVALID_LABEL_NAME_VALUE = 8;
    /**
     * <pre>
     * Labels cannot be applied to a draft.
     * </pre>
     *
     * <code>CANNOT_ATTACH_LABEL_TO_DRAFT = 9;</code>
     */
    public static final int CANNOT_ATTACH_LABEL_TO_DRAFT_VALUE = 9;
    /**
     * <pre>
     * Labels not from a manager account cannot be applied to the customer
     * resource.
     * </pre>
     *
     * <code>CANNOT_ATTACH_NON_MANAGER_LABEL_TO_CUSTOMER = 10;</code>
     */
    public static final int CANNOT_ATTACH_NON_MANAGER_LABEL_TO_CUSTOMER_VALUE = 10;


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
    public static LabelError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LabelError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_APPLY_INACTIVE_LABEL;
        case 3: return CANNOT_APPLY_LABEL_TO_DISABLED_AD_GROUP_CRITERION;
        case 4: return CANNOT_APPLY_LABEL_TO_NEGATIVE_AD_GROUP_CRITERION;
        case 5: return EXCEEDED_LABEL_LIMIT_PER_TYPE;
        case 6: return INVALID_RESOURCE_FOR_MANAGER_LABEL;
        case 7: return DUPLICATE_NAME;
        case 8: return INVALID_LABEL_NAME;
        case 9: return CANNOT_ATTACH_LABEL_TO_DRAFT;
        case 10: return CANNOT_ATTACH_NON_MANAGER_LABEL_TO_CUSTOMER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LabelError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LabelError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LabelError>() {
            public LabelError findValueByNumber(int number) {
              return LabelError.forNumber(number);
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
      return com.google.ads.googleads.v19.errors.LabelErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final LabelError[] VALUES = values();

    public static LabelError valueOf(
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

    private LabelError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.errors.LabelErrorEnum.LabelError)
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
    if (!(obj instanceof com.google.ads.googleads.v19.errors.LabelErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.errors.LabelErrorEnum other = (com.google.ads.googleads.v19.errors.LabelErrorEnum) obj;

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

  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.LabelErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.errors.LabelErrorEnum prototype) {
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
   * Container for enum describing possible label errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.errors.LabelErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.errors.LabelErrorEnum)
      com.google.ads.googleads.v19.errors.LabelErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.LabelErrorProto.internal_static_google_ads_googleads_v19_errors_LabelErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.errors.LabelErrorProto.internal_static_google_ads_googleads_v19_errors_LabelErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.errors.LabelErrorEnum.class, com.google.ads.googleads.v19.errors.LabelErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.errors.LabelErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v19.errors.LabelErrorProto.internal_static_google_ads_googleads_v19_errors_LabelErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.LabelErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.errors.LabelErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.LabelErrorEnum build() {
      com.google.ads.googleads.v19.errors.LabelErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.LabelErrorEnum buildPartial() {
      com.google.ads.googleads.v19.errors.LabelErrorEnum result = new com.google.ads.googleads.v19.errors.LabelErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.errors.LabelErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v19.errors.LabelErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.errors.LabelErrorEnum other) {
      if (other == com.google.ads.googleads.v19.errors.LabelErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.errors.LabelErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.errors.LabelErrorEnum)
  private static final com.google.ads.googleads.v19.errors.LabelErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.errors.LabelErrorEnum();
  }

  public static com.google.ads.googleads.v19.errors.LabelErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<LabelErrorEnum>() {
    @java.lang.Override
    public LabelErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<LabelErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.errors.LabelErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

