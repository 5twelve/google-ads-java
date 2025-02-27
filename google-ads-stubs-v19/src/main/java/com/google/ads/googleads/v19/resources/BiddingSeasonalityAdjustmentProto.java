// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/bidding_seasonality_adjustment.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class BiddingSeasonalityAdjustmentProto {
  private BiddingSeasonalityAdjustmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_BiddingSeasonalityAdjustment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_BiddingSeasonalityAdjustment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v19/resources/bid" +
      "ding_seasonality_adjustment.proto\022\"googl" +
      "e.ads.googleads.v19.resources\032=google/ad" +
      "s/googleads/v19/enums/advertising_channe" +
      "l_type.proto\032+google/ads/googleads/v19/e" +
      "nums/device.proto\032<google/ads/googleads/" +
      "v19/enums/seasonality_event_scope.proto\032" +
      "=google/ads/googleads/v19/enums/seasonal" +
      "ity_event_status.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\344\006\n\034BiddingSeasonalityAdjustment\022T\n\rr" +
      "esource_name\030\001 \001(\tB=\340A\005\372A7\n5googleads.go" +
      "ogleapis.com/BiddingSeasonalityAdjustmen" +
      "t\022&\n\031seasonality_adjustment_id\030\002 \001(\003B\003\340A" +
      "\003\022^\n\005scope\030\003 \001(\0162O.google.ads.googleads." +
      "v19.enums.SeasonalityEventScopeEnum.Seas" +
      "onalityEventScope\022f\n\006status\030\004 \001(\0162Q.goog" +
      "le.ads.googleads.v19.enums.SeasonalityEv" +
      "entStatusEnum.SeasonalityEventStatusB\003\340A" +
      "\003\022\034\n\017start_date_time\030\005 \001(\tB\003\340A\002\022\032\n\rend_d" +
      "ate_time\030\006 \001(\tB\003\340A\002\022\014\n\004name\030\007 \001(\t\022\023\n\013des" +
      "cription\030\010 \001(\t\022B\n\007devices\030\t \003(\01621.google" +
      ".ads.googleads.v19.enums.DeviceEnum.Devi" +
      "ce\022 \n\030conversion_rate_modifier\030\n \001(\001\0229\n\t" +
      "campaigns\030\013 \003(\tB&\372A#\n!googleads.googleap" +
      "is.com/Campaign\022t\n\031advertising_channel_t" +
      "ypes\030\014 \003(\0162Q.google.ads.googleads.v19.en" +
      "ums.AdvertisingChannelTypeEnum.Advertisi" +
      "ngChannelType:\211\001\352A\205\001\n5googleads.googleap" +
      "is.com/BiddingSeasonalityAdjustment\022Lcus" +
      "tomers/{customer_id}/biddingSeasonalityA" +
      "djustments/{seasonality_event_id}B\223\002\n&co" +
      "m.google.ads.googleads.v19.resourcesB!Bi" +
      "ddingSeasonalityAdjustmentProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v19/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V19.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V19\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SeasonalityEventScopeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.SeasonalityEventStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_BiddingSeasonalityAdjustment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_BiddingSeasonalityAdjustment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_BiddingSeasonalityAdjustment_descriptor,
        new java.lang.String[] { "ResourceName", "SeasonalityAdjustmentId", "Scope", "Status", "StartDateTime", "EndDateTime", "Name", "Description", "Devices", "ConversionRateModifier", "Campaigns", "AdvertisingChannelTypes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SeasonalityEventScopeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.SeasonalityEventStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
