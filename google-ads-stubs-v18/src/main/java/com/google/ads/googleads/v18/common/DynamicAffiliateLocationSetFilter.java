// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/feed_item_set_filter_type_infos.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * Represents a filter on affiliate locations in a FeedItemSet.
 * Only applicable if the parent Feed of the FeedItemSet is an
 * AFFILIATE_LOCATION feed.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter}
 */
public final class DynamicAffiliateLocationSetFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)
    DynamicAffiliateLocationSetFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicAffiliateLocationSetFilter.newBuilder() to construct.
  private DynamicAffiliateLocationSetFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicAffiliateLocationSetFilter() {
    chainIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicAffiliateLocationSetFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.FeedItemSetFilterTypeInfosProto.internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.FeedItemSetFilterTypeInfosProto.internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.class, com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.Builder.class);
  }

  public static final int CHAIN_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList chainIds_ =
      emptyLongList();
  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @return A list containing the chainIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getChainIdsList() {
    return chainIds_;
  }
  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @return The count of chainIds.
   */
  public int getChainIdsCount() {
    return chainIds_.size();
  }
  /**
   * <pre>
   * Used to filter affiliate locations by chain ids. Only affiliate locations
   * that belong to the specified chain(s) will be added to the FeedItemSet.
   * </pre>
   *
   * <code>repeated int64 chain_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The chainIds at the given index.
   */
  public long getChainIds(int index) {
    return chainIds_.getLong(index);
  }
  private int chainIdsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getChainIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(chainIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < chainIds_.size(); i++) {
      output.writeInt64NoTag(chainIds_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < chainIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(chainIds_.getLong(i));
      }
      size += dataSize;
      if (!getChainIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      chainIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter other = (com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter) obj;

    if (!getChainIdsList()
        .equals(other.getChainIdsList())) return false;
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
    if (getChainIdsCount() > 0) {
      hash = (37 * hash) + CHAIN_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getChainIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter prototype) {
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
   * Represents a filter on affiliate locations in a FeedItemSet.
   * Only applicable if the parent Feed of the FeedItemSet is an
   * AFFILIATE_LOCATION feed.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)
      com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.FeedItemSetFilterTypeInfosProto.internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.FeedItemSetFilterTypeInfosProto.internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.class, com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.newBuilder()
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
      chainIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.FeedItemSetFilterTypeInfosProto.internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter build() {
      com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter buildPartial() {
      com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter result = new com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        chainIds_.makeImmutable();
        result.chainIds_ = chainIds_;
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
      if (other instanceof com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter) {
        return mergeFrom((com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter other) {
      if (other == com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter.getDefaultInstance()) return this;
      if (!other.chainIds_.isEmpty()) {
        if (chainIds_.isEmpty()) {
          chainIds_ = other.chainIds_;
          chainIds_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureChainIdsIsMutable();
          chainIds_.addAll(other.chainIds_);
        }
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
            case 8: {
              long v = input.readInt64();
              ensureChainIdsIsMutable();
              chainIds_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureChainIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                chainIds_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList chainIds_ = emptyLongList();
    private void ensureChainIdsIsMutable() {
      if (!chainIds_.isModifiable()) {
        chainIds_ = makeMutableCopy(chainIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @return A list containing the chainIds.
     */
    public java.util.List<java.lang.Long>
        getChainIdsList() {
      chainIds_.makeImmutable();
      return chainIds_;
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @return The count of chainIds.
     */
    public int getChainIdsCount() {
      return chainIds_.size();
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The chainIds at the given index.
     */
    public long getChainIds(int index) {
      return chainIds_.getLong(index);
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The chainIds to set.
     * @return This builder for chaining.
     */
    public Builder setChainIds(
        int index, long value) {

      ensureChainIdsIsMutable();
      chainIds_.setLong(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @param value The chainIds to add.
     * @return This builder for chaining.
     */
    public Builder addChainIds(long value) {

      ensureChainIdsIsMutable();
      chainIds_.addLong(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @param values The chainIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllChainIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureChainIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, chainIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter affiliate locations by chain ids. Only affiliate locations
     * that belong to the specified chain(s) will be added to the FeedItemSet.
     * </pre>
     *
     * <code>repeated int64 chain_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChainIds() {
      chainIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter)
  private static final com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter();
  }

  public static com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicAffiliateLocationSetFilter>
      PARSER = new com.google.protobuf.AbstractParser<DynamicAffiliateLocationSetFilter>() {
    @java.lang.Override
    public DynamicAffiliateLocationSetFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<DynamicAffiliateLocationSetFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicAffiliateLocationSetFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.DynamicAffiliateLocationSetFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

