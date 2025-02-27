// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/campaign_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface EnableOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.EnableOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the campaign to enable.
   * </pre>
   *
   * <code>string campaign = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Required. The resource name of the campaign to enable.
   * </pre>
   *
   * <code>string campaign = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Required. The switch to automatically populate top-performing brand assets.
   * This field is required. If true, top-performing brand assets will be
   * automatically populated. If false, the brand_assets field is required.
   * </pre>
   *
   * <code>bool auto_populate_brand_assets = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The autoPopulateBrandAssets.
   */
  boolean getAutoPopulateBrandAssets();

  /**
   * <pre>
   * Optional. The brand assets linked to the campaign. This field is required
   * when the value of auto_populate_brand_assets is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.BrandCampaignAssets brand_assets = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the brandAssets field is set.
   */
  boolean hasBrandAssets();
  /**
   * <pre>
   * Optional. The brand assets linked to the campaign. This field is required
   * when the value of auto_populate_brand_assets is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.BrandCampaignAssets brand_assets = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The brandAssets.
   */
  com.google.ads.googleads.v19.services.BrandCampaignAssets getBrandAssets();
  /**
   * <pre>
   * Optional. The brand assets linked to the campaign. This field is required
   * when the value of auto_populate_brand_assets is false.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.BrandCampaignAssets brand_assets = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v19.services.BrandCampaignAssetsOrBuilder getBrandAssetsOrBuilder();

  /**
   * <pre>
   * Optional. The domain of the final uri.
   * </pre>
   *
   * <code>string final_uri_domain = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The finalUriDomain.
   */
  java.lang.String getFinalUriDomain();
  /**
   * <pre>
   * Optional. The domain of the final uri.
   * </pre>
   *
   * <code>string final_uri_domain = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for finalUriDomain.
   */
  com.google.protobuf.ByteString
      getFinalUriDomainBytes();

  /**
   * <pre>
   * Optional. Hex code representation of the main brand color, for example
   * #00ff00. main_color is required when accent color is specified.
   * </pre>
   *
   * <code>string main_color = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The mainColor.
   */
  java.lang.String getMainColor();
  /**
   * <pre>
   * Optional. Hex code representation of the main brand color, for example
   * #00ff00. main_color is required when accent color is specified.
   * </pre>
   *
   * <code>string main_color = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for mainColor.
   */
  com.google.protobuf.ByteString
      getMainColorBytes();

  /**
   * <pre>
   * Optional. Hex code representation of the accent brand color, for example
   * #00ff00. accent_color is required when main_color is specified.
   * </pre>
   *
   * <code>string accent_color = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The accentColor.
   */
  java.lang.String getAccentColor();
  /**
   * <pre>
   * Optional. Hex code representation of the accent brand color, for example
   * #00ff00. accent_color is required when main_color is specified.
   * </pre>
   *
   * <code>string accent_color = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for accentColor.
   */
  com.google.protobuf.ByteString
      getAccentColorBytes();

  /**
   * <pre>
   * Optional. The font family is specified as a string, and must be one of the
   * following: "Open Sans", "Roboto", "Roboto Slab", "Montserrat", "Poppins",
   * "Lato", "Oswald", or "Playfair Display".
   * </pre>
   *
   * <code>string font_family = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The fontFamily.
   */
  java.lang.String getFontFamily();
  /**
   * <pre>
   * Optional. The font family is specified as a string, and must be one of the
   * following: "Open Sans", "Roboto", "Roboto Slab", "Montserrat", "Poppins",
   * "Lato", "Oswald", or "Playfair Display".
   * </pre>
   *
   * <code>string font_family = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for fontFamily.
   */
  com.google.protobuf.ByteString
      getFontFamilyBytes();
}
