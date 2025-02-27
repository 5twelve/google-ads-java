// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/simulation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface TargetCpaSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.TargetCpaSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Projected required daily budget that the advertiser must set in order to
   * receive the estimated traffic, in micros of advertiser currency.
   * </pre>
   *
   * <code>int64 required_budget_amount_micros = 19;</code>
   * @return The requiredBudgetAmountMicros.
   */
  long getRequiredBudgetAmountMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 9;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 9;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 10;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 10;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of app installs.
   * </pre>
   *
   * <code>double app_installs = 15;</code>
   * @return The appInstalls.
   */
  double getAppInstalls();

  /**
   * <pre>
   * Projected number of in-app actions.
   * </pre>
   *
   * <code>double in_app_actions = 16;</code>
   * @return The inAppActions.
   */
  double getInAppActions();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 11;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 11;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 12;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 12;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 13;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 13;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 14;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 14;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();

  /**
   * <pre>
   * Projected number of interactions.
   * Only discovery advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 interactions = 20;</code>
   * @return Whether the interactions field is set.
   */
  boolean hasInteractions();
  /**
   * <pre>
   * Projected number of interactions.
   * Only discovery advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 interactions = 20;</code>
   * @return The interactions.
   */
  long getInteractions();

  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 17;</code>
   * @return Whether the targetCpaMicros field is set.
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * The simulated target CPA upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 target_cpa_micros = 17;</code>
   * @return The targetCpaMicros.
   */
  long getTargetCpaMicros();

  /**
   * <pre>
   * The simulated scaling modifier upon which projected metrics are based.
   * All CPA targets relevant to the simulated entity are scaled by this
   * modifier.
   * </pre>
   *
   * <code>double target_cpa_scaling_modifier = 18;</code>
   * @return Whether the targetCpaScalingModifier field is set.
   */
  boolean hasTargetCpaScalingModifier();
  /**
   * <pre>
   * The simulated scaling modifier upon which projected metrics are based.
   * All CPA targets relevant to the simulated entity are scaled by this
   * modifier.
   * </pre>
   *
   * <code>double target_cpa_scaling_modifier = 18;</code>
   * @return The targetCpaScalingModifier.
   */
  double getTargetCpaScalingModifier();

  com.google.ads.googleads.v19.common.TargetCpaSimulationPoint.TargetCpaSimulationKeyValueCase getTargetCpaSimulationKeyValueCase();
}
