// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/change_status.proto

package com.google.ads.googleads.v10.resources;

public final class ChangeStatusProto {
  private ChangeStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ChangeStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v10/resources/cha" +
      "nge_status.proto\022\"google.ads.googleads.v" +
      "10.resources\032,google/ads/googleads/v10/e" +
      "nums/ad_type.proto\032Agoogle/ads/googleads" +
      "/v10/enums/advertising_channel_sub_type." +
      "proto\032=google/ads/googleads/v10/enums/ad" +
      "vertising_channel_type.proto\032/google/ads" +
      "/googleads/v10/enums/asset_type.proto\032<g" +
      "oogle/ads/googleads/v10/enums/change_sta" +
      "tus_operation.proto\032@google/ads/googlead" +
      "s/v10/enums/change_status_resource_type." +
      "proto\0323google/ads/googleads/v10/enums/cr" +
      "iterion_type.proto\0320google/ads/googleads" +
      "/v10/enums/feed_origin.proto\032\034google/api" +
      "/annotations.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\"\207" +
      "\016\n\014ChangeStatus\022D\n\rresource_name\030\001 \001(\tB-" +
      "\340A\003\372A\'\n%googleads.googleapis.com/ChangeS" +
      "tatus\022\'\n\025last_change_date_time\030\030 \001(\tB\003\340A" +
      "\003H\000\210\001\001\022q\n\rresource_type\030\004 \001(\0162U.google.a" +
      "ds.googleads.v10.enums.ChangeStatusResou" +
      "rceTypeEnum.ChangeStatusResourceTypeB\003\340A" +
      "\003\022@\n\010campaign\030\021 \001(\tB)\340A\003\372A#\n!googleads.g" +
      "oogleapis.com/CampaignH\001\210\001\001\022?\n\010ad_group\030" +
      "\022 \001(\tB(\340A\003\372A\"\n googleads.googleapis.com/" +
      "AdGroupH\002\210\001\001\022m\n\017resource_status\030\010 \001(\0162O." +
      "google.ads.googleads.v10.enums.ChangeSta" +
      "tusOperationEnum.ChangeStatusOperationB\003" +
      "\340A\003\022D\n\013ad_group_ad\030\031 \001(\tB*\340A\003\372A$\n\"google" +
      "ads.googleapis.com/AdGroupAdH\003\210\001\001\022R\n\022ad_" +
      "group_criterion\030\032 \001(\tB1\340A\003\372A+\n)googleads" +
      ".googleapis.com/AdGroupCriterionH\004\210\001\001\022S\n" +
      "\022campaign_criterion\030\033 \001(\tB2\340A\003\372A,\n*googl" +
      "eads.googleapis.com/CampaignCriterionH\005\210" +
      "\001\001\0228\n\004feed\030\034 \001(\tB%\340A\003\372A\037\n\035googleads.goog" +
      "leapis.com/FeedH\006\210\001\001\022A\n\tfeed_item\030\035 \001(\tB" +
      ")\340A\003\372A#\n!googleads.googleapis.com/FeedIt" +
      "emH\007\210\001\001\022H\n\rad_group_feed\030\036 \001(\tB,\340A\003\372A&\n$" +
      "googleads.googleapis.com/AdGroupFeedH\010\210\001" +
      "\001\022I\n\rcampaign_feed\030\037 \001(\tB-\340A\003\372A\'\n%google" +
      "ads.googleapis.com/CampaignFeedH\t\210\001\001\022W\n\025" +
      "ad_group_bid_modifier\030  \001(\tB3\340A\003\372A-\n+goo" +
      "gleads.googleapis.com/AdGroupBidModifier" +
      "H\n\210\001\001\022>\n\nshared_set\030! \001(\tB*\340A\003\372A$\n\"googl" +
      "eads.googleapis.com/SharedSet\022O\n\023campaig" +
      "n_shared_set\030\" \001(\tB2\340A\003\372A,\n*googleads.go" +
      "ogleapis.com/CampaignSharedSet\0225\n\005asset\030" +
      "# \001(\tB&\340A\003\372A \n\036googleads.googleapis.com/" +
      "Asset\022F\n\016customer_asset\030$ \001(\tB.\340A\003\372A(\n&g" +
      "oogleads.googleapis.com/CustomerAsset\022F\n" +
      "\016campaign_asset\030% \001(\tB.\340A\003\372A(\n&googleads" +
      ".googleapis.com/CampaignAsset\022E\n\016ad_grou" +
      "p_asset\030& \001(\tB-\340A\003\372A\'\n%googleads.googlea" +
      "pis.com/AdGroupAsset:c\352A`\n%googleads.goo" +
      "gleapis.com/ChangeStatus\0227customers/{cus" +
      "tomer_id}/changeStatus/{change_status_id" +
      "}B\030\n\026_last_change_date_timeB\013\n\t_campaign" +
      "B\013\n\t_ad_groupB\016\n\014_ad_group_adB\025\n\023_ad_gro" +
      "up_criterionB\025\n\023_campaign_criterionB\007\n\005_" +
      "feedB\014\n\n_feed_itemB\020\n\016_ad_group_feedB\020\n\016" +
      "_campaign_feedB\030\n\026_ad_group_bid_modifier" +
      "B\203\002\n&com.google.ads.googleads.v10.resour" +
      "cesB\021ChangeStatusProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "0/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V10.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V10\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AdTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ChangeStatusOperationProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ChangeStatusResourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.FeedOriginProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ChangeStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ChangeStatus_descriptor,
        new java.lang.String[] { "ResourceName", "LastChangeDateTime", "ResourceType", "Campaign", "AdGroup", "ResourceStatus", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", "SharedSet", "CampaignSharedSet", "Asset", "CustomerAsset", "CampaignAsset", "AdGroupAsset", "LastChangeDateTime", "Campaign", "AdGroup", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", "Feed", "FeedItem", "AdGroupFeed", "CampaignFeed", "AdGroupBidModifier", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AdTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ChangeStatusOperationProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ChangeStatusResourceTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.FeedOriginProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
