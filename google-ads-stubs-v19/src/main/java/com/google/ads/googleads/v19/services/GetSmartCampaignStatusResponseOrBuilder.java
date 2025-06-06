// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface GetSmartCampaignStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.GetSmartCampaignStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The status of this Smart campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.SmartCampaignStatusEnum.SmartCampaignStatus smart_campaign_status = 1;</code>
   * @return The enum numeric value on the wire for smartCampaignStatus.
   */
  int getSmartCampaignStatusValue();
  /**
   * <pre>
   * The status of this Smart campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.SmartCampaignStatusEnum.SmartCampaignStatus smart_campaign_status = 1;</code>
   * @return The smartCampaignStatus.
   */
  com.google.ads.googleads.v19.enums.SmartCampaignStatusEnum.SmartCampaignStatus getSmartCampaignStatus();

  /**
   * <pre>
   * Details related to Smart campaigns that are ineligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignNotEligibleDetails not_eligible_details = 2;</code>
   * @return Whether the notEligibleDetails field is set.
   */
  boolean hasNotEligibleDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that are ineligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignNotEligibleDetails not_eligible_details = 2;</code>
   * @return The notEligibleDetails.
   */
  com.google.ads.googleads.v19.services.SmartCampaignNotEligibleDetails getNotEligibleDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that are ineligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignNotEligibleDetails not_eligible_details = 2;</code>
   */
  com.google.ads.googleads.v19.services.SmartCampaignNotEligibleDetailsOrBuilder getNotEligibleDetailsOrBuilder();

  /**
   * <pre>
   * Details related to Smart campaigns that are eligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEligibleDetails eligible_details = 3;</code>
   * @return Whether the eligibleDetails field is set.
   */
  boolean hasEligibleDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that are eligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEligibleDetails eligible_details = 3;</code>
   * @return The eligibleDetails.
   */
  com.google.ads.googleads.v19.services.SmartCampaignEligibleDetails getEligibleDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that are eligible to serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEligibleDetails eligible_details = 3;</code>
   */
  com.google.ads.googleads.v19.services.SmartCampaignEligibleDetailsOrBuilder getEligibleDetailsOrBuilder();

  /**
   * <pre>
   * Details related to paused Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignPausedDetails paused_details = 4;</code>
   * @return Whether the pausedDetails field is set.
   */
  boolean hasPausedDetails();
  /**
   * <pre>
   * Details related to paused Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignPausedDetails paused_details = 4;</code>
   * @return The pausedDetails.
   */
  com.google.ads.googleads.v19.services.SmartCampaignPausedDetails getPausedDetails();
  /**
   * <pre>
   * Details related to paused Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignPausedDetails paused_details = 4;</code>
   */
  com.google.ads.googleads.v19.services.SmartCampaignPausedDetailsOrBuilder getPausedDetailsOrBuilder();

  /**
   * <pre>
   * Details related to removed Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignRemovedDetails removed_details = 5;</code>
   * @return Whether the removedDetails field is set.
   */
  boolean hasRemovedDetails();
  /**
   * <pre>
   * Details related to removed Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignRemovedDetails removed_details = 5;</code>
   * @return The removedDetails.
   */
  com.google.ads.googleads.v19.services.SmartCampaignRemovedDetails getRemovedDetails();
  /**
   * <pre>
   * Details related to removed Smart campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignRemovedDetails removed_details = 5;</code>
   */
  com.google.ads.googleads.v19.services.SmartCampaignRemovedDetailsOrBuilder getRemovedDetailsOrBuilder();

  /**
   * <pre>
   * Details related to Smart campaigns that have ended.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEndedDetails ended_details = 6;</code>
   * @return Whether the endedDetails field is set.
   */
  boolean hasEndedDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that have ended.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEndedDetails ended_details = 6;</code>
   * @return The endedDetails.
   */
  com.google.ads.googleads.v19.services.SmartCampaignEndedDetails getEndedDetails();
  /**
   * <pre>
   * Details related to Smart campaigns that have ended.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SmartCampaignEndedDetails ended_details = 6;</code>
   */
  com.google.ads.googleads.v19.services.SmartCampaignEndedDetailsOrBuilder getEndedDetailsOrBuilder();

  com.google.ads.googleads.v19.services.GetSmartCampaignStatusResponse.SmartCampaignStatusDetailsCase getSmartCampaignStatusDetailsCase();
}
