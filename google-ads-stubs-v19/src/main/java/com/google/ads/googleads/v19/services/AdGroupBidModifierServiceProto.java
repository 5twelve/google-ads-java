// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/ad_group_bid_modifier_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public final class AdGroupBidModifierServiceProto {
  private AdGroupBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_AdGroupBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_AdGroupBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v19/services/ad_g" +
      "roup_bid_modifier_service.proto\022!google." +
      "ads.googleads.v19.services\032:google/ads/g" +
      "oogleads/v19/enums/response_content_type" +
      ".proto\032>google/ads/googleads/v19/resourc" +
      "es/ad_group_bid_modifier.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\261\002\n MutateAdGroupBidModifiersReques" +
      "t\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022W\n\noperation" +
      "s\030\002 \003(\0132>.google.ads.googleads.v19.servi" +
      "ces.AdGroupBidModifierOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\022j\n\025response_content_type\030\005 \001(\0162K.go" +
      "ogle.ads.googleads.v19.enums.ResponseCon" +
      "tentTypeEnum.ResponseContentType\"\263\002\n\033AdG" +
      "roupBidModifierOperation\022/\n\013update_mask\030" +
      "\004 \001(\0132\032.google.protobuf.FieldMask\022H\n\006cre" +
      "ate\030\001 \001(\01326.google.ads.googleads.v19.res" +
      "ources.AdGroupBidModifierH\000\022H\n\006update\030\002 " +
      "\001(\01326.google.ads.googleads.v19.resources" +
      ".AdGroupBidModifierH\000\022B\n\006remove\030\003 \001(\tB0\372" +
      "A-\n+googleads.googleapis.com/AdGroupBidM" +
      "odifierH\000B\013\n\toperation\"\252\001\n!MutateAdGroup" +
      "BidModifiersResponse\0221\n\025partial_failure_" +
      "error\030\003 \001(\0132\022.google.rpc.Status\022R\n\007resul" +
      "ts\030\002 \003(\0132A.google.ads.googleads.v19.serv" +
      "ices.MutateAdGroupBidModifierResult\"\300\001\n\036" +
      "MutateAdGroupBidModifierResult\022G\n\rresour" +
      "ce_name\030\001 \001(\tB0\372A-\n+googleads.googleapis" +
      ".com/AdGroupBidModifier\022U\n\025ad_group_bid_" +
      "modifier\030\002 \001(\01326.google.ads.googleads.v1" +
      "9.resources.AdGroupBidModifier2\352\002\n\031AdGro" +
      "upBidModifierService\022\205\002\n\031MutateAdGroupBi" +
      "dModifiers\022C.google.ads.googleads.v19.se" +
      "rvices.MutateAdGroupBidModifiersRequest\032" +
      "D.google.ads.googleads.v19.services.Muta" +
      "teAdGroupBidModifiersResponse\"]\332A\026custom" +
      "er_id,operations\202\323\344\223\002>\"9/v19/customers/{" +
      "customer_id=*}/adGroupBidModifiers:mutat" +
      "e:\001*\032E\312A\030googleads.googleapis.com\322A\'http" +
      "s://www.googleapis.com/auth/adwordsB\212\002\n%" +
      "com.google.ads.googleads.v19.servicesB\036A" +
      "dGroupBidModifierServiceProtoP\001ZIgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v19/services;services\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V19.Services\312\002!Google\\Ad" +
      "s\\GoogleAds\\V19\\Services\352\002%Google::Ads::" +
      "GoogleAds::V19::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.resources.AdGroupBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v19_services_AdGroupBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_AdGroupBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_AdGroupBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateAdGroupBidModifierResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupBidModifier", });
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
    com.google.ads.googleads.v19.resources.AdGroupBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
