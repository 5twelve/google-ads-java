// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/bidding.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface FixedCpmTargetFrequencyGoalInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.FixedCpmTargetFrequencyGoalInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Target frequency count represents the number of times an advertiser wants
   * to show the ad to target a single user.
   * </pre>
   *
   * <code>int64 target_count = 1;</code>
   * @return The targetCount.
   */
  long getTargetCount();

  /**
   * <pre>
   * Time window expressing the period over which you want to reach
   * the specified target_count.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.FixedCpmTargetFrequencyTimeUnitEnum.FixedCpmTargetFrequencyTimeUnit time_unit = 2;</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  int getTimeUnitValue();
  /**
   * <pre>
   * Time window expressing the period over which you want to reach
   * the specified target_count.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.FixedCpmTargetFrequencyTimeUnitEnum.FixedCpmTargetFrequencyTimeUnit time_unit = 2;</code>
   * @return The timeUnit.
   */
  com.google.ads.googleads.v20.enums.FixedCpmTargetFrequencyTimeUnitEnum.FixedCpmTargetFrequencyTimeUnit getTimeUnit();
}
