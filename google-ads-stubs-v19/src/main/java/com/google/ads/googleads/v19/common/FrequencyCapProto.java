// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/frequency_cap.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public final class FrequencyCapProto {
  private FrequencyCapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_FrequencyCapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_FrequencyCapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_FrequencyCapKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_FrequencyCapKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v19/common/freque" +
      "ncy_cap.proto\022\037google.ads.googleads.v19." +
      "common\032=google/ads/googleads/v19/enums/f" +
      "requency_cap_event_type.proto\0328google/ad" +
      "s/googleads/v19/enums/frequency_cap_leve" +
      "l.proto\032<google/ads/googleads/v19/enums/" +
      "frequency_cap_time_unit.proto\"l\n\021Frequen" +
      "cyCapEntry\022=\n\003key\030\001 \001(\01320.google.ads.goo" +
      "gleads.v19.common.FrequencyCapKey\022\020\n\003cap" +
      "\030\003 \001(\005H\000\210\001\001B\006\n\004_cap\"\332\002\n\017FrequencyCapKey\022" +
      "V\n\005level\030\001 \001(\0162G.google.ads.googleads.v1" +
      "9.enums.FrequencyCapLevelEnum.FrequencyC" +
      "apLevel\022c\n\nevent_type\030\003 \001(\0162O.google.ads" +
      ".googleads.v19.enums.FrequencyCapEventTy" +
      "peEnum.FrequencyCapEventType\022`\n\ttime_uni" +
      "t\030\002 \001(\0162M.google.ads.googleads.v19.enums" +
      ".FrequencyCapTimeUnitEnum.FrequencyCapTi" +
      "meUnit\022\030\n\013time_length\030\005 \001(\005H\000\210\001\001B\016\n\014_tim" +
      "e_lengthB\361\001\n#com.google.ads.googleads.v1" +
      "9.commonB\021FrequencyCapProtoP\001ZEgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v19/common;common\242\002\003GAA\252\002\037Google.Ads." +
      "GoogleAds.V19.Common\312\002\037Google\\Ads\\Google" +
      "Ads\\V19\\Common\352\002#Google::Ads::GoogleAds:" +
      ":V19::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.FrequencyCapEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.FrequencyCapLevelProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.FrequencyCapTimeUnitProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_common_FrequencyCapEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_common_FrequencyCapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_FrequencyCapEntry_descriptor,
        new java.lang.String[] { "Key", "Cap", });
    internal_static_google_ads_googleads_v19_common_FrequencyCapKey_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_common_FrequencyCapKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_FrequencyCapKey_descriptor,
        new java.lang.String[] { "Level", "EventType", "TimeUnit", "TimeLength", });
    com.google.ads.googleads.v19.enums.FrequencyCapEventTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.FrequencyCapLevelProto.getDescriptor();
    com.google.ads.googleads.v19.enums.FrequencyCapTimeUnitProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
