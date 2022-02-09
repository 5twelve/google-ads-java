// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_simulation.proto

package com.google.ads.googleads.v10.resources;

public final class CampaignSimulationProto {
  private CampaignSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CampaignSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CampaignSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v10/resources/cam" +
      "paign_simulation.proto\022\"google.ads.googl" +
      "eads.v10.resources\0320google/ads/googleads" +
      "/v10/common/simulation.proto\032Cgoogle/ads" +
      "/googleads/v10/enums/simulation_modifica" +
      "tion_method.proto\0324google/ads/googleads/" +
      "v10/enums/simulation_type.proto\032\034google/" +
      "api/annotations.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\272\010\n\022CampaignSimulation\022J\n\rresource_nam" +
      "e\030\001 \001(\tB3\340A\003\372A-\n+googleads.googleapis.co" +
      "m/CampaignSimulation\022\030\n\013campaign_id\030\002 \001(" +
      "\003B\003\340A\003\022T\n\004type\030\003 \001(\0162A.google.ads.google" +
      "ads.v10.enums.SimulationTypeEnum.Simulat" +
      "ionTypeB\003\340A\003\022\177\n\023modification_method\030\004 \001(" +
      "\0162].google.ads.googleads.v10.enums.Simul" +
      "ationModificationMethodEnum.SimulationMo" +
      "dificationMethodB\003\340A\003\022\027\n\nstart_date\030\005 \001(" +
      "\tB\003\340A\003\022\025\n\010end_date\030\006 \001(\tB\003\340A\003\022]\n\022cpc_bid" +
      "_point_list\030\007 \001(\0132:.google.ads.googleads" +
      ".v10.common.CpcBidSimulationPointListB\003\340" +
      "A\003H\000\022c\n\025target_cpa_point_list\030\010 \001(\0132=.go" +
      "ogle.ads.googleads.v10.common.TargetCpaS" +
      "imulationPointListB\003\340A\003H\000\022e\n\026target_roas" +
      "_point_list\030\t \001(\0132>.google.ads.googleads" +
      ".v10.common.TargetRoasSimulationPointLis" +
      "tB\003\340A\003H\000\022|\n\"target_impression_share_poin" +
      "t_list\030\n \001(\0132I.google.ads.googleads.v10." +
      "common.TargetImpressionShareSimulationPo" +
      "intListB\003\340A\003H\000\022\\\n\021budget_point_list\030\013 \001(" +
      "\0132:.google.ads.googleads.v10.common.Budg" +
      "etSimulationPointListB\003\340A\003H\000:\241\001\352A\235\001\n+goo" +
      "gleads.googleapis.com/CampaignSimulation" +
      "\022ncustomers/{customer_id}/campaignSimula" +
      "tions/{campaign_id}~{type}~{modification" +
      "_method}~{start_date}~{end_date}B\014\n\npoin" +
      "t_listB\211\002\n&com.google.ads.googleads.v10." +
      "resourcesB\027CampaignSimulationProtoP\001ZKgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v10/resources;resources\242\002\003GAA\252" +
      "\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"G" +
      "oogle\\Ads\\GoogleAds\\V10\\Resources\352\002&Goog" +
      "le::Ads::GoogleAds::V10::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CampaignSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CampaignSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CampaignSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "Type", "ModificationMethod", "StartDate", "EndDate", "CpcBidPointList", "TargetCpaPointList", "TargetRoasPointList", "TargetImpressionSharePointList", "BudgetPointList", "PointList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SimulationTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
