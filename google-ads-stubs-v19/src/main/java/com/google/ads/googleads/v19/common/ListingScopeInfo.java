// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * A listing scope criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.ListingScopeInfo}
 */
public final class ListingScopeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.ListingScopeInfo)
    ListingScopeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListingScopeInfo.newBuilder() to construct.
  private ListingScopeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListingScopeInfo() {
    dimensions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListingScopeInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.CriteriaProto.internal_static_google_ads_googleads_v19_common_ListingScopeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.CriteriaProto.internal_static_google_ads_googleads_v19_common_ListingScopeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.ListingScopeInfo.class, com.google.ads.googleads.v19.common.ListingScopeInfo.Builder.class);
  }

  public static final int DIMENSIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo> dimensions_;
  /**
   * <pre>
   * Scope of the campaign criterion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo> getDimensionsList() {
    return dimensions_;
  }
  /**
   * <pre>
   * Scope of the campaign criterion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder> 
      getDimensionsOrBuilderList() {
    return dimensions_;
  }
  /**
   * <pre>
   * Scope of the campaign criterion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
   */
  @java.lang.Override
  public int getDimensionsCount() {
    return dimensions_.size();
  }
  /**
   * <pre>
   * Scope of the campaign criterion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ListingDimensionInfo getDimensions(int index) {
    return dimensions_.get(index);
  }
  /**
   * <pre>
   * Scope of the campaign criterion.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder getDimensionsOrBuilder(
      int index) {
    return dimensions_.get(index);
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
    for (int i = 0; i < dimensions_.size(); i++) {
      output.writeMessage(2, dimensions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dimensions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dimensions_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.ListingScopeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.ListingScopeInfo other = (com.google.ads.googleads.v19.common.ListingScopeInfo) obj;

    if (!getDimensionsList()
        .equals(other.getDimensionsList())) return false;
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
    if (getDimensionsCount() > 0) {
      hash = (37 * hash) + DIMENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDimensionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ListingScopeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.ListingScopeInfo prototype) {
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
   * A listing scope criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.ListingScopeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.ListingScopeInfo)
      com.google.ads.googleads.v19.common.ListingScopeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.CriteriaProto.internal_static_google_ads_googleads_v19_common_ListingScopeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.CriteriaProto.internal_static_google_ads_googleads_v19_common_ListingScopeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.ListingScopeInfo.class, com.google.ads.googleads.v19.common.ListingScopeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.ListingScopeInfo.newBuilder()
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
      if (dimensionsBuilder_ == null) {
        dimensions_ = java.util.Collections.emptyList();
      } else {
        dimensions_ = null;
        dimensionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.CriteriaProto.internal_static_google_ads_googleads_v19_common_ListingScopeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ListingScopeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.ListingScopeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ListingScopeInfo build() {
      com.google.ads.googleads.v19.common.ListingScopeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ListingScopeInfo buildPartial() {
      com.google.ads.googleads.v19.common.ListingScopeInfo result = new com.google.ads.googleads.v19.common.ListingScopeInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v19.common.ListingScopeInfo result) {
      if (dimensionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dimensions_ = java.util.Collections.unmodifiableList(dimensions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dimensions_ = dimensions_;
      } else {
        result.dimensions_ = dimensionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.ListingScopeInfo result) {
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
      if (other instanceof com.google.ads.googleads.v19.common.ListingScopeInfo) {
        return mergeFrom((com.google.ads.googleads.v19.common.ListingScopeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.ListingScopeInfo other) {
      if (other == com.google.ads.googleads.v19.common.ListingScopeInfo.getDefaultInstance()) return this;
      if (dimensionsBuilder_ == null) {
        if (!other.dimensions_.isEmpty()) {
          if (dimensions_.isEmpty()) {
            dimensions_ = other.dimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimensionsIsMutable();
            dimensions_.addAll(other.dimensions_);
          }
          onChanged();
        }
      } else {
        if (!other.dimensions_.isEmpty()) {
          if (dimensionsBuilder_.isEmpty()) {
            dimensionsBuilder_.dispose();
            dimensionsBuilder_ = null;
            dimensions_ = other.dimensions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dimensionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDimensionsFieldBuilder() : null;
          } else {
            dimensionsBuilder_.addAllMessages(other.dimensions_);
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
            case 18: {
              com.google.ads.googleads.v19.common.ListingDimensionInfo m =
                  input.readMessage(
                      com.google.ads.googleads.v19.common.ListingDimensionInfo.parser(),
                      extensionRegistry);
              if (dimensionsBuilder_ == null) {
                ensureDimensionsIsMutable();
                dimensions_.add(m);
              } else {
                dimensionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo> dimensions_ =
      java.util.Collections.emptyList();
    private void ensureDimensionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dimensions_ = new java.util.ArrayList<com.google.ads.googleads.v19.common.ListingDimensionInfo>(dimensions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.ListingDimensionInfo, com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder> dimensionsBuilder_;

    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo> getDimensionsList() {
      if (dimensionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dimensions_);
      } else {
        return dimensionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public int getDimensionsCount() {
      if (dimensionsBuilder_ == null) {
        return dimensions_.size();
      } else {
        return dimensionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public com.google.ads.googleads.v19.common.ListingDimensionInfo getDimensions(int index) {
      if (dimensionsBuilder_ == null) {
        return dimensions_.get(index);
      } else {
        return dimensionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder setDimensions(
        int index, com.google.ads.googleads.v19.common.ListingDimensionInfo value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.set(index, value);
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder setDimensions(
        int index, com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.set(index, builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder addDimensions(com.google.ads.googleads.v19.common.ListingDimensionInfo value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.add(value);
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder addDimensions(
        int index, com.google.ads.googleads.v19.common.ListingDimensionInfo value) {
      if (dimensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDimensionsIsMutable();
        dimensions_.add(index, value);
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder addDimensions(
        com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.add(builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder addDimensions(
        int index, com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder builderForValue) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.add(index, builderForValue.build());
        onChanged();
      } else {
        dimensionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder addAllDimensions(
        java.lang.Iterable<? extends com.google.ads.googleads.v19.common.ListingDimensionInfo> values) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dimensions_);
        onChanged();
      } else {
        dimensionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder clearDimensions() {
      if (dimensionsBuilder_ == null) {
        dimensions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dimensionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public Builder removeDimensions(int index) {
      if (dimensionsBuilder_ == null) {
        ensureDimensionsIsMutable();
        dimensions_.remove(index);
        onChanged();
      } else {
        dimensionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder getDimensionsBuilder(
        int index) {
      return getDimensionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder getDimensionsOrBuilder(
        int index) {
      if (dimensionsBuilder_ == null) {
        return dimensions_.get(index);  } else {
        return dimensionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder> 
         getDimensionsOrBuilderList() {
      if (dimensionsBuilder_ != null) {
        return dimensionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dimensions_);
      }
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder addDimensionsBuilder() {
      return getDimensionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v19.common.ListingDimensionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder addDimensionsBuilder(
        int index) {
      return getDimensionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v19.common.ListingDimensionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Scope of the campaign criterion.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.common.ListingDimensionInfo dimensions = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder> 
         getDimensionsBuilderList() {
      return getDimensionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.common.ListingDimensionInfo, com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder> 
        getDimensionsFieldBuilder() {
      if (dimensionsBuilder_ == null) {
        dimensionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v19.common.ListingDimensionInfo, com.google.ads.googleads.v19.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v19.common.ListingDimensionInfoOrBuilder>(
                dimensions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dimensions_ = null;
      }
      return dimensionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.ListingScopeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.ListingScopeInfo)
  private static final com.google.ads.googleads.v19.common.ListingScopeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.ListingScopeInfo();
  }

  public static com.google.ads.googleads.v19.common.ListingScopeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListingScopeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ListingScopeInfo>() {
    @java.lang.Override
    public ListingScopeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListingScopeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListingScopeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.ListingScopeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

