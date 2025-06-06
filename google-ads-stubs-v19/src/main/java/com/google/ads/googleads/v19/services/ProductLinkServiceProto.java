// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/product_link_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public final class ProductLinkServiceProto {
  private ProductLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_CreateProductLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_CreateProductLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_CreateProductLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_CreateProductLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_RemoveProductLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_RemoveProductLinkResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v19/services/prod" +
      "uct_link_service.proto\022!google.ads.googl" +
      "eads.v19.services\0325google/ads/googleads/" +
      "v19/resources/product_link.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\"\200\001\n\030CreatePr" +
      "oductLinkRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340" +
      "A\002\022J\n\014product_link\030\002 \001(\0132/.google.ads.go" +
      "ogleads.v19.resources.ProductLinkB\003\340A\002\"]" +
      "\n\031CreateProductLinkResponse\022@\n\rresource_" +
      "name\030\001 \001(\tB)\372A&\n$googleads.googleapis.co" +
      "m/ProductLink\"\220\001\n\030RemoveProductLinkReque" +
      "st\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022C\n\rresource" +
      "_name\030\002 \001(\tB,\340A\002\372A&\n$googleads.googleapi" +
      "s.com/ProductLink\022\025\n\rvalidate_only\030\003 \001(\010" +
      "\"]\n\031RemoveProductLinkResponse\022@\n\rresourc" +
      "e_name\030\001 \001(\tB)\372A&\n$googleads.googleapis." +
      "com/ProductLink2\262\004\n\022ProductLinkService\022\350" +
      "\001\n\021CreateProductLink\022;.google.ads.google" +
      "ads.v19.services.CreateProductLinkReques" +
      "t\032<.google.ads.googleads.v19.services.Cr" +
      "eateProductLinkResponse\"X\332A\030customer_id," +
      "product_link\202\323\344\223\0027\"2/v19/customers/{cust" +
      "omer_id=*}/productLinks:create:\001*\022\351\001\n\021Re" +
      "moveProductLink\022;.google.ads.googleads.v" +
      "19.services.RemoveProductLinkRequest\032<.g" +
      "oogle.ads.googleads.v19.services.RemoveP" +
      "roductLinkResponse\"Y\332A\031customer_id,resou" +
      "rce_name\202\323\344\223\0027\"2/v19/customers/{customer" +
      "_id=*}/productLinks:remove:\001*\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\203\002\n%com.google.ads." +
      "googleads.v19.servicesB\027ProductLinkServi" +
      "ceProtoP\001ZIgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v19/services;serv" +
      "ices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V19.Se" +
      "rvices\312\002!Google\\Ads\\GoogleAds\\V19\\Servic" +
      "es\352\002%Google::Ads::GoogleAds::V19::Servic" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.resources.ProductLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_CreateProductLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_CreateProductLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_CreateProductLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ProductLink", });
    internal_static_google_ads_googleads_v19_services_CreateProductLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_CreateProductLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_CreateProductLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_RemoveProductLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ResourceName", "ValidateOnly", });
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_RemoveProductLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_RemoveProductLinkResponse_descriptor,
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
    com.google.ads.googleads.v19.resources.ProductLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
