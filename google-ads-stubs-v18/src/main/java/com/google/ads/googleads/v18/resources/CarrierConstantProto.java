// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/carrier_constant.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class CarrierConstantProto {
  private CarrierConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_CarrierConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_CarrierConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v18/resources/car" +
      "rier_constant.proto\022\"google.ads.googlead" +
      "s.v18.resources\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\231\002\n\017" +
      "CarrierConstant\022G\n\rresource_name\030\001 \001(\tB0" +
      "\340A\003\372A*\n(googleads.googleapis.com/Carrier" +
      "Constant\022\024\n\002id\030\005 \001(\003B\003\340A\003H\000\210\001\001\022\026\n\004name\030\006" +
      " \001(\tB\003\340A\003H\001\210\001\001\022\036\n\014country_code\030\007 \001(\tB\003\340A" +
      "\003H\002\210\001\001:N\352AK\n(googleads.googleapis.com/Ca" +
      "rrierConstant\022\037carrierConstants/{criteri" +
      "on_id}B\005\n\003_idB\007\n\005_nameB\017\n\r_country_codeB" +
      "\206\002\n&com.google.ads.googleads.v18.resourc" +
      "esB\024CarrierConstantProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v18/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V18.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V18\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_CarrierConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_CarrierConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_CarrierConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", });
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
