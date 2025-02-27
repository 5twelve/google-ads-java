// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/local_services_lead_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public final class LocalServicesLeadServiceProto {
  private LocalServicesLeadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_AppendLeadConversationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_AppendLeadConversationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_Conversation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_Conversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_ConversationOrError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v19/services/loca" +
      "l_services_lead_service.proto\022!google.ad" +
      "s.googleads.v19.services\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032\027google/rpc/status.p" +
      "roto\"\206\001\n\035AppendLeadConversationRequest\022\030" +
      "\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\rconversation" +
      "s\030\002 \003(\0132/.google.ads.googleads.v19.servi" +
      "ces.ConversationB\003\340A\002\"p\n\036AppendLeadConve" +
      "rsationResponse\022N\n\tresponses\030\001 \003(\01326.goo" +
      "gle.ads.googleads.v19.services.Conversat" +
      "ionOrErrorB\003\340A\002\"r\n\014Conversation\022O\n\023local" +
      "_services_lead\030\001 \001(\tB2\340A\002\372A,\n*googleads." +
      "googleapis.com/LocalServicesLead\022\021\n\004text" +
      "\030\002 \001(\tB\003\340A\002\"\233\001\n\023ConversationOrError\022*\n l" +
      "ocal_services_lead_conversation\030\001 \001(\tH\000\022" +
      "3\n\025partial_failure_error\030\002 \001(\0132\022.google." +
      "rpc.StatusH\000B#\n!append_lead_conversation" +
      "_response2\355\002\n\030LocalServicesLeadService\022\211" +
      "\002\n\026AppendLeadConversation\022@.google.ads.g" +
      "oogleads.v19.services.AppendLeadConversa" +
      "tionRequest\032A.google.ads.googleads.v19.s" +
      "ervices.AppendLeadConversationResponse\"j" +
      "\332A\031customer_id,conversations\202\323\344\223\002H\"C/v19" +
      "/customers/{customer_id=*}/localServices" +
      ":appendLeadConversation:\001*\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\211\002\n%com.google.ads.goo" +
      "gleads.v19.servicesB\035LocalServicesLeadSe" +
      "rviceProtoP\001ZIgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v19/services;s" +
      "ervices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V19" +
      ".Services\312\002!Google\\Ads\\GoogleAds\\V19\\Ser" +
      "vices\352\002%Google::Ads::GoogleAds::V19::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_AppendLeadConversationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversations", });
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_AppendLeadConversationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_AppendLeadConversationResponse_descriptor,
        new java.lang.String[] { "Responses", });
    internal_static_google_ads_googleads_v19_services_Conversation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_Conversation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_Conversation_descriptor,
        new java.lang.String[] { "LocalServicesLead", "Text", });
    internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_ConversationOrError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_ConversationOrError_descriptor,
        new java.lang.String[] { "LocalServicesLeadConversation", "PartialFailureError", "AppendLeadConversationResponse", });
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
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
