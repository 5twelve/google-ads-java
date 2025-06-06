// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/offline_user_data.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface StoreSalesThirdPartyMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.StoreSalesThirdPartyMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time the advertiser uploaded the data to the partner. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string advertiser_upload_date_time = 7;</code>
   * @return Whether the advertiserUploadDateTime field is set.
   */
  boolean hasAdvertiserUploadDateTime();
  /**
   * <pre>
   * Time the advertiser uploaded the data to the partner. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string advertiser_upload_date_time = 7;</code>
   * @return The advertiserUploadDateTime.
   */
  java.lang.String getAdvertiserUploadDateTime();
  /**
   * <pre>
   * Time the advertiser uploaded the data to the partner. Required.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string advertiser_upload_date_time = 7;</code>
   * @return The bytes for advertiserUploadDateTime.
   */
  com.google.protobuf.ByteString
      getAdvertiserUploadDateTimeBytes();

  /**
   * <pre>
   * The fraction of transactions that are valid. Invalid transactions may
   * include invalid formats or values.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double valid_transaction_fraction = 8;</code>
   * @return Whether the validTransactionFraction field is set.
   */
  boolean hasValidTransactionFraction();
  /**
   * <pre>
   * The fraction of transactions that are valid. Invalid transactions may
   * include invalid formats or values.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double valid_transaction_fraction = 8;</code>
   * @return The validTransactionFraction.
   */
  double getValidTransactionFraction();

  /**
   * <pre>
   * The fraction of valid transactions that are matched to a third party
   * assigned user ID on the partner side.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double partner_match_fraction = 9;</code>
   * @return Whether the partnerMatchFraction field is set.
   */
  boolean hasPartnerMatchFraction();
  /**
   * <pre>
   * The fraction of valid transactions that are matched to a third party
   * assigned user ID on the partner side.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double partner_match_fraction = 9;</code>
   * @return The partnerMatchFraction.
   */
  double getPartnerMatchFraction();

  /**
   * <pre>
   * The fraction of valid transactions that are uploaded by the partner to
   * Google.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double partner_upload_fraction = 10;</code>
   * @return Whether the partnerUploadFraction field is set.
   */
  boolean hasPartnerUploadFraction();
  /**
   * <pre>
   * The fraction of valid transactions that are uploaded by the partner to
   * Google.
   * Required.
   * The fraction needs to be between 0 and 1 (excluding 0).
   * </pre>
   *
   * <code>optional double partner_upload_fraction = 10;</code>
   * @return The partnerUploadFraction.
   */
  double getPartnerUploadFraction();

  /**
   * <pre>
   * Version of partner IDs to be used for uploads. Required.
   * </pre>
   *
   * <code>optional string bridge_map_version_id = 11;</code>
   * @return Whether the bridgeMapVersionId field is set.
   */
  boolean hasBridgeMapVersionId();
  /**
   * <pre>
   * Version of partner IDs to be used for uploads. Required.
   * </pre>
   *
   * <code>optional string bridge_map_version_id = 11;</code>
   * @return The bridgeMapVersionId.
   */
  java.lang.String getBridgeMapVersionId();
  /**
   * <pre>
   * Version of partner IDs to be used for uploads. Required.
   * </pre>
   *
   * <code>optional string bridge_map_version_id = 11;</code>
   * @return The bytes for bridgeMapVersionId.
   */
  com.google.protobuf.ByteString
      getBridgeMapVersionIdBytes();

  /**
   * <pre>
   * ID of the third party partner updating the transaction feed.
   * </pre>
   *
   * <code>optional int64 partner_id = 12;</code>
   * @return Whether the partnerId field is set.
   */
  boolean hasPartnerId();
  /**
   * <pre>
   * ID of the third party partner updating the transaction feed.
   * </pre>
   *
   * <code>optional int64 partner_id = 12;</code>
   * @return The partnerId.
   */
  long getPartnerId();
}
