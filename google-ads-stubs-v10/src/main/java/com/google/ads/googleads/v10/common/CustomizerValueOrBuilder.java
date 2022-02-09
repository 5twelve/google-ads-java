// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/customizer_value.proto

package com.google.ads.googleads.v10.common;

public interface CustomizerValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.CustomizerValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The data type for the customizer value. It must match the attribute type.
   * The string_value content must match the constraints associated with the
   * type.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. The data type for the customizer value. It must match the attribute type.
   * The string_value content must match the constraints associated with the
   * type.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType();

  /**
   * <pre>
   * Required. Value to insert in creative text. Customizer values of all types are stored
   * as string to make formatting unambiguous.
   * </pre>
   *
   * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * Required. Value to insert in creative text. Customizer values of all types are stored
   * as string to make formatting unambiguous.
   * </pre>
   *
   * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();
}
