// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/local_services_lead.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public interface NoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.Note)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The date time when lead note was edited. The format is
   * "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone. Examples:
   * "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string edit_date_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The editDateTime.
   */
  java.lang.String getEditDateTime();
  /**
   * <pre>
   * Output only. The date time when lead note was edited. The format is
   * "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone. Examples:
   * "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string edit_date_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for editDateTime.
   */
  com.google.protobuf.ByteString
      getEditDateTimeBytes();

  /**
   * <pre>
   * Output only. Content of lead note.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Output only. Content of lead note.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
