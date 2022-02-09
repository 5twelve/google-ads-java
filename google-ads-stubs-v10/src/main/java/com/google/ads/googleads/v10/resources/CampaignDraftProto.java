// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_draft.proto

package com.google.ads.googleads.v10.resources;

public final class CampaignDraftProto {
  private CampaignDraftProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CampaignDraft_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CampaignDraft_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/cam" +
      "paign_draft.proto\022\"google.ads.googleads." +
      "v10.resources\032:google/ads/googleads/v10/" +
      "enums/campaign_draft_status.proto\032\034googl" +
      "e/api/annotations.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\256\005\n\rCampaignDraft\022E\n\rresource_name\030\001" +
      " \001(\tB.\340A\005\372A(\n&googleads.googleapis.com/C" +
      "ampaignDraft\022\032\n\010draft_id\030\t \001(\003B\003\340A\003H\000\210\001\001" +
      "\022E\n\rbase_campaign\030\n \001(\tB)\340A\005\372A#\n!googlea" +
      "ds.googleapis.com/CampaignH\001\210\001\001\022\021\n\004name\030" +
      "\013 \001(\tH\002\210\001\001\022F\n\016draft_campaign\030\014 \001(\tB)\340A\003\372" +
      "A#\n!googleads.googleapis.com/CampaignH\003\210" +
      "\001\001\022`\n\006status\030\006 \001(\0162K.google.ads.googlead" +
      "s.v10.enums.CampaignDraftStatusEnum.Camp" +
      "aignDraftStatusB\003\340A\003\022(\n\026has_experiment_r" +
      "unning\030\r \001(\010B\003\340A\003H\004\210\001\001\022(\n\026long_running_o" +
      "peration\030\016 \001(\tB\003\340A\003H\005\210\001\001:q\352An\n&googleads" +
      ".googleapis.com/CampaignDraft\022Dcustomers" +
      "/{customer_id}/campaignDrafts/{base_camp" +
      "aign_id}~{draft_id}B\013\n\t_draft_idB\020\n\016_bas" +
      "e_campaignB\007\n\005_nameB\021\n\017_draft_campaignB\031" +
      "\n\027_has_experiment_runningB\031\n\027_long_runni" +
      "ng_operationB\204\002\n&com.google.ads.googlead" +
      "s.v10.resourcesB\022CampaignDraftProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v10/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V10::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CampaignDraft_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CampaignDraft_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CampaignDraft_descriptor,
        new java.lang.String[] { "ResourceName", "DraftId", "BaseCampaign", "Name", "DraftCampaign", "Status", "HasExperimentRunning", "LongRunningOperation", "DraftId", "BaseCampaign", "Name", "DraftCampaign", "HasExperimentRunning", "LongRunningOperation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
