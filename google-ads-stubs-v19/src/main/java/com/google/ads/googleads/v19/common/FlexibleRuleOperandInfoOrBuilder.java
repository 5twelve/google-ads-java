// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/user_lists.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface FlexibleRuleOperandInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.FlexibleRuleOperandInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListRuleInfo rule = 1;</code>
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListRuleInfo rule = 1;</code>
   * @return The rule.
   */
  com.google.ads.googleads.v19.common.UserListRuleInfo getRule();
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListRuleInfo rule = 1;</code>
   */
  com.google.ads.googleads.v19.common.UserListRuleInfoOrBuilder getRuleOrBuilder();

  /**
   * <pre>
   * Lookback window for this rule in days. From now until X days ago.
   * </pre>
   *
   * <code>optional int64 lookback_window_days = 2;</code>
   * @return Whether the lookbackWindowDays field is set.
   */
  boolean hasLookbackWindowDays();
  /**
   * <pre>
   * Lookback window for this rule in days. From now until X days ago.
   * </pre>
   *
   * <code>optional int64 lookback_window_days = 2;</code>
   * @return The lookbackWindowDays.
   */
  long getLookbackWindowDays();
}
