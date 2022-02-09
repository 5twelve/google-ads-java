// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/user_lists.proto

package com.google.ads.googleads.v10.common;

public interface CombinedRuleUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.CombinedRuleUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo left_operand = 1;</code>
   * @return Whether the leftOperand field is set.
   */
  boolean hasLeftOperand();
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo left_operand = 1;</code>
   * @return The leftOperand.
   */
  com.google.ads.googleads.v10.common.UserListRuleInfo getLeftOperand();
  /**
   * <pre>
   * Left operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo left_operand = 1;</code>
   */
  com.google.ads.googleads.v10.common.UserListRuleInfoOrBuilder getLeftOperandOrBuilder();

  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo right_operand = 2;</code>
   * @return Whether the rightOperand field is set.
   */
  boolean hasRightOperand();
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo right_operand = 2;</code>
   * @return The rightOperand.
   */
  com.google.ads.googleads.v10.common.UserListRuleInfo getRightOperand();
  /**
   * <pre>
   * Right operand of the combined rule.
   * This field is required and must be populated when creating new combined
   * rule based user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListRuleInfo right_operand = 2;</code>
   */
  com.google.ads.googleads.v10.common.UserListRuleInfoOrBuilder getRightOperandOrBuilder();

  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   * @return The enum numeric value on the wire for ruleOperator.
   */
  int getRuleOperatorValue();
  /**
   * <pre>
   * Operator to connect the two operands.
   * Required for creating a combined rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator rule_operator = 3;</code>
   * @return The ruleOperator.
   */
  com.google.ads.googleads.v10.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator getRuleOperator();
}
