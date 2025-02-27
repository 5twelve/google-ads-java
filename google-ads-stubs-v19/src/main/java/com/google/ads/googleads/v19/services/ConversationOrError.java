// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/local_services_lead_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * Result of the append conversation operation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.ConversationOrError}
 */
public final class ConversationOrError extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.ConversationOrError)
    ConversationOrErrorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversationOrError.newBuilder() to construct.
  private ConversationOrError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversationOrError() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversationOrError();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.LocalServicesLeadServiceProto.internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.LocalServicesLeadServiceProto.internal_static_google_ads_googleads_v19_services_ConversationOrError_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.ConversationOrError.class, com.google.ads.googleads.v19.services.ConversationOrError.Builder.class);
  }

  private int appendLeadConversationResponseCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object appendLeadConversationResponse_;
  public enum AppendLeadConversationResponseCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOCAL_SERVICES_LEAD_CONVERSATION(1),
    PARTIAL_FAILURE_ERROR(2),
    APPENDLEADCONVERSATIONRESPONSE_NOT_SET(0);
    private final int value;
    private AppendLeadConversationResponseCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AppendLeadConversationResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static AppendLeadConversationResponseCase forNumber(int value) {
      switch (value) {
        case 1: return LOCAL_SERVICES_LEAD_CONVERSATION;
        case 2: return PARTIAL_FAILURE_ERROR;
        case 0: return APPENDLEADCONVERSATIONRESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AppendLeadConversationResponseCase
  getAppendLeadConversationResponseCase() {
    return AppendLeadConversationResponseCase.forNumber(
        appendLeadConversationResponseCase_);
  }

  public static final int LOCAL_SERVICES_LEAD_CONVERSATION_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return Whether the localServicesLeadConversation field is set.
   */
  public boolean hasLocalServicesLeadConversation() {
    return appendLeadConversationResponseCase_ == 1;
  }
  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return The localServicesLeadConversation.
   */
  public java.lang.String getLocalServicesLeadConversation() {
    java.lang.Object ref = "";
    if (appendLeadConversationResponseCase_ == 1) {
      ref = appendLeadConversationResponse_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (appendLeadConversationResponseCase_ == 1) {
        appendLeadConversationResponse_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return The bytes for localServicesLeadConversation.
   */
  public com.google.protobuf.ByteString
      getLocalServicesLeadConversationBytes() {
    java.lang.Object ref = "";
    if (appendLeadConversationResponseCase_ == 1) {
      ref = appendLeadConversationResponse_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (appendLeadConversationResponseCase_ == 1) {
        appendLeadConversationResponse_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTIAL_FAILURE_ERROR_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  @java.lang.Override
  public boolean hasPartialFailureError() {
    return appendLeadConversationResponseCase_ == 2;
  }
  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailureError() {
    if (appendLeadConversationResponseCase_ == 2) {
       return (com.google.rpc.Status) appendLeadConversationResponse_;
    }
    return com.google.rpc.Status.getDefaultInstance();
  }
  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
    if (appendLeadConversationResponseCase_ == 2) {
       return (com.google.rpc.Status) appendLeadConversationResponse_;
    }
    return com.google.rpc.Status.getDefaultInstance();
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
    if (appendLeadConversationResponseCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appendLeadConversationResponse_);
    }
    if (appendLeadConversationResponseCase_ == 2) {
      output.writeMessage(2, (com.google.rpc.Status) appendLeadConversationResponse_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appendLeadConversationResponseCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appendLeadConversationResponse_);
    }
    if (appendLeadConversationResponseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.rpc.Status) appendLeadConversationResponse_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.ConversationOrError)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.ConversationOrError other = (com.google.ads.googleads.v19.services.ConversationOrError) obj;

    if (!getAppendLeadConversationResponseCase().equals(other.getAppendLeadConversationResponseCase())) return false;
    switch (appendLeadConversationResponseCase_) {
      case 1:
        if (!getLocalServicesLeadConversation()
            .equals(other.getLocalServicesLeadConversation())) return false;
        break;
      case 2:
        if (!getPartialFailureError()
            .equals(other.getPartialFailureError())) return false;
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
    switch (appendLeadConversationResponseCase_) {
      case 1:
        hash = (37 * hash) + LOCAL_SERVICES_LEAD_CONVERSATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocalServicesLeadConversation().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PARTIAL_FAILURE_ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getPartialFailureError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.ConversationOrError parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.ConversationOrError parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.ConversationOrError parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.ConversationOrError prototype) {
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
   * Result of the append conversation operation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.ConversationOrError}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.ConversationOrError)
      com.google.ads.googleads.v19.services.ConversationOrErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.LocalServicesLeadServiceProto.internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.LocalServicesLeadServiceProto.internal_static_google_ads_googleads_v19_services_ConversationOrError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.ConversationOrError.class, com.google.ads.googleads.v19.services.ConversationOrError.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.ConversationOrError.newBuilder()
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
      if (partialFailureErrorBuilder_ != null) {
        partialFailureErrorBuilder_.clear();
      }
      appendLeadConversationResponseCase_ = 0;
      appendLeadConversationResponse_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.LocalServicesLeadServiceProto.internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ConversationOrError getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.ConversationOrError.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ConversationOrError build() {
      com.google.ads.googleads.v19.services.ConversationOrError result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.ConversationOrError buildPartial() {
      com.google.ads.googleads.v19.services.ConversationOrError result = new com.google.ads.googleads.v19.services.ConversationOrError(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.ConversationOrError result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v19.services.ConversationOrError result) {
      result.appendLeadConversationResponseCase_ = appendLeadConversationResponseCase_;
      result.appendLeadConversationResponse_ = this.appendLeadConversationResponse_;
      if (appendLeadConversationResponseCase_ == 2 &&
          partialFailureErrorBuilder_ != null) {
        result.appendLeadConversationResponse_ = partialFailureErrorBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v19.services.ConversationOrError) {
        return mergeFrom((com.google.ads.googleads.v19.services.ConversationOrError)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.ConversationOrError other) {
      if (other == com.google.ads.googleads.v19.services.ConversationOrError.getDefaultInstance()) return this;
      switch (other.getAppendLeadConversationResponseCase()) {
        case LOCAL_SERVICES_LEAD_CONVERSATION: {
          appendLeadConversationResponseCase_ = 1;
          appendLeadConversationResponse_ = other.appendLeadConversationResponse_;
          onChanged();
          break;
        }
        case PARTIAL_FAILURE_ERROR: {
          mergePartialFailureError(other.getPartialFailureError());
          break;
        }
        case APPENDLEADCONVERSATIONRESPONSE_NOT_SET: {
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              appendLeadConversationResponseCase_ = 1;
              appendLeadConversationResponse_ = s;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPartialFailureErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              appendLeadConversationResponseCase_ = 2;
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
    private int appendLeadConversationResponseCase_ = 0;
    private java.lang.Object appendLeadConversationResponse_;
    public AppendLeadConversationResponseCase
        getAppendLeadConversationResponseCase() {
      return AppendLeadConversationResponseCase.forNumber(
          appendLeadConversationResponseCase_);
    }

    public Builder clearAppendLeadConversationResponse() {
      appendLeadConversationResponseCase_ = 0;
      appendLeadConversationResponse_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @return Whether the localServicesLeadConversation field is set.
     */
    @java.lang.Override
    public boolean hasLocalServicesLeadConversation() {
      return appendLeadConversationResponseCase_ == 1;
    }
    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @return The localServicesLeadConversation.
     */
    @java.lang.Override
    public java.lang.String getLocalServicesLeadConversation() {
      java.lang.Object ref = "";
      if (appendLeadConversationResponseCase_ == 1) {
        ref = appendLeadConversationResponse_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (appendLeadConversationResponseCase_ == 1) {
          appendLeadConversationResponse_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @return The bytes for localServicesLeadConversation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLocalServicesLeadConversationBytes() {
      java.lang.Object ref = "";
      if (appendLeadConversationResponseCase_ == 1) {
        ref = appendLeadConversationResponse_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (appendLeadConversationResponseCase_ == 1) {
          appendLeadConversationResponse_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @param value The localServicesLeadConversation to set.
     * @return This builder for chaining.
     */
    public Builder setLocalServicesLeadConversation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      appendLeadConversationResponseCase_ = 1;
      appendLeadConversationResponse_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalServicesLeadConversation() {
      if (appendLeadConversationResponseCase_ == 1) {
        appendLeadConversationResponseCase_ = 0;
        appendLeadConversationResponse_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The resource name of the appended local services lead conversation.
     * </pre>
     *
     * <code>string local_services_lead_conversation = 1;</code>
     * @param value The bytes for localServicesLeadConversation to set.
     * @return This builder for chaining.
     */
    public Builder setLocalServicesLeadConversationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      appendLeadConversationResponseCase_ = 1;
      appendLeadConversationResponse_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> partialFailureErrorBuilder_;
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     * @return Whether the partialFailureError field is set.
     */
    @java.lang.Override
    public boolean hasPartialFailureError() {
      return appendLeadConversationResponseCase_ == 2;
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     * @return The partialFailureError.
     */
    @java.lang.Override
    public com.google.rpc.Status getPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        if (appendLeadConversationResponseCase_ == 2) {
          return (com.google.rpc.Status) appendLeadConversationResponse_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      } else {
        if (appendLeadConversationResponseCase_ == 2) {
          return partialFailureErrorBuilder_.getMessage();
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder setPartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appendLeadConversationResponse_ = value;
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(value);
      }
      appendLeadConversationResponseCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder setPartialFailureError(
        com.google.rpc.Status.Builder builderForValue) {
      if (partialFailureErrorBuilder_ == null) {
        appendLeadConversationResponse_ = builderForValue.build();
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(builderForValue.build());
      }
      appendLeadConversationResponseCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder mergePartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (appendLeadConversationResponseCase_ == 2 &&
            appendLeadConversationResponse_ != com.google.rpc.Status.getDefaultInstance()) {
          appendLeadConversationResponse_ = com.google.rpc.Status.newBuilder((com.google.rpc.Status) appendLeadConversationResponse_)
              .mergeFrom(value).buildPartial();
        } else {
          appendLeadConversationResponse_ = value;
        }
        onChanged();
      } else {
        if (appendLeadConversationResponseCase_ == 2) {
          partialFailureErrorBuilder_.mergeFrom(value);
        } else {
          partialFailureErrorBuilder_.setMessage(value);
        }
      }
      appendLeadConversationResponseCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder clearPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        if (appendLeadConversationResponseCase_ == 2) {
          appendLeadConversationResponseCase_ = 0;
          appendLeadConversationResponse_ = null;
          onChanged();
        }
      } else {
        if (appendLeadConversationResponseCase_ == 2) {
          appendLeadConversationResponseCase_ = 0;
          appendLeadConversationResponse_ = null;
        }
        partialFailureErrorBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailureErrorBuilder() {
      return getPartialFailureErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    @java.lang.Override
    public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
      if ((appendLeadConversationResponseCase_ == 2) && (partialFailureErrorBuilder_ != null)) {
        return partialFailureErrorBuilder_.getMessageOrBuilder();
      } else {
        if (appendLeadConversationResponseCase_ == 2) {
          return (com.google.rpc.Status) appendLeadConversationResponse_;
        }
        return com.google.rpc.Status.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Failure status when the request could not be processed.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getPartialFailureErrorFieldBuilder() {
      if (partialFailureErrorBuilder_ == null) {
        if (!(appendLeadConversationResponseCase_ == 2)) {
          appendLeadConversationResponse_ = com.google.rpc.Status.getDefaultInstance();
        }
        partialFailureErrorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                (com.google.rpc.Status) appendLeadConversationResponse_,
                getParentForChildren(),
                isClean());
        appendLeadConversationResponse_ = null;
      }
      appendLeadConversationResponseCase_ = 2;
      onChanged();
      return partialFailureErrorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.ConversationOrError)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.ConversationOrError)
  private static final com.google.ads.googleads.v19.services.ConversationOrError DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.ConversationOrError();
  }

  public static com.google.ads.googleads.v19.services.ConversationOrError getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversationOrError>
      PARSER = new com.google.protobuf.AbstractParser<ConversationOrError>() {
    @java.lang.Override
    public ConversationOrError parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversationOrError> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversationOrError> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.ConversationOrError getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

