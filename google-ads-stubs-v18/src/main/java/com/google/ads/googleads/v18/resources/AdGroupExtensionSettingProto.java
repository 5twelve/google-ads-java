// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group_extension_setting.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class AdGroupExtensionSettingProto {
  private AdGroupExtensionSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupExtensionSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupExtensionSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v18/resources/ad_" +
      "group_extension_setting.proto\022\"google.ad" +
      "s.googleads.v18.resources\032=google/ads/go" +
      "ogleads/v18/enums/extension_setting_devi" +
      "ce.proto\0323google/ads/googleads/v18/enums" +
      "/extension_type.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\322\004\n\027AdGroupExtensionSetting\022O\n\rresourc" +
      "e_name\030\001 \001(\tB8\340A\005\372A2\n0googleads.googleap" +
      "is.com/AdGroupExtensionSetting\022\\\n\016extens" +
      "ion_type\030\002 \001(\0162?.google.ads.googleads.v1" +
      "8.enums.ExtensionTypeEnum.ExtensionTypeB" +
      "\003\340A\005\022?\n\010ad_group\030\006 \001(\tB(\340A\005\372A\"\n googlead" +
      "s.googleapis.com/AdGroupH\000\210\001\001\022M\n\024extensi" +
      "on_feed_items\030\007 \003(\tB/\372A,\n*googleads.goog" +
      "leapis.com/ExtensionFeedItem\022a\n\006device\030\005" +
      " \001(\0162Q.google.ads.googleads.v18.enums.Ex" +
      "tensionSettingDeviceEnum.ExtensionSettin" +
      "gDevice:\207\001\352A\203\001\n0googleads.googleapis.com" +
      "/AdGroupExtensionSetting\022Ocustomers/{cus" +
      "tomer_id}/adGroupExtensionSettings/{ad_g" +
      "roup_id}~{extension_type}B\013\n\t_ad_groupB\216" +
      "\002\n&com.google.ads.googleads.v18.resource" +
      "sB\034AdGroupExtensionSettingProtoP\001ZKgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v18/resources;resources\242\002\003GAA\252\002\"G" +
      "oogle.Ads.GoogleAds.V18.Resources\312\002\"Goog" +
      "le\\Ads\\GoogleAds\\V18\\Resources\352\002&Google:" +
      ":Ads::GoogleAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ExtensionSettingDeviceProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.ExtensionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdGroupExtensionSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroupExtensionSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupExtensionSetting_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "AdGroup", "ExtensionFeedItems", "Device", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.ExtensionSettingDeviceProto.getDescriptor();
    com.google.ads.googleads.v18.enums.ExtensionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
