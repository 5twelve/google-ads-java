// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/conversion_adjustment_upload_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface ConversionAdjustmentResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.ConversionAdjustmentResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The gclid and conversion date time of the conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.GclidDateTimePair gclid_date_time_pair = 9;</code>
   * @return Whether the gclidDateTimePair field is set.
   */
  boolean hasGclidDateTimePair();
  /**
   * <pre>
   * The gclid and conversion date time of the conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.GclidDateTimePair gclid_date_time_pair = 9;</code>
   * @return The gclidDateTimePair.
   */
  com.google.ads.googleads.v19.services.GclidDateTimePair getGclidDateTimePair();
  /**
   * <pre>
   * The gclid and conversion date time of the conversion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.GclidDateTimePair gclid_date_time_pair = 9;</code>
   */
  com.google.ads.googleads.v19.services.GclidDateTimePairOrBuilder getGclidDateTimePairOrBuilder();

  /**
   * <pre>
   * The order ID of the conversion to be adjusted.
   * </pre>
   *
   * <code>string order_id = 10;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted.
   * </pre>
   *
   * <code>string order_id = 10;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment.
   * </pre>
   *
   * <code>optional string conversion_action = 7;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment.
   * </pre>
   *
   * <code>optional string conversion_action = 7;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment.
   * </pre>
   *
   * <code>optional string conversion_action = 7;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the adjustment occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 8;</code>
   * @return Whether the adjustmentDateTime field is set.
   */
  boolean hasAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 8;</code>
   * @return The adjustmentDateTime.
   */
  java.lang.String getAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string adjustment_date_time = 8;</code>
   * @return The bytes for adjustmentDateTime.
   */
  com.google.protobuf.ByteString
      getAdjustmentDateTimeBytes();

  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The enum numeric value on the wire for adjustmentType.
   */
  int getAdjustmentTypeValue();
  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The adjustmentType.
   */
  com.google.ads.googleads.v19.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType getAdjustmentType();
}
