// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/keyword_plan_campaign.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public interface KeywordPlanCampaignOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.resources.KeywordPlanCampaign)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan campaign.
   * KeywordPlanCampaign resource names have the form:
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{kp_campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan campaign.
   * KeywordPlanCampaign resource names have the form:
   *
   * `customers/{customer_id}/keywordPlanCampaigns/{kp_campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>optional string keyword_plan = 9 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the keywordPlan field is set.
   */
  boolean hasKeywordPlan();
  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>optional string keyword_plan = 9 [(.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlan.
   */
  java.lang.String getKeywordPlan();
  /**
   * <pre>
   * The keyword plan this campaign belongs to.
   * </pre>
   *
   * <code>optional string keyword_plan = 9 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlan.
   */
  com.google.protobuf.ByteString
      getKeywordPlanBytes();

  /**
   * <pre>
   * Output only. The ID of the Keyword Plan campaign.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Keyword Plan campaign.
   * </pre>
   *
   * <code>optional int64 id = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the Keyword Plan campaign.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated string language_constants = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the languageConstants.
   */
  java.util.List<java.lang.String>
      getLanguageConstantsList();
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated string language_constants = 12 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of languageConstants.
   */
  int getLanguageConstantsCount();
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated string language_constants = 12 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The languageConstants at the given index.
   */
  java.lang.String getLanguageConstants(int index);
  /**
   * <pre>
   * The languages targeted for the Keyword Plan campaign.
   * Max allowed: 1.
   * </pre>
   *
   * <code>repeated string language_constants = 12 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageConstants at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageConstantsBytes(int index);

  /**
   * <pre>
   * Targeting network.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 6;</code>
   * @return The enum numeric value on the wire for keywordPlanNetwork.
   */
  int getKeywordPlanNetworkValue();
  /**
   * <pre>
   * Targeting network.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 6;</code>
   * @return The keywordPlanNetwork.
   */
  com.google.ads.googleads.v20.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork getKeywordPlanNetwork();

  /**
   * <pre>
   * A default max cpc bid in micros, and in the account currency, for all ad
   * groups under the campaign.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 13;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A default max cpc bid in micros, and in the account currency, for all ad
   * groups under the campaign.
   *
   * This field is required and should not be empty when creating Keyword Plan
   * campaigns.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 13;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();

  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v20.resources.KeywordPlanGeoTarget> 
      getGeoTargetsList();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  com.google.ads.googleads.v20.resources.KeywordPlanGeoTarget getGeoTargets(int index);
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  int getGeoTargetsCount();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.resources.KeywordPlanGeoTargetOrBuilder> 
      getGeoTargetsOrBuilderList();
  /**
   * <pre>
   * The geo targets.
   * Max number allowed: 20.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.KeywordPlanGeoTarget geo_targets = 8;</code>
   */
  com.google.ads.googleads.v20.resources.KeywordPlanGeoTargetOrBuilder getGeoTargetsOrBuilder(
      int index);
}
