// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/recommendation_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface ApplyRecommendationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.ApplyRecommendationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ApplyRecommendationOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.ApplyRecommendationOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ApplyRecommendationOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.services.ApplyRecommendationOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ApplyRecommendationOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ApplyRecommendationOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.ApplyRecommendationOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to apply recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ApplyRecommendationOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.services.ApplyRecommendationOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, operations will be carried
   * out as a transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();
}
