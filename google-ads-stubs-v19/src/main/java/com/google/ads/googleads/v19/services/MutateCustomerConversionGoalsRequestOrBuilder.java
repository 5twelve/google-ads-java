// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/customer_conversion_goal_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface MutateCustomerConversionGoalsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateCustomerConversionGoalsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose customer conversion goals are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose customer conversion goals are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual customer
   * conversion goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.CustomerConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.services.CustomerConversionGoalOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer
   * conversion goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.CustomerConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.CustomerConversionGoalOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer
   * conversion goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.CustomerConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer
   * conversion goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.CustomerConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.services.CustomerConversionGoalOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer
   * conversion goal.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.CustomerConversionGoalOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.CustomerConversionGoalOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
