// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/audience_insights_attribute.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface AudienceInsightsTopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.AudienceInsightsTopic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsEntity entity = 1;</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsEntity entity = 1;</code>
   * @return The entity.
   */
  com.google.ads.googleads.v19.common.AudienceInsightsEntity getEntity();
  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsEntity entity = 1;</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsEntityOrBuilder getEntityOrBuilder();

  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsCategory category = 2;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsCategory category = 2;</code>
   * @return The category.
   */
  com.google.ads.googleads.v19.common.AudienceInsightsCategory getCategory();
  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AudienceInsightsCategory category = 2;</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsCategoryOrBuilder getCategoryOrBuilder();

  com.google.ads.googleads.v19.common.AudienceInsightsTopic.TopicCase getTopicCase();
}
