// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/product_bidding_category_constant.proto

package com.google.ads.googleads.v10.resources;

public final class ProductBiddingCategoryConstantProto {
  private ProductBiddingCategoryConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ProductBiddingCategoryConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ProductBiddingCategoryConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v10/resources/pro" +
      "duct_bidding_category_constant.proto\022\"go" +
      "ogle.ads.googleads.v10.resources\032Cgoogle" +
      "/ads/googleads/v10/enums/product_bidding" +
      "_category_level.proto\032Dgoogle/ads/google" +
      "ads/v10/enums/product_bidding_category_s" +
      "tatus.proto\032\034google/api/annotations.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"\263\006\n\036ProductBidding" +
      "CategoryConstant\022V\n\rresource_name\030\001 \001(\tB" +
      "?\340A\003\372A9\n7googleads.googleapis.com/Produc" +
      "tBiddingCategoryConstant\022\024\n\002id\030\n \001(\003B\003\340A" +
      "\003H\000\210\001\001\022\036\n\014country_code\030\013 \001(\tB\003\340A\003H\001\210\001\001\022v" +
      "\n(product_bidding_category_constant_pare" +
      "nt\030\014 \001(\tB?\340A\003\372A9\n7googleads.googleapis.c" +
      "om/ProductBiddingCategoryConstantH\002\210\001\001\022o" +
      "\n\005level\030\005 \001(\0162[.google.ads.googleads.v10" +
      ".enums.ProductBiddingCategoryLevelEnum.P" +
      "roductBiddingCategoryLevelB\003\340A\003\022r\n\006statu" +
      "s\030\006 \001(\0162].google.ads.googleads.v10.enums" +
      ".ProductBiddingCategoryStatusEnum.Produc" +
      "tBiddingCategoryStatusB\003\340A\003\022\037\n\rlanguage_" +
      "code\030\r \001(\tB\003\340A\003H\003\210\001\001\022 \n\016localized_name\030\016" +
      " \001(\tB\003\340A\003H\004\210\001\001:y\352Av\n7googleads.googleapi" +
      "s.com/ProductBiddingCategoryConstant\022;pr" +
      "oductBiddingCategoryConstants/{country_c" +
      "ode}~{level}~{id}B\005\n\003_idB\017\n\r_country_cod" +
      "eB+\n)_product_bidding_category_constant_" +
      "parentB\020\n\016_language_codeB\021\n\017_localized_n" +
      "ameB\225\002\n&com.google.ads.googleads.v10.res" +
      "ourcesB#ProductBiddingCategoryConstantPr" +
      "otoP\001ZKgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v10/resources;resourc" +
      "es\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Reso" +
      "urces\312\002\"Google\\Ads\\GoogleAds\\V10\\Resourc" +
      "es\352\002&Google::Ads::GoogleAds::V10::Resour" +
      "cesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ProductBiddingCategoryLevelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ProductBiddingCategoryStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ProductBiddingCategoryConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ProductBiddingCategoryConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ProductBiddingCategoryConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CountryCode", "ProductBiddingCategoryConstantParent", "Level", "Status", "LanguageCode", "LocalizedName", "Id", "CountryCode", "ProductBiddingCategoryConstantParent", "LanguageCode", "LocalizedName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ProductBiddingCategoryLevelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ProductBiddingCategoryStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
