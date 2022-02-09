// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/customer_user_access_invitation.proto

package com.google.ads.googleads.v10.resources;

public final class CustomerUserAccessInvitationProto {
  private CustomerUserAccessInvitationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_CustomerUserAccessInvitation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_CustomerUserAccessInvitation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/ads/googleads/v10/resources/cus" +
      "tomer_user_access_invitation.proto\022\"goog" +
      "le.ads.googleads.v10.resources\032=google/a" +
      "ds/googleads/v10/enums/access_invitation" +
      "_status.proto\0320google/ads/googleads/v10/" +
      "enums/access_role.proto\032\034google/api/anno" +
      "tations.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\231\004\n\034Cu" +
      "stomerUserAccessInvitation\022T\n\rresource_n" +
      "ame\030\001 \001(\tB=\340A\005\372A7\n5googleads.googleapis." +
      "com/CustomerUserAccessInvitation\022\032\n\rinvi" +
      "tation_id\030\002 \001(\003B\003\340A\003\022S\n\013access_role\030\003 \001(" +
      "\01629.google.ads.googleads.v10.enums.Acces" +
      "sRoleEnum.AccessRoleB\003\340A\005\022\032\n\remail_addre" +
      "ss\030\004 \001(\tB\003\340A\005\022\037\n\022creation_date_time\030\005 \001(" +
      "\tB\003\340A\003\022q\n\021invitation_status\030\006 \001(\0162Q.goog" +
      "le.ads.googleads.v10.enums.AccessInvitat" +
      "ionStatusEnum.AccessInvitationStatusB\003\340A" +
      "\003:\201\001\352A~\n5googleads.googleapis.com/Custom" +
      "erUserAccessInvitation\022Ecustomers/{custo" +
      "mer_id}/customerUserAccessInvitations/{i" +
      "nvitation_id}B\223\002\n&com.google.ads.googlea" +
      "ds.v10.resourcesB!CustomerUserAccessInvi" +
      "tationProtoP\001ZKgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v10/resources" +
      ";resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds." +
      "V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10" +
      "\\Resources\352\002&Google::Ads::GoogleAds::V10" +
      "::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AccessInvitationStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AccessRoleProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_CustomerUserAccessInvitation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_CustomerUserAccessInvitation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_CustomerUserAccessInvitation_descriptor,
        new java.lang.String[] { "ResourceName", "InvitationId", "AccessRole", "EmailAddress", "CreationDateTime", "InvitationStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.AccessInvitationStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AccessRoleProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
