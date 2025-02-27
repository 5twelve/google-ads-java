// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/product_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface CreateProductLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.CreateProductLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer for which the product link is created.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer for which the product link is created.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the productLink field is set.
   */
  boolean hasProductLink();
  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The productLink.
   */
  com.google.ads.googleads.v19.resources.ProductLink getProductLink();
  /**
   * <pre>
   * Required. The product link to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ProductLink product_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.resources.ProductLinkOrBuilder getProductLinkOrBuilder();
}
