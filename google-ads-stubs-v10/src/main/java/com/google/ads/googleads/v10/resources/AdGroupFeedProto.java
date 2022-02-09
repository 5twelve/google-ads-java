// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/ad_group_feed.proto

package com.google.ads.googleads.v10.resources;

public final class AdGroupFeedProto {
  private AdGroupFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_AdGroupFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AdGroupFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v10/resources/ad_" +
      "group_feed.proto\022\"google.ads.googleads.v" +
      "10.resources\0327google/ads/googleads/v10/c" +
      "ommon/matching_function.proto\0325google/ad" +
      "s/googleads/v10/enums/feed_link_status.p" +
      "roto\0325google/ads/googleads/v10/enums/pla" +
      "ceholder_type.proto\032\034google/api/annotati" +
      "ons.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\322\004\n\013AdGrou" +
      "pFeed\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&\n$go" +
      "ogleads.googleapis.com/AdGroupFeed\0228\n\004fe" +
      "ed\030\007 \001(\tB%\340A\005\372A\037\n\035googleads.googleapis.c" +
      "om/FeedH\000\210\001\001\022?\n\010ad_group\030\010 \001(\tB(\340A\005\372A\"\n " +
      "googleads.googleapis.com/AdGroupH\001\210\001\001\022^\n" +
      "\021placeholder_types\030\004 \003(\0162C.google.ads.go" +
      "ogleads.v10.enums.PlaceholderTypeEnum.Pl" +
      "aceholderType\022L\n\021matching_function\030\005 \001(\013" +
      "21.google.ads.googleads.v10.common.Match" +
      "ingFunction\022V\n\006status\030\006 \001(\0162A.google.ads" +
      ".googleads.v10.enums.FeedLinkStatusEnum." +
      "FeedLinkStatusB\003\340A\003:g\352Ad\n$googleads.goog" +
      "leapis.com/AdGroupFeed\022<customers/{custo" +
      "mer_id}/adGroupFeeds/{ad_group_id}~{feed" +
      "_id}B\007\n\005_feedB\013\n\t_ad_groupB\202\002\n&com.googl" +
      "e.ads.googleads.v10.resourcesB\020AdGroupFe" +
      "edProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v10/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V10::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AdGroupFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AdGroupFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AdGroupFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AdGroup", "PlaceholderTypes", "MatchingFunction", "Status", "Feed", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
