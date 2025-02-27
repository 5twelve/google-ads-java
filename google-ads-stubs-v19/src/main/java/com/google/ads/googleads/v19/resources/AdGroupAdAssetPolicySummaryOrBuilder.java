// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/ad_group_ad_asset_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface AdGroupAdAssetPolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.AdGroupAdAssetPolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The list of policy findings for the ad group ad asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * Output only. The list of policy findings for the ad group ad asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * Output only. The list of policy findings for the ad group ad asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * Output only. The list of policy findings for the ad group ad asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * Output only. The list of policy findings for the ad group ad asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.PolicyTopicEntry policy_topic_entries = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Where in the review process this ad group ad asset is.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for reviewStatus.
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Output only. Where in the review process this ad group ad asset is.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reviewStatus.
   */
  com.google.ads.googleads.v19.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * Output only. The overall approval status of this ad group ad asset,
   * calculated based on the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvalStatus.
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * Output only. The overall approval status of this ad group ad asset,
   * calculated based on the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvalStatus.
   */
  com.google.ads.googleads.v19.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();
}
