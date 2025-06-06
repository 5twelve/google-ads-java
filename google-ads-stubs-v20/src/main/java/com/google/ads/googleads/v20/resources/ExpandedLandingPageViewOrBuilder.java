// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/expanded_landing_page_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public interface ExpandedLandingPageViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.resources.ExpandedLandingPageView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   *
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   *
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expandedFinalUrl field is set.
   */
  boolean hasExpandedFinalUrl();
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expandedFinalUrl.
   */
  java.lang.String getExpandedFinalUrl();
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for expandedFinalUrl.
   */
  com.google.protobuf.ByteString
      getExpandedFinalUrlBytes();
}
