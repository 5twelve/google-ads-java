// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/customer_manager_link_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface CustomerManagerLinkOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.CustomerManagerLinkOperation)
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
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomerManagerLink update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomerManagerLink update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.CustomerManagerLink getUpdate();
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.CustomerManagerLink update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.CustomerManagerLinkOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v18.services.CustomerManagerLinkOperation.OperationCase getOperationCase();
}
