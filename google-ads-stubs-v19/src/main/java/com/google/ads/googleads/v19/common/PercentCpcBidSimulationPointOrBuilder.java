// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/simulation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface PercentCpcBidSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.PercentCpcBidSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated percent CPC upon which projected metrics are based. Percent
   * CPC expressed as fraction of the advertised price for some good or service.
   * The value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>optional int64 percent_cpc_bid_micros = 1;</code>
   * @return Whether the percentCpcBidMicros field is set.
   */
  boolean hasPercentCpcBidMicros();
  /**
   * <pre>
   * The simulated percent CPC upon which projected metrics are based. Percent
   * CPC expressed as fraction of the advertised price for some good or service.
   * The value stored here is 1,000,000 * [fraction].
   * </pre>
   *
   * <code>optional int64 percent_cpc_bid_micros = 1;</code>
   * @return The percentCpcBidMicros.
   */
  long getPercentCpcBidMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 2;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 2;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions in local currency.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 3;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions in local currency.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 3;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 4;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 4;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 5;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 6;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 6;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 7;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 7;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();
}
