// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface DemandGenCarouselAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.DemandGenCarouselAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Advertiser/brand name.
   * </pre>
   *
   * <code>string business_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * Required. The Advertiser/brand name.
   * </pre>
   *
   * <code>string business_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * Required. Logo image to be used in the ad.  The minimum size is 128x128 and
   * the aspect ratio must be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset logo_image = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the logoImage field is set.
   */
  boolean hasLogoImage();
  /**
   * <pre>
   * Required. Logo image to be used in the ad.  The minimum size is 128x128 and
   * the aspect ratio must be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset logo_image = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The logoImage.
   */
  com.google.ads.googleads.v19.common.AdImageAsset getLogoImage();
  /**
   * <pre>
   * Required. Logo image to be used in the ad.  The minimum size is 128x128 and
   * the aspect ratio must be 1:1 (+-1%).
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdImageAsset logo_image = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AdImageAssetOrBuilder getLogoImageOrBuilder();

  /**
   * <pre>
   * Required. Headline of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset headline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the headline field is set.
   */
  boolean hasHeadline();
  /**
   * <pre>
   * Required. Headline of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset headline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The headline.
   */
  com.google.ads.googleads.v19.common.AdTextAsset getHeadline();
  /**
   * <pre>
   * Required. Headline of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset headline = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AdTextAssetOrBuilder getHeadlineOrBuilder();

  /**
   * <pre>
   * Required. The descriptive text of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset description = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Required. The descriptive text of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset description = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The description.
   */
  com.google.ads.googleads.v19.common.AdTextAsset getDescription();
  /**
   * <pre>
   * Required. The descriptive text of the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.AdTextAsset description = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AdTextAssetOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>string call_to_action_text = 5;</code>
   * @return The callToActionText.
   */
  java.lang.String getCallToActionText();
  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>string call_to_action_text = 5;</code>
   * @return The bytes for callToActionText.
   */
  com.google.protobuf.ByteString
      getCallToActionTextBytes();

  /**
   * <pre>
   * Required. Carousel cards that will display with the ad. Min 2 max 10.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset carousel_cards = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset> 
      getCarouselCardsList();
  /**
   * <pre>
   * Required. Carousel cards that will display with the ad. Min 2 max 10.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset carousel_cards = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset getCarouselCards(int index);
  /**
   * <pre>
   * Required. Carousel cards that will display with the ad. Min 2 max 10.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset carousel_cards = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCarouselCardsCount();
  /**
   * <pre>
   * Required. Carousel cards that will display with the ad. Min 2 max 10.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset carousel_cards = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.AdDemandGenCarouselCardAssetOrBuilder> 
      getCarouselCardsOrBuilderList();
  /**
   * <pre>
   * Required. Carousel cards that will display with the ad. Min 2 max 10.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AdDemandGenCarouselCardAsset carousel_cards = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.AdDemandGenCarouselCardAssetOrBuilder getCarouselCardsOrBuilder(
      int index);
}
