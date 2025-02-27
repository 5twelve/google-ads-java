// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/ad_group_asset_set.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface AdGroupAssetSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.AdGroupAssetSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group asset set.
   * Ad group asset set resource names have the form:
   *
   * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group asset set.
   * Ad group asset set resource names have the form:
   *
   * `customers/{customer_id}/adGroupAssetSets/{ad_group_id}~{asset_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group to which this asset set is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which this asset set is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Immutable. The asset set which is linked to the ad group.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  java.lang.String getAssetSet();
  /**
   * <pre>
   * Immutable. The asset set which is linked to the ad group.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  com.google.protobuf.ByteString
      getAssetSetBytes();

  /**
   * <pre>
   * Output only. The status of the ad group asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the ad group asset set. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v19.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus();
}
