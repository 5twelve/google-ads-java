// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/asset.proto

package com.google.ads.googleads.v10.resources;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.resources.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset.
   * Asset resource names have the form:
   * `customers/{customer_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>optional int64 id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the asset.
   * </pre>
   *
   * <code>optional int64 id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>optional string name = 12;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>optional string name = 12;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional name of the asset.
   * </pre>
   *
   * <code>optional string name = 12;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetTypeEnum.AssetType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. Type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetTypeEnum.AssetType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v10.enums.AssetTypeEnum.AssetType getType();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 14;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 14;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 14;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 16;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 16;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 16;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 16;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);

  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 17;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 17;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 17;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.CustomParameter url_custom_parameters = 18;</code>
   */
  java.util.List<com.google.ads.googleads.v10.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.CustomParameter url_custom_parameters = 18;</code>
   */
  com.google.ads.googleads.v10.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.CustomParameter url_custom_parameters = 18;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.CustomParameter url_custom_parameters = 18;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v10.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * A list of mappings to be used for substituting URL custom parameter tags in
   * the tracking_url_template, final_urls, and/or final_mobile_urls.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.CustomParameter url_custom_parameters = 18;</code>
   */
  com.google.ads.googleads.v10.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 19;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 19;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to landing page URLs served with parallel
   * tracking.
   * </pre>
   *
   * <code>optional string final_url_suffix = 19;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * Output only. Policy information for the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetPolicySummary policy_summary = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummary field is set.
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetPolicySummary policy_summary = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummary.
   */
  com.google.ads.googleads.v10.resources.AssetPolicySummary getPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.AssetPolicySummary policy_summary = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v10.resources.AssetPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideoAsset field is set.
   */
  boolean hasYoutubeVideoAsset();
  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideoAsset.
   */
  com.google.ads.googleads.v10.common.YoutubeVideoAsset getYoutubeVideoAsset();
  /**
   * <pre>
   * Immutable. A YouTube video asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.YoutubeVideoAsset youtube_video_asset = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v10.common.YoutubeVideoAssetOrBuilder getYoutubeVideoAssetOrBuilder();

  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mediaBundleAsset field is set.
   */
  boolean hasMediaBundleAsset();
  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mediaBundleAsset.
   */
  com.google.ads.googleads.v10.common.MediaBundleAsset getMediaBundleAsset();
  /**
   * <pre>
   * Immutable. A media bundle asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MediaBundleAsset media_bundle_asset = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v10.common.MediaBundleAssetOrBuilder getMediaBundleAssetOrBuilder();

  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the imageAsset field is set.
   */
  boolean hasImageAsset();
  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The imageAsset.
   */
  com.google.ads.googleads.v10.common.ImageAsset getImageAsset();
  /**
   * <pre>
   * Output only. An image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ImageAsset image_asset = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v10.common.ImageAssetOrBuilder getImageAssetOrBuilder();

  /**
   * <pre>
   * Immutable. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the textAsset field is set.
   */
  boolean hasTextAsset();
  /**
   * <pre>
   * Immutable. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The textAsset.
   */
  com.google.ads.googleads.v10.common.TextAsset getTextAsset();
  /**
   * <pre>
   * Immutable. A text asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.TextAsset text_asset = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v10.common.TextAssetOrBuilder getTextAssetOrBuilder();

  /**
   * <pre>
   * A lead form asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.LeadFormAsset lead_form_asset = 9;</code>
   * @return Whether the leadFormAsset field is set.
   */
  boolean hasLeadFormAsset();
  /**
   * <pre>
   * A lead form asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.LeadFormAsset lead_form_asset = 9;</code>
   * @return The leadFormAsset.
   */
  com.google.ads.googleads.v10.common.LeadFormAsset getLeadFormAsset();
  /**
   * <pre>
   * A lead form asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.LeadFormAsset lead_form_asset = 9;</code>
   */
  com.google.ads.googleads.v10.common.LeadFormAssetOrBuilder getLeadFormAssetOrBuilder();

  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   * @return Whether the bookOnGoogleAsset field is set.
   */
  boolean hasBookOnGoogleAsset();
  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   * @return The bookOnGoogleAsset.
   */
  com.google.ads.googleads.v10.common.BookOnGoogleAsset getBookOnGoogleAsset();
  /**
   * <pre>
   * A book on google asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.BookOnGoogleAsset book_on_google_asset = 10;</code>
   */
  com.google.ads.googleads.v10.common.BookOnGoogleAssetOrBuilder getBookOnGoogleAssetOrBuilder();

  /**
   * <pre>
   * A promotion asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PromotionAsset promotion_asset = 15;</code>
   * @return Whether the promotionAsset field is set.
   */
  boolean hasPromotionAsset();
  /**
   * <pre>
   * A promotion asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PromotionAsset promotion_asset = 15;</code>
   * @return The promotionAsset.
   */
  com.google.ads.googleads.v10.common.PromotionAsset getPromotionAsset();
  /**
   * <pre>
   * A promotion asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PromotionAsset promotion_asset = 15;</code>
   */
  com.google.ads.googleads.v10.common.PromotionAssetOrBuilder getPromotionAssetOrBuilder();

  /**
   * <pre>
   * A callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CalloutAsset callout_asset = 20;</code>
   * @return Whether the calloutAsset field is set.
   */
  boolean hasCalloutAsset();
  /**
   * <pre>
   * A callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CalloutAsset callout_asset = 20;</code>
   * @return The calloutAsset.
   */
  com.google.ads.googleads.v10.common.CalloutAsset getCalloutAsset();
  /**
   * <pre>
   * A callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CalloutAsset callout_asset = 20;</code>
   */
  com.google.ads.googleads.v10.common.CalloutAssetOrBuilder getCalloutAssetOrBuilder();

  /**
   * <pre>
   * A structured snippet asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.StructuredSnippetAsset structured_snippet_asset = 21;</code>
   * @return Whether the structuredSnippetAsset field is set.
   */
  boolean hasStructuredSnippetAsset();
  /**
   * <pre>
   * A structured snippet asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.StructuredSnippetAsset structured_snippet_asset = 21;</code>
   * @return The structuredSnippetAsset.
   */
  com.google.ads.googleads.v10.common.StructuredSnippetAsset getStructuredSnippetAsset();
  /**
   * <pre>
   * A structured snippet asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.StructuredSnippetAsset structured_snippet_asset = 21;</code>
   */
  com.google.ads.googleads.v10.common.StructuredSnippetAssetOrBuilder getStructuredSnippetAssetOrBuilder();

  /**
   * <pre>
   * A sitelink asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.SitelinkAsset sitelink_asset = 22;</code>
   * @return Whether the sitelinkAsset field is set.
   */
  boolean hasSitelinkAsset();
  /**
   * <pre>
   * A sitelink asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.SitelinkAsset sitelink_asset = 22;</code>
   * @return The sitelinkAsset.
   */
  com.google.ads.googleads.v10.common.SitelinkAsset getSitelinkAsset();
  /**
   * <pre>
   * A sitelink asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.SitelinkAsset sitelink_asset = 22;</code>
   */
  com.google.ads.googleads.v10.common.SitelinkAssetOrBuilder getSitelinkAssetOrBuilder();

  /**
   * <pre>
   * A page feed asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PageFeedAsset page_feed_asset = 23;</code>
   * @return Whether the pageFeedAsset field is set.
   */
  boolean hasPageFeedAsset();
  /**
   * <pre>
   * A page feed asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PageFeedAsset page_feed_asset = 23;</code>
   * @return The pageFeedAsset.
   */
  com.google.ads.googleads.v10.common.PageFeedAsset getPageFeedAsset();
  /**
   * <pre>
   * A page feed asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PageFeedAsset page_feed_asset = 23;</code>
   */
  com.google.ads.googleads.v10.common.PageFeedAssetOrBuilder getPageFeedAssetOrBuilder();

  /**
   * <pre>
   * A dynamic education asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.DynamicEducationAsset dynamic_education_asset = 24;</code>
   * @return Whether the dynamicEducationAsset field is set.
   */
  boolean hasDynamicEducationAsset();
  /**
   * <pre>
   * A dynamic education asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.DynamicEducationAsset dynamic_education_asset = 24;</code>
   * @return The dynamicEducationAsset.
   */
  com.google.ads.googleads.v10.common.DynamicEducationAsset getDynamicEducationAsset();
  /**
   * <pre>
   * A dynamic education asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.DynamicEducationAsset dynamic_education_asset = 24;</code>
   */
  com.google.ads.googleads.v10.common.DynamicEducationAssetOrBuilder getDynamicEducationAssetOrBuilder();

  /**
   * <pre>
   * A mobile app asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MobileAppAsset mobile_app_asset = 25;</code>
   * @return Whether the mobileAppAsset field is set.
   */
  boolean hasMobileAppAsset();
  /**
   * <pre>
   * A mobile app asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MobileAppAsset mobile_app_asset = 25;</code>
   * @return The mobileAppAsset.
   */
  com.google.ads.googleads.v10.common.MobileAppAsset getMobileAppAsset();
  /**
   * <pre>
   * A mobile app asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.MobileAppAsset mobile_app_asset = 25;</code>
   */
  com.google.ads.googleads.v10.common.MobileAppAssetOrBuilder getMobileAppAssetOrBuilder();

  /**
   * <pre>
   * A hotel callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HotelCalloutAsset hotel_callout_asset = 26;</code>
   * @return Whether the hotelCalloutAsset field is set.
   */
  boolean hasHotelCalloutAsset();
  /**
   * <pre>
   * A hotel callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HotelCalloutAsset hotel_callout_asset = 26;</code>
   * @return The hotelCalloutAsset.
   */
  com.google.ads.googleads.v10.common.HotelCalloutAsset getHotelCalloutAsset();
  /**
   * <pre>
   * A hotel callout asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.HotelCalloutAsset hotel_callout_asset = 26;</code>
   */
  com.google.ads.googleads.v10.common.HotelCalloutAssetOrBuilder getHotelCalloutAssetOrBuilder();

  /**
   * <pre>
   * A call asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallAsset call_asset = 27;</code>
   * @return Whether the callAsset field is set.
   */
  boolean hasCallAsset();
  /**
   * <pre>
   * A call asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallAsset call_asset = 27;</code>
   * @return The callAsset.
   */
  com.google.ads.googleads.v10.common.CallAsset getCallAsset();
  /**
   * <pre>
   * A call asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallAsset call_asset = 27;</code>
   */
  com.google.ads.googleads.v10.common.CallAssetOrBuilder getCallAssetOrBuilder();

  /**
   * <pre>
   * A price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PriceAsset price_asset = 28;</code>
   * @return Whether the priceAsset field is set.
   */
  boolean hasPriceAsset();
  /**
   * <pre>
   * A price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PriceAsset price_asset = 28;</code>
   * @return The priceAsset.
   */
  com.google.ads.googleads.v10.common.PriceAsset getPriceAsset();
  /**
   * <pre>
   * A price asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.PriceAsset price_asset = 28;</code>
   */
  com.google.ads.googleads.v10.common.PriceAssetOrBuilder getPriceAssetOrBuilder();

  /**
   * <pre>
   * Immutable. A call to action asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallToActionAsset call_to_action_asset = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the callToActionAsset field is set.
   */
  boolean hasCallToActionAsset();
  /**
   * <pre>
   * Immutable. A call to action asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallToActionAsset call_to_action_asset = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The callToActionAsset.
   */
  com.google.ads.googleads.v10.common.CallToActionAsset getCallToActionAsset();
  /**
   * <pre>
   * Immutable. A call to action asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.CallToActionAsset call_to_action_asset = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v10.common.CallToActionAssetOrBuilder getCallToActionAssetOrBuilder();

  public com.google.ads.googleads.v10.resources.Asset.AssetDataCase getAssetDataCase();
}
