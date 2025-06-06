// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/conversion_adjustment_upload_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible conversion adjustment upload errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum}
 */
public final class ConversionAdjustmentUploadErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)
    ConversionAdjustmentUploadErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionAdjustmentUploadErrorEnum.newBuilder() to construct.
  private ConversionAdjustmentUploadErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionAdjustmentUploadErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionAdjustmentUploadErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionAdjustmentUploadErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionAdjustmentUploadErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.class, com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion adjustment upload errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.ConversionAdjustmentUploadError}
   */
  public enum ConversionAdjustmentUploadError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Can't import events to a conversion action that was just created. Try
     * importing again in 6 hours.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION_ACTION = 2;</code>
     */
    TOO_RECENT_CONVERSION_ACTION(2),
    /**
     * <pre>
     * The conversion was already retracted. This adjustment was not processed.
     * </pre>
     *
     * <code>CONVERSION_ALREADY_RETRACTED = 4;</code>
     */
    CONVERSION_ALREADY_RETRACTED(4),
    /**
     * <pre>
     * The conversion for this conversion action and conversion identifier can't
     * be found. Make sure your conversion identifiers are associated with the
     * correct conversion action and try again.
     * </pre>
     *
     * <code>CONVERSION_NOT_FOUND = 5;</code>
     */
    CONVERSION_NOT_FOUND(5),
    /**
     * <pre>
     * Adjustment can't be made to a conversion that occurred more than 54 days
     * ago.
     * </pre>
     *
     * <code>CONVERSION_EXPIRED = 6;</code>
     */
    CONVERSION_EXPIRED(6),
    /**
     * <pre>
     * Adjustment has an `adjustment_date_time` that occurred before the
     * associated conversion. Make sure your `adjustment_date_time` is correct
     * and try again.
     * </pre>
     *
     * <code>ADJUSTMENT_PRECEDES_CONVERSION = 7;</code>
     */
    ADJUSTMENT_PRECEDES_CONVERSION(7),
    /**
     * <pre>
     * More recent adjustment `adjustment_date_time` has already been reported
     * for the associated conversion.  Make sure your adjustment
     * `adjustment_date_time` is correct and try again.
     * </pre>
     *
     * <code>MORE_RECENT_RESTATEMENT_FOUND = 8;</code>
     */
    MORE_RECENT_RESTATEMENT_FOUND(8),
    /**
     * <pre>
     * Adjustment can't be recorded because the conversion occurred too
     * recently. Try adjusting a conversion that occurred at least 24 hours ago.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION = 9;</code>
     */
    TOO_RECENT_CONVERSION(9),
    /**
     * <pre>
     * Can't make an adjustment to a conversion that is set up to use the
     * default value. Check your conversion action value setting and try again.
     * </pre>
     *
     * <code>CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE = 10;</code>
     */
    CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE(10),
    /**
     * <pre>
     * Try uploading fewer than 2001 adjustments in a single API request.
     * </pre>
     *
     * <code>TOO_MANY_ADJUSTMENTS_IN_REQUEST = 11;</code>
     */
    TOO_MANY_ADJUSTMENTS_IN_REQUEST(11),
    /**
     * <pre>
     * The conversion has already been adjusted the maximum number of times.
     * Make sure you're only making necessary adjustment to existing conversion.
     * </pre>
     *
     * <code>TOO_MANY_ADJUSTMENTS = 12;</code>
     */
    TOO_MANY_ADJUSTMENTS(12),
    /**
     * <pre>
     * The conversion has prior a restatement with the same
     * `adjustment_date_time`. Make sure your adjustment has the correct and
     * unique `adjustment_date_time` and try again.
     * </pre>
     *
     * <code>RESTATEMENT_ALREADY_EXISTS = 13;</code>
     */
    RESTATEMENT_ALREADY_EXISTS(13),
    /**
     * <pre>
     * Imported adjustment has a duplicate conversion adjustment with same
     * `adjustment_date_time`. Make sure your adjustment has the correct
     * `adjustment_date_time` and try again.
     * </pre>
     *
     * <code>DUPLICATE_ADJUSTMENT_IN_REQUEST = 14;</code>
     */
    DUPLICATE_ADJUSTMENT_IN_REQUEST(14),
    /**
     * <pre>
     * Make sure you agree to the customer data processing terms in conversion
     * settings and try again.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TERMS = 15;</code>
     */
    CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TERMS(15),
    /**
     * <pre>
     * Can't use enhanced conversions with the specified conversion action.
     * </pre>
     *
     * <code>CONVERSION_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT = 16;</code>
     */
    CONVERSION_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT(16),
    /**
     * <pre>
     * Make sure you hash user provided data using SHA-256 and ensure you are
     * normalizing according to the guidelines.
     * </pre>
     *
     * <code>INVALID_USER_IDENTIFIER = 17;</code>
     */
    INVALID_USER_IDENTIFIER(17),
    /**
     * <pre>
     * Use user provided data such as emails or phone numbers hashed using
     * SHA-256 and try again.
     * </pre>
     *
     * <code>UNSUPPORTED_USER_IDENTIFIER = 18;</code>
     */
    UNSUPPORTED_USER_IDENTIFIER(18),
    /**
     * <pre>
     * Cannot set both gclid_date_time_pair and order_id. Use only 1 type and
     * try again.
     * </pre>
     *
     * <code>GCLID_DATE_TIME_PAIR_AND_ORDER_ID_BOTH_SET = 20;</code>
     */
    GCLID_DATE_TIME_PAIR_AND_ORDER_ID_BOTH_SET(20),
    /**
     * <pre>
     * Conversion already has enhancements with the same Order ID and conversion
     * action. Make sure your data is correctly configured and try again.
     * </pre>
     *
     * <code>CONVERSION_ALREADY_ENHANCED = 21;</code>
     */
    CONVERSION_ALREADY_ENHANCED(21),
    /**
     * <pre>
     * Multiple enhancements have the same conversion action and Order ID.  Make
     * sure your data is correctly configured and try again.
     * </pre>
     *
     * <code>DUPLICATE_ENHANCEMENT_IN_REQUEST = 22;</code>
     */
    DUPLICATE_ENHANCEMENT_IN_REQUEST(22),
    /**
     * <pre>
     * Enhanced conversions can't be used for this account because of Google
     * customer data policies. Contact your Google representative.
     * </pre>
     *
     * <code>CUSTOMER_DATA_POLICY_PROHIBITS_ENHANCEMENT = 23;</code>
     */
    CUSTOMER_DATA_POLICY_PROHIBITS_ENHANCEMENT(23),
    /**
     * <pre>
     * Adjustment for website conversion requires Order ID (ie, transaction ID).
     * Make sure your website tags capture Order IDs and you send the same Order
     * IDs with your adjustment.
     * </pre>
     *
     * <code>MISSING_ORDER_ID_FOR_WEBPAGE = 24;</code>
     */
    MISSING_ORDER_ID_FOR_WEBPAGE(24),
    /**
     * <pre>
     * Can't use adjustment with Order IDs containing personally-identifiable
     * information (PII).
     * </pre>
     *
     * <code>ORDER_ID_CONTAINS_PII = 25;</code>
     */
    ORDER_ID_CONTAINS_PII(25),
    /**
     * <pre>
     * The provided job id in the request is not within the allowed range. A job
     * ID must be a positive integer in the range [1, 2^31).
     * </pre>
     *
     * <code>INVALID_JOB_ID = 26;</code>
     */
    INVALID_JOB_ID(26),
    /**
     * <pre>
     * The conversion action specified in the adjustment request cannot be
     * found. Make sure it's available in this account.
     * </pre>
     *
     * <code>NO_CONVERSION_ACTION_FOUND = 27;</code>
     */
    NO_CONVERSION_ACTION_FOUND(27),
    /**
     * <pre>
     * The type of the conversion action specified in the adjustment request
     * isn't supported for uploading adjustments. A conversion adjustment of
     * type `RETRACTION` or `RESTATEMENT` is only permitted for conversion
     * actions of type `SALESFORCE`, `UPLOAD_CLICK` or `WEBPAGE`. A conversion
     * adjustment of type `ENHANCEMENT` is only permitted for conversion
     * actions of type `WEBPAGE`.
     * </pre>
     *
     * <code>INVALID_CONVERSION_ACTION_TYPE = 28;</code>
     */
    INVALID_CONVERSION_ACTION_TYPE(28),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Can't import events to a conversion action that was just created. Try
     * importing again in 6 hours.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION_ACTION = 2;</code>
     */
    public static final int TOO_RECENT_CONVERSION_ACTION_VALUE = 2;
    /**
     * <pre>
     * The conversion was already retracted. This adjustment was not processed.
     * </pre>
     *
     * <code>CONVERSION_ALREADY_RETRACTED = 4;</code>
     */
    public static final int CONVERSION_ALREADY_RETRACTED_VALUE = 4;
    /**
     * <pre>
     * The conversion for this conversion action and conversion identifier can't
     * be found. Make sure your conversion identifiers are associated with the
     * correct conversion action and try again.
     * </pre>
     *
     * <code>CONVERSION_NOT_FOUND = 5;</code>
     */
    public static final int CONVERSION_NOT_FOUND_VALUE = 5;
    /**
     * <pre>
     * Adjustment can't be made to a conversion that occurred more than 54 days
     * ago.
     * </pre>
     *
     * <code>CONVERSION_EXPIRED = 6;</code>
     */
    public static final int CONVERSION_EXPIRED_VALUE = 6;
    /**
     * <pre>
     * Adjustment has an `adjustment_date_time` that occurred before the
     * associated conversion. Make sure your `adjustment_date_time` is correct
     * and try again.
     * </pre>
     *
     * <code>ADJUSTMENT_PRECEDES_CONVERSION = 7;</code>
     */
    public static final int ADJUSTMENT_PRECEDES_CONVERSION_VALUE = 7;
    /**
     * <pre>
     * More recent adjustment `adjustment_date_time` has already been reported
     * for the associated conversion.  Make sure your adjustment
     * `adjustment_date_time` is correct and try again.
     * </pre>
     *
     * <code>MORE_RECENT_RESTATEMENT_FOUND = 8;</code>
     */
    public static final int MORE_RECENT_RESTATEMENT_FOUND_VALUE = 8;
    /**
     * <pre>
     * Adjustment can't be recorded because the conversion occurred too
     * recently. Try adjusting a conversion that occurred at least 24 hours ago.
     * </pre>
     *
     * <code>TOO_RECENT_CONVERSION = 9;</code>
     */
    public static final int TOO_RECENT_CONVERSION_VALUE = 9;
    /**
     * <pre>
     * Can't make an adjustment to a conversion that is set up to use the
     * default value. Check your conversion action value setting and try again.
     * </pre>
     *
     * <code>CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE = 10;</code>
     */
    public static final int CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE_VALUE = 10;
    /**
     * <pre>
     * Try uploading fewer than 2001 adjustments in a single API request.
     * </pre>
     *
     * <code>TOO_MANY_ADJUSTMENTS_IN_REQUEST = 11;</code>
     */
    public static final int TOO_MANY_ADJUSTMENTS_IN_REQUEST_VALUE = 11;
    /**
     * <pre>
     * The conversion has already been adjusted the maximum number of times.
     * Make sure you're only making necessary adjustment to existing conversion.
     * </pre>
     *
     * <code>TOO_MANY_ADJUSTMENTS = 12;</code>
     */
    public static final int TOO_MANY_ADJUSTMENTS_VALUE = 12;
    /**
     * <pre>
     * The conversion has prior a restatement with the same
     * `adjustment_date_time`. Make sure your adjustment has the correct and
     * unique `adjustment_date_time` and try again.
     * </pre>
     *
     * <code>RESTATEMENT_ALREADY_EXISTS = 13;</code>
     */
    public static final int RESTATEMENT_ALREADY_EXISTS_VALUE = 13;
    /**
     * <pre>
     * Imported adjustment has a duplicate conversion adjustment with same
     * `adjustment_date_time`. Make sure your adjustment has the correct
     * `adjustment_date_time` and try again.
     * </pre>
     *
     * <code>DUPLICATE_ADJUSTMENT_IN_REQUEST = 14;</code>
     */
    public static final int DUPLICATE_ADJUSTMENT_IN_REQUEST_VALUE = 14;
    /**
     * <pre>
     * Make sure you agree to the customer data processing terms in conversion
     * settings and try again.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TERMS = 15;</code>
     */
    public static final int CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TERMS_VALUE = 15;
    /**
     * <pre>
     * Can't use enhanced conversions with the specified conversion action.
     * </pre>
     *
     * <code>CONVERSION_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT = 16;</code>
     */
    public static final int CONVERSION_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT_VALUE = 16;
    /**
     * <pre>
     * Make sure you hash user provided data using SHA-256 and ensure you are
     * normalizing according to the guidelines.
     * </pre>
     *
     * <code>INVALID_USER_IDENTIFIER = 17;</code>
     */
    public static final int INVALID_USER_IDENTIFIER_VALUE = 17;
    /**
     * <pre>
     * Use user provided data such as emails or phone numbers hashed using
     * SHA-256 and try again.
     * </pre>
     *
     * <code>UNSUPPORTED_USER_IDENTIFIER = 18;</code>
     */
    public static final int UNSUPPORTED_USER_IDENTIFIER_VALUE = 18;
    /**
     * <pre>
     * Cannot set both gclid_date_time_pair and order_id. Use only 1 type and
     * try again.
     * </pre>
     *
     * <code>GCLID_DATE_TIME_PAIR_AND_ORDER_ID_BOTH_SET = 20;</code>
     */
    public static final int GCLID_DATE_TIME_PAIR_AND_ORDER_ID_BOTH_SET_VALUE = 20;
    /**
     * <pre>
     * Conversion already has enhancements with the same Order ID and conversion
     * action. Make sure your data is correctly configured and try again.
     * </pre>
     *
     * <code>CONVERSION_ALREADY_ENHANCED = 21;</code>
     */
    public static final int CONVERSION_ALREADY_ENHANCED_VALUE = 21;
    /**
     * <pre>
     * Multiple enhancements have the same conversion action and Order ID.  Make
     * sure your data is correctly configured and try again.
     * </pre>
     *
     * <code>DUPLICATE_ENHANCEMENT_IN_REQUEST = 22;</code>
     */
    public static final int DUPLICATE_ENHANCEMENT_IN_REQUEST_VALUE = 22;
    /**
     * <pre>
     * Enhanced conversions can't be used for this account because of Google
     * customer data policies. Contact your Google representative.
     * </pre>
     *
     * <code>CUSTOMER_DATA_POLICY_PROHIBITS_ENHANCEMENT = 23;</code>
     */
    public static final int CUSTOMER_DATA_POLICY_PROHIBITS_ENHANCEMENT_VALUE = 23;
    /**
     * <pre>
     * Adjustment for website conversion requires Order ID (ie, transaction ID).
     * Make sure your website tags capture Order IDs and you send the same Order
     * IDs with your adjustment.
     * </pre>
     *
     * <code>MISSING_ORDER_ID_FOR_WEBPAGE = 24;</code>
     */
    public static final int MISSING_ORDER_ID_FOR_WEBPAGE_VALUE = 24;
    /**
     * <pre>
     * Can't use adjustment with Order IDs containing personally-identifiable
     * information (PII).
     * </pre>
     *
     * <code>ORDER_ID_CONTAINS_PII = 25;</code>
     */
    public static final int ORDER_ID_CONTAINS_PII_VALUE = 25;
    /**
     * <pre>
     * The provided job id in the request is not within the allowed range. A job
     * ID must be a positive integer in the range [1, 2^31).
     * </pre>
     *
     * <code>INVALID_JOB_ID = 26;</code>
     */
    public static final int INVALID_JOB_ID_VALUE = 26;
    /**
     * <pre>
     * The conversion action specified in the adjustment request cannot be
     * found. Make sure it's available in this account.
     * </pre>
     *
     * <code>NO_CONVERSION_ACTION_FOUND = 27;</code>
     */
    public static final int NO_CONVERSION_ACTION_FOUND_VALUE = 27;
    /**
     * <pre>
     * The type of the conversion action specified in the adjustment request
     * isn't supported for uploading adjustments. A conversion adjustment of
     * type `RETRACTION` or `RESTATEMENT` is only permitted for conversion
     * actions of type `SALESFORCE`, `UPLOAD_CLICK` or `WEBPAGE`. A conversion
     * adjustment of type `ENHANCEMENT` is only permitted for conversion
     * actions of type `WEBPAGE`.
     * </pre>
     *
     * <code>INVALID_CONVERSION_ACTION_TYPE = 28;</code>
     */
    public static final int INVALID_CONVERSION_ACTION_TYPE_VALUE = 28;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConversionAdjustmentUploadError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionAdjustmentUploadError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return TOO_RECENT_CONVERSION_ACTION;
        case 4: return CONVERSION_ALREADY_RETRACTED;
        case 5: return CONVERSION_NOT_FOUND;
        case 6: return CONVERSION_EXPIRED;
        case 7: return ADJUSTMENT_PRECEDES_CONVERSION;
        case 8: return MORE_RECENT_RESTATEMENT_FOUND;
        case 9: return TOO_RECENT_CONVERSION;
        case 10: return CANNOT_RESTATE_CONVERSION_ACTION_THAT_ALWAYS_USES_DEFAULT_CONVERSION_VALUE;
        case 11: return TOO_MANY_ADJUSTMENTS_IN_REQUEST;
        case 12: return TOO_MANY_ADJUSTMENTS;
        case 13: return RESTATEMENT_ALREADY_EXISTS;
        case 14: return DUPLICATE_ADJUSTMENT_IN_REQUEST;
        case 15: return CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TERMS;
        case 16: return CONVERSION_ACTION_NOT_ELIGIBLE_FOR_ENHANCEMENT;
        case 17: return INVALID_USER_IDENTIFIER;
        case 18: return UNSUPPORTED_USER_IDENTIFIER;
        case 20: return GCLID_DATE_TIME_PAIR_AND_ORDER_ID_BOTH_SET;
        case 21: return CONVERSION_ALREADY_ENHANCED;
        case 22: return DUPLICATE_ENHANCEMENT_IN_REQUEST;
        case 23: return CUSTOMER_DATA_POLICY_PROHIBITS_ENHANCEMENT;
        case 24: return MISSING_ORDER_ID_FOR_WEBPAGE;
        case 25: return ORDER_ID_CONTAINS_PII;
        case 26: return INVALID_JOB_ID;
        case 27: return NO_CONVERSION_ACTION_FOUND;
        case 28: return INVALID_CONVERSION_ACTION_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionAdjustmentUploadError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionAdjustmentUploadError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionAdjustmentUploadError>() {
            public ConversionAdjustmentUploadError findValueByNumber(int number) {
              return ConversionAdjustmentUploadError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionAdjustmentUploadError[] VALUES = values();

    public static ConversionAdjustmentUploadError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ConversionAdjustmentUploadError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.ConversionAdjustmentUploadError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum other = (com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum prototype) {
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
   * Container for enum describing possible conversion adjustment upload errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)
      com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionAdjustmentUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionAdjustmentUploadErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.class, com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionAdjustmentUploadErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum build() {
      com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum result = new com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum)
  private static final com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionAdjustmentUploadErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionAdjustmentUploadErrorEnum>() {
    @java.lang.Override
    public ConversionAdjustmentUploadErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionAdjustmentUploadErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionAdjustmentUploadErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

