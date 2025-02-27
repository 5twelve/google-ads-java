// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/keyword_plan_campaign.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class KeywordPlanCampaignProto {
  private KeywordPlanCampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_KeywordPlanCampaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_KeywordPlanCampaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_KeywordPlanGeoTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_KeywordPlanGeoTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v19/resources/key" +
      "word_plan_campaign.proto\022\"google.ads.goo" +
      "gleads.v19.resources\0329google/ads/googlea" +
      "ds/v19/enums/keyword_plan_network.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\"\242\005\n\023KeywordPlanCampa" +
      "ign\022K\n\rresource_name\030\001 \001(\tB4\340A\005\372A.\n,goog" +
      "leads.googleapis.com/KeywordPlanCampaign" +
      "\022D\n\014keyword_plan\030\t \001(\tB)\372A&\n$googleads.g" +
      "oogleapis.com/KeywordPlanH\000\210\001\001\022\024\n\002id\030\n \001" +
      "(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\013 \001(\tH\002\210\001\001\022J\n\022langu" +
      "age_constants\030\014 \003(\tB.\372A+\n)googleads.goog" +
      "leapis.com/LanguageConstant\022g\n\024keyword_p" +
      "lan_network\030\006 \001(\0162I.google.ads.googleads" +
      ".v19.enums.KeywordPlanNetworkEnum.Keywor" +
      "dPlanNetwork\022\033\n\016cpc_bid_micros\030\r \001(\003H\003\210\001" +
      "\001\022M\n\013geo_targets\030\010 \003(\01328.google.ads.goog" +
      "leads.v19.resources.KeywordPlanGeoTarget" +
      ":z\352Aw\n,googleads.googleapis.com/KeywordP" +
      "lanCampaign\022Gcustomers/{customer_id}/key" +
      "wordPlanCampaigns/{keyword_plan_campaign" +
      "_id}B\017\n\r_keyword_planB\005\n\003_idB\007\n\005_nameB\021\n" +
      "\017_cpc_bid_micros\"\201\001\n\024KeywordPlanGeoTarge" +
      "t\022Q\n\023geo_target_constant\030\002 \001(\tB/\372A,\n*goo" +
      "gleads.googleapis.com/GeoTargetConstantH" +
      "\000\210\001\001B\026\n\024_geo_target_constantB\212\002\n&com.goo" +
      "gle.ads.googleads.v19.resourcesB\030Keyword" +
      "PlanCampaignProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v19/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V19.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V19\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_KeywordPlanCampaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_KeywordPlanCampaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_KeywordPlanCampaign_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlan", "Id", "Name", "LanguageConstants", "KeywordPlanNetwork", "CpcBidMicros", "GeoTargets", });
    internal_static_google_ads_googleads_v19_resources_KeywordPlanGeoTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_resources_KeywordPlanGeoTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_KeywordPlanGeoTarget_descriptor,
        new java.lang.String[] { "GeoTargetConstant", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
