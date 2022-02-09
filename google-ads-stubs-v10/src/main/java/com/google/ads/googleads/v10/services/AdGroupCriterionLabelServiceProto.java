// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/ad_group_criterion_label_service.proto

package com.google.ads.googleads.v10.services;

public final class AdGroupCriterionLabelServiceProto {
  private AdGroupCriterionLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_AdGroupCriterionLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_AdGroupCriterionLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v10/services/ad_g" +
      "roup_criterion_label_service.proto\022!goog" +
      "le.ads.googleads.v10.services\032Agoogle/ad" +
      "s/googleads/v10/resources/ad_group_crite" +
      "rion_label.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032\027google/rpc/status.proto\"\313\001\n" +
      "#MutateAdGroupCriterionLabelsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022Z\n\noperations\030\002 \003" +
      "(\0132A.google.ads.googleads.v10.services.A" +
      "dGroupCriterionLabelOperationB\003\340A\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\"\301\001\n\036AdGroupCriterionLabelOperation\022K\n" +
      "\006create\030\001 \001(\01329.google.ads.googleads.v10" +
      ".resources.AdGroupCriterionLabelH\000\022E\n\006re" +
      "move\030\002 \001(\tB3\372A0\n.googleads.googleapis.co" +
      "m/AdGroupCriterionLabelH\000B\013\n\toperation\"\260" +
      "\001\n$MutateAdGroupCriterionLabelsResponse\022" +
      "1\n\025partial_failure_error\030\003 \001(\0132\022.google." +
      "rpc.Status\022U\n\007results\030\002 \003(\0132D.google.ads" +
      ".googleads.v10.services.MutateAdGroupCri" +
      "terionLabelResult\"o\n!MutateAdGroupCriter" +
      "ionLabelResult\022J\n\rresource_name\030\001 \001(\tB3\372" +
      "A0\n.googleads.googleapis.com/AdGroupCrit" +
      "erionLabel2\371\002\n\034AdGroupCriterionLabelServ" +
      "ice\022\221\002\n\034MutateAdGroupCriterionLabels\022F.g" +
      "oogle.ads.googleads.v10.services.MutateA" +
      "dGroupCriterionLabelsRequest\032G.google.ad" +
      "s.googleads.v10.services.MutateAdGroupCr" +
      "iterionLabelsResponse\"`\202\323\344\223\002A\"</v10/cust" +
      "omers/{customer_id=*}/adGroupCriterionLa" +
      "bels:mutate:\001*\332A\026customer_id,operations\032" +
      "E\312A\030googleads.googleapis.com\322A\'https://w" +
      "ww.googleapis.com/auth/adwordsB\215\002\n%com.g" +
      "oogle.ads.googleads.v10.servicesB!AdGrou" +
      "pCriterionLabelServiceProtoP\001ZIgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v10/services;services\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\" +
      "GoogleAds\\V10\\Services\352\002%Google::Ads::Go" +
      "ogleAds::V10::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.resources.AdGroupCriterionLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v10_services_AdGroupCriterionLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_AdGroupCriterionLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_AdGroupCriterionLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateAdGroupCriterionLabelResult_descriptor,
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
    com.google.ads.googleads.v10.resources.AdGroupCriterionLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
