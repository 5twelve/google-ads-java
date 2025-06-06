// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/criterion_category_availability.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public final class CriterionCategoryAvailabilityProto {
  private CriterionCategoryAvailabilityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_CriterionCategoryAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_CriterionCategoryAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_CriterionCategoryChannelAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_CriterionCategoryChannelAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_CriterionCategoryLocaleAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_CriterionCategoryLocaleAvailability_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v19/common/criter" +
      "ion_category_availability.proto\022\037google." +
      "ads.googleads.v19.common\032Agoogle/ads/goo" +
      "gleads/v19/enums/advertising_channel_sub" +
      "_type.proto\032=google/ads/googleads/v19/en" +
      "ums/advertising_channel_type.proto\032Qgoog" +
      "le/ads/googleads/v19/enums/criterion_cat" +
      "egory_channel_availability_mode.proto\032Pg" +
      "oogle/ads/googleads/v19/enums/criterion_" +
      "category_locale_availability_mode.proto\"" +
      "\315\001\n\035CriterionCategoryAvailability\022V\n\007cha" +
      "nnel\030\001 \001(\0132E.google.ads.googleads.v19.co" +
      "mmon.CriterionCategoryChannelAvailabilit" +
      "y\022T\n\006locale\030\002 \003(\0132D.google.ads.googleads" +
      ".v19.common.CriterionCategoryLocaleAvail" +
      "ability\"\201\004\n$CriterionCategoryChannelAvai" +
      "lability\022\220\001\n\021availability_mode\030\001 \001(\0162u.g" +
      "oogle.ads.googleads.v19.enums.CriterionC" +
      "ategoryChannelAvailabilityModeEnum.Crite" +
      "rionCategoryChannelAvailabilityMode\022s\n\030a" +
      "dvertising_channel_type\030\002 \001(\0162Q.google.a" +
      "ds.googleads.v19.enums.AdvertisingChanne" +
      "lTypeEnum.AdvertisingChannelType\022}\n\034adve" +
      "rtising_channel_sub_type\030\003 \003(\0162W.google." +
      "ads.googleads.v19.enums.AdvertisingChann" +
      "elSubTypeEnum.AdvertisingChannelSubType\022" +
      "-\n include_default_channel_sub_type\030\005 \001(" +
      "\010H\000\210\001\001B#\n!_include_default_channel_sub_t" +
      "ype\"\220\002\n#CriterionCategoryLocaleAvailabil" +
      "ity\022\216\001\n\021availability_mode\030\001 \001(\0162s.google" +
      ".ads.googleads.v19.enums.CriterionCatego" +
      "ryLocaleAvailabilityModeEnum.CriterionCa" +
      "tegoryLocaleAvailabilityMode\022\031\n\014country_" +
      "code\030\004 \001(\tH\000\210\001\001\022\032\n\rlanguage_code\030\005 \001(\tH\001" +
      "\210\001\001B\017\n\r_country_codeB\020\n\016_language_codeB\202" +
      "\002\n#com.google.ads.googleads.v19.commonB\"" +
      "CriterionCategoryAvailabilityProtoP\001ZEgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v19/common;common\242\002\003GAA\252\002\037Goog" +
      "le.Ads.GoogleAds.V19.Common\312\002\037Google\\Ads" +
      "\\GoogleAds\\V19\\Common\352\002#Google::Ads::Goo" +
      "gleAds::V19::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_common_CriterionCategoryAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_common_CriterionCategoryAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_CriterionCategoryAvailability_descriptor,
        new java.lang.String[] { "Channel", "Locale", });
    internal_static_google_ads_googleads_v19_common_CriterionCategoryChannelAvailability_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_common_CriterionCategoryChannelAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_CriterionCategoryChannelAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "AdvertisingChannelType", "AdvertisingChannelSubType", "IncludeDefaultChannelSubType", });
    internal_static_google_ads_googleads_v19_common_CriterionCategoryLocaleAvailability_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_common_CriterionCategoryLocaleAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_CriterionCategoryLocaleAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "CountryCode", "LanguageCode", });
    com.google.ads.googleads.v19.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
