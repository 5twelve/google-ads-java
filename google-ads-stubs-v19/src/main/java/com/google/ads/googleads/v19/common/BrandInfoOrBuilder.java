// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface BrandInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.BrandInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. A text representation of a brand.
   * </pre>
   *
   * <code>optional string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * Output only. A text representation of a brand.
   * </pre>
   *
   * <code>optional string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Output only. A text representation of a brand.
   * </pre>
   *
   * <code>optional string display_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The Commercial KG MID for the brand.
   * </pre>
   *
   * <code>optional string entity_id = 1;</code>
   * @return Whether the entityId field is set.
   */
  boolean hasEntityId();
  /**
   * <pre>
   * The Commercial KG MID for the brand.
   * </pre>
   *
   * <code>optional string entity_id = 1;</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * The Commercial KG MID for the brand.
   * </pre>
   *
   * <code>optional string entity_id = 1;</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Output only. The primary url of a brand.
   * </pre>
   *
   * <code>optional string primary_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the primaryUrl field is set.
   */
  boolean hasPrimaryUrl();
  /**
   * <pre>
   * Output only. The primary url of a brand.
   * </pre>
   *
   * <code>optional string primary_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The primaryUrl.
   */
  java.lang.String getPrimaryUrl();
  /**
   * <pre>
   * Output only. The primary url of a brand.
   * </pre>
   *
   * <code>optional string primary_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for primaryUrl.
   */
  com.google.protobuf.ByteString
      getPrimaryUrlBytes();

  /**
   * <pre>
   * Output only. The rejection reason when a brand status is REJECTED.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandRequestRejectionReasonEnum.BrandRequestRejectionReason rejection_reason = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the rejectionReason field is set.
   */
  boolean hasRejectionReason();
  /**
   * <pre>
   * Output only. The rejection reason when a brand status is REJECTED.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandRequestRejectionReasonEnum.BrandRequestRejectionReason rejection_reason = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for rejectionReason.
   */
  int getRejectionReasonValue();
  /**
   * <pre>
   * Output only. The rejection reason when a brand status is REJECTED.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandRequestRejectionReasonEnum.BrandRequestRejectionReason rejection_reason = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The rejectionReason.
   */
  com.google.ads.googleads.v19.enums.BrandRequestRejectionReasonEnum.BrandRequestRejectionReason getRejectionReason();

  /**
   * <pre>
   * Output only. The status of a brand.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandStateEnum.BrandState status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Output only. The status of a brand.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandStateEnum.BrandState status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of a brand.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.BrandStateEnum.BrandState status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v19.enums.BrandStateEnum.BrandState getStatus();
}
