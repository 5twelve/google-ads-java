// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/accessible_bidding_strategy.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public interface AccessibleBiddingStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.AccessibleBiddingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the accessible bidding strategy.
   * AccessibleBiddingStrategy resource names have the form:
   *
   * `customers/{customer_id}/accessibleBiddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the accessible bidding strategy.
   * AccessibleBiddingStrategy resource names have the form:
   *
   * `customers/{customer_id}/accessibleBiddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the bidding strategy.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The name of the bidding strategy.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the bidding strategy.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The type of the bidding strategy.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the bidding strategy.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v19.enums.BiddingStrategyTypeEnum.BiddingStrategyType getType();

  /**
   * <pre>
   * Output only. The ID of the Customer which owns the bidding strategy.
   * </pre>
   *
   * <code>int64 owner_customer_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The ownerCustomerId.
   */
  long getOwnerCustomerId();

  /**
   * <pre>
   * Output only. descriptive_name of the Customer which owns the bidding
   * strategy.
   * </pre>
   *
   * <code>string owner_descriptive_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The ownerDescriptiveName.
   */
  java.lang.String getOwnerDescriptiveName();
  /**
   * <pre>
   * Output only. descriptive_name of the Customer which owns the bidding
   * strategy.
   * </pre>
   *
   * <code>string owner_descriptive_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for ownerDescriptiveName.
   */
  com.google.protobuf.ByteString
      getOwnerDescriptiveNameBytes();

  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversion value for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionValue maximize_conversion_value = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the maximizeConversionValue field is set.
   */
  boolean hasMaximizeConversionValue();
  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversion value for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionValue maximize_conversion_value = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The maximizeConversionValue.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionValue getMaximizeConversionValue();
  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversion value for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionValue maximize_conversion_value = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionValueOrBuilder getMaximizeConversionValueOrBuilder();

  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversions for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversions maximize_conversions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the maximizeConversions field is set.
   */
  boolean hasMaximizeConversions();
  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversions for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversions maximize_conversions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The maximizeConversions.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversions getMaximizeConversions();
  /**
   * <pre>
   * Output only. An automated bidding strategy to help get the most
   * conversions for your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversions maximize_conversions = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.MaximizeConversionsOrBuilder getMaximizeConversionsOrBuilder();

  /**
   * <pre>
   * Output only. A bidding strategy that sets bids to help get as many
   * conversions as possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetCpa target_cpa = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetCpa field is set.
   */
  boolean hasTargetCpa();
  /**
   * <pre>
   * Output only. A bidding strategy that sets bids to help get as many
   * conversions as possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetCpa target_cpa = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetCpa.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetCpa getTargetCpa();
  /**
   * <pre>
   * Output only. A bidding strategy that sets bids to help get as many
   * conversions as possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetCpa target_cpa = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetCpaOrBuilder getTargetCpaOrBuilder();

  /**
   * <pre>
   * Output only. A bidding strategy that automatically optimizes towards a
   * chosen percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetImpressionShare target_impression_share = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetImpressionShare field is set.
   */
  boolean hasTargetImpressionShare();
  /**
   * <pre>
   * Output only. A bidding strategy that automatically optimizes towards a
   * chosen percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetImpressionShare target_impression_share = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetImpressionShare.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetImpressionShare getTargetImpressionShare();
  /**
   * <pre>
   * Output only. A bidding strategy that automatically optimizes towards a
   * chosen percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetImpressionShare target_impression_share = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetImpressionShareOrBuilder getTargetImpressionShareOrBuilder();

  /**
   * <pre>
   * Output only. A bidding strategy that helps you maximize revenue while
   * averaging a specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetRoas target_roas = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * Output only. A bidding strategy that helps you maximize revenue while
   * averaging a specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetRoas target_roas = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetRoas.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetRoas getTargetRoas();
  /**
   * <pre>
   * Output only. A bidding strategy that helps you maximize revenue while
   * averaging a specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetRoas target_roas = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetRoasOrBuilder getTargetRoasOrBuilder();

  /**
   * <pre>
   * Output only. A bid strategy that sets your bids to help get as many
   * clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetSpend target_spend = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetSpend field is set.
   */
  boolean hasTargetSpend();
  /**
   * <pre>
   * Output only. A bid strategy that sets your bids to help get as many
   * clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetSpend target_spend = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetSpend.
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetSpend getTargetSpend();
  /**
   * <pre>
   * Output only. A bid strategy that sets your bids to help get as many
   * clicks as possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetSpend target_spend = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.TargetSpendOrBuilder getTargetSpendOrBuilder();

  com.google.ads.googleads.v19.resources.AccessibleBiddingStrategy.SchemeCase getSchemeCase();
}
