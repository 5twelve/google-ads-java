// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/customer_lifecycle_goal_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public final class CustomerLifecycleGoalServiceProto {
  private CustomerLifecycleGoalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_CustomerLifecycleGoalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_CustomerLifecycleGoalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v19/services/cust" +
      "omer_lifecycle_goal_service.proto\022!googl" +
      "e.ads.googleads.v19.services\032@google/ads" +
      "/googleads/v19/resources/customer_lifecy" +
      "cle_goal.proto\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032 google/protobuf/field_mask.pr" +
      "oto\"\271\001\n&ConfigureCustomerLifecycleGoalsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022Y\n\toper" +
      "ation\030\002 \001(\0132A.google.ads.googleads.v19.s" +
      "ervices.CustomerLifecycleGoalOperationB\003" +
      "\340A\002\022\032\n\rvalidate_only\030\003 \001(\010B\003\340A\001\"\375\001\n\036Cust" +
      "omerLifecycleGoalOperation\0224\n\013update_mas" +
      "k\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001" +
      "\022K\n\006create\030\001 \001(\01329.google.ads.googleads." +
      "v19.resources.CustomerLifecycleGoalH\000\022K\n" +
      "\006update\030\003 \001(\01329.google.ads.googleads.v19" +
      ".resources.CustomerLifecycleGoalH\000B\013\n\top" +
      "eration\"\203\001\n\'ConfigureCustomerLifecycleGo" +
      "alsResponse\022X\n\006result\030\001 \001(\0132H.google.ads" +
      ".googleads.v19.services.ConfigureCustome" +
      "rLifecycleGoalsResult\"s\n%ConfigureCustom" +
      "erLifecycleGoalsResult\022J\n\rresource_name\030" +
      "\001 \001(\tB3\372A0\n.googleads.googleapis.com/Cus" +
      "tomerLifecycleGoal2\231\003\n\034CustomerLifecycle" +
      "GoalService\022\261\002\n\037ConfigureCustomerLifecyc" +
      "leGoals\022I.google.ads.googleads.v19.servi" +
      "ces.ConfigureCustomerLifecycleGoalsReque" +
      "st\032J.google.ads.googleads.v19.services.C" +
      "onfigureCustomerLifecycleGoalsResponse\"w" +
      "\332A\025customer_id,operation\202\323\344\223\002Y\"T/v19/cus" +
      "tomers/{customer_id=*}/customerLifecycle" +
      "Goal:configureCustomerLifecycleGoals:\001*\032" +
      "E\312A\030googleads.googleapis.com\322A\'https://w" +
      "ww.googleapis.com/auth/adwordsB\215\002\n%com.g" +
      "oogle.ads.googleads.v19.servicesB!Custom" +
      "erLifecycleGoalServiceProtoP\001ZIgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v19/services;services\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V19.Services\312\002!Google\\Ads\\" +
      "GoogleAds\\V19\\Services\352\002%Google::Ads::Go" +
      "ogleAds::V19::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.resources.CustomerLifecycleGoalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", });
    internal_static_google_ads_googleads_v19_services_CustomerLifecycleGoalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_services_CustomerLifecycleGoalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_CustomerLifecycleGoalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_services_ConfigureCustomerLifecycleGoalsResult_descriptor,
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
    com.google.ads.googleads.v19.resources.CustomerLifecycleGoalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
