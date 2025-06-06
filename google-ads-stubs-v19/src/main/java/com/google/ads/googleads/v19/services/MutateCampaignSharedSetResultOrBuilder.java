// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/campaign_shared_set_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface MutateCampaignSharedSetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateCampaignSharedSetResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   * @return Whether the campaignSharedSet field is set.
   */
  boolean hasCampaignSharedSet();
  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   * @return The campaignSharedSet.
   */
  com.google.ads.googleads.v19.resources.CampaignSharedSet getCampaignSharedSet();
  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   */
  com.google.ads.googleads.v19.resources.CampaignSharedSetOrBuilder getCampaignSharedSetOrBuilder();
}
