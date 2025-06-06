// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface GetSmartCampaignStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.GetSmartCampaignStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Smart campaign setting belonging to the
   * Smart campaign to fetch the status of.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Required. The resource name of the Smart campaign setting belonging to the
   * Smart campaign to fetch the status of.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();
}
