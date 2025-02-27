// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface GenerateKeywordIdeasRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.GenerateKeywordIdeasRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer with the recommendation.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 14;</code>
   * @return Whether the language field is set.
   */
  boolean hasLanguage();
  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 14;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * The resource name of the language to target.
   * Each keyword belongs to some set of languages; a keyword is included if
   * language is one of its languages.
   * If not set, all keywords will be included.
   * </pre>
   *
   * <code>optional string language = 14;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 15;</code>
   * @return A list containing the geoTargetConstants.
   */
  java.util.List<java.lang.String>
      getGeoTargetConstantsList();
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 15;</code>
   * @return The count of geoTargetConstants.
   */
  int getGeoTargetConstantsCount();
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 15;</code>
   * @param index The index of the element to return.
   * @return The geoTargetConstants at the given index.
   */
  java.lang.String getGeoTargetConstants(int index);
  /**
   * <pre>
   * The resource names of the location to target. Maximum is 10.
   * An empty list MAY be used to specify all targeting geos.
   * </pre>
   *
   * <code>repeated string geo_target_constants = 15;</code>
   * @param index The index of the value to return.
   * @return The bytes of the geoTargetConstants at the given index.
   */
  com.google.protobuf.ByteString
      getGeoTargetConstantsBytes(int index);

  /**
   * <pre>
   * If true, adult keywords will be included in response.
   * The default value is false.
   * </pre>
   *
   * <code>bool include_adult_keywords = 10;</code>
   * @return The includeAdultKeywords.
   */
  boolean getIncludeAdultKeywords();

  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. To request next page of results use the
   * value obtained from `next_page_token` in the previous response.
   * The request fields must match across pages.
   * </pre>
   *
   * <code>string page_token = 12;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. To request next page of results use the
   * value obtained from `next_page_token` in the previous response.
   * The request fields must match across pages.
   * </pre>
   *
   * <code>string page_token = 12;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Number of results to retrieve in a single page.
   * A maximum of 10,000 results may be returned, if the page_size
   * exceeds this, it is ignored.
   * If unspecified, at most 10,000 results will be returned.
   * The server may decide to further limit the number of returned resources.
   * If the response contains fewer than 10,000 results it may not be assumed
   * as last page of results.
   * </pre>
   *
   * <code>int32 page_size = 13;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Targeting network.
   * If not set, Google Search And Partners Network will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 9;</code>
   * @return The enum numeric value on the wire for keywordPlanNetwork.
   */
  int getKeywordPlanNetworkValue();
  /**
   * <pre>
   * Targeting network.
   * If not set, Google Search And Partners Network will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 9;</code>
   * @return The keywordPlanNetwork.
   */
  com.google.ads.googleads.v19.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork getKeywordPlanNetwork();

  /**
   * <pre>
   * The keyword annotations to include in response.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation keyword_annotation = 17;</code>
   * @return A list containing the keywordAnnotation.
   */
  java.util.List<com.google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation> getKeywordAnnotationList();
  /**
   * <pre>
   * The keyword annotations to include in response.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation keyword_annotation = 17;</code>
   * @return The count of keywordAnnotation.
   */
  int getKeywordAnnotationCount();
  /**
   * <pre>
   * The keyword annotations to include in response.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation keyword_annotation = 17;</code>
   * @param index The index of the element to return.
   * @return The keywordAnnotation at the given index.
   */
  com.google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation getKeywordAnnotation(int index);
  /**
   * <pre>
   * The keyword annotations to include in response.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation keyword_annotation = 17;</code>
   * @return A list containing the enum numeric values on the wire for keywordAnnotation.
   */
  java.util.List<java.lang.Integer>
  getKeywordAnnotationValueList();
  /**
   * <pre>
   * The keyword annotations to include in response.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation keyword_annotation = 17;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of keywordAnnotation at the given index.
   */
  int getKeywordAnnotationValue(int index);

  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.KeywordPlanAggregateMetrics aggregate_metrics = 16;</code>
   * @return Whether the aggregateMetrics field is set.
   */
  boolean hasAggregateMetrics();
  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.KeywordPlanAggregateMetrics aggregate_metrics = 16;</code>
   * @return The aggregateMetrics.
   */
  com.google.ads.googleads.v19.common.KeywordPlanAggregateMetrics getAggregateMetrics();
  /**
   * <pre>
   * The aggregate fields to include in response.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.KeywordPlanAggregateMetrics aggregate_metrics = 16;</code>
   */
  com.google.ads.googleads.v19.common.KeywordPlanAggregateMetricsOrBuilder getAggregateMetricsOrBuilder();

  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.HistoricalMetricsOptions historical_metrics_options = 18;</code>
   * @return Whether the historicalMetricsOptions field is set.
   */
  boolean hasHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.HistoricalMetricsOptions historical_metrics_options = 18;</code>
   * @return The historicalMetricsOptions.
   */
  com.google.ads.googleads.v19.common.HistoricalMetricsOptions getHistoricalMetricsOptions();
  /**
   * <pre>
   * The options for historical metrics data.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.HistoricalMetricsOptions historical_metrics_options = 18;</code>
   */
  com.google.ads.googleads.v19.common.HistoricalMetricsOptionsOrBuilder getHistoricalMetricsOptionsOrBuilder();

  /**
   * <pre>
   * A Keyword and a specific Url to generate ideas from
   * for example, cars, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordAndUrlSeed keyword_and_url_seed = 2;</code>
   * @return Whether the keywordAndUrlSeed field is set.
   */
  boolean hasKeywordAndUrlSeed();
  /**
   * <pre>
   * A Keyword and a specific Url to generate ideas from
   * for example, cars, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordAndUrlSeed keyword_and_url_seed = 2;</code>
   * @return The keywordAndUrlSeed.
   */
  com.google.ads.googleads.v19.services.KeywordAndUrlSeed getKeywordAndUrlSeed();
  /**
   * <pre>
   * A Keyword and a specific Url to generate ideas from
   * for example, cars, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordAndUrlSeed keyword_and_url_seed = 2;</code>
   */
  com.google.ads.googleads.v19.services.KeywordAndUrlSeedOrBuilder getKeywordAndUrlSeedOrBuilder();

  /**
   * <pre>
   * A Keyword or phrase to generate ideas from, for example, cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordSeed keyword_seed = 3;</code>
   * @return Whether the keywordSeed field is set.
   */
  boolean hasKeywordSeed();
  /**
   * <pre>
   * A Keyword or phrase to generate ideas from, for example, cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordSeed keyword_seed = 3;</code>
   * @return The keywordSeed.
   */
  com.google.ads.googleads.v19.services.KeywordSeed getKeywordSeed();
  /**
   * <pre>
   * A Keyword or phrase to generate ideas from, for example, cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.KeywordSeed keyword_seed = 3;</code>
   */
  com.google.ads.googleads.v19.services.KeywordSeedOrBuilder getKeywordSeedOrBuilder();

  /**
   * <pre>
   * A specific url to generate ideas from, for example, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.UrlSeed url_seed = 5;</code>
   * @return Whether the urlSeed field is set.
   */
  boolean hasUrlSeed();
  /**
   * <pre>
   * A specific url to generate ideas from, for example, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.UrlSeed url_seed = 5;</code>
   * @return The urlSeed.
   */
  com.google.ads.googleads.v19.services.UrlSeed getUrlSeed();
  /**
   * <pre>
   * A specific url to generate ideas from, for example, www.example.com/cars.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.UrlSeed url_seed = 5;</code>
   */
  com.google.ads.googleads.v19.services.UrlSeedOrBuilder getUrlSeedOrBuilder();

  /**
   * <pre>
   * The site to generate ideas from, for example, www.example.com.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SiteSeed site_seed = 11;</code>
   * @return Whether the siteSeed field is set.
   */
  boolean hasSiteSeed();
  /**
   * <pre>
   * The site to generate ideas from, for example, www.example.com.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SiteSeed site_seed = 11;</code>
   * @return The siteSeed.
   */
  com.google.ads.googleads.v19.services.SiteSeed getSiteSeed();
  /**
   * <pre>
   * The site to generate ideas from, for example, www.example.com.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.services.SiteSeed site_seed = 11;</code>
   */
  com.google.ads.googleads.v19.services.SiteSeedOrBuilder getSiteSeedOrBuilder();

  com.google.ads.googleads.v19.services.GenerateKeywordIdeasRequest.SeedCase getSeedCase();
}
