// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/enums/targeting_dimension.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.enums;

/**
 * <pre>
 * The dimensions that can be targeted.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.enums.TargetingDimensionEnum}
 */
public final class TargetingDimensionEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.enums.TargetingDimensionEnum)
    TargetingDimensionEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetingDimensionEnum.newBuilder() to construct.
  private TargetingDimensionEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetingDimensionEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetingDimensionEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.enums.TargetingDimensionProto.internal_static_google_ads_googleads_v19_enums_TargetingDimensionEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.enums.TargetingDimensionProto.internal_static_google_ads_googleads_v19_enums_TargetingDimensionEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.enums.TargetingDimensionEnum.class, com.google.ads.googleads.v19.enums.TargetingDimensionEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible targeting dimensions.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.enums.TargetingDimensionEnum.TargetingDimension}
   */
  public enum TargetingDimension
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
     * Keyword criteria, for example, 'mars cruise'. KEYWORD may be used as a
     * custom bid dimension. Keywords are always a targeting dimension, so may
     * not be set as a target "ALL" dimension with TargetRestriction.
     * </pre>
     *
     * <code>KEYWORD = 2;</code>
     */
    KEYWORD(2),
    /**
     * <pre>
     * Audience criteria, which include user list, user interest, custom
     * affinity,  and custom in market.
     * </pre>
     *
     * <code>AUDIENCE = 3;</code>
     */
    AUDIENCE(3),
    /**
     * <pre>
     * Topic criteria for targeting categories of content, for example,
     * 'category::Animals&gt;Pets' Used for Display and Video targeting.
     * </pre>
     *
     * <code>TOPIC = 4;</code>
     */
    TOPIC(4),
    /**
     * <pre>
     * Criteria for targeting gender.
     * </pre>
     *
     * <code>GENDER = 5;</code>
     */
    GENDER(5),
    /**
     * <pre>
     * Criteria for targeting age ranges.
     * </pre>
     *
     * <code>AGE_RANGE = 6;</code>
     */
    AGE_RANGE(6),
    /**
     * <pre>
     * Placement criteria, which include websites like 'www.flowers4sale.com',
     * as well as mobile applications, mobile app categories, YouTube videos,
     * and YouTube channels.
     * </pre>
     *
     * <code>PLACEMENT = 7;</code>
     */
    PLACEMENT(7),
    /**
     * <pre>
     * Criteria for parental status targeting.
     * </pre>
     *
     * <code>PARENTAL_STATUS = 8;</code>
     */
    PARENTAL_STATUS(8),
    /**
     * <pre>
     * Criteria for income range targeting.
     * </pre>
     *
     * <code>INCOME_RANGE = 9;</code>
     */
    INCOME_RANGE(9),
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
     * Keyword criteria, for example, 'mars cruise'. KEYWORD may be used as a
     * custom bid dimension. Keywords are always a targeting dimension, so may
     * not be set as a target "ALL" dimension with TargetRestriction.
     * </pre>
     *
     * <code>KEYWORD = 2;</code>
     */
    public static final int KEYWORD_VALUE = 2;
    /**
     * <pre>
     * Audience criteria, which include user list, user interest, custom
     * affinity,  and custom in market.
     * </pre>
     *
     * <code>AUDIENCE = 3;</code>
     */
    public static final int AUDIENCE_VALUE = 3;
    /**
     * <pre>
     * Topic criteria for targeting categories of content, for example,
     * 'category::Animals&gt;Pets' Used for Display and Video targeting.
     * </pre>
     *
     * <code>TOPIC = 4;</code>
     */
    public static final int TOPIC_VALUE = 4;
    /**
     * <pre>
     * Criteria for targeting gender.
     * </pre>
     *
     * <code>GENDER = 5;</code>
     */
    public static final int GENDER_VALUE = 5;
    /**
     * <pre>
     * Criteria for targeting age ranges.
     * </pre>
     *
     * <code>AGE_RANGE = 6;</code>
     */
    public static final int AGE_RANGE_VALUE = 6;
    /**
     * <pre>
     * Placement criteria, which include websites like 'www.flowers4sale.com',
     * as well as mobile applications, mobile app categories, YouTube videos,
     * and YouTube channels.
     * </pre>
     *
     * <code>PLACEMENT = 7;</code>
     */
    public static final int PLACEMENT_VALUE = 7;
    /**
     * <pre>
     * Criteria for parental status targeting.
     * </pre>
     *
     * <code>PARENTAL_STATUS = 8;</code>
     */
    public static final int PARENTAL_STATUS_VALUE = 8;
    /**
     * <pre>
     * Criteria for income range targeting.
     * </pre>
     *
     * <code>INCOME_RANGE = 9;</code>
     */
    public static final int INCOME_RANGE_VALUE = 9;


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
    public static TargetingDimension valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TargetingDimension forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return KEYWORD;
        case 3: return AUDIENCE;
        case 4: return TOPIC;
        case 5: return GENDER;
        case 6: return AGE_RANGE;
        case 7: return PLACEMENT;
        case 8: return PARENTAL_STATUS;
        case 9: return INCOME_RANGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TargetingDimension>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TargetingDimension> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TargetingDimension>() {
            public TargetingDimension findValueByNumber(int number) {
              return TargetingDimension.forNumber(number);
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
      return com.google.ads.googleads.v19.enums.TargetingDimensionEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final TargetingDimension[] VALUES = values();

    public static TargetingDimension valueOf(
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

    private TargetingDimension(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.enums.TargetingDimensionEnum.TargetingDimension)
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
    if (!(obj instanceof com.google.ads.googleads.v19.enums.TargetingDimensionEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.enums.TargetingDimensionEnum other = (com.google.ads.googleads.v19.enums.TargetingDimensionEnum) obj;

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

  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.enums.TargetingDimensionEnum prototype) {
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
   * The dimensions that can be targeted.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.enums.TargetingDimensionEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.enums.TargetingDimensionEnum)
      com.google.ads.googleads.v19.enums.TargetingDimensionEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.enums.TargetingDimensionProto.internal_static_google_ads_googleads_v19_enums_TargetingDimensionEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.enums.TargetingDimensionProto.internal_static_google_ads_googleads_v19_enums_TargetingDimensionEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.enums.TargetingDimensionEnum.class, com.google.ads.googleads.v19.enums.TargetingDimensionEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.enums.TargetingDimensionEnum.newBuilder()
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
      return com.google.ads.googleads.v19.enums.TargetingDimensionProto.internal_static_google_ads_googleads_v19_enums_TargetingDimensionEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.TargetingDimensionEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.enums.TargetingDimensionEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.TargetingDimensionEnum build() {
      com.google.ads.googleads.v19.enums.TargetingDimensionEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.enums.TargetingDimensionEnum buildPartial() {
      com.google.ads.googleads.v19.enums.TargetingDimensionEnum result = new com.google.ads.googleads.v19.enums.TargetingDimensionEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.enums.TargetingDimensionEnum) {
        return mergeFrom((com.google.ads.googleads.v19.enums.TargetingDimensionEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.enums.TargetingDimensionEnum other) {
      if (other == com.google.ads.googleads.v19.enums.TargetingDimensionEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.enums.TargetingDimensionEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.enums.TargetingDimensionEnum)
  private static final com.google.ads.googleads.v19.enums.TargetingDimensionEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.enums.TargetingDimensionEnum();
  }

  public static com.google.ads.googleads.v19.enums.TargetingDimensionEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetingDimensionEnum>
      PARSER = new com.google.protobuf.AbstractParser<TargetingDimensionEnum>() {
    @java.lang.Override
    public TargetingDimensionEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetingDimensionEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetingDimensionEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.enums.TargetingDimensionEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

