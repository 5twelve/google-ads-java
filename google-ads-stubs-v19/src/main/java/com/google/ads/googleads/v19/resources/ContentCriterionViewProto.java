// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/content_criterion_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public final class ContentCriterionViewProto {
  private ContentCriterionViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_ContentCriterionView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_ContentCriterionView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v19/resources/con" +
      "tent_criterion_view.proto\022\"google.ads.go" +
      "ogleads.v19.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\344\001\n\024ContentCriterionView\022L\n\rresource_n" +
      "ame\030\001 \001(\tB5\340A\003\372A/\n-googleads.googleapis." +
      "com/ContentCriterionView:~\352A{\n-googleads" +
      ".googleapis.com/ContentCriterionView\022Jcu" +
      "stomers/{customer_id}/contentCriterionVi" +
      "ews/{ad_group_id}~{criterion_id}B\213\002\n&com" +
      ".google.ads.googleads.v19.resourcesB\031Con" +
      "tentCriterionViewProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "9/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V19.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V19\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_ContentCriterionView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_ContentCriterionView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_ContentCriterionView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
