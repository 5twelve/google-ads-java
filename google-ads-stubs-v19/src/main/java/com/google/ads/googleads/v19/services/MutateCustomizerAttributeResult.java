// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/customizer_attribute_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * The result for the customizer attribute mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.MutateCustomizerAttributeResult}
 */
public final class MutateCustomizerAttributeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.MutateCustomizerAttributeResult)
    MutateCustomizerAttributeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomizerAttributeResult.newBuilder() to construct.
  private MutateCustomizerAttributeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomizerAttributeResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCustomizerAttributeResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.CustomizerAttributeServiceProto.internal_static_google_ads_googleads_v19_services_MutateCustomizerAttributeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.CustomizerAttributeServiceProto.internal_static_google_ads_googleads_v19_services_MutateCustomizerAttributeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.class, com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMIZER_ATTRIBUTE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v19.resources.CustomizerAttribute customizerAttribute_;
  /**
   * <pre>
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
   * @return Whether the customizerAttribute field is set.
   */
  @java.lang.Override
  public boolean hasCustomizerAttribute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
   * @return The customizerAttribute.
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.CustomizerAttribute getCustomizerAttribute() {
    return customizerAttribute_ == null ? com.google.ads.googleads.v19.resources.CustomizerAttribute.getDefaultInstance() : customizerAttribute_;
  }
  /**
   * <pre>
   * The mutated CustomizerAttribute with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.CustomizerAttributeOrBuilder getCustomizerAttributeOrBuilder() {
    return customizerAttribute_ == null ? com.google.ads.googleads.v19.resources.CustomizerAttribute.getDefaultInstance() : customizerAttribute_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCustomizerAttribute());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCustomizerAttribute());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult other = (com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCustomizerAttribute() != other.hasCustomizerAttribute()) return false;
    if (hasCustomizerAttribute()) {
      if (!getCustomizerAttribute()
          .equals(other.getCustomizerAttribute())) return false;
    }
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasCustomizerAttribute()) {
      hash = (37 * hash) + CUSTOMIZER_ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getCustomizerAttribute().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult prototype) {
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
   * The result for the customizer attribute mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.MutateCustomizerAttributeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.MutateCustomizerAttributeResult)
      com.google.ads.googleads.v19.services.MutateCustomizerAttributeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.CustomizerAttributeServiceProto.internal_static_google_ads_googleads_v19_services_MutateCustomizerAttributeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.CustomizerAttributeServiceProto.internal_static_google_ads_googleads_v19_services_MutateCustomizerAttributeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.class, com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.newBuilder()
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
        getCustomizerAttributeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      customizerAttribute_ = null;
      if (customizerAttributeBuilder_ != null) {
        customizerAttributeBuilder_.dispose();
        customizerAttributeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.CustomizerAttributeServiceProto.internal_static_google_ads_googleads_v19_services_MutateCustomizerAttributeResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult build() {
      com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult buildPartial() {
      com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult result = new com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customizerAttribute_ = customizerAttributeBuilder_ == null
            ? customizerAttribute_
            : customizerAttributeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult) {
        return mergeFrom((com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult other) {
      if (other == com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCustomizerAttribute()) {
        mergeCustomizerAttribute(other.getCustomizerAttribute());
      }
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
            case 10: {
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCustomizerAttributeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v19.resources.CustomizerAttribute customizerAttribute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.CustomizerAttribute, com.google.ads.googleads.v19.resources.CustomizerAttribute.Builder, com.google.ads.googleads.v19.resources.CustomizerAttributeOrBuilder> customizerAttributeBuilder_;
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     * @return Whether the customizerAttribute field is set.
     */
    public boolean hasCustomizerAttribute() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     * @return The customizerAttribute.
     */
    public com.google.ads.googleads.v19.resources.CustomizerAttribute getCustomizerAttribute() {
      if (customizerAttributeBuilder_ == null) {
        return customizerAttribute_ == null ? com.google.ads.googleads.v19.resources.CustomizerAttribute.getDefaultInstance() : customizerAttribute_;
      } else {
        return customizerAttributeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public Builder setCustomizerAttribute(com.google.ads.googleads.v19.resources.CustomizerAttribute value) {
      if (customizerAttributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customizerAttribute_ = value;
      } else {
        customizerAttributeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public Builder setCustomizerAttribute(
        com.google.ads.googleads.v19.resources.CustomizerAttribute.Builder builderForValue) {
      if (customizerAttributeBuilder_ == null) {
        customizerAttribute_ = builderForValue.build();
      } else {
        customizerAttributeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public Builder mergeCustomizerAttribute(com.google.ads.googleads.v19.resources.CustomizerAttribute value) {
      if (customizerAttributeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          customizerAttribute_ != null &&
          customizerAttribute_ != com.google.ads.googleads.v19.resources.CustomizerAttribute.getDefaultInstance()) {
          getCustomizerAttributeBuilder().mergeFrom(value);
        } else {
          customizerAttribute_ = value;
        }
      } else {
        customizerAttributeBuilder_.mergeFrom(value);
      }
      if (customizerAttribute_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public Builder clearCustomizerAttribute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customizerAttribute_ = null;
      if (customizerAttributeBuilder_ != null) {
        customizerAttributeBuilder_.dispose();
        customizerAttributeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public com.google.ads.googleads.v19.resources.CustomizerAttribute.Builder getCustomizerAttributeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCustomizerAttributeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    public com.google.ads.googleads.v19.resources.CustomizerAttributeOrBuilder getCustomizerAttributeOrBuilder() {
      if (customizerAttributeBuilder_ != null) {
        return customizerAttributeBuilder_.getMessageOrBuilder();
      } else {
        return customizerAttribute_ == null ?
            com.google.ads.googleads.v19.resources.CustomizerAttribute.getDefaultInstance() : customizerAttribute_;
      }
    }
    /**
     * <pre>
     * The mutated CustomizerAttribute with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.CustomizerAttribute customizer_attribute = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.CustomizerAttribute, com.google.ads.googleads.v19.resources.CustomizerAttribute.Builder, com.google.ads.googleads.v19.resources.CustomizerAttributeOrBuilder> 
        getCustomizerAttributeFieldBuilder() {
      if (customizerAttributeBuilder_ == null) {
        customizerAttributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v19.resources.CustomizerAttribute, com.google.ads.googleads.v19.resources.CustomizerAttribute.Builder, com.google.ads.googleads.v19.resources.CustomizerAttributeOrBuilder>(
                getCustomizerAttribute(),
                getParentForChildren(),
                isClean());
        customizerAttribute_ = null;
      }
      return customizerAttributeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.MutateCustomizerAttributeResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.MutateCustomizerAttributeResult)
  private static final com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult();
  }

  public static com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomizerAttributeResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomizerAttributeResult>() {
    @java.lang.Override
    public MutateCustomizerAttributeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateCustomizerAttributeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomizerAttributeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.MutateCustomizerAttributeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

