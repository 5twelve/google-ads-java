// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/campaign_error.proto

package com.google.ads.googleads.v10.errors;

public final class CampaignErrorProto {
  private CampaignErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_CampaignErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_CampaignErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v10/errors/campai" +
      "gn_error.proto\022\037google.ads.googleads.v10" +
      ".errors\032\034google/api/annotations.proto\"\317\017" +
      "\n\021CampaignErrorEnum\"\271\017\n\rCampaignError\022\017\n" +
      "\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035CANNOT_TA" +
      "RGET_CONTENT_NETWORK\020\003\022 \n\034CANNOT_TARGET_" +
      "SEARCH_NETWORK\020\004\0226\n2CANNOT_TARGET_SEARCH" +
      "_NETWORK_WITHOUT_GOOGLE_SEARCH\020\005\0220\n,CANN" +
      "OT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN" +
      "\020\006\022-\n)CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_" +
      "NETWORK\020\007\022(\n$CANNOT_TARGET_PARTNER_SEARC" +
      "H_NETWORK\020\010\022K\nGCANNOT_TARGET_CONTENT_NET" +
      "WORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_ST" +
      "RATEGY\020\t\0226\n2CAMPAIGN_DURATION_MUST_CONTA" +
      "IN_ALL_RUNNABLE_TRIALS\020\n\022$\n CANNOT_MODIF" +
      "Y_FOR_TRIAL_CAMPAIGN\020\013\022\033\n\027DUPLICATE_CAMP" +
      "AIGN_NAME\020\014\022\037\n\033INCOMPATIBLE_CAMPAIGN_FIE" +
      "LD\020\r\022\031\n\025INVALID_CAMPAIGN_NAME\020\016\022*\n&INVAL" +
      "ID_AD_SERVING_OPTIMIZATION_STATUS\020\017\022\030\n\024I" +
      "NVALID_TRACKING_URL\020\020\022>\n:CANNOT_SET_BOTH" +
      "_TRACKING_URL_TEMPLATE_AND_TRACKING_SETT" +
      "ING\020\021\022 \n\034MAX_IMPRESSIONS_NOT_IN_RANGE\020\022\022" +
      "\033\n\027TIME_UNIT_NOT_SUPPORTED\020\023\0221\n-INVALID_" +
      "OPERATION_IF_SERVING_STATUS_HAS_ENDED\020\024\022" +
      "\033\n\027BUDGET_CANNOT_BE_SHARED\020\025\022%\n!CAMPAIGN" +
      "_CANNOT_USE_SHARED_BUDGET\020\026\0220\n,CANNOT_CH" +
      "ANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS\020\027\022!\n" +
      "\035CAMPAIGN_LABEL_DOES_NOT_EXIST\020\030\022!\n\035CAMP" +
      "AIGN_LABEL_ALREADY_EXISTS\020\031\022\034\n\030MISSING_S" +
      "HOPPING_SETTING\020\032\022\"\n\036INVALID_SHOPPING_SA" +
      "LES_COUNTRY\020\033\022;\n7ADVERTISING_CHANNEL_TYP" +
      "E_NOT_AVAILABLE_FOR_ACCOUNT_TYPE\020\037\022(\n$IN" +
      "VALID_ADVERTISING_CHANNEL_SUB_TYPE\020 \022,\n(" +
      "AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED" +
      "\020!\022\037\n\033CANNOT_SET_AD_ROTATION_MODE\020\"\022/\n+C" +
      "ANNOT_MODIFY_START_DATE_IF_ALREADY_START" +
      "ED\020#\022\033\n\027CANNOT_SET_DATE_TO_PAST\020$\022\037\n\033MIS" +
      "SING_HOTEL_CUSTOMER_LINK\020%\022\037\n\033INVALID_HO" +
      "TEL_CUSTOMER_LINK\020&\022\031\n\025MISSING_HOTEL_SET" +
      "TING\020\'\022B\n>CANNOT_USE_SHARED_CAMPAIGN_BUD" +
      "GET_WHILE_PART_OF_CAMPAIGN_GROUP\020(\022\021\n\rAP" +
      "P_NOT_FOUND\020)\0229\n5SHOPPING_ENABLE_LOCAL_N" +
      "OT_SUPPORTED_FOR_CAMPAIGN_TYPE\020*\0223\n/MERC" +
      "HANT_NOT_ALLOWED_FOR_COMPARISON_LISTING_" +
      "ADS\020+\022#\n\037INSUFFICIENT_APP_INSTALLS_COUNT" +
      "\020,\022\032\n\026SENSITIVE_CATEGORY_APP\020-\022\032\n\026HEC_AG" +
      "REEMENT_REQUIRED\020.\022<\n8NOT_COMPATIBLE_WIT" +
      "H_VIEW_THROUGH_CONVERSION_OPTIMIZATION\0201" +
      "\022,\n(INVALID_EXCLUDED_PARENT_ASSET_FIELD_" +
      "TYPE\0200\022:\n6CANNOT_CREATE_APP_PRE_REGISTRA" +
      "TION_FOR_NON_ANDROID_APP\0202\022=\n9APP_NOT_AV" +
      "AILABLE_TO_CREATE_APP_PRE_REGISTRATION_C" +
      "AMPAIGN\0203\022\034\n\030INCOMPATIBLE_BUDGET_TYPE\0204B" +
      "\362\001\n#com.google.ads.googleads.v10.errorsB" +
      "\022CampaignErrorProtoP\001ZEgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v10/e" +
      "rrors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAd" +
      "s.V10.Errors\312\002\037Google\\Ads\\GoogleAds\\V10\\" +
      "Errors\352\002#Google::Ads::GoogleAds::V10::Er" +
      "rorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_CampaignErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_CampaignErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_CampaignErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
