// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface BasicInsightsAudienceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.BasicInsightsAudience)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.LocationInfo> 
      getCountryLocationList();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.LocationInfo getCountryLocation(int index);
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCountryLocationCount();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.LocationInfoOrBuilder> 
      getCountryLocationOrBuilderList();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.common.LocationInfoOrBuilder getCountryLocationOrBuilder(
      int index);

  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.LocationInfo> 
      getSubCountryLocationsList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v19.common.LocationInfo getSubCountryLocations(int index);
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo sub_country_locations = 2;</code>
   */
  int getSubCountryLocationsCount();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.LocationInfoOrBuilder> 
      getSubCountryLocationsOrBuilderList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v19.common.LocationInfoOrBuilder getSubCountryLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.GenderInfo gender = 3;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.GenderInfo gender = 3;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v19.common.GenderInfo getGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.GenderInfo gender = 3;</code>
   */
  com.google.ads.googleads.v19.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.AgeRangeInfo> 
      getAgeRangesList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v19.common.AgeRangeInfo getAgeRanges(int index);
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AgeRangeInfo age_ranges = 4;</code>
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.AgeRangeInfoOrBuilder> 
      getAgeRangesOrBuilderList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v19.common.AgeRangeInfoOrBuilder getAgeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.UserInterestInfo user_interests = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.UserInterestInfo> 
      getUserInterestsList();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.UserInterestInfo user_interests = 5;</code>
   */
  com.google.ads.googleads.v19.common.UserInterestInfo getUserInterests(int index);
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.UserInterestInfo user_interests = 5;</code>
   */
  int getUserInterestsCount();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.UserInterestInfo user_interests = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.UserInterestInfoOrBuilder> 
      getUserInterestsOrBuilderList();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.UserInterestInfo user_interests = 5;</code>
   */
  com.google.ads.googleads.v19.common.UserInterestInfoOrBuilder getUserInterestsOrBuilder(
      int index);

  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsTopic topics = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.AudienceInsightsTopic> 
      getTopicsList();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsTopic topics = 7;</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsTopic getTopics(int index);
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsTopic topics = 7;</code>
   */
  int getTopicsCount();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsTopic topics = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.AudienceInsightsTopicOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.common.AudienceInsightsTopic topics = 7;</code>
   */
  com.google.ads.googleads.v19.common.AudienceInsightsTopicOrBuilder getTopicsOrBuilder(
      int index);
}
