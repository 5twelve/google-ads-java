// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/errors/conversion_value_rule_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.errors;

/**
 * <pre>
 * Container for enum describing possible conversion value rule errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum}
 */
public final class ConversionValueRuleErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)
    ConversionValueRuleErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionValueRuleErrorEnum.newBuilder() to construct.
  private ConversionValueRuleErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionValueRuleErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionValueRuleErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorProto.internal_static_google_ads_googleads_v19_errors_ConversionValueRuleErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorProto.internal_static_google_ads_googleads_v19_errors_ConversionValueRuleErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.class, com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion value rule errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.ConversionValueRuleError}
   */
  public enum ConversionValueRuleError
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
     * The value rule's geo location condition contains invalid geo target
     * constant(s), for example, there's no matching geo target.
     * </pre>
     *
     * <code>INVALID_GEO_TARGET_CONSTANT = 2;</code>
     */
    INVALID_GEO_TARGET_CONSTANT(2),
    /**
     * <pre>
     * The value rule's geo location condition contains conflicting included and
     * excluded geo targets. Specifically, some of the excluded geo target(s)
     * are the same as or contain some of the included geo target(s). For
     * example, the geo location condition includes California but excludes U.S.
     * </pre>
     *
     * <code>CONFLICTING_INCLUDED_AND_EXCLUDED_GEO_TARGET = 3;</code>
     */
    CONFLICTING_INCLUDED_AND_EXCLUDED_GEO_TARGET(3),
    /**
     * <pre>
     * User specified conflicting conditions for two value rules in the same
     * value rule set.
     * </pre>
     *
     * <code>CONFLICTING_CONDITIONS = 4;</code>
     */
    CONFLICTING_CONDITIONS(4),
    /**
     * <pre>
     * The value rule cannot be removed because it's still included in some
     * value rule set.
     * </pre>
     *
     * <code>CANNOT_REMOVE_IF_INCLUDED_IN_VALUE_RULE_SET = 5;</code>
     */
    CANNOT_REMOVE_IF_INCLUDED_IN_VALUE_RULE_SET(5),
    /**
     * <pre>
     * The value rule contains a condition that's not allowed by the value rule
     * set including this value rule.
     * </pre>
     *
     * <code>CONDITION_NOT_ALLOWED = 6;</code>
     */
    CONDITION_NOT_ALLOWED(6),
    /**
     * <pre>
     * The value rule contains a field that should be unset.
     * </pre>
     *
     * <code>FIELD_MUST_BE_UNSET = 7;</code>
     */
    FIELD_MUST_BE_UNSET(7),
    /**
     * <pre>
     * Pausing the value rule requires pausing the value rule set because the
     * value rule is (one of) the last enabled in the value rule set.
     * </pre>
     *
     * <code>CANNOT_PAUSE_UNLESS_VALUE_RULE_SET_IS_PAUSED = 8;</code>
     */
    CANNOT_PAUSE_UNLESS_VALUE_RULE_SET_IS_PAUSED(8),
    /**
     * <pre>
     * The value rule's geo location condition contains untargetable geo target
     * constant(s).
     * </pre>
     *
     * <code>UNTARGETABLE_GEO_TARGET = 9;</code>
     */
    UNTARGETABLE_GEO_TARGET(9),
    /**
     * <pre>
     * The value rule's audience condition contains invalid user list(s). In
     * another word, there's no matching user list.
     * </pre>
     *
     * <code>INVALID_AUDIENCE_USER_LIST = 10;</code>
     */
    INVALID_AUDIENCE_USER_LIST(10),
    /**
     * <pre>
     * The value rule's audience condition contains inaccessible user list(s).
     * </pre>
     *
     * <code>INACCESSIBLE_USER_LIST = 11;</code>
     */
    INACCESSIBLE_USER_LIST(11),
    /**
     * <pre>
     * The value rule's audience condition contains invalid user_interest(s).
     * This might be because there is no matching user interest, or the user
     * interest is not visible.
     * </pre>
     *
     * <code>INVALID_AUDIENCE_USER_INTEREST = 12;</code>
     */
    INVALID_AUDIENCE_USER_INTEREST(12),
    /**
     * <pre>
     * When a value rule is created, it shouldn't have REMOVED status.
     * </pre>
     *
     * <code>CANNOT_ADD_RULE_WITH_STATUS_REMOVED = 13;</code>
     */
    CANNOT_ADD_RULE_WITH_STATUS_REMOVED(13),
    /**
     * <pre>
     * The value rule's itinerary condition contains invalid travel start day,
     * it contains no day of week.
     * </pre>
     *
     * <code>NO_DAY_OF_WEEK_SELECTED = 14;</code>
     */
    NO_DAY_OF_WEEK_SELECTED(14),
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
     * The value rule's geo location condition contains invalid geo target
     * constant(s), for example, there's no matching geo target.
     * </pre>
     *
     * <code>INVALID_GEO_TARGET_CONSTANT = 2;</code>
     */
    public static final int INVALID_GEO_TARGET_CONSTANT_VALUE = 2;
    /**
     * <pre>
     * The value rule's geo location condition contains conflicting included and
     * excluded geo targets. Specifically, some of the excluded geo target(s)
     * are the same as or contain some of the included geo target(s). For
     * example, the geo location condition includes California but excludes U.S.
     * </pre>
     *
     * <code>CONFLICTING_INCLUDED_AND_EXCLUDED_GEO_TARGET = 3;</code>
     */
    public static final int CONFLICTING_INCLUDED_AND_EXCLUDED_GEO_TARGET_VALUE = 3;
    /**
     * <pre>
     * User specified conflicting conditions for two value rules in the same
     * value rule set.
     * </pre>
     *
     * <code>CONFLICTING_CONDITIONS = 4;</code>
     */
    public static final int CONFLICTING_CONDITIONS_VALUE = 4;
    /**
     * <pre>
     * The value rule cannot be removed because it's still included in some
     * value rule set.
     * </pre>
     *
     * <code>CANNOT_REMOVE_IF_INCLUDED_IN_VALUE_RULE_SET = 5;</code>
     */
    public static final int CANNOT_REMOVE_IF_INCLUDED_IN_VALUE_RULE_SET_VALUE = 5;
    /**
     * <pre>
     * The value rule contains a condition that's not allowed by the value rule
     * set including this value rule.
     * </pre>
     *
     * <code>CONDITION_NOT_ALLOWED = 6;</code>
     */
    public static final int CONDITION_NOT_ALLOWED_VALUE = 6;
    /**
     * <pre>
     * The value rule contains a field that should be unset.
     * </pre>
     *
     * <code>FIELD_MUST_BE_UNSET = 7;</code>
     */
    public static final int FIELD_MUST_BE_UNSET_VALUE = 7;
    /**
     * <pre>
     * Pausing the value rule requires pausing the value rule set because the
     * value rule is (one of) the last enabled in the value rule set.
     * </pre>
     *
     * <code>CANNOT_PAUSE_UNLESS_VALUE_RULE_SET_IS_PAUSED = 8;</code>
     */
    public static final int CANNOT_PAUSE_UNLESS_VALUE_RULE_SET_IS_PAUSED_VALUE = 8;
    /**
     * <pre>
     * The value rule's geo location condition contains untargetable geo target
     * constant(s).
     * </pre>
     *
     * <code>UNTARGETABLE_GEO_TARGET = 9;</code>
     */
    public static final int UNTARGETABLE_GEO_TARGET_VALUE = 9;
    /**
     * <pre>
     * The value rule's audience condition contains invalid user list(s). In
     * another word, there's no matching user list.
     * </pre>
     *
     * <code>INVALID_AUDIENCE_USER_LIST = 10;</code>
     */
    public static final int INVALID_AUDIENCE_USER_LIST_VALUE = 10;
    /**
     * <pre>
     * The value rule's audience condition contains inaccessible user list(s).
     * </pre>
     *
     * <code>INACCESSIBLE_USER_LIST = 11;</code>
     */
    public static final int INACCESSIBLE_USER_LIST_VALUE = 11;
    /**
     * <pre>
     * The value rule's audience condition contains invalid user_interest(s).
     * This might be because there is no matching user interest, or the user
     * interest is not visible.
     * </pre>
     *
     * <code>INVALID_AUDIENCE_USER_INTEREST = 12;</code>
     */
    public static final int INVALID_AUDIENCE_USER_INTEREST_VALUE = 12;
    /**
     * <pre>
     * When a value rule is created, it shouldn't have REMOVED status.
     * </pre>
     *
     * <code>CANNOT_ADD_RULE_WITH_STATUS_REMOVED = 13;</code>
     */
    public static final int CANNOT_ADD_RULE_WITH_STATUS_REMOVED_VALUE = 13;
    /**
     * <pre>
     * The value rule's itinerary condition contains invalid travel start day,
     * it contains no day of week.
     * </pre>
     *
     * <code>NO_DAY_OF_WEEK_SELECTED = 14;</code>
     */
    public static final int NO_DAY_OF_WEEK_SELECTED_VALUE = 14;


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
    public static ConversionValueRuleError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionValueRuleError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_GEO_TARGET_CONSTANT;
        case 3: return CONFLICTING_INCLUDED_AND_EXCLUDED_GEO_TARGET;
        case 4: return CONFLICTING_CONDITIONS;
        case 5: return CANNOT_REMOVE_IF_INCLUDED_IN_VALUE_RULE_SET;
        case 6: return CONDITION_NOT_ALLOWED;
        case 7: return FIELD_MUST_BE_UNSET;
        case 8: return CANNOT_PAUSE_UNLESS_VALUE_RULE_SET_IS_PAUSED;
        case 9: return UNTARGETABLE_GEO_TARGET;
        case 10: return INVALID_AUDIENCE_USER_LIST;
        case 11: return INACCESSIBLE_USER_LIST;
        case 12: return INVALID_AUDIENCE_USER_INTEREST;
        case 13: return CANNOT_ADD_RULE_WITH_STATUS_REMOVED;
        case 14: return NO_DAY_OF_WEEK_SELECTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionValueRuleError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionValueRuleError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionValueRuleError>() {
            public ConversionValueRuleError findValueByNumber(int number) {
              return ConversionValueRuleError.forNumber(number);
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
      return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionValueRuleError[] VALUES = values();

    public static ConversionValueRuleError valueOf(
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

    private ConversionValueRuleError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.ConversionValueRuleError)
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
    if (!(obj instanceof com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum other = (com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum) obj;

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

  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum prototype) {
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
   * Container for enum describing possible conversion value rule errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)
      com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorProto.internal_static_google_ads_googleads_v19_errors_ConversionValueRuleErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorProto.internal_static_google_ads_googleads_v19_errors_ConversionValueRuleErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.class, com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorProto.internal_static_google_ads_googleads_v19_errors_ConversionValueRuleErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum build() {
      com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum buildPartial() {
      com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum result = new com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum other) {
      if (other == com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum)
  private static final com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum();
  }

  public static com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionValueRuleErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionValueRuleErrorEnum>() {
    @java.lang.Override
    public ConversionValueRuleErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionValueRuleErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionValueRuleErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.errors.ConversionValueRuleErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

