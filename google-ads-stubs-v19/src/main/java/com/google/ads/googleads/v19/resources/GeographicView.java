// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/geographic_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

/**
 * <pre>
 * A geographic view.
 *
 * Geographic View includes all metrics aggregated at the country level,
 * one row per country. It reports metrics at either actual physical location of
 * the user or an area of interest. If other segment fields are used, you may
 * get more than one row per country.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.resources.GeographicView}
 */
public final class GeographicView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.resources.GeographicView)
    GeographicViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeographicView.newBuilder() to construct.
  private GeographicView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeographicView() {
    resourceName_ = "";
    locationType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GeographicView();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.resources.GeographicViewProto.internal_static_google_ads_googleads_v19_resources_GeographicView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.resources.GeographicViewProto.internal_static_google_ads_googleads_v19_resources_GeographicView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.resources.GeographicView.class, com.google.ads.googleads.v19.resources.GeographicView.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Output only. The resource name of the geographic view.
   * Geographic view resource names have the form:
   *
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the geographic view.
   * Geographic view resource names have the form:
   *
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int LOCATION_TYPE_FIELD_NUMBER = 3;
  private int locationType_ = 0;
  /**
   * <pre>
   * Output only. Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for locationType.
   */
  @java.lang.Override public int getLocationTypeValue() {
    return locationType_;
  }
  /**
   * <pre>
   * Output only. Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locationType.
   */
  @java.lang.Override public com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType() {
    com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType result = com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.forNumber(locationType_);
    return result == null ? com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.UNRECOGNIZED : result;
  }

  public static final int COUNTRY_CRITERION_ID_FIELD_NUMBER = 5;
  private long countryCriterionId_ = 0L;
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCriterionId field is set.
   */
  @java.lang.Override
  public boolean hasCountryCriterionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCriterionId.
   */
  @java.lang.Override
  public long getCountryCriterionId() {
    return countryCriterionId_;
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
    if (locationType_ != com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, locationType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(5, countryCriterionId_);
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
    if (locationType_ != com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, locationType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, countryCriterionId_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.resources.GeographicView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.resources.GeographicView other = (com.google.ads.googleads.v19.resources.GeographicView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (locationType_ != other.locationType_) return false;
    if (hasCountryCriterionId() != other.hasCountryCriterionId()) return false;
    if (hasCountryCriterionId()) {
      if (getCountryCriterionId()
          != other.getCountryCriterionId()) return false;
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
    hash = (37 * hash) + LOCATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + locationType_;
    if (hasCountryCriterionId()) {
      hash = (37 * hash) + COUNTRY_CRITERION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCountryCriterionId());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.resources.GeographicView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.resources.GeographicView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.resources.GeographicView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.resources.GeographicView prototype) {
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
   * A geographic view.
   *
   * Geographic View includes all metrics aggregated at the country level,
   * one row per country. It reports metrics at either actual physical location of
   * the user or an area of interest. If other segment fields are used, you may
   * get more than one row per country.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.resources.GeographicView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.resources.GeographicView)
      com.google.ads.googleads.v19.resources.GeographicViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.resources.GeographicViewProto.internal_static_google_ads_googleads_v19_resources_GeographicView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.resources.GeographicViewProto.internal_static_google_ads_googleads_v19_resources_GeographicView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.resources.GeographicView.class, com.google.ads.googleads.v19.resources.GeographicView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.resources.GeographicView.newBuilder()
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
      resourceName_ = "";
      locationType_ = 0;
      countryCriterionId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.resources.GeographicViewProto.internal_static_google_ads_googleads_v19_resources_GeographicView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.GeographicView getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.resources.GeographicView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.GeographicView build() {
      com.google.ads.googleads.v19.resources.GeographicView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.resources.GeographicView buildPartial() {
      com.google.ads.googleads.v19.resources.GeographicView result = new com.google.ads.googleads.v19.resources.GeographicView(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.resources.GeographicView result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.locationType_ = locationType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.countryCriterionId_ = countryCriterionId_;
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
      if (other instanceof com.google.ads.googleads.v19.resources.GeographicView) {
        return mergeFrom((com.google.ads.googleads.v19.resources.GeographicView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.resources.GeographicView other) {
      if (other == com.google.ads.googleads.v19.resources.GeographicView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.locationType_ != 0) {
        setLocationTypeValue(other.getLocationTypeValue());
      }
      if (other.hasCountryCriterionId()) {
        setCountryCriterionId(other.getCountryCriterionId());
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
            case 24: {
              locationType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 40: {
              countryCriterionId_ = input.readInt64();
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
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the geographic view.
     * Geographic view resource names have the form:
     *
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the geographic view.
     * Geographic view resource names have the form:
     *
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the geographic view.
     * Geographic view resource names have the form:
     *
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the geographic view.
     * Geographic view resource names have the form:
     *
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the geographic view.
     * Geographic view resource names have the form:
     *
     * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private int locationType_ = 0;
    /**
     * <pre>
     * Output only. Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for locationType.
     */
    @java.lang.Override public int getLocationTypeValue() {
      return locationType_;
    }
    /**
     * <pre>
     * Output only. Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for locationType to set.
     * @return This builder for chaining.
     */
    public Builder setLocationTypeValue(int value) {
      locationType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The locationType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType() {
      com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType result = com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.forNumber(locationType_);
      return result == null ? com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The locationType to set.
     * @return This builder for chaining.
     */
    public Builder setLocationType(com.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      locationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Type of the geo targeting of the campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocationType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      locationType_ = 0;
      onChanged();
      return this;
    }

    private long countryCriterionId_ ;
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the countryCriterionId field is set.
     */
    @java.lang.Override
    public boolean hasCountryCriterionId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The countryCriterionId.
     */
    @java.lang.Override
    public long getCountryCriterionId() {
      return countryCriterionId_;
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The countryCriterionId to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCriterionId(long value) {

      countryCriterionId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Criterion Id for the country.
     * </pre>
     *
     * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCriterionId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      countryCriterionId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.resources.GeographicView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.resources.GeographicView)
  private static final com.google.ads.googleads.v19.resources.GeographicView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.resources.GeographicView();
  }

  public static com.google.ads.googleads.v19.resources.GeographicView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeographicView>
      PARSER = new com.google.protobuf.AbstractParser<GeographicView>() {
    @java.lang.Override
    public GeographicView parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeographicView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeographicView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.resources.GeographicView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

