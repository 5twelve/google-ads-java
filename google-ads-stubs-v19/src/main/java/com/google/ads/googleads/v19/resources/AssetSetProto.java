// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/asset_set.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class AssetSetProto {
  private AssetSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_AssetSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_AssetSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_AssetSet_MerchantCenterFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_AssetSet_HotelPropertyData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_AssetSet_HotelPropertyData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v19/resources/ass" +
      "et_set.proto\022\"google.ads.googleads.v19.r" +
      "esources\0325google/ads/googleads/v19/commo" +
      "n/asset_set_types.proto\0325google/ads/goog" +
      "leads/v19/enums/asset_set_status.proto\0323" +
      "google/ads/googleads/v19/enums/asset_set" +
      "_type.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\334\010\n\010Asse" +
      "tSet\022\017\n\002id\030\006 \001(\003B\003\340A\003\022@\n\rresource_name\030\001" +
      " \001(\tB)\340A\005\372A#\n!googleads.googleapis.com/A" +
      "ssetSet\022\021\n\004name\030\002 \001(\tB\003\340A\002\022S\n\004type\030\003 \001(\016" +
      "2=.google.ads.googleads.v19.enums.AssetS" +
      "etTypeEnum.AssetSetTypeB\006\340A\002\340A\005\022V\n\006statu" +
      "s\030\004 \001(\0162A.google.ads.googleads.v19.enums" +
      ".AssetSetStatusEnum.AssetSetStatusB\003\340A\003\022" +
      "]\n\024merchant_center_feed\030\005 \001(\0132?.google.a" +
      "ds.googleads.v19.resources.AssetSet.Merc" +
      "hantCenterFeed\022/\n\"location_group_parent_" +
      "asset_set_id\030\n \001(\003B\003\340A\005\022`\n\023hotel_propert" +
      "y_data\030\013 \001(\0132>.google.ads.googleads.v19." +
      "resources.AssetSet.HotelPropertyDataB\003\340A" +
      "\003\022D\n\014location_set\030\007 \001(\0132,.google.ads.goo" +
      "gleads.v19.common.LocationSetH\000\022h\n\037busin" +
      "ess_profile_location_group\030\010 \001(\0132=.googl" +
      "e.ads.googleads.v19.common.BusinessProfi" +
      "leLocationGroupH\000\022S\n\024chain_location_grou" +
      "p\030\t \001(\01323.google.ads.googleads.v19.commo" +
      "n.ChainLocationGroupH\000\032[\n\022MerchantCenter" +
      "Feed\022\030\n\013merchant_id\030\001 \001(\003B\003\340A\002\022\034\n\nfeed_l" +
      "abel\030\002 \001(\tB\003\340A\001H\000\210\001\001B\r\n\013_feed_label\032{\n\021H" +
      "otelPropertyData\022!\n\017hotel_center_id\030\001 \001(" +
      "\003B\003\340A\003H\000\210\001\001\022\036\n\014partner_name\030\002 \001(\tB\003\340A\003H\001" +
      "\210\001\001B\022\n\020_hotel_center_idB\017\n\r_partner_name" +
      ":X\352AU\n!googleads.googleapis.com/AssetSet" +
      "\0220customers/{customer_id}/assetSets/{ass" +
      "et_set_id}B\022\n\020asset_set_sourceB\377\001\n&com.g" +
      "oogle.ads.googleads.v19.resourcesB\rAsset" +
      "SetProtoP\001ZKgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v19/resources;re" +
      "sources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V19" +
      ".Resources\312\002\"Google\\Ads\\GoogleAds\\V19\\Re" +
      "sources\352\002&Google::Ads::GoogleAds::V19::R" +
      "esourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.common.AssetSetTypesProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AssetSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AssetSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_AssetSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_AssetSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_AssetSet_descriptor,
        new java.lang.String[] { "Id", "ResourceName", "Name", "Type", "Status", "MerchantCenterFeed", "LocationGroupParentAssetSetId", "HotelPropertyData", "LocationSet", "BusinessProfileLocationGroup", "ChainLocationGroup", "AssetSetSource", });
    internal_static_google_ads_googleads_v19_resources_AssetSet_MerchantCenterFeed_descriptor =
      internal_static_google_ads_googleads_v19_resources_AssetSet_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_AssetSet_MerchantCenterFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_AssetSet_MerchantCenterFeed_descriptor,
        new java.lang.String[] { "MerchantId", "FeedLabel", });
    internal_static_google_ads_googleads_v19_resources_AssetSet_HotelPropertyData_descriptor =
      internal_static_google_ads_googleads_v19_resources_AssetSet_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v19_resources_AssetSet_HotelPropertyData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_AssetSet_HotelPropertyData_descriptor,
        new java.lang.String[] { "HotelCenterId", "PartnerName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.common.AssetSetTypesProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AssetSetStatusProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AssetSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
