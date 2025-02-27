// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/criterion_category_availability.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.common;

public interface CriterionCategoryAvailabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.CriterionCategoryAvailability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Channel types and subtypes that are available to the category.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.CriterionCategoryChannelAvailability channel = 1;</code>
   * @return Whether the channel field is set.
   */
  boolean hasChannel();
  /**
   * <pre>
   * Channel types and subtypes that are available to the category.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.CriterionCategoryChannelAvailability channel = 1;</code>
   * @return The channel.
   */
  com.google.ads.googleads.v19.common.CriterionCategoryChannelAvailability getChannel();
  /**
   * <pre>
   * Channel types and subtypes that are available to the category.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.CriterionCategoryChannelAvailability channel = 1;</code>
   */
  com.google.ads.googleads.v19.common.CriterionCategoryChannelAvailabilityOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * Locales that are available to the category for the channel.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability locale = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability> 
      getLocaleList();
  /**
   * <pre>
   * Locales that are available to the category for the channel.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability locale = 2;</code>
   */
  com.google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability getLocale(int index);
  /**
   * <pre>
   * Locales that are available to the category for the channel.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability locale = 2;</code>
   */
  int getLocaleCount();
  /**
   * <pre>
   * Locales that are available to the category for the channel.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability locale = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.CriterionCategoryLocaleAvailabilityOrBuilder> 
      getLocaleOrBuilderList();
  /**
   * <pre>
   * Locales that are available to the category for the channel.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.CriterionCategoryLocaleAvailability locale = 2;</code>
   */
  com.google.ads.googleads.v19.common.CriterionCategoryLocaleAvailabilityOrBuilder getLocaleOrBuilder(
      int index);
}
