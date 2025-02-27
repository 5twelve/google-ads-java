// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/offline_conversion_upload_client_summary.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

/**
 * <pre>
 * Historical upload summary, grouped by upload date or job.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.resources.OfflineConversionSummary}
 */
public final class OfflineConversionSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.resources.OfflineConversionSummary)
    OfflineConversionSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfflineConversionSummary.newBuilder() to construct.
  private OfflineConversionSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfflineConversionSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfflineConversionSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.resources.OfflineConversionSummary.class, com.google.ads.googleads.v19.resources.OfflineConversionSummary.Builder.class);
  }

  private int dimensionKeyCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object dimensionKey_;
  public enum DimensionKeyCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    JOB_ID(1),
    UPLOAD_DATE(2),
    DIMENSIONKEY_NOT_SET(0);
    private final int value;
    private DimensionKeyCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DimensionKeyCase valueOf(int value) {
      return forNumber(value);
    }

    public static DimensionKeyCase forNumber(int value) {
      switch (value) {
        case 1: return JOB_ID;
        case 2: return UPLOAD_DATE;
        case 0: return DIMENSIONKEY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DimensionKeyCase
  getDimensionKeyCase() {
    return DimensionKeyCase.forNumber(
        dimensionKeyCase_);
  }

  public static final int SUCCESSFUL_COUNT_FIELD_NUMBER = 3;
  private long successfulCount_ = 0L;
  /**
   * <pre>
   * Output only. Total count of successful event.
   * </pre>
   *
   * <code>int64 successful_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successfulCount.
   */
  @java.lang.Override
  public long getSuccessfulCount() {
    return successfulCount_;
  }

  public static final int FAILED_COUNT_FIELD_NUMBER = 4;
  private long failedCount_ = 0L;
  /**
   * <pre>
   * Output only. Total count of failed event.
   * </pre>
   *
   * <code>int64 failed_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failedCount.
   */
  @java.lang.Override
  public long getFailedCount() {
    return failedCount_;
  }

  public static final int PENDING_COUNT_FIELD_NUMBER = 5;
  private long pendingCount_ = 0L;
  /**
   * <pre>
   * Output only. Total count of pending uploaded event.
   * </pre>
   *
   * <code>int64 pending_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pendingCount.
   */
  @java.lang.Override
  public long getPendingCount() {
    return pendingCount_;
  }

  public static final int JOB_ID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Output only. Dimension key for last N jobs.
   * </pre>
   *
   * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the jobId field is set.
   */
  @java.lang.Override
  public boolean hasJobId() {
    return dimensionKeyCase_ == 1;
  }
  /**
   * <pre>
   * Output only. Dimension key for last N jobs.
   * </pre>
   *
   * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The jobId.
   */
  @java.lang.Override
  public long getJobId() {
    if (dimensionKeyCase_ == 1) {
      return (java.lang.Long) dimensionKey_;
    }
    return 0L;
  }

  public static final int UPLOAD_DATE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the uploadDate field is set.
   */
  public boolean hasUploadDate() {
    return dimensionKeyCase_ == 2;
  }
  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uploadDate.
   */
  public java.lang.String getUploadDate() {
    java.lang.Object ref = "";
    if (dimensionKeyCase_ == 2) {
      ref = dimensionKey_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dimensionKeyCase_ == 2) {
        dimensionKey_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uploadDate.
   */
  public com.google.protobuf.ByteString
      getUploadDateBytes() {
    java.lang.Object ref = "";
    if (dimensionKeyCase_ == 2) {
      ref = dimensionKey_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dimensionKeyCase_ == 2) {
        dimensionKey_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (dimensionKeyCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) dimensionKey_));
    }
    if (dimensionKeyCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dimensionKey_);
    }
    if (successfulCount_ != 0L) {
      output.writeInt64(3, successfulCount_);
    }
    if (failedCount_ != 0L) {
      output.writeInt64(4, failedCount_);
    }
    if (pendingCount_ != 0L) {
      output.writeInt64(5, pendingCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dimensionKeyCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) dimensionKey_));
    }
    if (dimensionKeyCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dimensionKey_);
    }
    if (successfulCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, successfulCount_);
    }
    if (failedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, failedCount_);
    }
    if (pendingCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, pendingCount_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.resources.OfflineConversionSummary)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.resources.OfflineConversionSummary other = (com.google.ads.googleads.v19.resources.OfflineConversionSummary) obj;

    if (getSuccessfulCount()
        != other.getSuccessfulCount()) return false;
    if (getFailedCount()
        != other.getFailedCount()) return false;
    if (getPendingCount()
        != other.getPendingCount()) return false;
    if (!getDimensionKeyCase().equals(other.getDimensionKeyCase())) return false;
    switch (dimensionKeyCase_) {
      case 1:
        if (getJobId()
            != other.getJobId()) return false;
        break;
      case 2:
        if (!getUploadDate()
            .equals(other.getUploadDate())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SUCCESSFUL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSuccessfulCount());
    hash = (37 * hash) + FAILED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailedCount());
    hash = (37 * hash) + PENDING_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPendingCount());
    switch (dimensionKeyCase_) {
      case 1:
        hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getJobId());
        break;
      case 2:
        hash = (37 * hash) + UPLOAD_DATE_FIELD_NUMBER;
        hash = (53 * hash) + getUploadDate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.resources.OfflineConversionSummary prototype) {
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
   * Historical upload summary, grouped by upload date or job.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.resources.OfflineConversionSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.resources.OfflineConversionSummary)
      com.google.ads.googleads.v19.resources.OfflineConversionSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.resources.OfflineConversionSummary.class, com.google.ads.googleads.v19.resources.OfflineConversionSummary.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.resources.OfflineConversionSummary.newBuilder()
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
      successfulCount_ = 0L;
      failedCount_ = 0L;
      pendingCount_ = 0L;
      dimensionKeyCase_ = 0;
      dimensionKey_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.resources.OfflineConversionUploadClientSummaryProto.internal_static_google_ads_googleads_v19_resources_OfflineConversionSummary_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionSummary getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.resources.OfflineConversionSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionSummary build() {
      com.google.ads.googleads.v19.resources.OfflineConversionSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.OfflineConversionSummary buildPartial() {
      com.google.ads.googleads.v19.resources.OfflineConversionSummary result = new com.google.ads.googleads.v19.resources.OfflineConversionSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.resources.OfflineConversionSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.successfulCount_ = successfulCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.failedCount_ = failedCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pendingCount_ = pendingCount_;
      }
    }

    private void buildPartialOneofs(com.google.ads.googleads.v19.resources.OfflineConversionSummary result) {
      result.dimensionKeyCase_ = dimensionKeyCase_;
      result.dimensionKey_ = this.dimensionKey_;
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
      if (other instanceof com.google.ads.googleads.v19.resources.OfflineConversionSummary) {
        return mergeFrom((com.google.ads.googleads.v19.resources.OfflineConversionSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.resources.OfflineConversionSummary other) {
      if (other == com.google.ads.googleads.v19.resources.OfflineConversionSummary.getDefaultInstance()) return this;
      if (other.getSuccessfulCount() != 0L) {
        setSuccessfulCount(other.getSuccessfulCount());
      }
      if (other.getFailedCount() != 0L) {
        setFailedCount(other.getFailedCount());
      }
      if (other.getPendingCount() != 0L) {
        setPendingCount(other.getPendingCount());
      }
      switch (other.getDimensionKeyCase()) {
        case JOB_ID: {
          setJobId(other.getJobId());
          break;
        }
        case UPLOAD_DATE: {
          dimensionKeyCase_ = 2;
          dimensionKey_ = other.dimensionKey_;
          onChanged();
          break;
        }
        case DIMENSIONKEY_NOT_SET: {
          break;
        }
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
            case 8: {
              dimensionKey_ = input.readInt64();
              dimensionKeyCase_ = 1;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              dimensionKeyCase_ = 2;
              dimensionKey_ = s;
              break;
            } // case 18
            case 24: {
              successfulCount_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              failedCount_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 40: {
              pendingCount_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
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
    private int dimensionKeyCase_ = 0;
    private java.lang.Object dimensionKey_;
    public DimensionKeyCase
        getDimensionKeyCase() {
      return DimensionKeyCase.forNumber(
          dimensionKeyCase_);
    }

    public Builder clearDimensionKey() {
      dimensionKeyCase_ = 0;
      dimensionKey_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private long successfulCount_ ;
    /**
     * <pre>
     * Output only. Total count of successful event.
     * </pre>
     *
     * <code>int64 successful_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The successfulCount.
     */
    @java.lang.Override
    public long getSuccessfulCount() {
      return successfulCount_;
    }
    /**
     * <pre>
     * Output only. Total count of successful event.
     * </pre>
     *
     * <code>int64 successful_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The successfulCount to set.
     * @return This builder for chaining.
     */
    public Builder setSuccessfulCount(long value) {

      successfulCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Total count of successful event.
     * </pre>
     *
     * <code>int64 successful_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccessfulCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      successfulCount_ = 0L;
      onChanged();
      return this;
    }

    private long failedCount_ ;
    /**
     * <pre>
     * Output only. Total count of failed event.
     * </pre>
     *
     * <code>int64 failed_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The failedCount.
     */
    @java.lang.Override
    public long getFailedCount() {
      return failedCount_;
    }
    /**
     * <pre>
     * Output only. Total count of failed event.
     * </pre>
     *
     * <code>int64 failed_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The failedCount to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCount(long value) {

      failedCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Total count of failed event.
     * </pre>
     *
     * <code>int64 failed_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      failedCount_ = 0L;
      onChanged();
      return this;
    }

    private long pendingCount_ ;
    /**
     * <pre>
     * Output only. Total count of pending uploaded event.
     * </pre>
     *
     * <code>int64 pending_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The pendingCount.
     */
    @java.lang.Override
    public long getPendingCount() {
      return pendingCount_;
    }
    /**
     * <pre>
     * Output only. Total count of pending uploaded event.
     * </pre>
     *
     * <code>int64 pending_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The pendingCount to set.
     * @return This builder for chaining.
     */
    public Builder setPendingCount(long value) {

      pendingCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Total count of pending uploaded event.
     * </pre>
     *
     * <code>int64 pending_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pendingCount_ = 0L;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Output only. Dimension key for last N jobs.
     * </pre>
     *
     * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the jobId field is set.
     */
    public boolean hasJobId() {
      return dimensionKeyCase_ == 1;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N jobs.
     * </pre>
     *
     * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The jobId.
     */
    public long getJobId() {
      if (dimensionKeyCase_ == 1) {
        return (java.lang.Long) dimensionKey_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N jobs.
     * </pre>
     *
     * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(long value) {

      dimensionKeyCase_ = 1;
      dimensionKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N jobs.
     * </pre>
     *
     * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      if (dimensionKeyCase_ == 1) {
        dimensionKeyCase_ = 0;
        dimensionKey_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the uploadDate field is set.
     */
    @java.lang.Override
    public boolean hasUploadDate() {
      return dimensionKeyCase_ == 2;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The uploadDate.
     */
    @java.lang.Override
    public java.lang.String getUploadDate() {
      java.lang.Object ref = "";
      if (dimensionKeyCase_ == 2) {
        ref = dimensionKey_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dimensionKeyCase_ == 2) {
          dimensionKey_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for uploadDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUploadDateBytes() {
      java.lang.Object ref = "";
      if (dimensionKeyCase_ == 2) {
        ref = dimensionKey_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dimensionKeyCase_ == 2) {
          dimensionKey_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The uploadDate to set.
     * @return This builder for chaining.
     */
    public Builder setUploadDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dimensionKeyCase_ = 2;
      dimensionKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUploadDate() {
      if (dimensionKeyCase_ == 2) {
        dimensionKeyCase_ = 0;
        dimensionKey_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Dimension key for last N days.
     * </pre>
     *
     * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for uploadDate to set.
     * @return This builder for chaining.
     */
    public Builder setUploadDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dimensionKeyCase_ = 2;
      dimensionKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.resources.OfflineConversionSummary)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.resources.OfflineConversionSummary)
  private static final com.google.ads.googleads.v19.resources.OfflineConversionSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.resources.OfflineConversionSummary();
  }

  public static com.google.ads.googleads.v19.resources.OfflineConversionSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfflineConversionSummary>
      PARSER = new com.google.protobuf.AbstractParser<OfflineConversionSummary>() {
    @java.lang.Override
    public OfflineConversionSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfflineConversionSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfflineConversionSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.resources.OfflineConversionSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

