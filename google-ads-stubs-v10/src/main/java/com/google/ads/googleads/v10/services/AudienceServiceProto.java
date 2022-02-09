// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/audience_service.proto

package com.google.ads.googleads.v10.services;

public final class AudienceServiceProto {
  private AudienceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAudiencesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAudiencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAudiencesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAudiencesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_AudienceOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_AudienceOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAudienceResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAudienceResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v10/services/audi" +
      "ence_service.proto\022!google.ads.googleads" +
      ".v10.services\032:google/ads/googleads/v10/" +
      "enums/response_content_type.proto\0321googl" +
      "e/ads/googleads/v10/resources/audience.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/rpc/status.proto\"\235\002\n\026MutateAudiencesRe" +
      "quest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022M\n\nopera" +
      "tions\030\002 \003(\01324.google.ads.googleads.v10.s" +
      "ervices.AudienceOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j" +
      "\n\025response_content_type\030\005 \001(\0162K.google.a" +
      "ds.googleads.v10.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\226\001\n\027MutateAud" +
      "iencesResponse\022H\n\007results\030\001 \003(\01327.google" +
      ".ads.googleads.v10.services.MutateAudien" +
      "ceResult\0221\n\025partial_failure_error\030\002 \001(\0132" +
      "\022.google.rpc.Status\"\321\001\n\021AudienceOperatio" +
      "n\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf" +
      ".FieldMask\022>\n\006create\030\001 \001(\0132,.google.ads." +
      "googleads.v10.resources.AudienceH\000\022>\n\006up" +
      "date\030\002 \001(\0132,.google.ads.googleads.v10.re" +
      "sources.AudienceH\000B\013\n\toperation\"\225\001\n\024Muta" +
      "teAudienceResult\022=\n\rresource_name\030\001 \001(\tB" +
      "&\372A#\n!googleads.googleapis.com/Audience\022" +
      ">\n\010audience\030\002 \001(\0132,.google.ads.googleads" +
      ".v10.resources.Audience2\270\002\n\017AudienceServ" +
      "ice\022\335\001\n\017MutateAudiences\0229.google.ads.goo" +
      "gleads.v10.services.MutateAudiencesReque" +
      "st\032:.google.ads.googleads.v10.services.M" +
      "utateAudiencesResponse\"S\202\323\344\223\0024\"//v10/cus" +
      "tomers/{customer_id=*}/audiences:mutate:" +
      "\001*\332A\026customer_id,operations\032E\312A\030googlead" +
      "s.googleapis.com\322A\'https://www.googleapi" +
      "s.com/auth/adwordsB\200\002\n%com.google.ads.go" +
      "ogleads.v10.servicesB\024AudienceServicePro" +
      "toP\001ZIgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v10/services;services\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Service" +
      "s\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%" +
      "Google::Ads::GoogleAds::V10::Servicesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.resources.AudienceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateAudiencesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateAudiencesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAudiencesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v10_services_MutateAudiencesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_MutateAudiencesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAudiencesResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v10_services_AudienceOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_AudienceOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_AudienceOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateAudienceResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateAudienceResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAudienceResult_descriptor,
        new java.lang.String[] { "ResourceName", "Audience", });
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
    com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v10.resources.AudienceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
