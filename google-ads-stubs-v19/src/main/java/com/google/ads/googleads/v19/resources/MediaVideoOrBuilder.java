// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/media_file.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface MediaVideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.MediaVideo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The duration of the Video in milliseconds.
   * </pre>
   *
   * <code>optional int64 ad_duration_millis = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the adDurationMillis field is set.
   */
  boolean hasAdDurationMillis();
  /**
   * <pre>
   * Output only. The duration of the Video in milliseconds.
   * </pre>
   *
   * <code>optional int64 ad_duration_millis = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The adDurationMillis.
   */
  long getAdDurationMillis();

  /**
   * <pre>
   * Immutable. The YouTube video ID (as seen in YouTube URLs). Adding prefix
   * "https://www.youtube.com/watch?v=" to this ID will get the YouTube
   * streaming URL for this video.
   * </pre>
   *
   * <code>optional string youtube_video_id = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideoId field is set.
   */
  boolean hasYoutubeVideoId();
  /**
   * <pre>
   * Immutable. The YouTube video ID (as seen in YouTube URLs). Adding prefix
   * "https://www.youtube.com/watch?v=" to this ID will get the YouTube
   * streaming URL for this video.
   * </pre>
   *
   * <code>optional string youtube_video_id = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideoId.
   */
  java.lang.String getYoutubeVideoId();
  /**
   * <pre>
   * Immutable. The YouTube video ID (as seen in YouTube URLs). Adding prefix
   * "https://www.youtube.com/watch?v=" to this ID will get the YouTube
   * streaming URL for this video.
   * </pre>
   *
   * <code>optional string youtube_video_id = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for youtubeVideoId.
   */
  com.google.protobuf.ByteString
      getYoutubeVideoIdBytes();

  /**
   * <pre>
   * Output only. The Advertising Digital Identification code for this video, as
   * defined by the American Association of Advertising Agencies, used mainly
   * for television commercials.
   * </pre>
   *
   * <code>optional string advertising_id_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the advertisingIdCode field is set.
   */
  boolean hasAdvertisingIdCode();
  /**
   * <pre>
   * Output only. The Advertising Digital Identification code for this video, as
   * defined by the American Association of Advertising Agencies, used mainly
   * for television commercials.
   * </pre>
   *
   * <code>optional string advertising_id_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The advertisingIdCode.
   */
  java.lang.String getAdvertisingIdCode();
  /**
   * <pre>
   * Output only. The Advertising Digital Identification code for this video, as
   * defined by the American Association of Advertising Agencies, used mainly
   * for television commercials.
   * </pre>
   *
   * <code>optional string advertising_id_code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for advertisingIdCode.
   */
  com.google.protobuf.ByteString
      getAdvertisingIdCodeBytes();

  /**
   * <pre>
   * Output only. The Industry Standard Commercial Identifier code for this
   * video, used mainly for television commercials.
   * </pre>
   *
   * <code>optional string isci_code = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the isciCode field is set.
   */
  boolean hasIsciCode();
  /**
   * <pre>
   * Output only. The Industry Standard Commercial Identifier code for this
   * video, used mainly for television commercials.
   * </pre>
   *
   * <code>optional string isci_code = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The isciCode.
   */
  java.lang.String getIsciCode();
  /**
   * <pre>
   * Output only. The Industry Standard Commercial Identifier code for this
   * video, used mainly for television commercials.
   * </pre>
   *
   * <code>optional string isci_code = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for isciCode.
   */
  com.google.protobuf.ByteString
      getIsciCodeBytes();
}
