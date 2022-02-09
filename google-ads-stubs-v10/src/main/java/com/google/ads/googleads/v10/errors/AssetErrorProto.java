// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/asset_error.proto

package com.google.ads.googleads.v10.errors;

public final class AssetErrorProto {
  private AssetErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_AssetErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_AssetErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v10/errors/asset_" +
      "error.proto\022\037google.ads.googleads.v10.er" +
      "rors\032\034google/api/annotations.proto\"\337\t\n\016A" +
      "ssetErrorEnum\"\314\t\n\nAssetError\022\017\n\013UNSPECIF" +
      "IED\020\000\022\013\n\007UNKNOWN\020\001\022,\n(CUSTOMER_NOT_ON_AL" +
      "LOWLIST_FOR_ASSET_TYPE\020\r\022\023\n\017DUPLICATE_AS" +
      "SET\020\003\022\030\n\024DUPLICATE_ASSET_NAME\020\004\022\031\n\025ASSET" +
      "_DATA_IS_MISSING\020\005\022\034\n\030CANNOT_MODIFY_ASSE" +
      "T_NAME\020\006\022&\n\"FIELD_INCOMPATIBLE_WITH_ASSE" +
      "T_TYPE\020\007\022\037\n\033INVALID_CALL_TO_ACTION_TEXT\020" +
      "\010\022(\n$LEAD_FORM_INVALID_FIELDS_COMBINATIO" +
      "N\020\t\022\037\n\033LEAD_FORM_MISSING_AGREEMENT\020\n\022\030\n\024" +
      "INVALID_ASSET_STATUS\020\013\022+\n\'FIELD_CANNOT_B" +
      "E_MODIFIED_FOR_ASSET_TYPE\020\014\022\034\n\030SCHEDULES" +
      "_CANNOT_OVERLAP\020\016\0229\n5PROMOTION_CANNOT_SE" +
      "T_PERCENT_OFF_AND_MONEY_AMOUNT_OFF\020\017\022>\n:" +
      "PROMOTION_CANNOT_SET_PROMOTION_CODE_AND_" +
      "ORDERS_OVER_AMOUNT\020\020\022%\n!TOO_MANY_DECIMAL" +
      "_PLACES_SPECIFIED\020\021\022/\n+DUPLICATE_ASSETS_" +
      "WITH_DIFFERENT_FIELD_VALUE\020\022\0222\n.CALL_CAR" +
      "RIER_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED\020\023" +
      "\0225\n1CALL_CUSTOMER_CONSENT_FOR_CALL_RECOR" +
      "DING_REQUIRED\020\024\022\037\n\033CALL_DISALLOWED_NUMBE" +
      "R_TYPE\020\025\022\"\n\036CALL_INVALID_CONVERSION_ACTI" +
      "ON\020\026\022\035\n\031CALL_INVALID_COUNTRY_CODE\020\027\022-\n)C" +
      "ALL_INVALID_DOMESTIC_PHONE_NUMBER_FORMAT" +
      "\020\030\022\035\n\031CALL_INVALID_PHONE_NUMBER\020\031\022/\n+CAL" +
      "L_PHONE_NUMBER_NOT_SUPPORTED_FOR_COUNTRY" +
      "\020\032\022(\n$CALL_PREMIUM_RATE_NUMBER_NOT_ALLOW" +
      "ED\020\033\022(\n$CALL_VANITY_PHONE_NUMBER_NOT_ALL" +
      "OWED\020\034\022$\n PRICE_HEADER_SAME_AS_DESCRIPTI" +
      "ON\020\035\022\035\n\031MOBILE_APP_INVALID_APP_ID\020\036\0225\n1M" +
      "OBILE_APP_INVALID_FINAL_URL_FOR_APP_DOWN" +
      "LOAD_URL\020\037\022 \n\034NAME_REQUIRED_FOR_ASSET_TY" +
      "PE\020 B\357\001\n#com.google.ads.googleads.v10.er" +
      "rorsB\017AssetErrorProtoP\001ZEgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v10" +
      "/errors;errors\242\002\003GAA\252\002\037Google.Ads.Google" +
      "Ads.V10.Errors\312\002\037Google\\Ads\\GoogleAds\\V1" +
      "0\\Errors\352\002#Google::Ads::GoogleAds::V10::" +
      "Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_AssetErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_AssetErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_AssetErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
