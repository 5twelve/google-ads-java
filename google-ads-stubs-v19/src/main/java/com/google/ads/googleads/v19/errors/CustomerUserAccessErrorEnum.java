// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/errors/customer_user_access_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.errors;

/**
 * <pre>
 * Container for enum describing possible CustomerUserAccess errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum}
 */
public final class CustomerUserAccessErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)
    CustomerUserAccessErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerUserAccessErrorEnum.newBuilder() to construct.
  private CustomerUserAccessErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerUserAccessErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerUserAccessErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorProto.internal_static_google_ads_googleads_v19_errors_CustomerUserAccessErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorProto.internal_static_google_ads_googleads_v19_errors_CustomerUserAccessErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.class, com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible customer user access errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.CustomerUserAccessError}
   */
  public enum CustomerUserAccessError
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
     * There is no user associated with the user id specified.
     * </pre>
     *
     * <code>INVALID_USER_ID = 2;</code>
     */
    INVALID_USER_ID(2),
    /**
     * <pre>
     * Unable to remove the access between the user and customer.
     * </pre>
     *
     * <code>REMOVAL_DISALLOWED = 3;</code>
     */
    REMOVAL_DISALLOWED(3),
    /**
     * <pre>
     * Unable to add or update the access role as specified.
     * </pre>
     *
     * <code>DISALLOWED_ACCESS_ROLE = 4;</code>
     */
    DISALLOWED_ACCESS_ROLE(4),
    /**
     * <pre>
     * The user can't remove itself from an active serving customer if it's the
     * last admin user and the customer doesn't have any owner manager
     * </pre>
     *
     * <code>LAST_ADMIN_USER_OF_SERVING_CUSTOMER = 5;</code>
     */
    LAST_ADMIN_USER_OF_SERVING_CUSTOMER(5),
    /**
     * <pre>
     * Last admin user cannot be removed from a manager.
     * </pre>
     *
     * <code>LAST_ADMIN_USER_OF_MANAGER = 6;</code>
     */
    LAST_ADMIN_USER_OF_MANAGER(6),
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
     * There is no user associated with the user id specified.
     * </pre>
     *
     * <code>INVALID_USER_ID = 2;</code>
     */
    public static final int INVALID_USER_ID_VALUE = 2;
    /**
     * <pre>
     * Unable to remove the access between the user and customer.
     * </pre>
     *
     * <code>REMOVAL_DISALLOWED = 3;</code>
     */
    public static final int REMOVAL_DISALLOWED_VALUE = 3;
    /**
     * <pre>
     * Unable to add or update the access role as specified.
     * </pre>
     *
     * <code>DISALLOWED_ACCESS_ROLE = 4;</code>
     */
    public static final int DISALLOWED_ACCESS_ROLE_VALUE = 4;
    /**
     * <pre>
     * The user can't remove itself from an active serving customer if it's the
     * last admin user and the customer doesn't have any owner manager
     * </pre>
     *
     * <code>LAST_ADMIN_USER_OF_SERVING_CUSTOMER = 5;</code>
     */
    public static final int LAST_ADMIN_USER_OF_SERVING_CUSTOMER_VALUE = 5;
    /**
     * <pre>
     * Last admin user cannot be removed from a manager.
     * </pre>
     *
     * <code>LAST_ADMIN_USER_OF_MANAGER = 6;</code>
     */
    public static final int LAST_ADMIN_USER_OF_MANAGER_VALUE = 6;


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
    public static CustomerUserAccessError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomerUserAccessError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_USER_ID;
        case 3: return REMOVAL_DISALLOWED;
        case 4: return DISALLOWED_ACCESS_ROLE;
        case 5: return LAST_ADMIN_USER_OF_SERVING_CUSTOMER;
        case 6: return LAST_ADMIN_USER_OF_MANAGER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomerUserAccessError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomerUserAccessError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomerUserAccessError>() {
            public CustomerUserAccessError findValueByNumber(int number) {
              return CustomerUserAccessError.forNumber(number);
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
      return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomerUserAccessError[] VALUES = values();

    public static CustomerUserAccessError valueOf(
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

    private CustomerUserAccessError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.CustomerUserAccessError)
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
    if (!(obj instanceof com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum other = (com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum) obj;

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

  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum prototype) {
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
   * Container for enum describing possible CustomerUserAccess errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)
      com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorProto.internal_static_google_ads_googleads_v19_errors_CustomerUserAccessErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorProto.internal_static_google_ads_googleads_v19_errors_CustomerUserAccessErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.class, com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorProto.internal_static_google_ads_googleads_v19_errors_CustomerUserAccessErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum build() {
      com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum buildPartial() {
      com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum result = new com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum other) {
      if (other == com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum)
  private static final com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum();
  }

  public static com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerUserAccessErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CustomerUserAccessErrorEnum>() {
    @java.lang.Override
    public CustomerUserAccessErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerUserAccessErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerUserAccessErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.errors.CustomerUserAccessErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

