// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/conversion_value_rule.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface ConversionValueRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.ConversionValueRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the conversion value rule.
   * Conversion value rule resource names have the form:
   *
   * `customers/{customer_id}/conversionValueRules/{conversion_value_rule_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the conversion value rule.
   * Conversion value rule resource names have the form:
   *
   * `customers/{customer_id}/conversionValueRules/{conversion_value_rule_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the conversion value rule.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Action applied when the rule is triggered.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAction action = 3;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <pre>
   * Action applied when the rule is triggered.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAction action = 3;</code>
   * @return The action.
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAction getAction();
  /**
   * <pre>
   * Action applied when the rule is triggered.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAction action = 3;</code>
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleActionOrBuilder getActionOrBuilder();

  /**
   * <pre>
   * Condition for Geo location that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleGeoLocationCondition geo_location_condition = 4;</code>
   * @return Whether the geoLocationCondition field is set.
   */
  boolean hasGeoLocationCondition();
  /**
   * <pre>
   * Condition for Geo location that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleGeoLocationCondition geo_location_condition = 4;</code>
   * @return The geoLocationCondition.
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleGeoLocationCondition getGeoLocationCondition();
  /**
   * <pre>
   * Condition for Geo location that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleGeoLocationCondition geo_location_condition = 4;</code>
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleGeoLocationConditionOrBuilder getGeoLocationConditionOrBuilder();

  /**
   * <pre>
   * Condition for device type that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleDeviceCondition device_condition = 5;</code>
   * @return Whether the deviceCondition field is set.
   */
  boolean hasDeviceCondition();
  /**
   * <pre>
   * Condition for device type that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleDeviceCondition device_condition = 5;</code>
   * @return The deviceCondition.
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleDeviceCondition getDeviceCondition();
  /**
   * <pre>
   * Condition for device type that must be satisfied for the value rule to
   * apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleDeviceCondition device_condition = 5;</code>
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleDeviceConditionOrBuilder getDeviceConditionOrBuilder();

  /**
   * <pre>
   * Condition for audience that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAudienceCondition audience_condition = 6;</code>
   * @return Whether the audienceCondition field is set.
   */
  boolean hasAudienceCondition();
  /**
   * <pre>
   * Condition for audience that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAudienceCondition audience_condition = 6;</code>
   * @return The audienceCondition.
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAudienceCondition getAudienceCondition();
  /**
   * <pre>
   * Condition for audience that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAudienceCondition audience_condition = 6;</code>
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleAudienceConditionOrBuilder getAudienceConditionOrBuilder();

  /**
   * <pre>
   * Condition for itinerary that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleItineraryCondition itinerary_condition = 9;</code>
   * @return Whether the itineraryCondition field is set.
   */
  boolean hasItineraryCondition();
  /**
   * <pre>
   * Condition for itinerary that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleItineraryCondition itinerary_condition = 9;</code>
   * @return The itineraryCondition.
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleItineraryCondition getItineraryCondition();
  /**
   * <pre>
   * Condition for itinerary that must be satisfied for the value rule to apply.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleItineraryCondition itinerary_condition = 9;</code>
   */
  com.google.ads.googleads.v19.resources.ConversionValueRule.ValueRuleItineraryConditionOrBuilder getItineraryConditionOrBuilder();

  /**
   * <pre>
   * Output only. The resource name of the conversion value rule's owner
   * customer. When the value rule is inherited from a manager customer,
   * owner_customer will be the resource name of the manager whereas the
   * customer in the resource_name will be of the requesting serving customer.
   * ** Read-only **
   * </pre>
   *
   * <code>string owner_customer = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The ownerCustomer.
   */
  java.lang.String getOwnerCustomer();
  /**
   * <pre>
   * Output only. The resource name of the conversion value rule's owner
   * customer. When the value rule is inherited from a manager customer,
   * owner_customer will be the resource name of the manager whereas the
   * customer in the resource_name will be of the requesting serving customer.
   * ** Read-only **
   * </pre>
   *
   * <code>string owner_customer = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for ownerCustomer.
   */
  com.google.protobuf.ByteString
      getOwnerCustomerBytes();

  /**
   * <pre>
   * The status of the conversion value rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ConversionValueRuleStatusEnum.ConversionValueRuleStatus status = 8;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the conversion value rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.ConversionValueRuleStatusEnum.ConversionValueRuleStatus status = 8;</code>
   * @return The status.
   */
  com.google.ads.googleads.v19.enums.ConversionValueRuleStatusEnum.ConversionValueRuleStatus getStatus();
}
