// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/topic_view.proto

package com.google.ads.googleads.v10.resources;

public final class TopicViewProto {
  private TopicViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_TopicView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_TopicView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v10/resources/top" +
      "ic_view.proto\022\"google.ads.googleads.v10." +
      "resources\032\034google/api/annotations.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\"\270\001\n\tTopicView\022A\n\rres" +
      "ource_name\030\001 \001(\tB*\340A\003\372A$\n\"googleads.goog" +
      "leapis.com/TopicView:h\352Ae\n\"googleads.goo" +
      "gleapis.com/TopicView\022?customers/{custom" +
      "er_id}/topicViews/{ad_group_id}~{criteri" +
      "on_id}B\200\002\n&com.google.ads.googleads.v10." +
      "resourcesB\016TopicViewProtoP\001ZKgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v10/resources;resources\242\002\003GAA\252\002\"Google." +
      "Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads" +
      "\\GoogleAds\\V10\\Resources\352\002&Google::Ads::" +
      "GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_TopicView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_TopicView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_TopicView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
