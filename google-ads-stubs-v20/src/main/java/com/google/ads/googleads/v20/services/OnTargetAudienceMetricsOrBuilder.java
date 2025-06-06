// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface OnTargetAudienceMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.OnTargetAudienceMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>optional int64 youtube_audience_size = 3;</code>
   * @return Whether the youtubeAudienceSize field is set.
   */
  boolean hasYoutubeAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>optional int64 youtube_audience_size = 3;</code>
   * @return The youtubeAudienceSize.
   */
  long getYoutubeAudienceSize();

  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>optional int64 census_audience_size = 4;</code>
   * @return Whether the censusAudienceSize field is set.
   */
  boolean hasCensusAudienceSize();
  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>optional int64 census_audience_size = 4;</code>
   * @return The censusAudienceSize.
   */
  long getCensusAudienceSize();
}
