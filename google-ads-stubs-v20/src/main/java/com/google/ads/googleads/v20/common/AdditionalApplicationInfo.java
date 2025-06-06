// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/additional_application_info.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

/**
 * <pre>
 * Additional information about the application/tool issuing the request. This
 * field is only used by [ContentCreatorInsightsService],
 * [AudienceInsightsService], and [ReachPlanService] APIs.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.common.AdditionalApplicationInfo}
 */
public final class AdditionalApplicationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.common.AdditionalApplicationInfo)
    AdditionalApplicationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdditionalApplicationInfo.newBuilder() to construct.
  private AdditionalApplicationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdditionalApplicationInfo() {
    applicationId_ = "";
    applicationInstance_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdditionalApplicationInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.common.AdditionalApplicationInfoProto.internal_static_google_ads_googleads_v20_common_AdditionalApplicationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.common.AdditionalApplicationInfoProto.internal_static_google_ads_googleads_v20_common_AdditionalApplicationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.common.AdditionalApplicationInfo.class, com.google.ads.googleads.v20.common.AdditionalApplicationInfo.Builder.class);
  }

  public static final int APPLICATION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object applicationId_ = "";
  /**
   * <pre>
   * The unique identifier of the agency proprietary application. This
   * identifier is generated by Google. Reach out to your Google representative
   * to request an application_id for each new application being integrated.
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The applicationId.
   */
  @java.lang.Override
  public java.lang.String getApplicationId() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier of the agency proprietary application. This
   * identifier is generated by Google. Reach out to your Google representative
   * to request an application_id for each new application being integrated.
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The bytes for applicationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApplicationIdBytes() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATION_INSTANCE_FIELD_NUMBER = 2;
  private int applicationInstance_ = 0;
  /**
   * <pre>
   * The instance type of the application sending the request.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
   * @return The enum numeric value on the wire for applicationInstance.
   */
  @java.lang.Override public int getApplicationInstanceValue() {
    return applicationInstance_;
  }
  /**
   * <pre>
   * The instance type of the application sending the request.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
   * @return The applicationInstance.
   */
  @java.lang.Override public com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance getApplicationInstance() {
    com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance result = com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.forNumber(applicationInstance_);
    return result == null ? com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, applicationId_);
    }
    if (applicationInstance_ != com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, applicationInstance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(applicationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, applicationId_);
    }
    if (applicationInstance_ != com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, applicationInstance_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.common.AdditionalApplicationInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.common.AdditionalApplicationInfo other = (com.google.ads.googleads.v20.common.AdditionalApplicationInfo) obj;

    if (!getApplicationId()
        .equals(other.getApplicationId())) return false;
    if (applicationInstance_ != other.applicationInstance_) return false;
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
    hash = (37 * hash) + APPLICATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationId().hashCode();
    hash = (37 * hash) + APPLICATION_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + applicationInstance_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.common.AdditionalApplicationInfo prototype) {
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
   * Additional information about the application/tool issuing the request. This
   * field is only used by [ContentCreatorInsightsService],
   * [AudienceInsightsService], and [ReachPlanService] APIs.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.common.AdditionalApplicationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.common.AdditionalApplicationInfo)
      com.google.ads.googleads.v20.common.AdditionalApplicationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.common.AdditionalApplicationInfoProto.internal_static_google_ads_googleads_v20_common_AdditionalApplicationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.common.AdditionalApplicationInfoProto.internal_static_google_ads_googleads_v20_common_AdditionalApplicationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.common.AdditionalApplicationInfo.class, com.google.ads.googleads.v20.common.AdditionalApplicationInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.common.AdditionalApplicationInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      applicationId_ = "";
      applicationInstance_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.common.AdditionalApplicationInfoProto.internal_static_google_ads_googleads_v20_common_AdditionalApplicationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AdditionalApplicationInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.common.AdditionalApplicationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AdditionalApplicationInfo build() {
      com.google.ads.googleads.v20.common.AdditionalApplicationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.common.AdditionalApplicationInfo buildPartial() {
      com.google.ads.googleads.v20.common.AdditionalApplicationInfo result = new com.google.ads.googleads.v20.common.AdditionalApplicationInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.common.AdditionalApplicationInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.applicationId_ = applicationId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.applicationInstance_ = applicationInstance_;
      }
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
      if (other instanceof com.google.ads.googleads.v20.common.AdditionalApplicationInfo) {
        return mergeFrom((com.google.ads.googleads.v20.common.AdditionalApplicationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.common.AdditionalApplicationInfo other) {
      if (other == com.google.ads.googleads.v20.common.AdditionalApplicationInfo.getDefaultInstance()) return this;
      if (!other.getApplicationId().isEmpty()) {
        applicationId_ = other.applicationId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.applicationInstance_ != 0) {
        setApplicationInstanceValue(other.getApplicationInstanceValue());
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
              applicationId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              applicationInstance_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object applicationId_ = "";
    /**
     * <pre>
     * The unique identifier of the agency proprietary application. This
     * identifier is generated by Google. Reach out to your Google representative
     * to request an application_id for each new application being integrated.
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return The applicationId.
     */
    public java.lang.String getApplicationId() {
      java.lang.Object ref = applicationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the agency proprietary application. This
     * identifier is generated by Google. Reach out to your Google representative
     * to request an application_id for each new application being integrated.
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return The bytes for applicationId.
     */
    public com.google.protobuf.ByteString
        getApplicationIdBytes() {
      java.lang.Object ref = applicationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier of the agency proprietary application. This
     * identifier is generated by Google. Reach out to your Google representative
     * to request an application_id for each new application being integrated.
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @param value The applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      applicationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the agency proprietary application. This
     * identifier is generated by Google. Reach out to your Google representative
     * to request an application_id for each new application being integrated.
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationId() {
      applicationId_ = getDefaultInstance().getApplicationId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier of the agency proprietary application. This
     * identifier is generated by Google. Reach out to your Google representative
     * to request an application_id for each new application being integrated.
     * </pre>
     *
     * <code>string application_id = 1;</code>
     * @param value The bytes for applicationId to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      applicationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int applicationInstance_ = 0;
    /**
     * <pre>
     * The instance type of the application sending the request.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
     * @return The enum numeric value on the wire for applicationInstance.
     */
    @java.lang.Override public int getApplicationInstanceValue() {
      return applicationInstance_;
    }
    /**
     * <pre>
     * The instance type of the application sending the request.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
     * @param value The enum numeric value on the wire for applicationInstance to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationInstanceValue(int value) {
      applicationInstance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance type of the application sending the request.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
     * @return The applicationInstance.
     */
    @java.lang.Override
    public com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance getApplicationInstance() {
      com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance result = com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.forNumber(applicationInstance_);
      return result == null ? com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The instance type of the application sending the request.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
     * @param value The applicationInstance to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationInstance(com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      applicationInstance_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance type of the application sending the request.
     * </pre>
     *
     * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationInstance() {
      bitField0_ = (bitField0_ & ~0x00000002);
      applicationInstance_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.common.AdditionalApplicationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.common.AdditionalApplicationInfo)
  private static final com.google.ads.googleads.v20.common.AdditionalApplicationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.common.AdditionalApplicationInfo();
  }

  public static com.google.ads.googleads.v20.common.AdditionalApplicationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdditionalApplicationInfo>
      PARSER = new com.google.protobuf.AbstractParser<AdditionalApplicationInfo>() {
    @java.lang.Override
    public AdditionalApplicationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdditionalApplicationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdditionalApplicationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.common.AdditionalApplicationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

