// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/product_link.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface GoogleAdsIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.GoogleAdsIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   * <pre>
   * Immutable. The resource name of the Google Ads account.
   * This field is required and should not be empty when creating a new
   * Google Ads link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString
      getCustomerBytes();
}
