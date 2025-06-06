// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/offline_conversion_upload_client_summary.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public interface OfflineConversionAlertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.OfflineConversionAlert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  com.google.ads.googleads.v18.resources.OfflineConversionError getError();
  /**
   * <pre>
   * Output only. Error for offline conversion client alert.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.OfflineConversionError error = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.resources.OfflineConversionErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * Output only. Percentage of the error, the range of this field should be
   * [0, 1.0].
   * </pre>
   *
   * <code>double error_percentage = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The errorPercentage.
   */
  double getErrorPercentage();
}
