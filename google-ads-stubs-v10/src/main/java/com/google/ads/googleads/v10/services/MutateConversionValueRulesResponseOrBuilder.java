// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/conversion_value_rule_service.proto

package com.google.ads.googleads.v10.services;

public interface MutateConversionValueRulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.MutateConversionValueRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.MutateConversionValueRuleResult results = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v10.services.MutateConversionValueRuleResult> 
      getResultsList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.MutateConversionValueRuleResult results = 2;</code>
   */
  com.google.ads.googleads.v10.services.MutateConversionValueRuleResult getResults(int index);
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.MutateConversionValueRuleResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.MutateConversionValueRuleResult results = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v10.services.MutateConversionValueRuleResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.services.MutateConversionValueRuleResult results = 2;</code>
   */
  com.google.ads.googleads.v10.services.MutateConversionValueRuleResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (e.g. auth errors),
   * we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();
}
