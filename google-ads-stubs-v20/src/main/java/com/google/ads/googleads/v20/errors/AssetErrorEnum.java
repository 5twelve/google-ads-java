// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/errors/asset_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.errors;

/**
 * <pre>
 * Container for enum describing possible asset errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.errors.AssetErrorEnum}
 */
public final class AssetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.errors.AssetErrorEnum)
    AssetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetErrorEnum.newBuilder() to construct.
  private AssetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.errors.AssetErrorProto.internal_static_google_ads_googleads_v20_errors_AssetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.errors.AssetErrorProto.internal_static_google_ads_googleads_v20_errors_AssetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.errors.AssetErrorEnum.class, com.google.ads.googleads.v20.errors.AssetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible asset errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v20.errors.AssetErrorEnum.AssetError}
   */
  public enum AssetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The customer is not is not on the allow-list for this asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE = 13;</code>
     */
    CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE(13),
    /**
     * <pre>
     * Assets are duplicated across operations.
     * </pre>
     *
     * <code>DUPLICATE_ASSET = 3;</code>
     */
    DUPLICATE_ASSET(3),
    /**
     * <pre>
     * The asset name is duplicated, either across operations or with an
     * existing asset.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_NAME = 4;</code>
     */
    DUPLICATE_ASSET_NAME(4),
    /**
     * <pre>
     * The Asset.asset_data oneof is empty.
     * </pre>
     *
     * <code>ASSET_DATA_IS_MISSING = 5;</code>
     */
    ASSET_DATA_IS_MISSING(5),
    /**
     * <pre>
     * The asset has a name which is different from an existing duplicate that
     * represents the same content.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_NAME = 6;</code>
     */
    CANNOT_MODIFY_ASSET_NAME(6),
    /**
     * <pre>
     * The field cannot be set for this asset type.
     * </pre>
     *
     * <code>FIELD_INCOMPATIBLE_WITH_ASSET_TYPE = 7;</code>
     */
    FIELD_INCOMPATIBLE_WITH_ASSET_TYPE(7),
    /**
     * <pre>
     * Call to action must come from the list of supported values.
     * </pre>
     *
     * <code>INVALID_CALL_TO_ACTION_TEXT = 8;</code>
     */
    INVALID_CALL_TO_ACTION_TEXT(8),
    /**
     * <pre>
     * A lead form asset is created with an invalid combination of input fields.
     * </pre>
     *
     * <code>LEAD_FORM_INVALID_FIELDS_COMBINATION = 9;</code>
     */
    LEAD_FORM_INVALID_FIELDS_COMBINATION(9),
    /**
     * <pre>
     * Lead forms require that the Terms of Service have been agreed to before
     * mutates can be executed.
     * </pre>
     *
     * <code>LEAD_FORM_MISSING_AGREEMENT = 10;</code>
     */
    LEAD_FORM_MISSING_AGREEMENT(10),
    /**
     * <pre>
     * Asset status is invalid in this operation.
     * </pre>
     *
     * <code>INVALID_ASSET_STATUS = 11;</code>
     */
    INVALID_ASSET_STATUS(11),
    /**
     * <pre>
     * The field cannot be modified by this asset type.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE = 12;</code>
     */
    FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE(12),
    /**
     * <pre>
     * Ad schedules for the same asset cannot overlap.
     * </pre>
     *
     * <code>SCHEDULES_CANNOT_OVERLAP = 14;</code>
     */
    SCHEDULES_CANNOT_OVERLAP(14),
    /**
     * <pre>
     * Cannot set both percent off and money amount off fields of promotion
     * asset.
     * </pre>
     *
     * <code>PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF = 15;</code>
     */
    PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF(15),
    /**
     * <pre>
     * Cannot set both promotion code and orders over amount fields of promotion
     * asset.
     * </pre>
     *
     * <code>PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT = 16;</code>
     */
    PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT(16),
    /**
     * <pre>
     * The field has too many decimal places specified.
     * </pre>
     *
     * <code>TOO_MANY_DECIMAL_PLACES_SPECIFIED = 17;</code>
     */
    TOO_MANY_DECIMAL_PLACES_SPECIFIED(17),
    /**
     * <pre>
     * Duplicate assets across operations, which have identical Asset.asset_data
     * oneof, cannot have different asset level fields for asset types which are
     * deduped.
     * </pre>
     *
     * <code>DUPLICATE_ASSETS_WITH_DIFFERENT_FIELD_VALUE = 18;</code>
     */
    DUPLICATE_ASSETS_WITH_DIFFERENT_FIELD_VALUE(18),
    /**
     * <pre>
     * Carrier specific short number is not allowed.
     * </pre>
     *
     * <code>CALL_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = 19;</code>
     */
    CALL_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED(19),
    /**
     * <pre>
     * Customer consent required for call recording Terms of Service.
     * </pre>
     *
     * <code>CALL_CUSTOMER_CONSENT_FOR_CALL_RECORDING_REQUIRED = 20;</code>
     */
    CALL_CUSTOMER_CONSENT_FOR_CALL_RECORDING_REQUIRED(20),
    /**
     * <pre>
     * The type of the specified phone number is not allowed.
     * </pre>
     *
     * <code>CALL_DISALLOWED_NUMBER_TYPE = 21;</code>
     */
    CALL_DISALLOWED_NUMBER_TYPE(21),
    /**
     * <pre>
     * If the default call_conversion_action is not used, the customer must have
     * a ConversionAction with the same id and the ConversionAction must be call
     * conversion type.
     * </pre>
     *
     * <code>CALL_INVALID_CONVERSION_ACTION = 22;</code>
     */
    CALL_INVALID_CONVERSION_ACTION(22),
    /**
     * <pre>
     * The country code of the phone number is invalid.
     * </pre>
     *
     * <code>CALL_INVALID_COUNTRY_CODE = 23;</code>
     */
    CALL_INVALID_COUNTRY_CODE(23),
    /**
     * <pre>
     * The format of the phone number is incorrect.
     * </pre>
     *
     * <code>CALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = 24;</code>
     */
    CALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT(24),
    /**
     * <pre>
     * The input phone number is not a valid phone number.
     * </pre>
     *
     * <code>CALL_INVALID_PHONE_NUMBER = 25;</code>
     */
    CALL_INVALID_PHONE_NUMBER(25),
    /**
     * <pre>
     * The phone number is not supported for country.
     * </pre>
     *
     * <code>CALL_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = 26;</code>
     */
    CALL_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY(26),
    /**
     * <pre>
     * Premium rate phone number is not allowed.
     * </pre>
     *
     * <code>CALL_PREMIUM_RATE_NUMBER_NOT_ALLOWED = 27;</code>
     */
    CALL_PREMIUM_RATE_NUMBER_NOT_ALLOWED(27),
    /**
     * <pre>
     * Vanity phone number is not allowed.
     * </pre>
     *
     * <code>CALL_VANITY_PHONE_NUMBER_NOT_ALLOWED = 28;</code>
     */
    CALL_VANITY_PHONE_NUMBER_NOT_ALLOWED(28),
    /**
     * <pre>
     * PriceOffering cannot have the same value for header and description.
     * </pre>
     *
     * <code>PRICE_HEADER_SAME_AS_DESCRIPTION = 29;</code>
     */
    PRICE_HEADER_SAME_AS_DESCRIPTION(29),
    /**
     * <pre>
     * AppId is invalid.
     * </pre>
     *
     * <code>MOBILE_APP_INVALID_APP_ID = 30;</code>
     */
    MOBILE_APP_INVALID_APP_ID(30),
    /**
     * <pre>
     * Invalid App download URL in final URLs.
     * </pre>
     *
     * <code>MOBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL = 31;</code>
     */
    MOBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL(31),
    /**
     * <pre>
     * Asset name is required for the asset type.
     * </pre>
     *
     * <code>NAME_REQUIRED_FOR_ASSET_TYPE = 32;</code>
     */
    NAME_REQUIRED_FOR_ASSET_TYPE(32),
    /**
     * <pre>
     * Legacy qualifying questions cannot be in the same Lead Form as
     * custom questions.
     * </pre>
     *
     * <code>LEAD_FORM_LEGACY_QUALIFYING_QUESTIONS_DISALLOWED = 33;</code>
     */
    LEAD_FORM_LEGACY_QUALIFYING_QUESTIONS_DISALLOWED(33),
    /**
     * <pre>
     * Unique name is required for this asset type.
     * </pre>
     *
     * <code>NAME_CONFLICT_FOR_ASSET_TYPE = 34;</code>
     */
    NAME_CONFLICT_FOR_ASSET_TYPE(34),
    /**
     * <pre>
     * Cannot modify asset source.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_SOURCE = 35;</code>
     */
    CANNOT_MODIFY_ASSET_SOURCE(35),
    /**
     * <pre>
     * User can not modify the automatically created asset.
     * </pre>
     *
     * <code>CANNOT_MODIFY_AUTOMATICALLY_CREATED_ASSET = 36;</code>
     */
    CANNOT_MODIFY_AUTOMATICALLY_CREATED_ASSET(36),
    /**
     * <pre>
     * Lead Form is disallowed to use "LOCATION" answer type.
     * </pre>
     *
     * <code>LEAD_FORM_LOCATION_ANSWER_TYPE_DISALLOWED = 37;</code>
     */
    LEAD_FORM_LOCATION_ANSWER_TYPE_DISALLOWED(37),
    /**
     * <pre>
     * Page Feed label text contains invalid characters.
     * </pre>
     *
     * <code>PAGE_FEED_INVALID_LABEL_TEXT = 38;</code>
     */
    PAGE_FEED_INVALID_LABEL_TEXT(38),
    /**
     * <pre>
     * The customer is not in the allow-list for whatsapp message asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_WHATSAPP_MESSAGE_ASSETS = 39;</code>
     */
    CUSTOMER_NOT_ON_ALLOWLIST_FOR_WHATSAPP_MESSAGE_ASSETS(39),
    /**
     * <pre>
     * Only customers on the allowlist can create AppDeepLinkAsset.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_APP_DEEP_LINK_ASSETS = 40;</code>
     */
    CUSTOMER_NOT_ON_ALLOWLIST_FOR_APP_DEEP_LINK_ASSETS(40),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The customer is not is not on the allow-list for this asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE = 13;</code>
     */
    public static final int CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE_VALUE = 13;
    /**
     * <pre>
     * Assets are duplicated across operations.
     * </pre>
     *
     * <code>DUPLICATE_ASSET = 3;</code>
     */
    public static final int DUPLICATE_ASSET_VALUE = 3;
    /**
     * <pre>
     * The asset name is duplicated, either across operations or with an
     * existing asset.
     * </pre>
     *
     * <code>DUPLICATE_ASSET_NAME = 4;</code>
     */
    public static final int DUPLICATE_ASSET_NAME_VALUE = 4;
    /**
     * <pre>
     * The Asset.asset_data oneof is empty.
     * </pre>
     *
     * <code>ASSET_DATA_IS_MISSING = 5;</code>
     */
    public static final int ASSET_DATA_IS_MISSING_VALUE = 5;
    /**
     * <pre>
     * The asset has a name which is different from an existing duplicate that
     * represents the same content.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_NAME = 6;</code>
     */
    public static final int CANNOT_MODIFY_ASSET_NAME_VALUE = 6;
    /**
     * <pre>
     * The field cannot be set for this asset type.
     * </pre>
     *
     * <code>FIELD_INCOMPATIBLE_WITH_ASSET_TYPE = 7;</code>
     */
    public static final int FIELD_INCOMPATIBLE_WITH_ASSET_TYPE_VALUE = 7;
    /**
     * <pre>
     * Call to action must come from the list of supported values.
     * </pre>
     *
     * <code>INVALID_CALL_TO_ACTION_TEXT = 8;</code>
     */
    public static final int INVALID_CALL_TO_ACTION_TEXT_VALUE = 8;
    /**
     * <pre>
     * A lead form asset is created with an invalid combination of input fields.
     * </pre>
     *
     * <code>LEAD_FORM_INVALID_FIELDS_COMBINATION = 9;</code>
     */
    public static final int LEAD_FORM_INVALID_FIELDS_COMBINATION_VALUE = 9;
    /**
     * <pre>
     * Lead forms require that the Terms of Service have been agreed to before
     * mutates can be executed.
     * </pre>
     *
     * <code>LEAD_FORM_MISSING_AGREEMENT = 10;</code>
     */
    public static final int LEAD_FORM_MISSING_AGREEMENT_VALUE = 10;
    /**
     * <pre>
     * Asset status is invalid in this operation.
     * </pre>
     *
     * <code>INVALID_ASSET_STATUS = 11;</code>
     */
    public static final int INVALID_ASSET_STATUS_VALUE = 11;
    /**
     * <pre>
     * The field cannot be modified by this asset type.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE = 12;</code>
     */
    public static final int FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE_VALUE = 12;
    /**
     * <pre>
     * Ad schedules for the same asset cannot overlap.
     * </pre>
     *
     * <code>SCHEDULES_CANNOT_OVERLAP = 14;</code>
     */
    public static final int SCHEDULES_CANNOT_OVERLAP_VALUE = 14;
    /**
     * <pre>
     * Cannot set both percent off and money amount off fields of promotion
     * asset.
     * </pre>
     *
     * <code>PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF = 15;</code>
     */
    public static final int PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF_VALUE = 15;
    /**
     * <pre>
     * Cannot set both promotion code and orders over amount fields of promotion
     * asset.
     * </pre>
     *
     * <code>PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT = 16;</code>
     */
    public static final int PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT_VALUE = 16;
    /**
     * <pre>
     * The field has too many decimal places specified.
     * </pre>
     *
     * <code>TOO_MANY_DECIMAL_PLACES_SPECIFIED = 17;</code>
     */
    public static final int TOO_MANY_DECIMAL_PLACES_SPECIFIED_VALUE = 17;
    /**
     * <pre>
     * Duplicate assets across operations, which have identical Asset.asset_data
     * oneof, cannot have different asset level fields for asset types which are
     * deduped.
     * </pre>
     *
     * <code>DUPLICATE_ASSETS_WITH_DIFFERENT_FIELD_VALUE = 18;</code>
     */
    public static final int DUPLICATE_ASSETS_WITH_DIFFERENT_FIELD_VALUE_VALUE = 18;
    /**
     * <pre>
     * Carrier specific short number is not allowed.
     * </pre>
     *
     * <code>CALL_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED = 19;</code>
     */
    public static final int CALL_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED_VALUE = 19;
    /**
     * <pre>
     * Customer consent required for call recording Terms of Service.
     * </pre>
     *
     * <code>CALL_CUSTOMER_CONSENT_FOR_CALL_RECORDING_REQUIRED = 20;</code>
     */
    public static final int CALL_CUSTOMER_CONSENT_FOR_CALL_RECORDING_REQUIRED_VALUE = 20;
    /**
     * <pre>
     * The type of the specified phone number is not allowed.
     * </pre>
     *
     * <code>CALL_DISALLOWED_NUMBER_TYPE = 21;</code>
     */
    public static final int CALL_DISALLOWED_NUMBER_TYPE_VALUE = 21;
    /**
     * <pre>
     * If the default call_conversion_action is not used, the customer must have
     * a ConversionAction with the same id and the ConversionAction must be call
     * conversion type.
     * </pre>
     *
     * <code>CALL_INVALID_CONVERSION_ACTION = 22;</code>
     */
    public static final int CALL_INVALID_CONVERSION_ACTION_VALUE = 22;
    /**
     * <pre>
     * The country code of the phone number is invalid.
     * </pre>
     *
     * <code>CALL_INVALID_COUNTRY_CODE = 23;</code>
     */
    public static final int CALL_INVALID_COUNTRY_CODE_VALUE = 23;
    /**
     * <pre>
     * The format of the phone number is incorrect.
     * </pre>
     *
     * <code>CALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT = 24;</code>
     */
    public static final int CALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT_VALUE = 24;
    /**
     * <pre>
     * The input phone number is not a valid phone number.
     * </pre>
     *
     * <code>CALL_INVALID_PHONE_NUMBER = 25;</code>
     */
    public static final int CALL_INVALID_PHONE_NUMBER_VALUE = 25;
    /**
     * <pre>
     * The phone number is not supported for country.
     * </pre>
     *
     * <code>CALL_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY = 26;</code>
     */
    public static final int CALL_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY_VALUE = 26;
    /**
     * <pre>
     * Premium rate phone number is not allowed.
     * </pre>
     *
     * <code>CALL_PREMIUM_RATE_NUMBER_NOT_ALLOWED = 27;</code>
     */
    public static final int CALL_PREMIUM_RATE_NUMBER_NOT_ALLOWED_VALUE = 27;
    /**
     * <pre>
     * Vanity phone number is not allowed.
     * </pre>
     *
     * <code>CALL_VANITY_PHONE_NUMBER_NOT_ALLOWED = 28;</code>
     */
    public static final int CALL_VANITY_PHONE_NUMBER_NOT_ALLOWED_VALUE = 28;
    /**
     * <pre>
     * PriceOffering cannot have the same value for header and description.
     * </pre>
     *
     * <code>PRICE_HEADER_SAME_AS_DESCRIPTION = 29;</code>
     */
    public static final int PRICE_HEADER_SAME_AS_DESCRIPTION_VALUE = 29;
    /**
     * <pre>
     * AppId is invalid.
     * </pre>
     *
     * <code>MOBILE_APP_INVALID_APP_ID = 30;</code>
     */
    public static final int MOBILE_APP_INVALID_APP_ID_VALUE = 30;
    /**
     * <pre>
     * Invalid App download URL in final URLs.
     * </pre>
     *
     * <code>MOBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL = 31;</code>
     */
    public static final int MOBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL_VALUE = 31;
    /**
     * <pre>
     * Asset name is required for the asset type.
     * </pre>
     *
     * <code>NAME_REQUIRED_FOR_ASSET_TYPE = 32;</code>
     */
    public static final int NAME_REQUIRED_FOR_ASSET_TYPE_VALUE = 32;
    /**
     * <pre>
     * Legacy qualifying questions cannot be in the same Lead Form as
     * custom questions.
     * </pre>
     *
     * <code>LEAD_FORM_LEGACY_QUALIFYING_QUESTIONS_DISALLOWED = 33;</code>
     */
    public static final int LEAD_FORM_LEGACY_QUALIFYING_QUESTIONS_DISALLOWED_VALUE = 33;
    /**
     * <pre>
     * Unique name is required for this asset type.
     * </pre>
     *
     * <code>NAME_CONFLICT_FOR_ASSET_TYPE = 34;</code>
     */
    public static final int NAME_CONFLICT_FOR_ASSET_TYPE_VALUE = 34;
    /**
     * <pre>
     * Cannot modify asset source.
     * </pre>
     *
     * <code>CANNOT_MODIFY_ASSET_SOURCE = 35;</code>
     */
    public static final int CANNOT_MODIFY_ASSET_SOURCE_VALUE = 35;
    /**
     * <pre>
     * User can not modify the automatically created asset.
     * </pre>
     *
     * <code>CANNOT_MODIFY_AUTOMATICALLY_CREATED_ASSET = 36;</code>
     */
    public static final int CANNOT_MODIFY_AUTOMATICALLY_CREATED_ASSET_VALUE = 36;
    /**
     * <pre>
     * Lead Form is disallowed to use "LOCATION" answer type.
     * </pre>
     *
     * <code>LEAD_FORM_LOCATION_ANSWER_TYPE_DISALLOWED = 37;</code>
     */
    public static final int LEAD_FORM_LOCATION_ANSWER_TYPE_DISALLOWED_VALUE = 37;
    /**
     * <pre>
     * Page Feed label text contains invalid characters.
     * </pre>
     *
     * <code>PAGE_FEED_INVALID_LABEL_TEXT = 38;</code>
     */
    public static final int PAGE_FEED_INVALID_LABEL_TEXT_VALUE = 38;
    /**
     * <pre>
     * The customer is not in the allow-list for whatsapp message asset type.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_WHATSAPP_MESSAGE_ASSETS = 39;</code>
     */
    public static final int CUSTOMER_NOT_ON_ALLOWLIST_FOR_WHATSAPP_MESSAGE_ASSETS_VALUE = 39;
    /**
     * <pre>
     * Only customers on the allowlist can create AppDeepLinkAsset.
     * </pre>
     *
     * <code>CUSTOMER_NOT_ON_ALLOWLIST_FOR_APP_DEEP_LINK_ASSETS = 40;</code>
     */
    public static final int CUSTOMER_NOT_ON_ALLOWLIST_FOR_APP_DEEP_LINK_ASSETS_VALUE = 40;


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
    public static AssetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 13: return CUSTOMER_NOT_ON_ALLOWLIST_FOR_ASSET_TYPE;
        case 3: return DUPLICATE_ASSET;
        case 4: return DUPLICATE_ASSET_NAME;
        case 5: return ASSET_DATA_IS_MISSING;
        case 6: return CANNOT_MODIFY_ASSET_NAME;
        case 7: return FIELD_INCOMPATIBLE_WITH_ASSET_TYPE;
        case 8: return INVALID_CALL_TO_ACTION_TEXT;
        case 9: return LEAD_FORM_INVALID_FIELDS_COMBINATION;
        case 10: return LEAD_FORM_MISSING_AGREEMENT;
        case 11: return INVALID_ASSET_STATUS;
        case 12: return FIELD_CANNOT_BE_MODIFIED_FOR_ASSET_TYPE;
        case 14: return SCHEDULES_CANNOT_OVERLAP;
        case 15: return PROMOTION_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT_OFF;
        case 16: return PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVER_AMOUNT;
        case 17: return TOO_MANY_DECIMAL_PLACES_SPECIFIED;
        case 18: return DUPLICATE_ASSETS_WITH_DIFFERENT_FIELD_VALUE;
        case 19: return CALL_CARRIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED;
        case 20: return CALL_CUSTOMER_CONSENT_FOR_CALL_RECORDING_REQUIRED;
        case 21: return CALL_DISALLOWED_NUMBER_TYPE;
        case 22: return CALL_INVALID_CONVERSION_ACTION;
        case 23: return CALL_INVALID_COUNTRY_CODE;
        case 24: return CALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT;
        case 25: return CALL_INVALID_PHONE_NUMBER;
        case 26: return CALL_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY;
        case 27: return CALL_PREMIUM_RATE_NUMBER_NOT_ALLOWED;
        case 28: return CALL_VANITY_PHONE_NUMBER_NOT_ALLOWED;
        case 29: return PRICE_HEADER_SAME_AS_DESCRIPTION;
        case 30: return MOBILE_APP_INVALID_APP_ID;
        case 31: return MOBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWNLOAD_URL;
        case 32: return NAME_REQUIRED_FOR_ASSET_TYPE;
        case 33: return LEAD_FORM_LEGACY_QUALIFYING_QUESTIONS_DISALLOWED;
        case 34: return NAME_CONFLICT_FOR_ASSET_TYPE;
        case 35: return CANNOT_MODIFY_ASSET_SOURCE;
        case 36: return CANNOT_MODIFY_AUTOMATICALLY_CREATED_ASSET;
        case 37: return LEAD_FORM_LOCATION_ANSWER_TYPE_DISALLOWED;
        case 38: return PAGE_FEED_INVALID_LABEL_TEXT;
        case 39: return CUSTOMER_NOT_ON_ALLOWLIST_FOR_WHATSAPP_MESSAGE_ASSETS;
        case 40: return CUSTOMER_NOT_ON_ALLOWLIST_FOR_APP_DEEP_LINK_ASSETS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetError>() {
            public AssetError findValueByNumber(int number) {
              return AssetError.forNumber(number);
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
      return com.google.ads.googleads.v20.errors.AssetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetError[] VALUES = values();

    public static AssetError valueOf(
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

    private AssetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v20.errors.AssetErrorEnum.AssetError)
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
    if (!(obj instanceof com.google.ads.googleads.v20.errors.AssetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.errors.AssetErrorEnum other = (com.google.ads.googleads.v20.errors.AssetErrorEnum) obj;

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

  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.errors.AssetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.errors.AssetErrorEnum prototype) {
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
   * Container for enum describing possible asset errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.errors.AssetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.errors.AssetErrorEnum)
      com.google.ads.googleads.v20.errors.AssetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.errors.AssetErrorProto.internal_static_google_ads_googleads_v20_errors_AssetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.errors.AssetErrorProto.internal_static_google_ads_googleads_v20_errors_AssetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.errors.AssetErrorEnum.class, com.google.ads.googleads.v20.errors.AssetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.errors.AssetErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v20.errors.AssetErrorProto.internal_static_google_ads_googleads_v20_errors_AssetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.AssetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.errors.AssetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.AssetErrorEnum build() {
      com.google.ads.googleads.v20.errors.AssetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.errors.AssetErrorEnum buildPartial() {
      com.google.ads.googleads.v20.errors.AssetErrorEnum result = new com.google.ads.googleads.v20.errors.AssetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v20.errors.AssetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v20.errors.AssetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.errors.AssetErrorEnum other) {
      if (other == com.google.ads.googleads.v20.errors.AssetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.errors.AssetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.errors.AssetErrorEnum)
  private static final com.google.ads.googleads.v20.errors.AssetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.errors.AssetErrorEnum();
  }

  public static com.google.ads.googleads.v20.errors.AssetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetErrorEnum>() {
    @java.lang.Override
    public AssetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.errors.AssetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

