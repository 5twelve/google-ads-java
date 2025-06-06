// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/targeting_setting.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public interface TargetRestrictionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.TargetRestriction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The targeting dimension that these settings apply to.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
   * @return The enum numeric value on the wire for targetingDimension.
   */
  int getTargetingDimensionValue();
  /**
   * <pre>
   * The targeting dimension that these settings apply to.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TargetingDimensionEnum.TargetingDimension targeting_dimension = 1;</code>
   * @return The targetingDimension.
   */
  com.google.ads.googleads.v19.enums.TargetingDimensionEnum.TargetingDimension getTargetingDimension();

  /**
   * <pre>
   * Indicates whether to restrict your ads to show only for the criteria you
   * have selected for this targeting_dimension, or to target all values for
   * this targeting_dimension and show ads based on your targeting in other
   * TargetingDimensions. A value of `true` means that these criteria will only
   * apply bid modifiers, and not affect targeting. A value of `false` means
   * that these criteria will restrict targeting as well as applying bid
   * modifiers.
   * </pre>
   *
   * <code>optional bool bid_only = 3;</code>
   * @return Whether the bidOnly field is set.
   */
  boolean hasBidOnly();
  /**
   * <pre>
   * Indicates whether to restrict your ads to show only for the criteria you
   * have selected for this targeting_dimension, or to target all values for
   * this targeting_dimension and show ads based on your targeting in other
   * TargetingDimensions. A value of `true` means that these criteria will only
   * apply bid modifiers, and not affect targeting. A value of `false` means
   * that these criteria will restrict targeting as well as applying bid
   * modifiers.
   * </pre>
   *
   * <code>optional bool bid_only = 3;</code>
   * @return The bidOnly.
   */
  boolean getBidOnly();
}
