// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/experiment_arm.proto

package com.google.ads.googleads.v10.resources;

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
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ExperimentArm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/exp" +
      "eriment_arm.proto\022\"google.ads.googleads." +
      "v10.resources\032\034google/api/annotations.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\277\003\n\rExperimentAr" +
      "m\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372A(\n&google" +
      "ads.googleapis.com/ExperimentArm\022:\n\005tria" +
      "l\030\002 \001(\tB+\340A\005\372A%\n#googleads.googleapis.co" +
      "m/Experiment\022\021\n\004name\030\003 \001(\tB\003\340A\002\022\017\n\007contr" +
      "ol\030\004 \001(\010\022\025\n\rtraffic_split\030\005 \001(\003\0229\n\tcampa" +
      "igns\030\006 \003(\tB&\372A#\n!googleads.googleapis.co" +
      "m/Campaign\022F\n\023in_design_campaigns\030\007 \003(\tB" +
      ")\340A\003\372A#\n!googleads.googleapis.com/Campai" +
      "gn:m\352Aj\n&googleads.googleapis.com/Experi" +
      "mentArm\022@customers/{customer_id}/experim" +
      "entArms/{trial_id}~{trial_arm_id}B\204\002\n&co" +
      "m.google.ads.googleads.v10.resourcesB\022Ex" +
      "perimentArmProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v10/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V10.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V10\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor,
        new java.lang.String[] { "ResourceName", "Trial", "Name", "Control", "TrafficSplit", "Campaigns", "InDesignCampaigns", });
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
