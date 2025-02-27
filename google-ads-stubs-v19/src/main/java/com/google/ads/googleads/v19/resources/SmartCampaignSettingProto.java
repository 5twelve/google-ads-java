// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/smart_campaign_setting.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class SmartCampaignSettingProto {
  private SmartCampaignSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_AdOptimizedBusinessProfileSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_AdOptimizedBusinessProfileSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v19/resources/sma" +
      "rt_campaign_setting.proto\022\"google.ads.go" +
      "ogleads.v19.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\330\006\n\024SmartCampaignSetting\022L\n\rresource_n" +
      "ame\030\001 \001(\tB5\340A\005\372A/\n-googleads.googleapis." +
      "com/SmartCampaignSetting\022;\n\010campaign\030\002 \001" +
      "(\tB)\340A\003\372A#\n!googleads.googleapis.com/Cam" +
      "paign\022Z\n\014phone_number\030\003 \001(\0132D.google.ads" +
      ".googleads.v19.resources.SmartCampaignSe" +
      "tting.PhoneNumber\022!\n\031advertising_languag" +
      "e_code\030\007 \001(\t\022\023\n\tfinal_url\030\010 \001(\tH\000\022\213\001\n%ad" +
      "_optimized_business_profile_setting\030\t \001(" +
      "\0132Z.google.ads.googleads.v19.resources.S" +
      "martCampaignSetting.AdOptimizedBusinessP" +
      "rofileSettingH\000\022\027\n\rbusiness_name\030\005 \001(\tH\001" +
      "\022#\n\031business_profile_location\030\n \001(\tH\001\032e\n" +
      "\013PhoneNumber\022\031\n\014phone_number\030\001 \001(\tH\000\210\001\001\022" +
      "\031\n\014country_code\030\002 \001(\tH\001\210\001\001B\017\n\r_phone_num" +
      "berB\017\n\r_country_code\032Y\n!AdOptimizedBusin" +
      "essProfileSetting\022\036\n\021include_lead_form\030\001" +
      " \001(\010H\000\210\001\001B\024\n\022_include_lead_form:o\352Al\n-go" +
      "ogleads.googleapis.com/SmartCampaignSett" +
      "ing\022;customers/{customer_id}/smartCampai" +
      "gnSettings/{campaign_id}B\016\n\014landing_page" +
      "B\022\n\020business_settingB\213\002\n&com.google.ads." +
      "googleads.v19.resourcesB\031SmartCampaignSe" +
      "ttingProtoP\001ZKgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v19/resources;" +
      "resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V" +
      "19.Resources\312\002\"Google\\Ads\\GoogleAds\\V19\\" +
      "Resources\352\002&Google::Ads::GoogleAds::V19:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "PhoneNumber", "AdvertisingLanguageCode", "FinalUrl", "AdOptimizedBusinessProfileSetting", "BusinessName", "BusinessProfileLocation", "LandingPage", "BusinessSetting", });
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_PhoneNumber_descriptor =
      internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_PhoneNumber_descriptor,
        new java.lang.String[] { "PhoneNumber", "CountryCode", });
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_AdOptimizedBusinessProfileSetting_descriptor =
      internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_AdOptimizedBusinessProfileSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_SmartCampaignSetting_AdOptimizedBusinessProfileSetting_descriptor,
        new java.lang.String[] { "IncludeLeadForm", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
