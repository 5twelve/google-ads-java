// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/consent.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public final class ConsentProto {
  private ConsentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_Consent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_Consent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v19/common/consen" +
      "t.proto\022\037google.ads.googleads.v19.common" +
      "\0323google/ads/googleads/v19/enums/consent" +
      "_status.proto\"\275\001\n\007Consent\022U\n\014ad_user_dat" +
      "a\030\001 \001(\0162?.google.ads.googleads.v19.enums" +
      ".ConsentStatusEnum.ConsentStatus\022[\n\022ad_p" +
      "ersonalization\030\002 \001(\0162?.google.ads.google" +
      "ads.v19.enums.ConsentStatusEnum.ConsentS" +
      "tatusB\354\001\n#com.google.ads.googleads.v19.c" +
      "ommonB\014ConsentProtoP\001ZEgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v19/c" +
      "ommon;common\242\002\003GAA\252\002\037Google.Ads.GoogleAd" +
      "s.V19.Common\312\002\037Google\\Ads\\GoogleAds\\V19\\" +
      "Common\352\002#Google::Ads::GoogleAds::V19::Co" +
      "mmonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.ConsentStatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_common_Consent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_common_Consent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_Consent_descriptor,
        new java.lang.String[] { "AdUserData", "AdPersonalization", });
    com.google.ads.googleads.v19.enums.ConsentStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
