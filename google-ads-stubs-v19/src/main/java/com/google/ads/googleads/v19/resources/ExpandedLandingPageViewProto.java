// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/expanded_landing_page_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class ExpandedLandingPageViewProto {
  private ExpandedLandingPageViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_ExpandedLandingPageView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_ExpandedLandingPageView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v19/resources/exp" +
      "anded_landing_page_view.proto\022\"google.ad" +
      "s.googleads.v19.resources\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\"\263\002\n\027ExpandedLandingPageView\022O\n\rres" +
      "ource_name\030\001 \001(\tB8\340A\003\372A2\n0googleads.goog" +
      "leapis.com/ExpandedLandingPageView\022$\n\022ex" +
      "panded_final_url\030\003 \001(\tB\003\340A\003H\000\210\001\001:\211\001\352A\205\001\n" +
      "0googleads.googleapis.com/ExpandedLandin" +
      "gPageView\022Qcustomers/{customer_id}/expan" +
      "dedLandingPageViews/{expanded_final_url_" +
      "fingerprint}B\025\n\023_expanded_final_urlB\216\002\n&" +
      "com.google.ads.googleads.v19.resourcesB\034" +
      "ExpandedLandingPageViewProtoP\001ZKgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v19/resources;resources\242\002\003GAA\252\002\"Goog" +
      "le.Ads.GoogleAds.V19.Resources\312\002\"Google\\" +
      "Ads\\GoogleAds\\V19\\Resources\352\002&Google::Ad" +
      "s::GoogleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_ExpandedLandingPageView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_ExpandedLandingPageView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_ExpandedLandingPageView_descriptor,
        new java.lang.String[] { "ResourceName", "ExpandedFinalUrl", });
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
