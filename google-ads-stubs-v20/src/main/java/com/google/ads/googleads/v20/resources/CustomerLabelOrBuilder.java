// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/customer_label.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public interface CustomerLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.resources.CustomerLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * Customer label resource names have the form:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Customer label resource names have the form:
   * `customers/{customer_id}/customerLabels/{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is
   * attached. Read only.
   * </pre>
   *
   * <code>optional string customer = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is
   * attached. Read only.
   * </pre>
   *
   * <code>optional string customer = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   * <pre>
   * Output only. The resource name of the customer to which the label is
   * attached. Read only.
   * </pre>
   *
   * <code>optional string customer = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString
      getCustomerBytes();

  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   *
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   *
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Output only. The resource name of the label assigned to the customer.
   *
   * Note: the Customer ID portion of the label resource name is not
   * validated when creating a new CustomerLabel.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}
