// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/experiment_service.proto

package com.google.ads.googleads.v10.services;

public interface ScheduleExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.ScheduleExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The scheduled experiment.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Required. The scheduled experiment.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
