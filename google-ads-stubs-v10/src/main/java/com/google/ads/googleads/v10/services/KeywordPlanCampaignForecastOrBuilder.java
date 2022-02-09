// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/keyword_plan_service.proto

package com.google.ads.googleads.v10.services;

public interface KeywordPlanCampaignForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.KeywordPlanCampaignForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The keywordPlanCampaign.
   */
  java.lang.String getKeywordPlanCampaign();
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes();

  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return Whether the campaignForecast field is set.
   */
  boolean hasCampaignForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return The campaignForecast.
   */
  com.google.ads.googleads.v10.services.ForecastMetrics getCampaignForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  com.google.ads.googleads.v10.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder();
}
