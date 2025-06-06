// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/experiment_arm.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class ExperimentArmProto {
  private ExperimentArmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_ExperimentArm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_ExperimentArm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v19/resources/exp" +
      "eriment_arm.proto\022\"google.ads.googleads." +
      "v19.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\304\003\n\rEx" +
      "perimentArm\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372" +
      "A(\n&googleads.googleapis.com/ExperimentA" +
      "rm\022?\n\nexperiment\030\010 \001(\tB+\340A\005\372A%\n#googlead" +
      "s.googleapis.com/Experiment\022\021\n\004name\030\003 \001(" +
      "\tB\003\340A\002\022\017\n\007control\030\004 \001(\010\022\025\n\rtraffic_split" +
      "\030\005 \001(\003\0229\n\tcampaigns\030\006 \003(\tB&\372A#\n!googlead" +
      "s.googleapis.com/Campaign\022F\n\023in_design_c" +
      "ampaigns\030\007 \003(\tB)\340A\003\372A#\n!googleads.google" +
      "apis.com/Campaign:m\352Aj\n&googleads.google" +
      "apis.com/ExperimentArm\022@customers/{custo" +
      "mer_id}/experimentArms/{trial_id}~{trial" +
      "_arm_id}B\204\002\n&com.google.ads.googleads.v1" +
      "9.resourcesB\022ExperimentArmProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v19/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V19.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V19\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_ExperimentArm_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_ExperimentArm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_ExperimentArm_descriptor,
        new java.lang.String[] { "ResourceName", "Experiment", "Name", "Control", "TrafficSplit", "Campaigns", "InDesignCampaigns", });
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
