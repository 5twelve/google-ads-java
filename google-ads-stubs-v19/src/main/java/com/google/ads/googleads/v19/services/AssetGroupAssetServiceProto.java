// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/asset_group_asset_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public final class AssetGroupAssetServiceProto {
  private AssetGroupAssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_AssetGroupAssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_AssetGroupAssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v19/services/asse" +
      "t_group_asset_service.proto\022!google.ads." +
      "googleads.v19.services\032:google/ads/googl" +
      "eads/v19/resources/asset_group_asset.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\027google/" +
      "rpc/status.proto\"\277\001\n\035MutateAssetGroupAss" +
      "etsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022T\n\n" +
      "operations\030\002 \003(\0132;.google.ads.googleads." +
      "v19.services.AssetGroupAssetOperationB\003\340" +
      "A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_" +
      "only\030\004 \001(\010\"\247\002\n\030AssetGroupAssetOperation\022" +
      "/\n\013update_mask\030\004 \001(\0132\032.google.protobuf.F" +
      "ieldMask\022E\n\006create\030\001 \001(\01323.google.ads.go" +
      "ogleads.v19.resources.AssetGroupAssetH\000\022" +
      "E\n\006update\030\002 \001(\01323.google.ads.googleads.v" +
      "19.resources.AssetGroupAssetH\000\022?\n\006remove" +
      "\030\003 \001(\tB-\372A*\n(googleads.googleapis.com/As" +
      "setGroupAssetH\000B\013\n\toperation\"\244\001\n\036MutateA" +
      "ssetGroupAssetsResponse\022O\n\007results\030\001 \003(\013" +
      "2>.google.ads.googleads.v19.services.Mut" +
      "ateAssetGroupAssetResult\0221\n\025partial_fail" +
      "ure_error\030\002 \001(\0132\022.google.rpc.Status\"c\n\033M" +
      "utateAssetGroupAssetResult\022D\n\rresource_n" +
      "ame\030\001 \001(\tB-\372A*\n(googleads.googleapis.com" +
      "/AssetGroupAsset2\333\002\n\026AssetGroupAssetServ" +
      "ice\022\371\001\n\026MutateAssetGroupAssets\022@.google." +
      "ads.googleads.v19.services.MutateAssetGr" +
      "oupAssetsRequest\032A.google.ads.googleads." +
      "v19.services.MutateAssetGroupAssetsRespo" +
      "nse\"Z\332A\026customer_id,operations\202\323\344\223\002;\"6/v" +
      "19/customers/{customer_id=*}/assetGroupA" +
      "ssets:mutate:\001*\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\207\002\n%com.google.ads.googleads.v19." +
      "servicesB\033AssetGroupAssetServiceProtoP\001Z" +
      "Igoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v19/services;services\242\002\003GAA" +
      "\252\002!Google.Ads.GoogleAds.V19.Services\312\002!G" +
      "oogle\\Ads\\GoogleAds\\V19\\Services\352\002%Googl" +
      "e::Ads::GoogleAds::V19::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.resources.AssetGroupAssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v19_services_AssetGroupAssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_AssetGroupAssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_AssetGroupAssetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v19.resources.AssetGroupAssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
