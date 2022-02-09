// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset_group.proto

package com.google.ads.googleads.v10.resources;

public interface AssetGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.resources.AssetGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset group.
   * Asset group resource names have the form:
   * `customers/{customer_id}/assetGroups/{asset_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset group.
   * Asset group resource names have the form:
   * `customers/{customer_id}/assetGroups/{asset_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the asset group.
   * </pre>
   *
   * <code>int64 id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. The campaign with which this asset group is associated.
   * The asset which is linked to the asset group.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign with which this asset group is associated.
   * The asset which is linked to the asset group.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Required. Name of the asset group. Required. It must have a minimum length of 1 and
   * maximum length of 128. It must be unique under a campaign.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the asset group. Required. It must have a minimum length of 1 and
   * maximum length of 128. It must be unique under a campaign.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A list of final URLs after all cross domain redirects. In performance max,
   * by default, the urls will be eligible for expansion unless opted out.
   * </pre>
   *
   * <code>repeated string final_urls = 4;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of final URLs after all cross domain redirects. In performance max,
   * by default, the urls will be eligible for expansion unless opted out.
   * </pre>
   *
   * <code>repeated string final_urls = 4;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of final URLs after all cross domain redirects. In performance max,
   * by default, the urls will be eligible for expansion unless opted out.
   * </pre>
   *
   * <code>repeated string final_urls = 4;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of final URLs after all cross domain redirects. In performance max,
   * by default, the urls will be eligible for expansion unless opted out.
   * </pre>
   *
   * <code>repeated string final_urls = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of final mobile URLs after all cross domain redirects. In
   * performance max, by default, the urls will be eligible for expansion
   * unless opted out.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 5;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of final mobile URLs after all cross domain redirects. In
   * performance max, by default, the urls will be eligible for expansion
   * unless opted out.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 5;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of final mobile URLs after all cross domain redirects. In
   * performance max, by default, the urls will be eligible for expansion
   * unless opted out.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 5;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of final mobile URLs after all cross domain redirects. In
   * performance max, by default, the urls will be eligible for expansion
   * unless opted out.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * The status of the asset group.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetGroupStatusEnum.AssetGroupStatus status = 6;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the asset group.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetGroupStatusEnum.AssetGroupStatus status = 6;</code>
   * @return The status.
   */
  com.google.ads.googleads.v10.enums.AssetGroupStatusEnum.AssetGroupStatus getStatus();

  /**
   * <pre>
   * First part of text that may appear appended to the url displayed in
   * the ad.
   * </pre>
   *
   * <code>string path1 = 7;</code>
   * @return The path1.
   */
  java.lang.String getPath1();
  /**
   * <pre>
   * First part of text that may appear appended to the url displayed in
   * the ad.
   * </pre>
   *
   * <code>string path1 = 7;</code>
   * @return The bytes for path1.
   */
  com.google.protobuf.ByteString
      getPath1Bytes();

  /**
   * <pre>
   * Second part of text that may appear appended to the url displayed in
   * the ad. This field can only be set when path1 is set.
   * </pre>
   *
   * <code>string path2 = 8;</code>
   * @return The path2.
   */
  java.lang.String getPath2();
  /**
   * <pre>
   * Second part of text that may appear appended to the url displayed in
   * the ad. This field can only be set when path1 is set.
   * </pre>
   *
   * <code>string path2 = 8;</code>
   * @return The bytes for path2.
   */
  com.google.protobuf.ByteString
      getPath2Bytes();
}
