// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/asset_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_AssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_AssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_services_MutateAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_services_MutateAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v20/services/asse" +
      "t_service.proto\022!google.ads.googleads.v2" +
      "0.services\032:google/ads/googleads/v20/enu" +
      "ms/response_content_type.proto\032.google/a" +
      "ds/googleads/v20/resources/asset.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\027google/rpc/" +
      "status.proto\"\227\002\n\023MutateAssetsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022J\n\noperations\030\002 \003" +
      "(\01321.google.ads.googleads.v20.services.A" +
      "ssetOperationB\003\340A\002\022\027\n\017partial_failure\030\005 " +
      "\001(\010\022j\n\025response_content_type\030\003 \001(\0162K.goo" +
      "gle.ads.googleads.v20.enums.ResponseCont" +
      "entTypeEnum.ResponseContentType\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\"\310\001\n\016AssetOperation\022/\n\013upd" +
      "ate_mask\030\003 \001(\0132\032.google.protobuf.FieldMa" +
      "sk\022;\n\006create\030\001 \001(\0132).google.ads.googlead" +
      "s.v20.resources.AssetH\000\022;\n\006update\030\002 \001(\0132" +
      ").google.ads.googleads.v20.resources.Ass" +
      "etH\000B\013\n\toperation\"\220\001\n\024MutateAssetsRespon" +
      "se\0221\n\025partial_failure_error\030\003 \001(\0132\022.goog" +
      "le.rpc.Status\022E\n\007results\030\002 \003(\01324.google." +
      "ads.googleads.v20.services.MutateAssetRe" +
      "sult\"\211\001\n\021MutateAssetResult\022:\n\rresource_n" +
      "ame\030\001 \001(\tB#\372A \n\036googleads.googleapis.com" +
      "/Asset\0228\n\005asset\030\002 \001(\0132).google.ads.googl" +
      "eads.v20.resources.Asset2\251\002\n\014AssetServic" +
      "e\022\321\001\n\014MutateAssets\0226.google.ads.googlead" +
      "s.v20.services.MutateAssetsRequest\0327.goo" +
      "gle.ads.googleads.v20.services.MutateAss" +
      "etsResponse\"P\332A\026customer_id,operations\202\323" +
      "\344\223\0021\",/v20/customers/{customer_id=*}/ass" +
      "ets:mutate:\001*\032E\312A\030googleads.googleapis.c" +
      "om\322A\'https://www.googleapis.com/auth/adw" +
      "ordsB\375\001\n%com.google.ads.googleads.v20.se" +
      "rvicesB\021AssetServiceProtoP\001ZIgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v20/services;services\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V20.Services\312\002!Google\\Ads\\Go" +
      "ogleAds\\V20\\Services\352\002%Google::Ads::Goog" +
      "leAds::V20::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v20.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v20.resources.AssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v20_services_MutateAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v20_services_MutateAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ResponseContentType", "ValidateOnly", });
    internal_static_google_ads_googleads_v20_services_AssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v20_services_AssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_AssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v20_services_MutateAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v20_services_MutateAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateAssetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v20_services_MutateAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v20_services_MutateAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_services_MutateAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", "Asset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v20.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v20.resources.AssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
