// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/travel_activity_group_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public final class TravelActivityGroupViewProto {
  private TravelActivityGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_resources_TravelActivityGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_resources_TravelActivityGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v20/resources/tra" +
      "vel_activity_group_view.proto\022\"google.ad" +
      "s.googleads.v20.resources\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\"\362\001\n\027TravelActivityGroupView\022O\n\rres" +
      "ource_name\030\001 \001(\tB8\340A\003\372A2\n0googleads.goog" +
      "leapis.com/TravelActivityGroupView:\205\001\352A\201" +
      "\001\n0googleads.googleapis.com/TravelActivi" +
      "tyGroupView\022Mcustomers/{customer_id}/tra" +
      "velActivityGroupViews/{ad_group_id}~{cri" +
      "terion_id}B\216\002\n&com.google.ads.googleads." +
      "v20.resourcesB\034TravelActivityGroupViewPr" +
      "otoP\001ZKgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v20/resources;resourc" +
      "es\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V20.Reso" +
      "urces\312\002\"Google\\Ads\\GoogleAds\\V20\\Resourc" +
      "es\352\002&Google::Ads::GoogleAds::V20::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v20_resources_TravelActivityGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v20_resources_TravelActivityGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_resources_TravelActivityGroupView_descriptor,
        new java.lang.String[] { "ResourceName", });
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
