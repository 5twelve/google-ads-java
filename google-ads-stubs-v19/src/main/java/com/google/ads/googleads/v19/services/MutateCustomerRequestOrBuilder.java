// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/customer_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface MutateCustomerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateCustomerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v19.services.CustomerOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.CustomerOperation operation = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.CustomerOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 6;</code>
   * @return The enum numeric value on the wire for responseContentType.
   */
  int getResponseContentTypeValue();
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned post mutation.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 6;</code>
   * @return The responseContentType.
   */
  com.google.ads.googleads.v19.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType();
}
