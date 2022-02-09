// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/ad_type_infos.proto

package com.google.ads.googleads.v10.common;

public interface VideoAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.VideoAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The YouTube video assets used for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdVideoAsset video = 8;</code>
   * @return Whether the video field is set.
   */
  boolean hasVideo();
  /**
   * <pre>
   * The YouTube video assets used for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdVideoAsset video = 8;</code>
   * @return The video.
   */
  com.google.ads.googleads.v10.common.AdVideoAsset getVideo();
  /**
   * <pre>
   * The YouTube video assets used for the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdVideoAsset video = 8;</code>
   */
  com.google.ads.googleads.v10.common.AdVideoAssetOrBuilder getVideoOrBuilder();

  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   * @return Whether the inStream field is set.
   */
  boolean hasInStream();
  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   * @return The inStream.
   */
  com.google.ads.googleads.v10.common.VideoTrueViewInStreamAdInfo getInStream();
  /**
   * <pre>
   * Video TrueView in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoTrueViewInStreamAdInfo in_stream = 2;</code>
   */
  com.google.ads.googleads.v10.common.VideoTrueViewInStreamAdInfoOrBuilder getInStreamOrBuilder();

  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   * @return Whether the bumper field is set.
   */
  boolean hasBumper();
  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   * @return The bumper.
   */
  com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo getBumper();
  /**
   * <pre>
   * Video bumper in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo bumper = 3;</code>
   */
  com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfoOrBuilder getBumperOrBuilder();

  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoOutstreamAdInfo out_stream = 4;</code>
   * @return Whether the outStream field is set.
   */
  boolean hasOutStream();
  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoOutstreamAdInfo out_stream = 4;</code>
   * @return The outStream.
   */
  com.google.ads.googleads.v10.common.VideoOutstreamAdInfo getOutStream();
  /**
   * <pre>
   * Video out-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoOutstreamAdInfo out_stream = 4;</code>
   */
  com.google.ads.googleads.v10.common.VideoOutstreamAdInfoOrBuilder getOutStreamOrBuilder();

  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   * @return Whether the nonSkippable field is set.
   */
  boolean hasNonSkippable();
  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   * @return The nonSkippable.
   */
  com.google.ads.googleads.v10.common.VideoNonSkippableInStreamAdInfo getNonSkippable();
  /**
   * <pre>
   * Video non-skippable in-stream ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.VideoNonSkippableInStreamAdInfo non_skippable = 5;</code>
   */
  com.google.ads.googleads.v10.common.VideoNonSkippableInStreamAdInfoOrBuilder getNonSkippableOrBuilder();

  /**
   * <pre>
   * In-feed video ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.InFeedVideoAdInfo in_feed = 9;</code>
   * @return Whether the inFeed field is set.
   */
  boolean hasInFeed();
  /**
   * <pre>
   * In-feed video ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.InFeedVideoAdInfo in_feed = 9;</code>
   * @return The inFeed.
   */
  com.google.ads.googleads.v10.common.InFeedVideoAdInfo getInFeed();
  /**
   * <pre>
   * In-feed video ad format.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.InFeedVideoAdInfo in_feed = 9;</code>
   */
  com.google.ads.googleads.v10.common.InFeedVideoAdInfoOrBuilder getInFeedOrBuilder();

  public com.google.ads.googleads.v10.common.VideoAdInfo.FormatCase getFormatCase();
}
