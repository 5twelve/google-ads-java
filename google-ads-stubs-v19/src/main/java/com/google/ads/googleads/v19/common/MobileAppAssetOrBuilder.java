// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/asset_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public interface MobileAppAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.MobileAppAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. A string that uniquely identifies a mobile application. It should
   * just contain the platform native id, like "com.android.ebay" for Android or
   * "12345689" for iOS.
   * </pre>
   *
   * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <pre>
   * Required. A string that uniquely identifies a mobile application. It should
   * just contain the platform native id, like "com.android.ebay" for Android or
   * "12345689" for iOS.
   * </pre>
   *
   * <code>string app_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <pre>
   * Required. The application store that distributes this specific app.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.MobileAppVendorEnum.MobileAppVendor app_store = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for appStore.
   */
  int getAppStoreValue();
  /**
   * <pre>
   * Required. The application store that distributes this specific app.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.MobileAppVendorEnum.MobileAppVendor app_store = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The appStore.
   */
  com.google.ads.googleads.v19.enums.MobileAppVendorEnum.MobileAppVendor getAppStore();

  /**
   * <pre>
   * Required. The visible text displayed when the link is rendered in an ad.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The linkText.
   */
  java.lang.String getLinkText();
  /**
   * <pre>
   * Required. The visible text displayed when the link is rendered in an ad.
   * The length of this string should be between 1 and 25, inclusive.
   * </pre>
   *
   * <code>string link_text = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for linkText.
   */
  com.google.protobuf.ByteString
      getLinkTextBytes();

  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Start date of when this asset is effective and can begin serving, in
   * yyyy-MM-dd format.
   * </pre>
   *
   * <code>string start_date = 4;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Last date of when this asset is effective and still serving, in yyyy-MM-dd
   * format.
   * </pre>
   *
   * <code>string end_date = 5;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
