// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/user_location_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class UserLocationViewProto {
  private UserLocationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_UserLocationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_UserLocationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v19/resources/use" +
      "r_location_view.proto\022\"google.ads.google" +
      "ads.v19.resources\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\"\346\002" +
      "\n\020UserLocationView\022H\n\rresource_name\030\001 \001(" +
      "\tB1\340A\003\372A+\n)googleads.googleapis.com/User" +
      "LocationView\022&\n\024country_criterion_id\030\004 \001" +
      "(\003B\003\340A\003H\000\210\001\001\022$\n\022targeting_location\030\005 \001(\010" +
      "B\003\340A\003H\001\210\001\001:\211\001\352A\205\001\n)googleads.googleapis." +
      "com/UserLocationView\022Xcustomers/{custome" +
      "r_id}/userLocationViews/{country_criteri" +
      "on_id}~{is_targeting_location}B\027\n\025_count" +
      "ry_criterion_idB\025\n\023_targeting_locationB\207" +
      "\002\n&com.google.ads.googleads.v19.resource" +
      "sB\025UserLocationViewProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v19/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V19.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V19\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_UserLocationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_UserLocationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_UserLocationView_descriptor,
        new java.lang.String[] { "ResourceName", "CountryCriterionId", "TargetingLocation", });
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
