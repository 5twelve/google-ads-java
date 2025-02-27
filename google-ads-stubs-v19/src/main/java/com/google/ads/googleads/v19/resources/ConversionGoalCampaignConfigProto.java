// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/conversion_goal_campaign_config.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class ConversionGoalCampaignConfigProto {
  private ConversionGoalCampaignConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_ConversionGoalCampaignConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_ConversionGoalCampaignConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v19/resources/con" +
      "version_goal_campaign_config.proto\022\"goog" +
      "le.ads.googleads.v19.resources\0326google/a" +
      "ds/googleads/v19/enums/goal_config_level" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\346\003\n\034Conversio" +
      "nGoalCampaignConfig\022T\n\rresource_name\030\001 \001" +
      "(\tB=\340A\005\372A7\n5googleads.googleapis.com/Con" +
      "versionGoalCampaignConfig\022;\n\010campaign\030\002 " +
      "\001(\tB)\340A\005\372A#\n!googleads.googleapis.com/Ca" +
      "mpaign\022^\n\021goal_config_level\030\003 \001(\0162C.goog" +
      "le.ads.googleads.v19.enums.GoalConfigLev" +
      "elEnum.GoalConfigLevel\022R\n\026custom_convers" +
      "ion_goal\030\004 \001(\tB2\372A/\n-googleads.googleapi" +
      "s.com/CustomConversionGoal:\177\352A|\n5googlea" +
      "ds.googleapis.com/ConversionGoalCampaign" +
      "Config\022Ccustomers/{customer_id}/conversi" +
      "onGoalCampaignConfigs/{campaign_id}B\223\002\n&" +
      "com.google.ads.googleads.v19.resourcesB!" +
      "ConversionGoalCampaignConfigProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v19/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V19.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V19\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V19::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.GoalConfigLevelProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_ConversionGoalCampaignConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_ConversionGoalCampaignConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_ConversionGoalCampaignConfig_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "GoalConfigLevel", "CustomConversionGoal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.GoalConfigLevelProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
