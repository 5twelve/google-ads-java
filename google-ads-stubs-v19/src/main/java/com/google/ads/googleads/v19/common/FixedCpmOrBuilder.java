// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/bidding.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface FixedCpmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.FixedCpm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fixed CPM bidding goal. Determines the exact bidding optimization
   * parameters.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.FixedCpmGoalEnum.FixedCpmGoal goal = 1;</code>
   * @return The enum numeric value on the wire for goal.
   */
  int getGoalValue();
  /**
   * <pre>
   * Fixed CPM bidding goal. Determines the exact bidding optimization
   * parameters.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.FixedCpmGoalEnum.FixedCpmGoal goal = 1;</code>
   * @return The goal.
   */
  com.google.ads.googleads.v19.enums.FixedCpmGoalEnum.FixedCpmGoal getGoal();

  /**
   * <pre>
   * Target frequency bidding goal details.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.FixedCpmTargetFrequencyGoalInfo target_frequency_info = 2;</code>
   * @return Whether the targetFrequencyInfo field is set.
   */
  boolean hasTargetFrequencyInfo();
  /**
   * <pre>
   * Target frequency bidding goal details.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.FixedCpmTargetFrequencyGoalInfo target_frequency_info = 2;</code>
   * @return The targetFrequencyInfo.
   */
  com.google.ads.googleads.v19.common.FixedCpmTargetFrequencyGoalInfo getTargetFrequencyInfo();
  /**
   * <pre>
   * Target frequency bidding goal details.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.FixedCpmTargetFrequencyGoalInfo target_frequency_info = 2;</code>
   */
  com.google.ads.googleads.v19.common.FixedCpmTargetFrequencyGoalInfoOrBuilder getTargetFrequencyInfoOrBuilder();

  com.google.ads.googleads.v19.common.FixedCpm.GoalInfoCase getGoalInfoCase();
}
