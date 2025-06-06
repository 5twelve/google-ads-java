// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/customer_asset_set_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public final class CustomerAssetSetServiceProto {
  private CustomerAssetSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CustomerAssetSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CustomerAssetSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v18/services/cust" +
      "omer_asset_set_service.proto\022!google.ads" +
      ".googleads.v18.services\032:google/ads/goog" +
      "leads/v18/enums/response_content_type.pr" +
      "oto\032;google/ads/googleads/v18/resources/" +
      "customer_asset_set.proto\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/rpc/status.p" +
      "roto\"\255\002\n\036MutateCustomerAssetSetsRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\noperations\030" +
      "\002 \003(\0132<.google.ads.googleads.v18.service" +
      "s.CustomerAssetSetOperationB\003\340A\002\022\027\n\017part" +
      "ial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\022j\n\025response_content_type\030\005 \001(\0162K.google" +
      ".ads.googleads.v18.enums.ResponseContent" +
      "TypeEnum.ResponseContentType\"\262\001\n\031Custome" +
      "rAssetSetOperation\022F\n\006create\030\001 \001(\01324.goo" +
      "gle.ads.googleads.v18.resources.Customer" +
      "AssetSetH\000\022@\n\006remove\030\002 \001(\tB.\372A+\n)googlea" +
      "ds.googleapis.com/CustomerAssetSetH\000B\013\n\t" +
      "operation\"\246\001\n\037MutateCustomerAssetSetsRes" +
      "ponse\022P\n\007results\030\001 \003(\0132?.google.ads.goog" +
      "leads.v18.services.MutateCustomerAssetSe" +
      "tResult\0221\n\025partial_failure_error\030\002 \001(\0132\022" +
      ".google.rpc.Status\"\267\001\n\034MutateCustomerAss" +
      "etSetResult\022E\n\rresource_name\030\001 \001(\tB.\372A+\n" +
      ")googleads.googleapis.com/CustomerAssetS" +
      "et\022P\n\022customer_asset_set\030\002 \001(\01324.google." +
      "ads.googleads.v18.resources.CustomerAsse" +
      "tSet2\340\002\n\027CustomerAssetSetService\022\375\001\n\027Mut" +
      "ateCustomerAssetSets\022A.google.ads.google" +
      "ads.v18.services.MutateCustomerAssetSets" +
      "Request\032B.google.ads.googleads.v18.servi" +
      "ces.MutateCustomerAssetSetsResponse\"[\332A\026" +
      "customer_id,operations\202\323\344\223\002<\"7/v18/custo" +
      "mers/{customer_id=*}/customerAssetSets:m" +
      "utate:\001*\032E\312A\030googleads.googleapis.com\322A\'" +
      "https://www.googleapis.com/auth/adwordsB" +
      "\210\002\n%com.google.ads.googleads.v18.service" +
      "sB\034CustomerAssetSetServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v18/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V18.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V18\\Services\352\002%Google::Ads" +
      "::GoogleAds::V18::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.CustomerAssetSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_CustomerAssetSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_CustomerAssetSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CustomerAssetSetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerAssetSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerAssetSet", });
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
    com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v18.resources.CustomerAssetSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
