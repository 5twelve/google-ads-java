// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/asset_group_listing_group_filter_error.proto

package com.google.ads.googleads.v10.errors;

/**
 * <pre>
 * Container for enum describing possible asset group listing group filter
 * errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum}
 */
public final class AssetGroupListingGroupFilterErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)
    AssetGroupListingGroupFilterErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetGroupListingGroupFilterErrorEnum.newBuilder() to construct.
  private AssetGroupListingGroupFilterErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetGroupListingGroupFilterErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetGroupListingGroupFilterErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetGroupListingGroupFilterErrorEnum(
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
    return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorProto.internal_static_google_ads_googleads_v10_errors_AssetGroupListingGroupFilterErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorProto.internal_static_google_ads_googleads_v10_errors_AssetGroupListingGroupFilterErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.class, com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset group listing group filter errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.AssetGroupListingGroupFilterError}
   */
  public enum AssetGroupListingGroupFilterError
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
     * Listing group tree is too deep.
     * </pre>
     *
     * <code>TREE_TOO_DEEP = 2;</code>
     */
    TREE_TOO_DEEP(2),
    /**
     * <pre>
     * Listing Group UNIT node cannot have children.
     * </pre>
     *
     * <code>UNIT_CANNOT_HAVE_CHILDREN = 3;</code>
     */
    UNIT_CANNOT_HAVE_CHILDREN(3),
    /**
     * <pre>
     * Listing Group SUBDIVISION node must have everything else child.
     * </pre>
     *
     * <code>SUBDIVISION_MUST_HAVE_EVERYTHING_ELSE_CHILD = 4;</code>
     */
    SUBDIVISION_MUST_HAVE_EVERYTHING_ELSE_CHILD(4),
    /**
     * <pre>
     * Dimension type of Listing Group must be the same as that of its siblings.
     * </pre>
     *
     * <code>DIFFERENT_DIMENSION_TYPE_BETWEEN_SIBLINGS = 5;</code>
     */
    DIFFERENT_DIMENSION_TYPE_BETWEEN_SIBLINGS(5),
    /**
     * <pre>
     * The sibling Listing Groups target exactly the same dimension value.
     * </pre>
     *
     * <code>SAME_DIMENSION_VALUE_BETWEEN_SIBLINGS = 6;</code>
     */
    SAME_DIMENSION_VALUE_BETWEEN_SIBLINGS(6),
    /**
     * <pre>
     * The dimension type is the same as one of the ancestor Listing Groups.
     * </pre>
     *
     * <code>SAME_DIMENSION_TYPE_BETWEEN_ANCESTORS = 7;</code>
     */
    SAME_DIMENSION_TYPE_BETWEEN_ANCESTORS(7),
    /**
     * <pre>
     * Each Listing Group tree must have a single root.
     * </pre>
     *
     * <code>MULTIPLE_ROOTS = 8;</code>
     */
    MULTIPLE_ROOTS(8),
    /**
     * <pre>
     * Invalid Listing Group dimension value.
     * </pre>
     *
     * <code>INVALID_DIMENSION_VALUE = 9;</code>
     */
    INVALID_DIMENSION_VALUE(9),
    /**
     * <pre>
     * Hierarchical dimension must refine a dimension of the same type.
     * </pre>
     *
     * <code>MUST_REFINE_HIERARCHICAL_PARENT_TYPE = 10;</code>
     */
    MUST_REFINE_HIERARCHICAL_PARENT_TYPE(10),
    /**
     * <pre>
     * Invalid Product Bidding Category.
     * </pre>
     *
     * <code>INVALID_PRODUCT_BIDDING_CATEGORY = 11;</code>
     */
    INVALID_PRODUCT_BIDDING_CATEGORY(11),
    /**
     * <pre>
     * Modifying case value is allowed only while updating the entire subtree at
     * the same time.
     * </pre>
     *
     * <code>CHANGING_CASE_VALUE_WITH_CHILDREN = 12;</code>
     */
    CHANGING_CASE_VALUE_WITH_CHILDREN(12),
    /**
     * <pre>
     * Subdivision node has children which must be removed first.
     * </pre>
     *
     * <code>SUBDIVISION_HAS_CHILDREN = 13;</code>
     */
    SUBDIVISION_HAS_CHILDREN(13),
    /**
     * <pre>
     * Dimension can't subdivide everything-else node in its own hierarchy.
     * </pre>
     *
     * <code>CANNOT_REFINE_HIERARCHICAL_EVERYTHING_ELSE = 14;</code>
     */
    CANNOT_REFINE_HIERARCHICAL_EVERYTHING_ELSE(14),
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
     * Listing group tree is too deep.
     * </pre>
     *
     * <code>TREE_TOO_DEEP = 2;</code>
     */
    public static final int TREE_TOO_DEEP_VALUE = 2;
    /**
     * <pre>
     * Listing Group UNIT node cannot have children.
     * </pre>
     *
     * <code>UNIT_CANNOT_HAVE_CHILDREN = 3;</code>
     */
    public static final int UNIT_CANNOT_HAVE_CHILDREN_VALUE = 3;
    /**
     * <pre>
     * Listing Group SUBDIVISION node must have everything else child.
     * </pre>
     *
     * <code>SUBDIVISION_MUST_HAVE_EVERYTHING_ELSE_CHILD = 4;</code>
     */
    public static final int SUBDIVISION_MUST_HAVE_EVERYTHING_ELSE_CHILD_VALUE = 4;
    /**
     * <pre>
     * Dimension type of Listing Group must be the same as that of its siblings.
     * </pre>
     *
     * <code>DIFFERENT_DIMENSION_TYPE_BETWEEN_SIBLINGS = 5;</code>
     */
    public static final int DIFFERENT_DIMENSION_TYPE_BETWEEN_SIBLINGS_VALUE = 5;
    /**
     * <pre>
     * The sibling Listing Groups target exactly the same dimension value.
     * </pre>
     *
     * <code>SAME_DIMENSION_VALUE_BETWEEN_SIBLINGS = 6;</code>
     */
    public static final int SAME_DIMENSION_VALUE_BETWEEN_SIBLINGS_VALUE = 6;
    /**
     * <pre>
     * The dimension type is the same as one of the ancestor Listing Groups.
     * </pre>
     *
     * <code>SAME_DIMENSION_TYPE_BETWEEN_ANCESTORS = 7;</code>
     */
    public static final int SAME_DIMENSION_TYPE_BETWEEN_ANCESTORS_VALUE = 7;
    /**
     * <pre>
     * Each Listing Group tree must have a single root.
     * </pre>
     *
     * <code>MULTIPLE_ROOTS = 8;</code>
     */
    public static final int MULTIPLE_ROOTS_VALUE = 8;
    /**
     * <pre>
     * Invalid Listing Group dimension value.
     * </pre>
     *
     * <code>INVALID_DIMENSION_VALUE = 9;</code>
     */
    public static final int INVALID_DIMENSION_VALUE_VALUE = 9;
    /**
     * <pre>
     * Hierarchical dimension must refine a dimension of the same type.
     * </pre>
     *
     * <code>MUST_REFINE_HIERARCHICAL_PARENT_TYPE = 10;</code>
     */
    public static final int MUST_REFINE_HIERARCHICAL_PARENT_TYPE_VALUE = 10;
    /**
     * <pre>
     * Invalid Product Bidding Category.
     * </pre>
     *
     * <code>INVALID_PRODUCT_BIDDING_CATEGORY = 11;</code>
     */
    public static final int INVALID_PRODUCT_BIDDING_CATEGORY_VALUE = 11;
    /**
     * <pre>
     * Modifying case value is allowed only while updating the entire subtree at
     * the same time.
     * </pre>
     *
     * <code>CHANGING_CASE_VALUE_WITH_CHILDREN = 12;</code>
     */
    public static final int CHANGING_CASE_VALUE_WITH_CHILDREN_VALUE = 12;
    /**
     * <pre>
     * Subdivision node has children which must be removed first.
     * </pre>
     *
     * <code>SUBDIVISION_HAS_CHILDREN = 13;</code>
     */
    public static final int SUBDIVISION_HAS_CHILDREN_VALUE = 13;
    /**
     * <pre>
     * Dimension can't subdivide everything-else node in its own hierarchy.
     * </pre>
     *
     * <code>CANNOT_REFINE_HIERARCHICAL_EVERYTHING_ELSE = 14;</code>
     */
    public static final int CANNOT_REFINE_HIERARCHICAL_EVERYTHING_ELSE_VALUE = 14;


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
    public static AssetGroupListingGroupFilterError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetGroupListingGroupFilterError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return TREE_TOO_DEEP;
        case 3: return UNIT_CANNOT_HAVE_CHILDREN;
        case 4: return SUBDIVISION_MUST_HAVE_EVERYTHING_ELSE_CHILD;
        case 5: return DIFFERENT_DIMENSION_TYPE_BETWEEN_SIBLINGS;
        case 6: return SAME_DIMENSION_VALUE_BETWEEN_SIBLINGS;
        case 7: return SAME_DIMENSION_TYPE_BETWEEN_ANCESTORS;
        case 8: return MULTIPLE_ROOTS;
        case 9: return INVALID_DIMENSION_VALUE;
        case 10: return MUST_REFINE_HIERARCHICAL_PARENT_TYPE;
        case 11: return INVALID_PRODUCT_BIDDING_CATEGORY;
        case 12: return CHANGING_CASE_VALUE_WITH_CHILDREN;
        case 13: return SUBDIVISION_HAS_CHILDREN;
        case 14: return CANNOT_REFINE_HIERARCHICAL_EVERYTHING_ELSE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetGroupListingGroupFilterError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetGroupListingGroupFilterError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetGroupListingGroupFilterError>() {
            public AssetGroupListingGroupFilterError findValueByNumber(int number) {
              return AssetGroupListingGroupFilterError.forNumber(number);
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
      return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetGroupListingGroupFilterError[] VALUES = values();

    public static AssetGroupListingGroupFilterError valueOf(
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

    private AssetGroupListingGroupFilterError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.AssetGroupListingGroupFilterError)
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
    if (!(obj instanceof com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum other = (com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum) obj;

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

  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum prototype) {
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
   * Container for enum describing possible asset group listing group filter
   * errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)
      com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorProto.internal_static_google_ads_googleads_v10_errors_AssetGroupListingGroupFilterErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorProto.internal_static_google_ads_googleads_v10_errors_AssetGroupListingGroupFilterErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.class, com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorProto.internal_static_google_ads_googleads_v10_errors_AssetGroupListingGroupFilterErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum build() {
      com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum buildPartial() {
      com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum result = new com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum other) {
      if (other == com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum)
  private static final com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum();
  }

  public static com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetGroupListingGroupFilterErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetGroupListingGroupFilterErrorEnum>() {
    @java.lang.Override
    public AssetGroupListingGroupFilterErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetGroupListingGroupFilterErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetGroupListingGroupFilterErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetGroupListingGroupFilterErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.errors.AssetGroupListingGroupFilterErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

