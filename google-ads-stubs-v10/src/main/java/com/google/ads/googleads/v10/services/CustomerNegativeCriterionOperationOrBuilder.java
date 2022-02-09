// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/customer_negative_criterion_service.proto

package com.google.ads.googleads.v10.services;

public interface CustomerNegativeCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.CustomerNegativeCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CustomerNegativeCriterion create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CustomerNegativeCriterion create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v10.resources.CustomerNegativeCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.CustomerNegativeCriterion create = 1;</code>
   */
  com.google.ads.googleads.v10.resources.CustomerNegativeCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/customerNegativeCriteria/{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v10.services.CustomerNegativeCriterionOperation.OperationCase getOperationCase();
}
