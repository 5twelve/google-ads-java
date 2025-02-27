// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/billing_setup_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public final class BillingSetupServiceProto {
  private BillingSetupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateBillingSetupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_BillingSetupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_BillingSetupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateBillingSetupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_MutateBillingSetupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v19/services/bill" +
      "ing_setup_service.proto\022!google.ads.goog" +
      "leads.v19.services\0326google/ads/googleads" +
      "/v19/resources/billing_setup.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\207\001\n\031Mutate" +
      "BillingSetupRequest\022\030\n\013customer_id\030\001 \001(\t" +
      "B\003\340A\002\022P\n\toperation\030\002 \001(\01328.google.ads.go" +
      "ogleads.v19.services.BillingSetupOperati" +
      "onB\003\340A\002\"\246\001\n\025BillingSetupOperation\022B\n\006cre" +
      "ate\030\002 \001(\01320.google.ads.googleads.v19.res" +
      "ources.BillingSetupH\000\022<\n\006remove\030\001 \001(\tB*\372" +
      "A\'\n%googleads.googleapis.com/BillingSetu" +
      "pH\000B\013\n\toperation\"i\n\032MutateBillingSetupRe" +
      "sponse\022K\n\006result\030\001 \001(\0132;.google.ads.goog" +
      "leads.v19.services.MutateBillingSetupRes" +
      "ult\"]\n\030MutateBillingSetupResult\022A\n\rresou" +
      "rce_name\030\001 \001(\tB*\372A\'\n%googleads.googleapi" +
      "s.com/BillingSetup2\310\002\n\023BillingSetupServi" +
      "ce\022\351\001\n\022MutateBillingSetup\022<.google.ads.g" +
      "oogleads.v19.services.MutateBillingSetup" +
      "Request\032=.google.ads.googleads.v19.servi" +
      "ces.MutateBillingSetupResponse\"V\332A\025custo" +
      "mer_id,operation\202\323\344\223\0028\"3/v19/customers/{" +
      "customer_id=*}/billingSetups:mutate:\001*\032E" +
      "\312A\030googleads.googleapis.com\322A\'https://ww" +
      "w.googleapis.com/auth/adwordsB\204\002\n%com.go" +
      "ogle.ads.googleads.v19.servicesB\030Billing" +
      "SetupServiceProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v19/ser" +
      "vices;services\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V19.Services\312\002!Google\\Ads\\GoogleAds\\" +
      "V19\\Services\352\002%Google::Ads::GoogleAds::V" +
      "19::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.resources.BillingSetupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateBillingSetupRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v19_services_BillingSetupOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_BillingSetupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_BillingSetupOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateBillingSetupResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_MutateBillingSetupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_MutateBillingSetupResult_descriptor,
        new java.lang.String[] { "ResourceName", });
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
    com.google.ads.googleads.v19.resources.BillingSetupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
