// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/batch_job_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface ListBatchJobResultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.ListBatchJobResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.BatchJobResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.BatchJobResult> 
      getResultsList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.BatchJobResult results = 1;</code>
   */
  com.google.ads.googleads.v18.services.BatchJobResult getResults(int index);
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.BatchJobResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.BatchJobResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.BatchJobResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.BatchJobResult results = 1;</code>
   */
  com.google.ads.googleads.v18.services.BatchJobResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results.
   * Pass the content of this string as the `page_token` attribute of
   * the next request. `next_page_token` is not returned for the last
   * page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
