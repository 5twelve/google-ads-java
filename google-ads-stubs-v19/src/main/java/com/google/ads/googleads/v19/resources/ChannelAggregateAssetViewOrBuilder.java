// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/channel_aggregate_asset_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface ChannelAggregateAssetViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.ChannelAggregateAssetView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the channel aggregate asset view.
   * Channel aggregate asset view resource names have the form:
   *
   * `customers/{customer_id}/channelAggregateAssetViews/{ChannelAssetV2.advertising_channel_type}~{ChannelAssetV2.asset_id}~{ChannelAssetV2.asset_source}~{ChannelAssetV2.field_type}"`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the channel aggregate asset view.
   * Channel aggregate asset view resource names have the form:
   *
   * `customers/{customer_id}/channelAggregateAssetViews/{ChannelAssetV2.advertising_channel_type}~{ChannelAssetV2.asset_id}~{ChannelAssetV2.asset_source}~{ChannelAssetV2.field_type}"`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Channel in which the asset served.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the advertisingChannelType field is set.
   */
  boolean hasAdvertisingChannelType();
  /**
   * <pre>
   * Output only. Channel in which the asset served.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for advertisingChannelType.
   */
  int getAdvertisingChannelTypeValue();
  /**
   * <pre>
   * Output only. Channel in which the asset served.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The advertisingChannelType.
   */
  com.google.ads.googleads.v19.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType getAdvertisingChannelType();

  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>optional string asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>optional string asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>optional string asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Output only. Source of the asset link.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetSourceEnum.AssetSource asset_source = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetSource field is set.
   */
  boolean hasAssetSource();
  /**
   * <pre>
   * Output only. Source of the asset link.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetSourceEnum.AssetSource asset_source = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetSource.
   */
  int getAssetSourceValue();
  /**
   * <pre>
   * Output only. Source of the asset link.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetSourceEnum.AssetSource asset_source = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetSource.
   */
  com.google.ads.googleads.v19.enums.AssetSourceEnum.AssetSource getAssetSource();

  /**
   * <pre>
   * Output only. FieldType of the asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetFieldTypeEnum.AssetFieldType field_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the fieldType field is set.
   */
  boolean hasFieldType();
  /**
   * <pre>
   * Output only. FieldType of the asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetFieldTypeEnum.AssetFieldType field_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Output only. FieldType of the asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.AssetFieldTypeEnum.AssetFieldType field_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v19.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();
}
