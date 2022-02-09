// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/recommendation_service.proto

package com.google.ads.googleads.v10.services;

public interface DismissRecommendationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.DismissRecommendationRequest)
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
   * Required. The list of operations to dismiss recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to dismiss recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to dismiss recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to dismiss recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to dismiss recommendations.
   * If partial_failure=false all recommendations should be of the same type
   * There is a limit of 100 operations per request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v10.services.DismissRecommendationRequest.DismissRecommendationOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, operations will be carried in a
   * single transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 2;</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();
}
