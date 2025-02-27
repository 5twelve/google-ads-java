// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/offline_conversion_upload_client_summary.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

/**
 * <pre>
 * Alert for offline conversion client summary.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.resources.OfflineConversionAlert}
 */
public final class OfflineConversionAlert extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.resources.OfflineConversionAlert)
    OfflineConversionAlertOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfflineConversionAlert.newBuilder() to construct.
  private OfflineConversionAlert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfflineConversionAlert() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfflineConversionAlert();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionAlert_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionAlert_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.resources.OfflineConversionAlert.class, com.google.ads.googleads.v19.resources.OfflineConversionAlert.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v19.resources.OfflineConversionError error_;
  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.OfflineConversionError getError() {
    return error_ == null ? com.google.ads.googleads.v19.resources.OfflineConversionError.getDefaultInstance() : error_;
  }
  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.resources.OfflineConversionErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.google.ads.googleads.v19.resources.OfflineConversionError.getDefaultInstance() : error_;
  }

  public static final int ERROR_PERCENTAGE_FIELD_NUMBER = 2;
  private double errorPercentage_ = 0D;
  /**
   * <pre>
   * Output only. Percentage of the error, the range of this field should be
   * [0, 1.0].
   * </pre>
   *
   * <code>double error_percentage = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorPercentage.
   */
  @java.lang.Override
  public double getErrorPercentage() {
    return errorPercentage_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getError());
    }
    if (java.lang.Double.doubleToRawLongBits(errorPercentage_) != 0) {
      output.writeDouble(2, errorPercentage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getError());
    }
    if (java.lang.Double.doubleToRawLongBits(errorPercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, errorPercentage_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.resources.OfflineConversionAlert)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.resources.OfflineConversionAlert other = (com.google.ads.googleads.v19.resources.OfflineConversionAlert) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
    if (java.lang.Double.doubleToLongBits(getErrorPercentage())
        != java.lang.Double.doubleToLongBits(
            other.getErrorPercentage())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (37 * hash) + ERROR_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getErrorPercentage()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.resources.OfflineConversionAlert prototype) {
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
   * Alert for offline conversion client summary.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.resources.OfflineConversionAlert}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.resources.OfflineConversionAlert)
      com.google.ads.googleads.v19.resources.OfflineConversionAlertOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionAlert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionAlert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.resources.OfflineConversionAlert.class, com.google.ads.googleads.v19.resources.OfflineConversionAlert.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.resources.OfflineConversionAlert.newBuilder()
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
        getErrorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      errorPercentage_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionAlert_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionAlert getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.resources.OfflineConversionAlert.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionAlert build() {
      com.google.ads.googleads.v19.resources.OfflineConversionAlert result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionAlert buildPartial() {
      com.google.ads.googleads.v19.resources.OfflineConversionAlert result = new com.google.ads.googleads.v19.resources.OfflineConversionAlert(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.resources.OfflineConversionAlert result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.errorPercentage_ = errorPercentage_;
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
      if (other instanceof com.google.ads.googleads.v19.resources.OfflineConversionAlert) {
        return mergeFrom((com.google.ads.googleads.v19.resources.OfflineConversionAlert)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.resources.OfflineConversionAlert other) {
      if (other == com.google.ads.googleads.v19.resources.OfflineConversionAlert.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (other.getErrorPercentage() != 0D) {
        setErrorPercentage(other.getErrorPercentage());
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
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              errorPercentage_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
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

    private com.google.ads.googleads.v19.resources.OfflineConversionError error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.OfflineConversionError, com.google.ads.googleads.v19.resources.OfflineConversionError.Builder, com.google.ads.googleads.v19.resources.OfflineConversionErrorOrBuilder> errorBuilder_;
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The error.
     */
    public com.google.ads.googleads.v19.resources.OfflineConversionError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.google.ads.googleads.v19.resources.OfflineConversionError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setError(com.google.ads.googleads.v19.resources.OfflineConversionError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setError(
        com.google.ads.googleads.v19.resources.OfflineConversionError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeError(com.google.ads.googleads.v19.resources.OfflineConversionError value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          error_ != null &&
          error_ != com.google.ads.googleads.v19.resources.OfflineConversionError.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v19.resources.OfflineConversionError.Builder getErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v19.resources.OfflineConversionErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.google.ads.googleads.v19.resources.OfflineConversionError.getDefaultInstance() : error_;
      }
    }
    /**
     * <pre>
     * Output only. Error for offline conversion client alert.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.resources.OfflineConversionError, com.google.ads.googleads.v19.resources.OfflineConversionError.Builder, com.google.ads.googleads.v19.resources.OfflineConversionErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v19.resources.OfflineConversionError, com.google.ads.googleads.v19.resources.OfflineConversionError.Builder, com.google.ads.googleads.v19.resources.OfflineConversionErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private double errorPercentage_ ;
    /**
     * <pre>
     * Output only. Percentage of the error, the range of this field should be
     * [0, 1.0].
     * </pre>
     *
     * <code>double error_percentage = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The errorPercentage.
     */
    @java.lang.Override
    public double getErrorPercentage() {
      return errorPercentage_;
    }
    /**
     * <pre>
     * Output only. Percentage of the error, the range of this field should be
     * [0, 1.0].
     * </pre>
     *
     * <code>double error_percentage = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The errorPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setErrorPercentage(double value) {

      errorPercentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Percentage of the error, the range of this field should be
     * [0, 1.0].
     * </pre>
     *
     * <code>double error_percentage = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      errorPercentage_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.resources.OfflineConversionAlert)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.resources.OfflineConversionAlert)
  private static final com.google.ads.googleads.v19.resources.OfflineConversionAlert DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.resources.OfflineConversionAlert();
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionAlert getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfflineConversionAlert>
      PARSER = new com.google.protobuf.AbstractParser<OfflineConversionAlert>() {
    @java.lang.Override
    public OfflineConversionAlert parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfflineConversionAlert> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfflineConversionAlert> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.resources.OfflineConversionAlert getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

