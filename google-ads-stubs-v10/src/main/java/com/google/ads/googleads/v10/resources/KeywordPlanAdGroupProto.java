// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v10.resources;

public final class KeywordPlanAdGroupProto {
  private KeywordPlanAdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_KeywordPlanAdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_KeywordPlanAdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v10/resources/key" +
      "word_plan_ad_group.proto\022\"google.ads.goo" +
      "gleads.v10.resources\032\034google/api/annotat" +
      "ions.proto\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\"\264\003\n\022Keywo" +
      "rdPlanAdGroup\022J\n\rresource_name\030\001 \001(\tB3\340A" +
      "\005\372A-\n+googleads.googleapis.com/KeywordPl" +
      "anAdGroup\022U\n\025keyword_plan_campaign\030\006 \001(\t" +
      "B1\372A.\n,googleads.googleapis.com/KeywordP" +
      "lanCampaignH\000\210\001\001\022\024\n\002id\030\007 \001(\003B\003\340A\003H\001\210\001\001\022\021" +
      "\n\004name\030\010 \001(\tH\002\210\001\001\022\033\n\016cpc_bid_micros\030\t \001(" +
      "\003H\003\210\001\001:x\352Au\n+googleads.googleapis.com/Ke" +
      "ywordPlanAdGroup\022Fcustomers/{customer_id" +
      "}/keywordPlanAdGroups/{keyword_plan_ad_g" +
      "roup_id}B\030\n\026_keyword_plan_campaignB\005\n\003_i" +
      "dB\007\n\005_nameB\021\n\017_cpc_bid_microsB\211\002\n&com.go" +
      "ogle.ads.googleads.v10.resourcesB\027Keywor" +
      "dPlanAdGroupProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v10/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V10.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V10\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_KeywordPlanAdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_KeywordPlanAdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_KeywordPlanAdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "KeywordPlanCampaign", "Id", "Name", "CpcBidMicros", "KeywordPlanCampaign", "Id", "Name", "CpcBidMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
