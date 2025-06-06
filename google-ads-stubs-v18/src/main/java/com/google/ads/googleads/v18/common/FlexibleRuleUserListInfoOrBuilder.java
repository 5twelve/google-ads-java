// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/user_lists.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

public interface FlexibleRuleUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.FlexibleRuleUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Operator that defines how the inclusive operands are combined.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.UserListFlexibleRuleOperatorEnum.UserListFlexibleRuleOperator inclusive_rule_operator = 1;</code>
   * @return The enum numeric value on the wire for inclusiveRuleOperator.
   */
  int getInclusiveRuleOperatorValue();
  /**
   * <pre>
   * Operator that defines how the inclusive operands are combined.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.UserListFlexibleRuleOperatorEnum.UserListFlexibleRuleOperator inclusive_rule_operator = 1;</code>
   * @return The inclusiveRuleOperator.
   */
  com.google.ads.googleads.v18.enums.UserListFlexibleRuleOperatorEnum.UserListFlexibleRuleOperator getInclusiveRuleOperator();

  /**
   * <pre>
   * Rules representing users that should be included in the user list. These
   * are located on the left side of the AND_NOT operator, and joined together
   * by either AND/OR as specified by the inclusive_rule_operator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo inclusive_operands = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.FlexibleRuleOperandInfo> 
      getInclusiveOperandsList();
  /**
   * <pre>
   * Rules representing users that should be included in the user list. These
   * are located on the left side of the AND_NOT operator, and joined together
   * by either AND/OR as specified by the inclusive_rule_operator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo inclusive_operands = 2;</code>
   */
  com.google.ads.googleads.v18.common.FlexibleRuleOperandInfo getInclusiveOperands(int index);
  /**
   * <pre>
   * Rules representing users that should be included in the user list. These
   * are located on the left side of the AND_NOT operator, and joined together
   * by either AND/OR as specified by the inclusive_rule_operator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo inclusive_operands = 2;</code>
   */
  int getInclusiveOperandsCount();
  /**
   * <pre>
   * Rules representing users that should be included in the user list. These
   * are located on the left side of the AND_NOT operator, and joined together
   * by either AND/OR as specified by the inclusive_rule_operator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo inclusive_operands = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.FlexibleRuleOperandInfoOrBuilder> 
      getInclusiveOperandsOrBuilderList();
  /**
   * <pre>
   * Rules representing users that should be included in the user list. These
   * are located on the left side of the AND_NOT operator, and joined together
   * by either AND/OR as specified by the inclusive_rule_operator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo inclusive_operands = 2;</code>
   */
  com.google.ads.googleads.v18.common.FlexibleRuleOperandInfoOrBuilder getInclusiveOperandsOrBuilder(
      int index);

  /**
   * <pre>
   * Rules representing users that should be excluded from the user list. These
   * are located on the right side of the AND_NOT operator, and joined together
   * by OR.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo exclusive_operands = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.FlexibleRuleOperandInfo> 
      getExclusiveOperandsList();
  /**
   * <pre>
   * Rules representing users that should be excluded from the user list. These
   * are located on the right side of the AND_NOT operator, and joined together
   * by OR.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo exclusive_operands = 3;</code>
   */
  com.google.ads.googleads.v18.common.FlexibleRuleOperandInfo getExclusiveOperands(int index);
  /**
   * <pre>
   * Rules representing users that should be excluded from the user list. These
   * are located on the right side of the AND_NOT operator, and joined together
   * by OR.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo exclusive_operands = 3;</code>
   */
  int getExclusiveOperandsCount();
  /**
   * <pre>
   * Rules representing users that should be excluded from the user list. These
   * are located on the right side of the AND_NOT operator, and joined together
   * by OR.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo exclusive_operands = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.FlexibleRuleOperandInfoOrBuilder> 
      getExclusiveOperandsOrBuilderList();
  /**
   * <pre>
   * Rules representing users that should be excluded from the user list. These
   * are located on the right side of the AND_NOT operator, and joined together
   * by OR.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.FlexibleRuleOperandInfo exclusive_operands = 3;</code>
   */
  com.google.ads.googleads.v18.common.FlexibleRuleOperandInfoOrBuilder getExclusiveOperandsOrBuilder(
      int index);
}
