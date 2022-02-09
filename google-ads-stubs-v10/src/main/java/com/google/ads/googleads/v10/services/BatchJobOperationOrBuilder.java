// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/batch_job_service.proto

package com.google.ads.googleads.v10.services;

public interface BatchJobOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.BatchJobOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.BatchJob create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.BatchJob create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v10.resources.BatchJob getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.BatchJob create = 1;</code>
   */
  com.google.ads.googleads.v10.resources.BatchJobOrBuilder getCreateOrBuilder();

  public com.google.ads.googleads.v10.services.BatchJobOperation.OperationCase getOperationCase();
}
