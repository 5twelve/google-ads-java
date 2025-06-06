// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface KeywordForecastMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.KeywordForecastMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The total number of impressions.
   * </pre>
   *
   * <code>optional double impressions = 1;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * The total number of impressions.
   * </pre>
   *
   * <code>optional double impressions = 1;</code>
   * @return The impressions.
   */
  double getImpressions();

  /**
   * <pre>
   * The average click through rate. Available only if impressions &gt; 0.
   * </pre>
   *
   * <code>optional double click_through_rate = 2;</code>
   * @return Whether the clickThroughRate field is set.
   */
  boolean hasClickThroughRate();
  /**
   * <pre>
   * The average click through rate. Available only if impressions &gt; 0.
   * </pre>
   *
   * <code>optional double click_through_rate = 2;</code>
   * @return The clickThroughRate.
   */
  double getClickThroughRate();

  /**
   * <pre>
   * The average cpc. Available only if clicks &gt; 0.
   * </pre>
   *
   * <code>optional int64 average_cpc_micros = 3;</code>
   * @return Whether the averageCpcMicros field is set.
   */
  boolean hasAverageCpcMicros();
  /**
   * <pre>
   * The average cpc. Available only if clicks &gt; 0.
   * </pre>
   *
   * <code>optional int64 average_cpc_micros = 3;</code>
   * @return The averageCpcMicros.
   */
  long getAverageCpcMicros();

  /**
   * <pre>
   * The total number of clicks.
   * </pre>
   *
   * <code>optional double clicks = 4;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * The total number of clicks.
   * </pre>
   *
   * <code>optional double clicks = 4;</code>
   * @return The clicks.
   */
  double getClicks();

  /**
   * <pre>
   * The total cost.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * The total cost.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Forecasted number of conversions: clicks * conversion_rate.
   * </pre>
   *
   * <code>optional double conversions = 6;</code>
   * @return Whether the conversions field is set.
   */
  boolean hasConversions();
  /**
   * <pre>
   * Forecasted number of conversions: clicks * conversion_rate.
   * </pre>
   *
   * <code>optional double conversions = 6;</code>
   * @return The conversions.
   */
  double getConversions();

  /**
   * <pre>
   * Forecasted conversion rate.
   * </pre>
   *
   * <code>optional double conversion_rate = 7;</code>
   * @return Whether the conversionRate field is set.
   */
  boolean hasConversionRate();
  /**
   * <pre>
   * Forecasted conversion rate.
   * </pre>
   *
   * <code>optional double conversion_rate = 7;</code>
   * @return The conversionRate.
   */
  double getConversionRate();

  /**
   * <pre>
   * Average cost per acquisition calculated as cost_micros / conversions.
   * </pre>
   *
   * <code>optional int64 average_cpa_micros = 8;</code>
   * @return Whether the averageCpaMicros field is set.
   */
  boolean hasAverageCpaMicros();
  /**
   * <pre>
   * Average cost per acquisition calculated as cost_micros / conversions.
   * </pre>
   *
   * <code>optional int64 average_cpa_micros = 8;</code>
   * @return The averageCpaMicros.
   */
  long getAverageCpaMicros();
}
