// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/keyword_plan_ad_group_keyword.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface KeywordPlanAdGroupKeywordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.KeywordPlanAdGroupKeyword)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan ad group keyword.
   * KeywordPlanAdGroupKeyword resource names have the form:
   *
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{kp_ad_group_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Plan ad group keyword.
   * KeywordPlanAdGroupKeyword resource names have the form:
   *
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{kp_ad_group_keyword_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The Keyword Plan ad group to which this keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the keywordPlanAdGroup field is set.
   */
  boolean hasKeywordPlanAdGroup();
  /**
   * <pre>
   * The Keyword Plan ad group to which this keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlanAdGroup.
   */
  java.lang.String getKeywordPlanAdGroup();
  /**
   * <pre>
   * The Keyword Plan ad group to which this keyword belongs.
   * </pre>
   *
   * <code>optional string keyword_plan_ad_group = 8 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlanAdGroup.
   */
  com.google.protobuf.ByteString
      getKeywordPlanAdGroupBytes();

  /**
   * <pre>
   * Output only. The ID of the Keyword Plan keyword.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the Keyword Plan keyword.
   * </pre>
   *
   * <code>optional int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The keyword text.
   * </pre>
   *
   * <code>optional string text = 10;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   * @return The enum numeric value on the wire for matchType.
   */
  int getMatchTypeValue();
  /**
   * <pre>
   * The keyword match type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 5;</code>
   * @return The matchType.
   */
  com.google.ads.googleads.v19.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType();

  /**
   * <pre>
   * A keyword level max cpc bid in micros (for example, $1 = 1mm). The currency
   * is the same as the account currency code. This will override any CPC bid
   * set at the keyword plan ad group level. Not applicable for negative
   * keywords. (negative = true) This field is Optional.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 11;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A keyword level max cpc bid in micros (for example, $1 = 1mm). The currency
   * is the same as the account currency code. This will override any CPC bid
   * set at the keyword plan ad group level. Not applicable for negative
   * keywords. (negative = true) This field is Optional.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 11;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();

  /**
   * <pre>
   * Immutable. If true, the keyword is negative.
   * </pre>
   *
   * <code>optional bool negative = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the negative field is set.
   */
  boolean hasNegative();
  /**
   * <pre>
   * Immutable. If true, the keyword is negative.
   * </pre>
   *
   * <code>optional bool negative = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The negative.
   */
  boolean getNegative();
}
