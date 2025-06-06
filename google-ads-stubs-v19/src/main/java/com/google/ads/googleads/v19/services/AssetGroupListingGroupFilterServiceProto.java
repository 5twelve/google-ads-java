// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/asset_group_listing_group_filter_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public final class AssetGroupListingGroupFilterServiceProto {
  private AssetGroupListingGroupFilterServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_AssetGroupListingGroupFilterOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_AssetGroupListingGroupFilterOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFilterResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFilterResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/ads/googleads/v19/services/asse" +
      "t_group_listing_group_filter_service.pro" +
      "to\022!google.ads.googleads.v19.services\032:g" +
      "oogle/ads/googleads/v19/enums/response_c" +
      "ontent_type.proto\032Igoogle/ads/googleads/" +
      "v19/resources/asset_group_listing_group_" +
      "filter.proto\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032 google/protobuf/field_mask.prot" +
      "o\"\254\002\n*MutateAssetGroupListingGroupFilter" +
      "sRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022a\n\nop" +
      "erations\030\002 \003(\0132H.google.ads.googleads.v1" +
      "9.services.AssetGroupListingGroupFilterO" +
      "perationB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010\022j\n\025" +
      "response_content_type\030\004 \001(\0162K.google.ads" +
      ".googleads.v19.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\333\002\n%AssetGroupL" +
      "istingGroupFilterOperation\022/\n\013update_mas" +
      "k\030\004 \001(\0132\032.google.protobuf.FieldMask\022R\n\006c" +
      "reate\030\001 \001(\0132@.google.ads.googleads.v19.r" +
      "esources.AssetGroupListingGroupFilterH\000\022" +
      "R\n\006update\030\002 \001(\0132@.google.ads.googleads.v" +
      "19.resources.AssetGroupListingGroupFilte" +
      "rH\000\022L\n\006remove\030\003 \001(\tB:\372A7\n5googleads.goog" +
      "leapis.com/AssetGroupListingGroupFilterH" +
      "\000B\013\n\toperation\"\213\001\n+MutateAssetGroupListi" +
      "ngGroupFiltersResponse\022\\\n\007results\030\001 \003(\0132" +
      "K.google.ads.googleads.v19.services.Muta" +
      "teAssetGroupListingGroupFilterResult\"\351\001\n" +
      "(MutateAssetGroupListingGroupFilterResul" +
      "t\022Q\n\rresource_name\030\001 \001(\tB:\372A7\n5googleads" +
      ".googleapis.com/AssetGroupListingGroupFi" +
      "lter\022j\n asset_group_listing_group_filter" +
      "\030\002 \001(\0132@.google.ads.googleads.v19.resour" +
      "ces.AssetGroupListingGroupFilter2\234\003\n#Ass" +
      "etGroupListingGroupFilterService\022\255\002\n#Mut" +
      "ateAssetGroupListingGroupFilters\022M.googl" +
      "e.ads.googleads.v19.services.MutateAsset" +
      "GroupListingGroupFiltersRequest\032N.google" +
      ".ads.googleads.v19.services.MutateAssetG" +
      "roupListingGroupFiltersResponse\"g\332A\026cust" +
      "omer_id,operations\202\323\344\223\002H\"C/v19/customers" +
      "/{customer_id=*}/assetGroupListingGroupF" +
      "ilters:mutate:\001*\032E\312A\030googleads.googleapi" +
      "s.com\322A\'https://www.googleapis.com/auth/" +
      "adwordsB\224\002\n%com.google.ads.googleads.v19" +
      ".servicesB(AssetGroupListingGroupFilterS" +
      "erviceProtoP\001ZIgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v19/services;" +
      "services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1" +
      "9.Services\312\002!Google\\Ads\\GoogleAds\\V19\\Se" +
      "rvices\352\002%Google::Ads::GoogleAds::V19::Se" +
      "rvicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.resources.AssetGroupListingGroupFilterProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v19_services_AssetGroupListingGroupFilterOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_AssetGroupListingGroupFilterOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_AssetGroupListingGroupFilterOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFiltersResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFilterResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFilterResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAssetGroupListingGroupFilterResult_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroupListingGroupFilter", });
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
    com.google.ads.googleads.v19.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v19.resources.AssetGroupListingGroupFilterProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
