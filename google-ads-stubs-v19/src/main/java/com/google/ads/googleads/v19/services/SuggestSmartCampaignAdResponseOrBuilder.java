// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/smart_campaign_suggest_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface SuggestSmartCampaignAdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.SuggestSmartCampaignAdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the adInfo field is set.
   */
  boolean hasAdInfo();
  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The adInfo.
   */
  com.google.ads.googleads.v19.common.SmartCampaignAdInfo getAdInfo();
  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v19.common.SmartCampaignAdInfoOrBuilder getAdInfoOrBuilder();
}
