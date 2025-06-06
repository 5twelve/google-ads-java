// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/criteria.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface KeywordInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.KeywordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   * @return The enum numeric value on the wire for matchType.
   */
  int getMatchTypeValue();
  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   * @return The matchType.
   */
  com.google.ads.googleads.v20.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType();
}
