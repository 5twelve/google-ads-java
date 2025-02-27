// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/data_link.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface YoutubeVideoIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.YoutubeVideoIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the channelId field is set.
   */
  boolean hasChannelId();
  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The channelId.
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for channelId.
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the videoId field is set.
   */
  boolean hasVideoId();
  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The videoId.
   */
  java.lang.String getVideoId();
  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for videoId.
   */
  com.google.protobuf.ByteString
      getVideoIdBytes();
}
