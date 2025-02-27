// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/customer_search_term_insight.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface CustomerSearchTermInsightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.CustomerSearchTermInsight)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the customer level search term insight.
   * Customer level search term insight resource names have the form:
   *
   * `customers/{customer_id}/customerSearchTermInsights/{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the customer level search term insight.
   * Customer level search term insight resource names have the form:
   *
   * `customers/{customer_id}/customerSearchTermInsights/{category_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryLabel field is set.
   */
  boolean hasCategoryLabel();
  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryLabel.
   */
  java.lang.String getCategoryLabel();
  /**
   * <pre>
   * Output only. The label for the search category. An empty string denotes the
   * catch-all category for search terms that didn't fit into another category.
   * </pre>
   *
   * <code>optional string category_label = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for categoryLabel.
   */
  com.google.protobuf.ByteString
      getCategoryLabelBytes();

  /**
   * <pre>
   * Output only. The ID of the insight.
   * </pre>
   *
   * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the insight.
   * </pre>
   *
   * <code>optional int64 id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();
}
