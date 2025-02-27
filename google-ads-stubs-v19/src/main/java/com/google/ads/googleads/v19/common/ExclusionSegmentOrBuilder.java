// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface ExclusionSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.ExclusionSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListSegment user_list = 1;</code>
   * @return Whether the userList field is set.
   */
  boolean hasUserList();
  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListSegment user_list = 1;</code>
   * @return The userList.
   */
  com.google.ads.googleads.v19.common.UserListSegment getUserList();
  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.UserListSegment user_list = 1;</code>
   */
  com.google.ads.googleads.v19.common.UserListSegmentOrBuilder getUserListOrBuilder();

  com.google.ads.googleads.v19.common.ExclusionSegment.SegmentCase getSegmentCase();
}
