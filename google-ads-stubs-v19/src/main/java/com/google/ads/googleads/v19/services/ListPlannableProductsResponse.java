// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * A response with all available products.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.ListPlannableProductsResponse}
 */
public final class ListPlannableProductsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.ListPlannableProductsResponse)
    ListPlannableProductsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPlannableProductsResponse.newBuilder() to construct.
  private ListPlannableProductsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPlannableProductsResponse() {
    productMetadata_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPlannableProductsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v19_services_ListPlannableProductsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v19_services_ListPlannableProductsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.ListPlannableProductsResponse.class, com.google.ads.googleads.v19.services.ListPlannableProductsResponse.Builder.class);
  }

  public static final int PRODUCT_METADATA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v19.services.ProductMetadata> productMetadata_;
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v19.services.ProductMetadata> getProductMetadataList() {
    return productMetadata_;
  }
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v19.services.ProductMetadataOrBuilder> 
      getProductMetadataOrBuilderList() {
    return productMetadata_;
  }
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
   */
  @java.lang.Override
  public int getProductMetadataCount() {
    return productMetadata_.size();
  }
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.services.ProductMetadata getProductMetadata(int index) {
    return productMetadata_.get(index);
  }
  /**
   * <pre>
   * The list of products available for planning and related targeting metadata.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.services.ProductMetadataOrBuilder getProductMetadataOrBuilder(
      int index) {
    return productMetadata_.get(index);
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
    for (int i = 0; i < productMetadata_.size(); i++) {
      output.writeMessage(1, productMetadata_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < productMetadata_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, productMetadata_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.ListPlannableProductsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.ListPlannableProductsResponse other = (com.google.ads.googleads.v19.services.ListPlannableProductsResponse) obj;

    if (!getProductMetadataList()
        .equals(other.getProductMetadataList())) return false;
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
    if (getProductMetadataCount() > 0) {
      hash = (37 * hash) + PRODUCT_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getProductMetadataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.ListPlannableProductsResponse prototype) {
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
   * A response with all available products.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.ListPlannableProductsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.ListPlannableProductsResponse)
      com.google.ads.googleads.v19.services.ListPlannableProductsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v19_services_ListPlannableProductsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v19_services_ListPlannableProductsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.ListPlannableProductsResponse.class, com.google.ads.googleads.v19.services.ListPlannableProductsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.ListPlannableProductsResponse.newBuilder()
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
      if (productMetadataBuilder_ == null) {
        productMetadata_ = java.util.Collections.emptyList();
      } else {
        productMetadata_ = null;
        productMetadataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v19_services_ListPlannableProductsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ListPlannableProductsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.ListPlannableProductsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ListPlannableProductsResponse build() {
      com.google.ads.googleads.v19.services.ListPlannableProductsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ListPlannableProductsResponse buildPartial() {
      com.google.ads.googleads.v19.services.ListPlannableProductsResponse result = new com.google.ads.googleads.v19.services.ListPlannableProductsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v19.services.ListPlannableProductsResponse result) {
      if (productMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          productMetadata_ = java.util.Collections.unmodifiableList(productMetadata_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productMetadata_ = productMetadata_;
      } else {
        result.productMetadata_ = productMetadataBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.ListPlannableProductsResponse result) {
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
      if (other instanceof com.google.ads.googleads.v19.services.ListPlannableProductsResponse) {
        return mergeFrom((com.google.ads.googleads.v19.services.ListPlannableProductsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.ListPlannableProductsResponse other) {
      if (other == com.google.ads.googleads.v19.services.ListPlannableProductsResponse.getDefaultInstance()) return this;
      if (productMetadataBuilder_ == null) {
        if (!other.productMetadata_.isEmpty()) {
          if (productMetadata_.isEmpty()) {
            productMetadata_ = other.productMetadata_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductMetadataIsMutable();
            productMetadata_.addAll(other.productMetadata_);
          }
          onChanged();
        }
      } else {
        if (!other.productMetadata_.isEmpty()) {
          if (productMetadataBuilder_.isEmpty()) {
            productMetadataBuilder_.dispose();
            productMetadataBuilder_ = null;
            productMetadata_ = other.productMetadata_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productMetadataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductMetadataFieldBuilder() : null;
          } else {
            productMetadataBuilder_.addAllMessages(other.productMetadata_);
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
              com.google.ads.googleads.v19.services.ProductMetadata m =
                  input.readMessage(
                      com.google.ads.googleads.v19.services.ProductMetadata.parser(),
                      extensionRegistry);
              if (productMetadataBuilder_ == null) {
                ensureProductMetadataIsMutable();
                productMetadata_.add(m);
              } else {
                productMetadataBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v19.services.ProductMetadata> productMetadata_ =
      java.util.Collections.emptyList();
    private void ensureProductMetadataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        productMetadata_ = new java.util.ArrayList<com.google.ads.googleads.v19.services.ProductMetadata>(productMetadata_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.services.ProductMetadata, com.google.ads.googleads.v19.services.ProductMetadata.Builder, com.google.ads.googleads.v19.services.ProductMetadataOrBuilder> productMetadataBuilder_;

    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.services.ProductMetadata> getProductMetadataList() {
      if (productMetadataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productMetadata_);
      } else {
        return productMetadataBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public int getProductMetadataCount() {
      if (productMetadataBuilder_ == null) {
        return productMetadata_.size();
      } else {
        return productMetadataBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public com.google.ads.googleads.v19.services.ProductMetadata getProductMetadata(int index) {
      if (productMetadataBuilder_ == null) {
        return productMetadata_.get(index);
      } else {
        return productMetadataBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder setProductMetadata(
        int index, com.google.ads.googleads.v19.services.ProductMetadata value) {
      if (productMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMetadataIsMutable();
        productMetadata_.set(index, value);
        onChanged();
      } else {
        productMetadataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder setProductMetadata(
        int index, com.google.ads.googleads.v19.services.ProductMetadata.Builder builderForValue) {
      if (productMetadataBuilder_ == null) {
        ensureProductMetadataIsMutable();
        productMetadata_.set(index, builderForValue.build());
        onChanged();
      } else {
        productMetadataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder addProductMetadata(com.google.ads.googleads.v19.services.ProductMetadata value) {
      if (productMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMetadataIsMutable();
        productMetadata_.add(value);
        onChanged();
      } else {
        productMetadataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder addProductMetadata(
        int index, com.google.ads.googleads.v19.services.ProductMetadata value) {
      if (productMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMetadataIsMutable();
        productMetadata_.add(index, value);
        onChanged();
      } else {
        productMetadataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder addProductMetadata(
        com.google.ads.googleads.v19.services.ProductMetadata.Builder builderForValue) {
      if (productMetadataBuilder_ == null) {
        ensureProductMetadataIsMutable();
        productMetadata_.add(builderForValue.build());
        onChanged();
      } else {
        productMetadataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder addProductMetadata(
        int index, com.google.ads.googleads.v19.services.ProductMetadata.Builder builderForValue) {
      if (productMetadataBuilder_ == null) {
        ensureProductMetadataIsMutable();
        productMetadata_.add(index, builderForValue.build());
        onChanged();
      } else {
        productMetadataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder addAllProductMetadata(
        java.lang.Iterable<? extends com.google.ads.googleads.v19.services.ProductMetadata> values) {
      if (productMetadataBuilder_ == null) {
        ensureProductMetadataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, productMetadata_);
        onChanged();
      } else {
        productMetadataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder clearProductMetadata() {
      if (productMetadataBuilder_ == null) {
        productMetadata_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productMetadataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public Builder removeProductMetadata(int index) {
      if (productMetadataBuilder_ == null) {
        ensureProductMetadataIsMutable();
        productMetadata_.remove(index);
        onChanged();
      } else {
        productMetadataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public com.google.ads.googleads.v19.services.ProductMetadata.Builder getProductMetadataBuilder(
        int index) {
      return getProductMetadataFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public com.google.ads.googleads.v19.services.ProductMetadataOrBuilder getProductMetadataOrBuilder(
        int index) {
      if (productMetadataBuilder_ == null) {
        return productMetadata_.get(index);  } else {
        return productMetadataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v19.services.ProductMetadataOrBuilder> 
         getProductMetadataOrBuilderList() {
      if (productMetadataBuilder_ != null) {
        return productMetadataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productMetadata_);
      }
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public com.google.ads.googleads.v19.services.ProductMetadata.Builder addProductMetadataBuilder() {
      return getProductMetadataFieldBuilder().addBuilder(
          com.google.ads.googleads.v19.services.ProductMetadata.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public com.google.ads.googleads.v19.services.ProductMetadata.Builder addProductMetadataBuilder(
        int index) {
      return getProductMetadataFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v19.services.ProductMetadata.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of products available for planning and related targeting metadata.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ProductMetadata product_metadata = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v19.services.ProductMetadata.Builder> 
         getProductMetadataBuilderList() {
      return getProductMetadataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.services.ProductMetadata, com.google.ads.googleads.v19.services.ProductMetadata.Builder, com.google.ads.googleads.v19.services.ProductMetadataOrBuilder> 
        getProductMetadataFieldBuilder() {
      if (productMetadataBuilder_ == null) {
        productMetadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v19.services.ProductMetadata, com.google.ads.googleads.v19.services.ProductMetadata.Builder, com.google.ads.googleads.v19.services.ProductMetadataOrBuilder>(
                productMetadata_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        productMetadata_ = null;
      }
      return productMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.ListPlannableProductsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.ListPlannableProductsResponse)
  private static final com.google.ads.googleads.v19.services.ListPlannableProductsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.ListPlannableProductsResponse();
  }

  public static com.google.ads.googleads.v19.services.ListPlannableProductsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPlannableProductsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPlannableProductsResponse>() {
    @java.lang.Override
    public ListPlannableProductsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPlannableProductsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPlannableProductsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.ListPlannableProductsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

