// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/customer_sk_ad_network_conversion_value_schema_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public final class CustomerSkAdNetworkConversionValueSchemaServiceProto {
  private CustomerSkAdNetworkConversionValueSchemaServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_CustomerSkAdNetworkConversionValueSchemaOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_CustomerSkAdNetworkConversionValueSchemaOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n^google/ads/googleads/v19/services/cust" +
      "omer_sk_ad_network_conversion_value_sche" +
      "ma_service.proto\022!google.ads.googleads.v" +
      "19.services\032Wgoogle/ads/googleads/v19/re" +
      "sources/customer_sk_ad_network_conversio" +
      "n_value_schema.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\027google/rpc/status.proto" +
      "\"\221\001\n1CustomerSkAdNetworkConversionValueS" +
      "chemaOperation\022\\\n\006update\030\001 \001(\0132L.google." +
      "ads.googleads.v19.resources.CustomerSkAd" +
      "NetworkConversionValueSchema\"\352\001\n5MutateC" +
      "ustomerSkAdNetworkConversionValueSchemaR" +
      "equest\022\023\n\013customer_id\030\001 \001(\t\022g\n\toperation" +
      "\030\002 \001(\0132T.google.ads.googleads.v19.servic" +
      "es.CustomerSkAdNetworkConversionValueSch" +
      "emaOperation\022\025\n\rvalidate_only\030\003 \001(\010\022\034\n\017e" +
      "nable_warnings\030\004 \001(\010B\003\340A\001\"\245\001\n4MutateCust" +
      "omerSkAdNetworkConversionValueSchemaResu" +
      "lt\022]\n\rresource_name\030\001 \001(\tBF\372AC\nAgooglead" +
      "s.googleapis.com/CustomerSkAdNetworkConv" +
      "ersionValueSchema\022\016\n\006app_id\030\002 \001(\t\"\306\001\n6Mu" +
      "tateCustomerSkAdNetworkConversionValueSc" +
      "hemaResponse\022g\n\006result\030\001 \001(\0132W.google.ad" +
      "s.googleads.v19.services.MutateCustomerS" +
      "kAdNetworkConversionValueSchemaResult\022#\n" +
      "\007warning\030\002 \001(\0132\022.google.rpc.Status2\274\003\n/C" +
      "ustomerSkAdNetworkConversionValueSchemaS" +
      "ervice\022\301\002\n.MutateCustomerSkAdNetworkConv" +
      "ersionValueSchema\022X.google.ads.googleads" +
      ".v19.services.MutateCustomerSkAdNetworkC" +
      "onversionValueSchemaRequest\032Y.google.ads" +
      ".googleads.v19.services.MutateCustomerSk" +
      "AdNetworkConversionValueSchemaResponse\"Z" +
      "\202\323\344\223\002T\"O/v19/customers/{customer_id=*}/c" +
      "ustomerSkAdNetworkConversionValueSchemas" +
      ":mutate:\001*\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\240\002\n%com.google.ads.googleads.v19.servi" +
      "cesB4CustomerSkAdNetworkConversionValueS" +
      "chemaServiceProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v19/ser" +
      "vices;services\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V19.Services\312\002!Google\\Ads\\GoogleAds\\" +
      "V19\\Services\352\002%Google::Ads::GoogleAds::V" +
      "19::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.resources.CustomerSkAdNetworkConversionValueSchemaProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_CustomerSkAdNetworkConversionValueSchemaOperation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_CustomerSkAdNetworkConversionValueSchemaOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_CustomerSkAdNetworkConversionValueSchemaOperation_descriptor,
        new java.lang.String[] { "Update", });
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", "EnableWarnings", });
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResult_descriptor,
        new java.lang.String[] { "ResourceName", "AppId", });
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateCustomerSkAdNetworkConversionValueSchemaResponse_descriptor,
        new java.lang.String[] { "Result", "Warning", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.resources.CustomerSkAdNetworkConversionValueSchemaProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
