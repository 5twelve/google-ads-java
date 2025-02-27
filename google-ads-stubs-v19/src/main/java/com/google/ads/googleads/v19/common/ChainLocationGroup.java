// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/asset_set_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * Represents information about a Chain dynamic location group.
 * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
 * sync source is chain.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.ChainLocationGroup}
 */
public final class ChainLocationGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.ChainLocationGroup)
    ChainLocationGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChainLocationGroup.newBuilder() to construct.
  private ChainLocationGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChainLocationGroup() {
    dynamicChainLocationGroupFilters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChainLocationGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.AssetSetTypesProto.internal_static_google_ads_googleads_v19_common_ChainLocationGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.AssetSetTypesProto.internal_static_google_ads_googleads_v19_common_ChainLocationGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.ChainLocationGroup.class, com.google.ads.googleads.v19.common.ChainLocationGroup.Builder.class);
  }

  public static final int DYNAMIC_CHAIN_LOCATION_GROUP_FILTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v19.common.ChainFilter> dynamicChainLocationGroupFilters_;
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v19.common.ChainFilter> getDynamicChainLocationGroupFiltersList() {
    return dynamicChainLocationGroupFilters_;
  }
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v19.common.ChainFilterOrBuilder> 
      getDynamicChainLocationGroupFiltersOrBuilderList() {
    return dynamicChainLocationGroupFilters_;
  }
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  @java.lang.Override
  public int getDynamicChainLocationGroupFiltersCount() {
    return dynamicChainLocationGroupFilters_.size();
  }
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ChainFilter getDynamicChainLocationGroupFilters(int index) {
    return dynamicChainLocationGroupFilters_.get(index);
  }
  /**
   * <pre>
   * Used to filter chain locations by chain ids.
   * Only Locations that belong to the specified chain(s) will be in the asset
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ChainFilterOrBuilder getDynamicChainLocationGroupFiltersOrBuilder(
      int index) {
    return dynamicChainLocationGroupFilters_.get(index);
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
    for (int i = 0; i < dynamicChainLocationGroupFilters_.size(); i++) {
      output.writeMessage(1, dynamicChainLocationGroupFilters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dynamicChainLocationGroupFilters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dynamicChainLocationGroupFilters_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.ChainLocationGroup)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.ChainLocationGroup other = (com.google.ads.googleads.v19.common.ChainLocationGroup) obj;

    if (!getDynamicChainLocationGroupFiltersList()
        .equals(other.getDynamicChainLocationGroupFiltersList())) return false;
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
    if (getDynamicChainLocationGroupFiltersCount() > 0) {
      hash = (37 * hash) + DYNAMIC_CHAIN_LOCATION_GROUP_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getDynamicChainLocationGroupFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ChainLocationGroup parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.ChainLocationGroup prototype) {
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
   * Represents information about a Chain dynamic location group.
   * Only applicable if the sync level AssetSet's type is LOCATION_SYNC and
   * sync source is chain.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.ChainLocationGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.ChainLocationGroup)
      com.google.ads.googleads.v19.common.ChainLocationGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.AssetSetTypesProto.internal_static_google_ads_googleads_v19_common_ChainLocationGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.AssetSetTypesProto.internal_static_google_ads_googleads_v19_common_ChainLocationGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.ChainLocationGroup.class, com.google.ads.googleads.v19.common.ChainLocationGroup.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.ChainLocationGroup.newBuilder()
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
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        dynamicChainLocationGroupFilters_ = java.util.Collections.emptyList();
      } else {
        dynamicChainLocationGroupFilters_ = null;
        dynamicChainLocationGroupFiltersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.AssetSetTypesProto.internal_static_google_ads_googleads_v19_common_ChainLocationGroup_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ChainLocationGroup getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.ChainLocationGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ChainLocationGroup build() {
      com.google.ads.googleads.v19.common.ChainLocationGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ChainLocationGroup buildPartial() {
      com.google.ads.googleads.v19.common.ChainLocationGroup result = new com.google.ads.googleads.v19.common.ChainLocationGroup(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v19.common.ChainLocationGroup result) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dynamicChainLocationGroupFilters_ = java.util.Collections.unmodifiableList(dynamicChainLocationGroupFilters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dynamicChainLocationGroupFilters_ = dynamicChainLocationGroupFilters_;
      } else {
        result.dynamicChainLocationGroupFilters_ = dynamicChainLocationGroupFiltersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.ChainLocationGroup result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v19.common.ChainLocationGroup) {
        return mergeFrom((com.google.ads.googleads.v19.common.ChainLocationGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.ChainLocationGroup other) {
      if (other == com.google.ads.googleads.v19.common.ChainLocationGroup.getDefaultInstance()) return this;
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        if (!other.dynamicChainLocationGroupFilters_.isEmpty()) {
          if (dynamicChainLocationGroupFilters_.isEmpty()) {
            dynamicChainLocationGroupFilters_ = other.dynamicChainLocationGroupFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDynamicChainLocationGroupFiltersIsMutable();
            dynamicChainLocationGroupFilters_.addAll(other.dynamicChainLocationGroupFilters_);
          }
          onChanged();
        }
      } else {
        if (!other.dynamicChainLocationGroupFilters_.isEmpty()) {
          if (dynamicChainLocationGroupFiltersBuilder_.isEmpty()) {
            dynamicChainLocationGroupFiltersBuilder_.dispose();
            dynamicChainLocationGroupFiltersBuilder_ = null;
            dynamicChainLocationGroupFilters_ = other.dynamicChainLocationGroupFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dynamicChainLocationGroupFiltersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDynamicChainLocationGroupFiltersFieldBuilder() : null;
          } else {
            dynamicChainLocationGroupFiltersBuilder_.addAllMessages(other.dynamicChainLocationGroupFilters_);
          }
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
            case 10: {
              com.google.ads.googleads.v19.common.ChainFilter m =
                  input.readMessage(
                      com.google.ads.googleads.v19.common.ChainFilter.parser(),
                      extensionRegistry);
              if (dynamicChainLocationGroupFiltersBuilder_ == null) {
                ensureDynamicChainLocationGroupFiltersIsMutable();
                dynamicChainLocationGroupFilters_.add(m);
              } else {
                dynamicChainLocationGroupFiltersBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v19.common.ChainFilter> dynamicChainLocationGroupFilters_ =
      java.util.Collections.emptyList();
    private void ensureDynamicChainLocationGroupFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dynamicChainLocationGroupFilters_ = new java.util.ArrayList<com.google.ads.googleads.v19.common.ChainFilter>(dynamicChainLocationGroupFilters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.ChainFilter, com.google.ads.googleads.v19.common.ChainFilter.Builder, com.google.ads.googleads.v19.common.ChainFilterOrBuilder> dynamicChainLocationGroupFiltersBuilder_;

    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.ChainFilter> getDynamicChainLocationGroupFiltersList() {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dynamicChainLocationGroupFilters_);
      } else {
        return dynamicChainLocationGroupFiltersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public int getDynamicChainLocationGroupFiltersCount() {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        return dynamicChainLocationGroupFilters_.size();
      } else {
        return dynamicChainLocationGroupFiltersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public com.google.ads.googleads.v19.common.ChainFilter getDynamicChainLocationGroupFilters(int index) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        return dynamicChainLocationGroupFilters_.get(index);
      } else {
        return dynamicChainLocationGroupFiltersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder setDynamicChainLocationGroupFilters(
        int index, com.google.ads.googleads.v19.common.ChainFilter value) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.set(index, value);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder setDynamicChainLocationGroupFilters(
        int index, com.google.ads.googleads.v19.common.ChainFilter.Builder builderForValue) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.set(index, builderForValue.build());
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder addDynamicChainLocationGroupFilters(com.google.ads.googleads.v19.common.ChainFilter value) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.add(value);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder addDynamicChainLocationGroupFilters(
        int index, com.google.ads.googleads.v19.common.ChainFilter value) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.add(index, value);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder addDynamicChainLocationGroupFilters(
        com.google.ads.googleads.v19.common.ChainFilter.Builder builderForValue) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.add(builderForValue.build());
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder addDynamicChainLocationGroupFilters(
        int index, com.google.ads.googleads.v19.common.ChainFilter.Builder builderForValue) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.add(index, builderForValue.build());
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder addAllDynamicChainLocationGroupFilters(
        java.lang.Iterable<? extends com.google.ads.googleads.v19.common.ChainFilter> values) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        ensureDynamicChainLocationGroupFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dynamicChainLocationGroupFilters_);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder clearDynamicChainLocationGroupFilters() {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        dynamicChainLocationGroupFilters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public Builder removeDynamicChainLocationGroupFilters(int index) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        ensureDynamicChainLocationGroupFiltersIsMutable();
        dynamicChainLocationGroupFilters_.remove(index);
        onChanged();
      } else {
        dynamicChainLocationGroupFiltersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public com.google.ads.googleads.v19.common.ChainFilter.Builder getDynamicChainLocationGroupFiltersBuilder(
        int index) {
      return getDynamicChainLocationGroupFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public com.google.ads.googleads.v19.common.ChainFilterOrBuilder getDynamicChainLocationGroupFiltersOrBuilder(
        int index) {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        return dynamicChainLocationGroupFilters_.get(index);  } else {
        return dynamicChainLocationGroupFiltersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v19.common.ChainFilterOrBuilder> 
         getDynamicChainLocationGroupFiltersOrBuilderList() {
      if (dynamicChainLocationGroupFiltersBuilder_ != null) {
        return dynamicChainLocationGroupFiltersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dynamicChainLocationGroupFilters_);
      }
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public com.google.ads.googleads.v19.common.ChainFilter.Builder addDynamicChainLocationGroupFiltersBuilder() {
      return getDynamicChainLocationGroupFiltersFieldBuilder().addBuilder(
          com.google.ads.googleads.v19.common.ChainFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public com.google.ads.googleads.v19.common.ChainFilter.Builder addDynamicChainLocationGroupFiltersBuilder(
        int index) {
      return getDynamicChainLocationGroupFiltersFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v19.common.ChainFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * Used to filter chain locations by chain ids.
     * Only Locations that belong to the specified chain(s) will be in the asset
     * set.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ChainFilter dynamic_chain_location_group_filters = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.ChainFilter.Builder> 
         getDynamicChainLocationGroupFiltersBuilderList() {
      return getDynamicChainLocationGroupFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.ChainFilter, com.google.ads.googleads.v19.common.ChainFilter.Builder, com.google.ads.googleads.v19.common.ChainFilterOrBuilder> 
        getDynamicChainLocationGroupFiltersFieldBuilder() {
      if (dynamicChainLocationGroupFiltersBuilder_ == null) {
        dynamicChainLocationGroupFiltersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v19.common.ChainFilter, com.google.ads.googleads.v19.common.ChainFilter.Builder, com.google.ads.googleads.v19.common.ChainFilterOrBuilder>(
                dynamicChainLocationGroupFilters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dynamicChainLocationGroupFilters_ = null;
      }
      return dynamicChainLocationGroupFiltersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.ChainLocationGroup)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.ChainLocationGroup)
  private static final com.google.ads.googleads.v19.common.ChainLocationGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.ChainLocationGroup();
  }

  public static com.google.ads.googleads.v19.common.ChainLocationGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChainLocationGroup>
      PARSER = new com.google.protobuf.AbstractParser<ChainLocationGroup>() {
    @java.lang.Override
    public ChainLocationGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChainLocationGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChainLocationGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.ChainLocationGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

