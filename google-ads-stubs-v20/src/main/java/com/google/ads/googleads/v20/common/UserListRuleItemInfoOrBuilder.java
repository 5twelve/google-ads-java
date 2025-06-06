// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/user_lists.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface UserListRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.UserListRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Rule variable name. It should match the corresponding key name fired
   * by the pixel.
   * A name must begin with US-ascii letters or underscore or UTF8 code that is
   * greater than 127 and consist of US-ascii letters or digits or underscore or
   * UTF8 code that is greater than 127.
   * For websites, there are two built-in variable URL (name = 'url__') and
   * referrer URL (name = 'ref_url__').
   * This field must be populated when creating a new rule item.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * An atomic rule item composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   * @return Whether the numberRuleItem field is set.
   */
  boolean hasNumberRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   * @return The numberRuleItem.
   */
  com.google.ads.googleads.v20.common.UserListNumberRuleItemInfo getNumberRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a number operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListNumberRuleItemInfo number_rule_item = 2;</code>
   */
  com.google.ads.googleads.v20.common.UserListNumberRuleItemInfoOrBuilder getNumberRuleItemOrBuilder();

  /**
   * <pre>
   * An atomic rule item composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   * @return Whether the stringRuleItem field is set.
   */
  boolean hasStringRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   * @return The stringRuleItem.
   */
  com.google.ads.googleads.v20.common.UserListStringRuleItemInfo getStringRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a string operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListStringRuleItemInfo string_rule_item = 3;</code>
   */
  com.google.ads.googleads.v20.common.UserListStringRuleItemInfoOrBuilder getStringRuleItemOrBuilder();

  /**
   * <pre>
   * An atomic rule item composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   * @return Whether the dateRuleItem field is set.
   */
  boolean hasDateRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   * @return The dateRuleItem.
   */
  com.google.ads.googleads.v20.common.UserListDateRuleItemInfo getDateRuleItem();
  /**
   * <pre>
   * An atomic rule item composed of a date operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.UserListDateRuleItemInfo date_rule_item = 4;</code>
   */
  com.google.ads.googleads.v20.common.UserListDateRuleItemInfoOrBuilder getDateRuleItemOrBuilder();

  com.google.ads.googleads.v20.common.UserListRuleItemInfo.RuleItemCase getRuleItemCase();
}
