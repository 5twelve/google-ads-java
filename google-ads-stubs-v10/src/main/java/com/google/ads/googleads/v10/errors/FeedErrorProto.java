// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/feed_error.proto

package com.google.ads.googleads.v10.errors;

public final class FeedErrorProto {
  private FeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v10/errors/feed_e" +
      "rror.proto\022\037google.ads.googleads.v10.err" +
      "ors\032\034google/api/annotations.proto\"\353\006\n\rFe" +
      "edErrorEnum\"\331\006\n\tFeedError\022\017\n\013UNSPECIFIED" +
      "\020\000\022\013\n\007UNKNOWN\020\001\022\036\n\032ATTRIBUTE_NAMES_NOT_U" +
      "NIQUE\020\002\022/\n+ATTRIBUTES_DO_NOT_MATCH_EXIST" +
      "ING_ATTRIBUTES\020\003\022.\n*CANNOT_SPECIFY_USER_" +
      "ORIGIN_FOR_SYSTEM_FEED\020\004\0224\n0CANNOT_SPECI" +
      "FY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED\020\005\0222" +
      "\n.CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYS" +
      "TEM_FEED\020\006\0224\n0CANNOT_UPDATE_FEED_ATTRIBU" +
      "TES_WITH_ORIGIN_GOOGLE\020\007\022\020\n\014FEED_REMOVED" +
      "\020\010\022\030\n\024INVALID_ORIGIN_VALUE\020\t\022\033\n\027FEED_ORI" +
      "GIN_IS_NOT_USER\020\n\022 \n\034INVALID_AUTH_TOKEN_" +
      "FOR_EMAIL\020\013\022\021\n\rINVALID_EMAIL\020\014\022\027\n\023DUPLIC" +
      "ATE_FEED_NAME\020\r\022\025\n\021INVALID_FEED_NAME\020\016\022\026" +
      "\n\022MISSING_OAUTH_INFO\020\017\022.\n*NEW_ATTRIBUTE_" +
      "CANNOT_BE_PART_OF_UNIQUE_KEY\020\020\022\027\n\023TOO_MA" +
      "NY_ATTRIBUTES\020\021\022\034\n\030INVALID_BUSINESS_ACCO" +
      "UNT\020\022\0223\n/BUSINESS_ACCOUNT_CANNOT_ACCESS_" +
      "LOCATION_ACCOUNT\020\023\022\036\n\032INVALID_AFFILIATE_" +
      "CHAIN_ID\020\024\022\031\n\025DUPLICATE_SYSTEM_FEED\020\025\022\024\n" +
      "\020GMB_ACCESS_ERROR\020\026\0225\n1CANNOT_HAVE_LOCAT" +
      "ION_AND_AFFILIATE_LOCATION_FEEDS\020\027\022#\n\037LE" +
      "GACY_EXTENSION_TYPE_READ_ONLY\020\030B\356\001\n#com." +
      "google.ads.googleads.v10.errorsB\016FeedErr" +
      "orProtoP\001ZEgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v10/errors;errors" +
      "\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Errors" +
      "\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors\352\002#Goo" +
      "gle::Ads::GoogleAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
