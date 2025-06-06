// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface ForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.Forecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency or
   * GenerateReachForecastRequest.effective_frequency_limit times that exactly
   * matches the Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the on_target_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>optional int64 on_target_reach = 5;</code>
   * @return Whether the onTargetReach field is set.
   */
  boolean hasOnTargetReach();
  /**
   * <pre>
   * Number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency or
   * GenerateReachForecastRequest.effective_frequency_limit times that exactly
   * matches the Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the on_target_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>optional int64 on_target_reach = 5;</code>
   * @return The onTargetReach.
   */
  long getOnTargetReach();

  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency or
   * GenerateReachForecastRequest.effective_frequency_limit times. This includes
   * people that may fall outside the specified Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the total_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>optional int64 total_reach = 6;</code>
   * @return Whether the totalReach field is set.
   */
  boolean hasTotalReach();
  /**
   * <pre>
   * Total number of unique people reached at least
   * GenerateReachForecastRequest.min_effective_frequency or
   * GenerateReachForecastRequest.effective_frequency_limit times. This includes
   * people that may fall outside the specified Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the total_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>optional int64 total_reach = 6;</code>
   * @return The totalReach.
   */
  long getTotalReach();

  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>optional int64 on_target_impressions = 7;</code>
   * @return Whether the onTargetImpressions field is set.
   */
  boolean hasOnTargetImpressions();
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting.
   * </pre>
   *
   * <code>optional int64 on_target_impressions = 7;</code>
   * @return The onTargetImpressions.
   */
  long getOnTargetImpressions();

  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>optional int64 total_impressions = 8;</code>
   * @return Whether the totalImpressions field is set.
   */
  boolean hasTotalImpressions();
  /**
   * <pre>
   * Total number of ad impressions. This includes impressions that may fall
   * outside the specified Targeting, due to insufficient information on
   * signed-in users.
   * </pre>
   *
   * <code>optional int64 total_impressions = 8;</code>
   * @return The totalImpressions.
   */
  long getTotalImpressions();

  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>optional int64 viewable_impressions = 9;</code>
   * @return Whether the viewableImpressions field is set.
   */
  boolean hasViewableImpressions();
  /**
   * <pre>
   * Number of times the ad's impressions were considered viewable.
   * See https://support.google.com/google-ads/answer/7029393 for
   * more information about what makes an ad viewable and how
   * viewability is measured.
   * </pre>
   *
   * <code>optional int64 viewable_impressions = 9;</code>
   * @return The viewableImpressions.
   */
  long getViewableImpressions();

  /**
   * <pre>
   * A list of effective frequency forecasts. The list is ordered starting with
   * 1+ and ending with the value set in
   * GenerateReachForecastRequest.effective_frequency_limit. If no
   * effective_frequency_limit was set, this list will be empty.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.EffectiveFrequencyBreakdown effective_frequency_breakdowns = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v20.services.EffectiveFrequencyBreakdown> 
      getEffectiveFrequencyBreakdownsList();
  /**
   * <pre>
   * A list of effective frequency forecasts. The list is ordered starting with
   * 1+ and ending with the value set in
   * GenerateReachForecastRequest.effective_frequency_limit. If no
   * effective_frequency_limit was set, this list will be empty.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.EffectiveFrequencyBreakdown effective_frequency_breakdowns = 10;</code>
   */
  com.google.ads.googleads.v20.services.EffectiveFrequencyBreakdown getEffectiveFrequencyBreakdowns(int index);
  /**
   * <pre>
   * A list of effective frequency forecasts. The list is ordered starting with
   * 1+ and ending with the value set in
   * GenerateReachForecastRequest.effective_frequency_limit. If no
   * effective_frequency_limit was set, this list will be empty.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.EffectiveFrequencyBreakdown effective_frequency_breakdowns = 10;</code>
   */
  int getEffectiveFrequencyBreakdownsCount();
  /**
   * <pre>
   * A list of effective frequency forecasts. The list is ordered starting with
   * 1+ and ending with the value set in
   * GenerateReachForecastRequest.effective_frequency_limit. If no
   * effective_frequency_limit was set, this list will be empty.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.EffectiveFrequencyBreakdown effective_frequency_breakdowns = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.services.EffectiveFrequencyBreakdownOrBuilder> 
      getEffectiveFrequencyBreakdownsOrBuilderList();
  /**
   * <pre>
   * A list of effective frequency forecasts. The list is ordered starting with
   * 1+ and ending with the value set in
   * GenerateReachForecastRequest.effective_frequency_limit. If no
   * effective_frequency_limit was set, this list will be empty.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.EffectiveFrequencyBreakdown effective_frequency_breakdowns = 10;</code>
   */
  com.google.ads.googleads.v20.services.EffectiveFrequencyBreakdownOrBuilder getEffectiveFrequencyBreakdownsOrBuilder(
      int index);

  /**
   * <pre>
   * Number of unique people reached that exactly matches the Targeting
   * including co-viewers.
   * </pre>
   *
   * <code>optional int64 on_target_coview_reach = 11;</code>
   * @return Whether the onTargetCoviewReach field is set.
   */
  boolean hasOnTargetCoviewReach();
  /**
   * <pre>
   * Number of unique people reached that exactly matches the Targeting
   * including co-viewers.
   * </pre>
   *
   * <code>optional int64 on_target_coview_reach = 11;</code>
   * @return The onTargetCoviewReach.
   */
  long getOnTargetCoviewReach();

  /**
   * <pre>
   * Number of unique people reached including co-viewers. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>optional int64 total_coview_reach = 12;</code>
   * @return Whether the totalCoviewReach field is set.
   */
  boolean hasTotalCoviewReach();
  /**
   * <pre>
   * Number of unique people reached including co-viewers. This includes
   * people that may fall outside the specified Targeting.
   * </pre>
   *
   * <code>optional int64 total_coview_reach = 12;</code>
   * @return The totalCoviewReach.
   */
  long getTotalCoviewReach();

  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting including
   * co-viewers.
   * </pre>
   *
   * <code>optional int64 on_target_coview_impressions = 13;</code>
   * @return Whether the onTargetCoviewImpressions field is set.
   */
  boolean hasOnTargetCoviewImpressions();
  /**
   * <pre>
   * Number of ad impressions that exactly matches the Targeting including
   * co-viewers.
   * </pre>
   *
   * <code>optional int64 on_target_coview_impressions = 13;</code>
   * @return The onTargetCoviewImpressions.
   */
  long getOnTargetCoviewImpressions();

  /**
   * <pre>
   * Total number of ad impressions including co-viewers. This includes
   * impressions that may fall outside the specified Targeting, due to
   * insufficient information on signed-in users.
   * </pre>
   *
   * <code>optional int64 total_coview_impressions = 14;</code>
   * @return Whether the totalCoviewImpressions field is set.
   */
  boolean hasTotalCoviewImpressions();
  /**
   * <pre>
   * Total number of ad impressions including co-viewers. This includes
   * impressions that may fall outside the specified Targeting, due to
   * insufficient information on signed-in users.
   * </pre>
   *
   * <code>optional int64 total_coview_impressions = 14;</code>
   * @return The totalCoviewImpressions.
   */
  long getTotalCoviewImpressions();

  /**
   * <pre>
   * Number of ad views forecasted for the specified product and targeting.
   * A view is counted when a viewer views a larger portion or the entirety of
   * an ad beyond an impression.
   *
   * See https://support.google.com/google-ads/answer/2375431 for
   * more information on views.
   * </pre>
   *
   * <code>optional int64 views = 15;</code>
   * @return Whether the views field is set.
   */
  boolean hasViews();
  /**
   * <pre>
   * Number of ad views forecasted for the specified product and targeting.
   * A view is counted when a viewer views a larger portion or the entirety of
   * an ad beyond an impression.
   *
   * See https://support.google.com/google-ads/answer/2375431 for
   * more information on views.
   * </pre>
   *
   * <code>optional int64 views = 15;</code>
   * @return The views.
   */
  long getViews();

  /**
   * <pre>
   * The number of conversions.
   * This metric is only available for DEMAND_GEN plannable products.
   *
   * See https://support.google.com/google-ads/answer/2375431 for
   * more information on conversions.
   * </pre>
   *
   * <code>optional double conversions = 16;</code>
   * @return Whether the conversions field is set.
   */
  boolean hasConversions();
  /**
   * <pre>
   * The number of conversions.
   * This metric is only available for DEMAND_GEN plannable products.
   *
   * See https://support.google.com/google-ads/answer/2375431 for
   * more information on conversions.
   * </pre>
   *
   * <code>optional double conversions = 16;</code>
   * @return The conversions.
   */
  double getConversions();
}
