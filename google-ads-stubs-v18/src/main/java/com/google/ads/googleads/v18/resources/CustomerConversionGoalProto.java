// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer_conversion_goal.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class CustomerConversionGoalProto {
  private CustomerConversionGoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_CustomerConversionGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_CustomerConversionGoal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v18/resources/cus" +
      "tomer_conversion_goal.proto\022\"google.ads." +
      "googleads.v18.resources\032?google/ads/goog" +
      "leads/v18/enums/conversion_action_catego" +
      "ry.proto\0326google/ads/googleads/v18/enums" +
      "/conversion_origin.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\265\003\n\026CustomerConversionGoal\022N\n\rresou" +
      "rce_name\030\001 \001(\tB7\340A\005\372A1\n/googleads.google" +
      "apis.com/CustomerConversionGoal\022g\n\010categ" +
      "ory\030\002 \001(\0162U.google.ads.googleads.v18.enu" +
      "ms.ConversionActionCategoryEnum.Conversi" +
      "onActionCategory\022U\n\006origin\030\003 \001(\0162E.googl" +
      "e.ads.googleads.v18.enums.ConversionOrig" +
      "inEnum.ConversionOrigin\022\020\n\010biddable\030\004 \001(" +
      "\010:y\352Av\n/googleads.googleapis.com/Custome" +
      "rConversionGoal\022Ccustomers/{customer_id}" +
      "/customerConversionGoals/{category}~{sou" +
      "rce}B\215\002\n&com.google.ads.googleads.v18.re" +
      "sourcesB\033CustomerConversionGoalProtoP\001ZK" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v18/resources;resources\242\002\003GA" +
      "A\252\002\"Google.Ads.GoogleAds.V18.Resources\312\002" +
      "\"Google\\Ads\\GoogleAds\\V18\\Resources\352\002&Go" +
      "ogle::Ads::GoogleAds::V18::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.ConversionOriginProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_CustomerConversionGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_CustomerConversionGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_CustomerConversionGoal_descriptor,
        new java.lang.String[] { "ResourceName", "Category", "Origin", "Biddable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v18.enums.ConversionOriginProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
