// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * Representation of video bumper in-stream ad format (very short in-stream
 * non-skippable video ad).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.VideoBumperInStreamAdInfo}
 */
public final class VideoBumperInStreamAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)
    VideoBumperInStreamAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoBumperInStreamAdInfo.newBuilder() to construct.
  private VideoBumperInStreamAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoBumperInStreamAdInfo() {
    actionButtonLabel_ = "";
    actionHeadline_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoBumperInStreamAdInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.AdTypeInfosProto.internal_static_google_ads_googleads_v19_common_VideoBumperInStreamAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.AdTypeInfosProto.internal_static_google_ads_googleads_v19_common_VideoBumperInStreamAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.Builder.class);
  }

  private int bitField0_;
  public static final int COMPANION_BANNER_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v19.common.AdImageAsset companionBanner_;
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
   * @return Whether the companionBanner field is set.
   */
  @java.lang.Override
  public boolean hasCompanionBanner() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
   * @return The companionBanner.
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.AdImageAsset getCompanionBanner() {
    return companionBanner_ == null ? com.google.ads.googleads.v19.common.AdImageAsset.getDefaultInstance() : companionBanner_;
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
    return companionBanner_ == null ? com.google.ads.googleads.v19.common.AdImageAsset.getDefaultInstance() : companionBanner_;
  }

  public static final int ACTION_BUTTON_LABEL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object actionButtonLabel_ = "";
  /**
   * <pre>
   * Label on the "Call To Action" button taking the user to the video ad's
   * final URL.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The actionButtonLabel.
   */
  @java.lang.Override
  public java.lang.String getActionButtonLabel() {
    java.lang.Object ref = actionButtonLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionButtonLabel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Label on the "Call To Action" button taking the user to the video ad's
   * final URL.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The bytes for actionButtonLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionButtonLabelBytes() {
    java.lang.Object ref = actionButtonLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionButtonLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_HEADLINE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object actionHeadline_ = "";
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The actionHeadline.
   */
  @java.lang.Override
  public java.lang.String getActionHeadline() {
    java.lang.Object ref = actionHeadline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionHeadline_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The bytes for actionHeadline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionHeadlineBytes() {
    java.lang.Object ref = actionHeadline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionHeadline_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getCompanionBanner());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionButtonLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, actionButtonLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionHeadline_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, actionHeadline_);
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
        .computeMessageSize(3, getCompanionBanner());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionButtonLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, actionButtonLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionHeadline_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, actionHeadline_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo other = (com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo) obj;

    if (hasCompanionBanner() != other.hasCompanionBanner()) return false;
    if (hasCompanionBanner()) {
      if (!getCompanionBanner()
          .equals(other.getCompanionBanner())) return false;
    }
    if (!getActionButtonLabel()
        .equals(other.getActionButtonLabel())) return false;
    if (!getActionHeadline()
        .equals(other.getActionHeadline())) return false;
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
    if (hasCompanionBanner()) {
      hash = (37 * hash) + COMPANION_BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionBanner().hashCode();
    }
    hash = (37 * hash) + ACTION_BUTTON_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getActionButtonLabel().hashCode();
    hash = (37 * hash) + ACTION_HEADLINE_FIELD_NUMBER;
    hash = (53 * hash) + getActionHeadline().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo prototype) {
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
   * Representation of video bumper in-stream ad format (very short in-stream
   * non-skippable video ad).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.VideoBumperInStreamAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)
      com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.AdTypeInfosProto.internal_static_google_ads_googleads_v19_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.AdTypeInfosProto.internal_static_google_ads_googleads_v19_common_VideoBumperInStreamAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.newBuilder()
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
        getCompanionBannerFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      companionBanner_ = null;
      if (companionBannerBuilder_ != null) {
        companionBannerBuilder_.dispose();
        companionBannerBuilder_ = null;
      }
      actionButtonLabel_ = "";
      actionHeadline_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.AdTypeInfosProto.internal_static_google_ads_googleads_v19_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo build() {
      com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo buildPartial() {
      com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo result = new com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.companionBanner_ = companionBannerBuilder_ == null
            ? companionBanner_
            : companionBannerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.actionButtonLabel_ = actionButtonLabel_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.actionHeadline_ = actionHeadline_;
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
      if (other instanceof com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo) {
        return mergeFrom((com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo other) {
      if (other == com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo.getDefaultInstance()) return this;
      if (other.hasCompanionBanner()) {
        mergeCompanionBanner(other.getCompanionBanner());
      }
      if (!other.getActionButtonLabel().isEmpty()) {
        actionButtonLabel_ = other.actionButtonLabel_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getActionHeadline().isEmpty()) {
        actionHeadline_ = other.actionHeadline_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 26: {
              input.readMessage(
                  getCompanionBannerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              actionButtonLabel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              actionHeadline_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
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

    private com.google.ads.googleads.v19.common.AdImageAsset companionBanner_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.common.AdImageAsset, com.google.ads.googleads.v19.common.AdImageAsset.Builder, com.google.ads.googleads.v19.common.AdImageAssetOrBuilder> companionBannerBuilder_;
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     * @return Whether the companionBanner field is set.
     */
    public boolean hasCompanionBanner() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     * @return The companionBanner.
     */
    public com.google.ads.googleads.v19.common.AdImageAsset getCompanionBanner() {
      if (companionBannerBuilder_ == null) {
        return companionBanner_ == null ? com.google.ads.googleads.v19.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      } else {
        return companionBannerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder setCompanionBanner(com.google.ads.googleads.v19.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        companionBanner_ = value;
      } else {
        companionBannerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder setCompanionBanner(
        com.google.ads.googleads.v19.common.AdImageAsset.Builder builderForValue) {
      if (companionBannerBuilder_ == null) {
        companionBanner_ = builderForValue.build();
      } else {
        companionBannerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder mergeCompanionBanner(com.google.ads.googleads.v19.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          companionBanner_ != null &&
          companionBanner_ != com.google.ads.googleads.v19.common.AdImageAsset.getDefaultInstance()) {
          getCompanionBannerBuilder().mergeFrom(value);
        } else {
          companionBanner_ = value;
        }
      } else {
        companionBannerBuilder_.mergeFrom(value);
      }
      if (companionBanner_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder clearCompanionBanner() {
      bitField0_ = (bitField0_ & ~0x00000001);
      companionBanner_ = null;
      if (companionBannerBuilder_ != null) {
        companionBannerBuilder_.dispose();
        companionBannerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public com.google.ads.googleads.v19.common.AdImageAsset.Builder getCompanionBannerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCompanionBannerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    public com.google.ads.googleads.v19.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
      if (companionBannerBuilder_ != null) {
        return companionBannerBuilder_.getMessageOrBuilder();
      } else {
        return companionBanner_ == null ?
            com.google.ads.googleads.v19.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.AdImageAsset companion_banner = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.common.AdImageAsset, com.google.ads.googleads.v19.common.AdImageAsset.Builder, com.google.ads.googleads.v19.common.AdImageAssetOrBuilder> 
        getCompanionBannerFieldBuilder() {
      if (companionBannerBuilder_ == null) {
        companionBannerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v19.common.AdImageAsset, com.google.ads.googleads.v19.common.AdImageAsset.Builder, com.google.ads.googleads.v19.common.AdImageAssetOrBuilder>(
                getCompanionBanner(),
                getParentForChildren(),
                isClean());
        companionBanner_ = null;
      }
      return companionBannerBuilder_;
    }

    private java.lang.Object actionButtonLabel_ = "";
    /**
     * <pre>
     * Label on the "Call To Action" button taking the user to the video ad's
     * final URL.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return The actionButtonLabel.
     */
    public java.lang.String getActionButtonLabel() {
      java.lang.Object ref = actionButtonLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionButtonLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Label on the "Call To Action" button taking the user to the video ad's
     * final URL.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return The bytes for actionButtonLabel.
     */
    public com.google.protobuf.ByteString
        getActionButtonLabelBytes() {
      java.lang.Object ref = actionButtonLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionButtonLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Label on the "Call To Action" button taking the user to the video ad's
     * final URL.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @param value The actionButtonLabel to set.
     * @return This builder for chaining.
     */
    public Builder setActionButtonLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      actionButtonLabel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label on the "Call To Action" button taking the user to the video ad's
     * final URL.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionButtonLabel() {
      actionButtonLabel_ = getDefaultInstance().getActionButtonLabel();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label on the "Call To Action" button taking the user to the video ad's
     * final URL.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @param value The bytes for actionButtonLabel to set.
     * @return This builder for chaining.
     */
    public Builder setActionButtonLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      actionButtonLabel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object actionHeadline_ = "";
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return The actionHeadline.
     */
    public java.lang.String getActionHeadline() {
      java.lang.Object ref = actionHeadline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionHeadline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return The bytes for actionHeadline.
     */
    public com.google.protobuf.ByteString
        getActionHeadlineBytes() {
      java.lang.Object ref = actionHeadline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionHeadline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @param value The actionHeadline to set.
     * @return This builder for chaining.
     */
    public Builder setActionHeadline(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      actionHeadline_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionHeadline() {
      actionHeadline_ = getDefaultInstance().getActionHeadline();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @param value The bytes for actionHeadline to set.
     * @return This builder for chaining.
     */
    public Builder setActionHeadlineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      actionHeadline_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.VideoBumperInStreamAdInfo)
  private static final com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo();
  }

  public static com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoBumperInStreamAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoBumperInStreamAdInfo>() {
    @java.lang.Override
    public VideoBumperInStreamAdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoBumperInStreamAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoBumperInStreamAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

