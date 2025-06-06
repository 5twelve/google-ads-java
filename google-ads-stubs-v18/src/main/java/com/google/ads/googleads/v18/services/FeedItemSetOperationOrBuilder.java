// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/feed_item_set_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface FeedItemSetOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.FeedItemSetOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item set
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item set
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.FeedItemSet getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new feed item set
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.FeedItemSetOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The feed item set is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The feed item set is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.FeedItemSet getUpdate();
  /**
   * <pre>
   * Update operation: The feed item set is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.FeedItemSet update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.FeedItemSetOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item is
   * expected, in this format:
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item is
   * expected, in this format:
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed feed item is
   * expected, in this format:
   * `customers/{customer_id}/feedItems/{feed_id}~{feed_item_set_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.FeedItemSetOperation.OperationCase getOperationCase();
}
