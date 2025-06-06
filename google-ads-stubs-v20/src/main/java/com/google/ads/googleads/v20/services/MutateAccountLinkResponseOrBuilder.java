// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/account_link_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface MutateAccountLinkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.MutateAccountLinkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.MutateAccountLinkResult result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.MutateAccountLinkResult result = 1;</code>
   * @return The result.
   */
  com.google.ads.googleads.v20.services.MutateAccountLinkResult getResult();
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.MutateAccountLinkResult result = 1;</code>
   */
  com.google.ads.googleads.v20.services.MutateAccountLinkResultOrBuilder getResultOrBuilder();

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();
}
