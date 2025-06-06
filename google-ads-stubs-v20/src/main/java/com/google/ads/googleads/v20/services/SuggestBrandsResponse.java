// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/brand_suggestion_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

/**
 * <pre>
 * Response message for
 * [BrandSuggestionService.SuggestBrands][google.ads.googleads.v20.services.BrandSuggestionService.SuggestBrands].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.services.SuggestBrandsResponse}
 */
public final class SuggestBrandsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.services.SuggestBrandsResponse)
    SuggestBrandsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestBrandsResponse.newBuilder() to construct.
  private SuggestBrandsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestBrandsResponse() {
    brands_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestBrandsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_SuggestBrandsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_SuggestBrandsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.services.SuggestBrandsResponse.class, com.google.ads.googleads.v20.services.SuggestBrandsResponse.Builder.class);
  }

  public static final int BRANDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v20.services.BrandSuggestion> brands_;
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v20.services.BrandSuggestion> getBrandsList() {
    return brands_;
  }
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder> 
      getBrandsOrBuilderList() {
    return brands_;
  }
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
   */
  @java.lang.Override
  public int getBrandsCount() {
    return brands_.size();
  }
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.services.BrandSuggestion getBrands(int index) {
    return brands_.get(index);
  }
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder getBrandsOrBuilder(
      int index) {
    return brands_.get(index);
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
    for (int i = 0; i < brands_.size(); i++) {
      output.writeMessage(1, brands_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < brands_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, brands_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v20.services.SuggestBrandsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.services.SuggestBrandsResponse other = (com.google.ads.googleads.v20.services.SuggestBrandsResponse) obj;

    if (!getBrandsList()
        .equals(other.getBrandsList())) return false;
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
    if (getBrandsCount() > 0) {
      hash = (37 * hash) + BRANDS_FIELD_NUMBER;
      hash = (53 * hash) + getBrandsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.services.SuggestBrandsResponse prototype) {
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
   * Response message for
   * [BrandSuggestionService.SuggestBrands][google.ads.googleads.v20.services.BrandSuggestionService.SuggestBrands].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.services.SuggestBrandsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.services.SuggestBrandsResponse)
      com.google.ads.googleads.v20.services.SuggestBrandsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_SuggestBrandsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_SuggestBrandsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.services.SuggestBrandsResponse.class, com.google.ads.googleads.v20.services.SuggestBrandsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.services.SuggestBrandsResponse.newBuilder()
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
      if (brandsBuilder_ == null) {
        brands_ = java.util.Collections.emptyList();
      } else {
        brands_ = null;
        brandsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.services.BrandSuggestionServiceProto.internal_static_google_ads_googleads_v20_services_SuggestBrandsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SuggestBrandsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.services.SuggestBrandsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SuggestBrandsResponse build() {
      com.google.ads.googleads.v20.services.SuggestBrandsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SuggestBrandsResponse buildPartial() {
      com.google.ads.googleads.v20.services.SuggestBrandsResponse result = new com.google.ads.googleads.v20.services.SuggestBrandsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v20.services.SuggestBrandsResponse result) {
      if (brandsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          brands_ = java.util.Collections.unmodifiableList(brands_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.brands_ = brands_;
      } else {
        result.brands_ = brandsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v20.services.SuggestBrandsResponse result) {
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
      if (other instanceof com.google.ads.googleads.v20.services.SuggestBrandsResponse) {
        return mergeFrom((com.google.ads.googleads.v20.services.SuggestBrandsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.services.SuggestBrandsResponse other) {
      if (other == com.google.ads.googleads.v20.services.SuggestBrandsResponse.getDefaultInstance()) return this;
      if (brandsBuilder_ == null) {
        if (!other.brands_.isEmpty()) {
          if (brands_.isEmpty()) {
            brands_ = other.brands_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBrandsIsMutable();
            brands_.addAll(other.brands_);
          }
          onChanged();
        }
      } else {
        if (!other.brands_.isEmpty()) {
          if (brandsBuilder_.isEmpty()) {
            brandsBuilder_.dispose();
            brandsBuilder_ = null;
            brands_ = other.brands_;
            bitField0_ = (bitField0_ & ~0x00000001);
            brandsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBrandsFieldBuilder() : null;
          } else {
            brandsBuilder_.addAllMessages(other.brands_);
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
              com.google.ads.googleads.v20.services.BrandSuggestion m =
                  input.readMessage(
                      com.google.ads.googleads.v20.services.BrandSuggestion.parser(),
                      extensionRegistry);
              if (brandsBuilder_ == null) {
                ensureBrandsIsMutable();
                brands_.add(m);
              } else {
                brandsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v20.services.BrandSuggestion> brands_ =
      java.util.Collections.emptyList();
    private void ensureBrandsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        brands_ = new java.util.ArrayList<com.google.ads.googleads.v20.services.BrandSuggestion>(brands_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v20.services.BrandSuggestion, com.google.ads.googleads.v20.services.BrandSuggestion.Builder, com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder> brandsBuilder_;

    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v20.services.BrandSuggestion> getBrandsList() {
      if (brandsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(brands_);
      } else {
        return brandsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public int getBrandsCount() {
      if (brandsBuilder_ == null) {
        return brands_.size();
      } else {
        return brandsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public com.google.ads.googleads.v20.services.BrandSuggestion getBrands(int index) {
      if (brandsBuilder_ == null) {
        return brands_.get(index);
      } else {
        return brandsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder setBrands(
        int index, com.google.ads.googleads.v20.services.BrandSuggestion value) {
      if (brandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrandsIsMutable();
        brands_.set(index, value);
        onChanged();
      } else {
        brandsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder setBrands(
        int index, com.google.ads.googleads.v20.services.BrandSuggestion.Builder builderForValue) {
      if (brandsBuilder_ == null) {
        ensureBrandsIsMutable();
        brands_.set(index, builderForValue.build());
        onChanged();
      } else {
        brandsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder addBrands(com.google.ads.googleads.v20.services.BrandSuggestion value) {
      if (brandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrandsIsMutable();
        brands_.add(value);
        onChanged();
      } else {
        brandsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder addBrands(
        int index, com.google.ads.googleads.v20.services.BrandSuggestion value) {
      if (brandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBrandsIsMutable();
        brands_.add(index, value);
        onChanged();
      } else {
        brandsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder addBrands(
        com.google.ads.googleads.v20.services.BrandSuggestion.Builder builderForValue) {
      if (brandsBuilder_ == null) {
        ensureBrandsIsMutable();
        brands_.add(builderForValue.build());
        onChanged();
      } else {
        brandsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder addBrands(
        int index, com.google.ads.googleads.v20.services.BrandSuggestion.Builder builderForValue) {
      if (brandsBuilder_ == null) {
        ensureBrandsIsMutable();
        brands_.add(index, builderForValue.build());
        onChanged();
      } else {
        brandsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder addAllBrands(
        java.lang.Iterable<? extends com.google.ads.googleads.v20.services.BrandSuggestion> values) {
      if (brandsBuilder_ == null) {
        ensureBrandsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, brands_);
        onChanged();
      } else {
        brandsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder clearBrands() {
      if (brandsBuilder_ == null) {
        brands_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        brandsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public Builder removeBrands(int index) {
      if (brandsBuilder_ == null) {
        ensureBrandsIsMutable();
        brands_.remove(index);
        onChanged();
      } else {
        brandsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public com.google.ads.googleads.v20.services.BrandSuggestion.Builder getBrandsBuilder(
        int index) {
      return getBrandsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder getBrandsOrBuilder(
        int index) {
      if (brandsBuilder_ == null) {
        return brands_.get(index);  } else {
        return brandsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder> 
         getBrandsOrBuilderList() {
      if (brandsBuilder_ != null) {
        return brandsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(brands_);
      }
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public com.google.ads.googleads.v20.services.BrandSuggestion.Builder addBrandsBuilder() {
      return getBrandsFieldBuilder().addBuilder(
          com.google.ads.googleads.v20.services.BrandSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public com.google.ads.googleads.v20.services.BrandSuggestion.Builder addBrandsBuilder(
        int index) {
      return getBrandsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v20.services.BrandSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Generated brand suggestions of verified brands for the given prefix.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.services.BrandSuggestion brands = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v20.services.BrandSuggestion.Builder> 
         getBrandsBuilderList() {
      return getBrandsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v20.services.BrandSuggestion, com.google.ads.googleads.v20.services.BrandSuggestion.Builder, com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder> 
        getBrandsFieldBuilder() {
      if (brandsBuilder_ == null) {
        brandsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v20.services.BrandSuggestion, com.google.ads.googleads.v20.services.BrandSuggestion.Builder, com.google.ads.googleads.v20.services.BrandSuggestionOrBuilder>(
                brands_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        brands_ = null;
      }
      return brandsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.services.SuggestBrandsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.services.SuggestBrandsResponse)
  private static final com.google.ads.googleads.v20.services.SuggestBrandsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.services.SuggestBrandsResponse();
  }

  public static com.google.ads.googleads.v20.services.SuggestBrandsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestBrandsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestBrandsResponse>() {
    @java.lang.Override
    public SuggestBrandsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestBrandsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestBrandsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.services.SuggestBrandsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

