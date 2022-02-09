// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/user_lists.proto

package com.google.ads.googleads.v10.common;

public interface UserListRuleInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.UserListRuleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rule type is used to determine how to group rule items.
   * The default is OR of ANDs (disjunctive normal form).
   * That is, rule items will be ANDed together within rule item groups and the
   * groups themselves will be ORed together.
   * Currently AND of ORs (conjunctive normal form) is only supported for
   * ExpressionRuleUserList.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
   * @return The enum numeric value on the wire for ruleType.
   */
  int getRuleTypeValue();
  /**
   * <pre>
   * Rule type is used to determine how to group rule items.
   * The default is OR of ANDs (disjunctive normal form).
   * That is, rule items will be ANDed together within rule item groups and the
   * groups themselves will be ORed together.
   * Currently AND of ORs (conjunctive normal form) is only supported for
   * ExpressionRuleUserList.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListRuleTypeEnum.UserListRuleType rule_type = 1;</code>
   * @return The ruleType.
   */
  com.google.ads.googleads.v10.enums.UserListRuleTypeEnum.UserListRuleType getRuleType();

  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v10.common.UserListRuleItemGroupInfo> 
      getRuleItemGroupsList();
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  com.google.ads.googleads.v10.common.UserListRuleItemGroupInfo getRuleItemGroups(int index);
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  int getRuleItemGroupsCount();
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v10.common.UserListRuleItemGroupInfoOrBuilder> 
      getRuleItemGroupsOrBuilderList();
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.UserListRuleItemGroupInfo rule_item_groups = 2;</code>
   */
  com.google.ads.googleads.v10.common.UserListRuleItemGroupInfoOrBuilder getRuleItemGroupsOrBuilder(
      int index);
}
