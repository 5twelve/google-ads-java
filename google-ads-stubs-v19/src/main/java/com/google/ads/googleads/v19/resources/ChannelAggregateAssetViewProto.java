// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/channel_aggregate_asset_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class ChannelAggregateAssetViewProto {
  private ChannelAggregateAssetViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_ChannelAggregateAssetView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_ChannelAggregateAssetView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v19/resources/cha" +
      "nnel_aggregate_asset_view.proto\022\"google." +
      "ads.googleads.v19.resources\032=google/ads/" +
      "googleads/v19/enums/advertising_channel_" +
      "type.proto\0325google/ads/googleads/v19/enu" +
      "ms/asset_field_type.proto\0321google/ads/go" +
      "ogleads/v19/enums/asset_source.proto\032\037go" +
      "ogle/api/field_behavior.proto\032\031google/ap" +
      "i/resource.proto\"\337\005\n\031ChannelAggregateAss" +
      "etView\022Q\n\rresource_name\030\001 \001(\tB:\340A\003\372A4\n2g" +
      "oogleads.googleapis.com/ChannelAggregate" +
      "AssetView\022}\n\030advertising_channel_type\030\002 " +
      "\001(\0162Q.google.ads.googleads.v19.enums.Adv" +
      "ertisingChannelTypeEnum.AdvertisingChann" +
      "elTypeB\003\340A\003H\000\210\001\001\022:\n\005asset\030\003 \001(\tB&\340A\003\372A \n" +
      "\036googleads.googleapis.com/AssetH\001\210\001\001\022[\n\014" +
      "asset_source\030\004 \001(\0162;.google.ads.googlead" +
      "s.v19.enums.AssetSourceEnum.AssetSourceB" +
      "\003\340A\003H\002\210\001\001\022_\n\nfield_type\030\005 \001(\0162A.google.a" +
      "ds.googleads.v19.enums.AssetFieldTypeEnu" +
      "m.AssetFieldTypeB\003\340A\003H\003\210\001\001:\256\001\352A\252\001\n2googl" +
      "eads.googleapis.com/ChannelAggregateAsse" +
      "tView\022tcustomers/{customer_id}/channelAg" +
      "gregateAssetViews/{advertising_channel_t" +
      "ype}~{asset_id}~{asset_source}~{field_ty" +
      "pe}B\033\n\031_advertising_channel_typeB\010\n\006_ass" +
      "etB\017\n\r_asset_sourceB\r\n\013_field_typeB\220\002\n&c" +
      "om.google.ads.googleads.v19.resourcesB\036C" +
      "hannelAggregateAssetViewProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v19/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V19.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V19\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.AssetSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_ChannelAggregateAssetView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_ChannelAggregateAssetView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_ChannelAggregateAssetView_descriptor,
        new java.lang.String[] { "ResourceName", "AdvertisingChannelType", "Asset", "AssetSource", "FieldType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.AssetSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
