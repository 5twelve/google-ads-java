// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/shared_criterion_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface SharedCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.SharedCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.SharedCriterion create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.SharedCriterion create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.SharedCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new shared
   * criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.SharedCriterion create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.SharedCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   *
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   *
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed shared criterion is
   * expected, in this format:
   *
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.SharedCriterionOperation.OperationCase getOperationCase();
}
