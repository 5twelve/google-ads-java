// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/asset_usage.proto

package com.google.ads.googleads.v10.common;

public final class AssetUsageProto {
  private AssetUsageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_AssetUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_AssetUsage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v10/common/asset_" +
      "usage.proto\022\037google.ads.googleads.v10.co" +
      "mmon\032<google/ads/googleads/v10/enums/ser" +
      "ved_asset_field_type.proto\032\034google/api/a" +
      "nnotations.proto\"\213\001\n\nAssetUsage\022\r\n\005asset" +
      "\030\001 \001(\t\022n\n\027served_asset_field_type\030\002 \001(\0162" +
      "M.google.ads.googleads.v10.enums.ServedA" +
      "ssetFieldTypeEnum.ServedAssetFieldTypeB\357" +
      "\001\n#com.google.ads.googleads.v10.commonB\017" +
      "AssetUsageProtoP\001ZEgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v10/commo" +
      "n;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V1" +
      "0.Common\312\002\037Google\\Ads\\GoogleAds\\V10\\Comm" +
      "on\352\002#Google::Ads::GoogleAds::V10::Common" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ServedAssetFieldTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_AssetUsage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_AssetUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_AssetUsage_descriptor,
        new java.lang.String[] { "Asset", "ServedAssetFieldType", });
    com.google.ads.googleads.v10.enums.ServedAssetFieldTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
