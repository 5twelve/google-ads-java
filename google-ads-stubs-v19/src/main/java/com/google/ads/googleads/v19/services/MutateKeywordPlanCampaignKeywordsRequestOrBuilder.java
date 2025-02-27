// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/keyword_plan_campaign_keyword_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface MutateKeywordPlanCampaignKeywordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateKeywordPlanCampaignKeywordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose campaign keywords are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose campaign keywords are being
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
   * Required. The list of operations to perform on individual Keyword Plan
   * campaign keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual Keyword Plan
   * campaign keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual Keyword Plan
   * campaign keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual Keyword Plan
   * campaign keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual Keyword Plan
   * campaign keywords.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.KeywordPlanCampaignKeywordOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
