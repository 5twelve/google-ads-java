// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/asset_group_top_combination_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface AssetGroupTopCombinationViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.AssetGroupTopCombinationView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the asset group top combination view.
   * AssetGroup Top Combination view resource names have the form:
   * `"customers/{customer_id}/assetGroupTopCombinationViews/{asset_group_id}~{asset_combination_category}"
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the asset group top combination view.
   * AssetGroup Top Combination view resource names have the form:
   * `"customers/{customer_id}/assetGroupTopCombinationViews/{asset_group_id}~{asset_combination_category}"
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The top combinations of assets that served together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.resources.AssetGroupAssetCombinationData asset_group_top_combinations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v19.resources.AssetGroupAssetCombinationData> 
      getAssetGroupTopCombinationsList();
  /**
   * <pre>
   * Output only. The top combinations of assets that served together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.resources.AssetGroupAssetCombinationData asset_group_top_combinations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AssetGroupAssetCombinationData getAssetGroupTopCombinations(int index);
  /**
   * <pre>
   * Output only. The top combinations of assets that served together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.resources.AssetGroupAssetCombinationData asset_group_top_combinations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAssetGroupTopCombinationsCount();
  /**
   * <pre>
   * Output only. The top combinations of assets that served together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.resources.AssetGroupAssetCombinationData asset_group_top_combinations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.resources.AssetGroupAssetCombinationDataOrBuilder> 
      getAssetGroupTopCombinationsOrBuilderList();
  /**
   * <pre>
   * Output only. The top combinations of assets that served together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.resources.AssetGroupAssetCombinationData asset_group_top_combinations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.AssetGroupAssetCombinationDataOrBuilder getAssetGroupTopCombinationsOrBuilder(
      int index);
}
