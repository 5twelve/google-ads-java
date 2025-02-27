// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface GetIdentityVerificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.GetIdentityVerificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.  The ID of the customer for whom we are requesting verification
   *  information.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required.  The ID of the customer for whom we are requesting verification
   *  information.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();
}
