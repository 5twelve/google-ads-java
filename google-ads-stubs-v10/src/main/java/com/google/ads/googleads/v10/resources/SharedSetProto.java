// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/shared_set.proto

package com.google.ads.googleads.v10.resources;

public final class SharedSetProto {
  private SharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_SharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_SharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v10/resources/sha" +
      "red_set.proto\022\"google.ads.googleads.v10." +
      "resources\0326google/ads/googleads/v10/enum" +
      "s/shared_set_status.proto\0324google/ads/go" +
      "ogleads/v10/enums/shared_set_type.proto\032" +
      "\034google/api/annotations.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\372\003\n\tSharedSet\022A\n\rresource_name" +
      "\030\001 \001(\tB*\340A\005\372A$\n\"googleads.googleapis.com" +
      "/SharedSet\022\024\n\002id\030\010 \001(\003B\003\340A\003H\000\210\001\001\022R\n\004type" +
      "\030\003 \001(\0162?.google.ads.googleads.v10.enums." +
      "SharedSetTypeEnum.SharedSetTypeB\003\340A\005\022\021\n\004" +
      "name\030\t \001(\tH\001\210\001\001\022X\n\006status\030\005 \001(\0162C.google" +
      ".ads.googleads.v10.enums.SharedSetStatus" +
      "Enum.SharedSetStatusB\003\340A\003\022\036\n\014member_coun" +
      "t\030\n \001(\003B\003\340A\003H\002\210\001\001\022!\n\017reference_count\030\013 \001" +
      "(\003B\003\340A\003H\003\210\001\001:[\352AX\n\"googleads.googleapis." +
      "com/SharedSet\0222customers/{customer_id}/s" +
      "haredSets/{shared_set_id}B\005\n\003_idB\007\n\005_nam" +
      "eB\017\n\r_member_countB\022\n\020_reference_countB\200" +
      "\002\n&com.google.ads.googleads.v10.resource" +
      "sB\016SharedSetProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v10/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V10.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V10\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.SharedSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.SharedSetTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_SharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_SharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_SharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "Name", "Status", "MemberCount", "ReferenceCount", "Id", "Name", "MemberCount", "ReferenceCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.SharedSetStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.SharedSetTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
