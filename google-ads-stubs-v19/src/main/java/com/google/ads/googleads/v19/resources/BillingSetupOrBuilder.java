// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/billing_setup.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public interface BillingSetupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.BillingSetup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the billing setup.
   * BillingSetup resource names have the form:
   *
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the billing setup.
   * BillingSetup resource names have the form:
   *
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the billing setup.
   * </pre>
   *
   * <code>optional int64 id = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the billing setup.
   * </pre>
   *
   * <code>optional int64 id = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v19.enums.BillingSetupStatusEnum.BillingSetupStatus getStatus();

  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this
   * billing setup. Payments resource names have the form:
   *
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>optional string payments_account = 18 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the paymentsAccount field is set.
   */
  boolean hasPaymentsAccount();
  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this
   * billing setup. Payments resource names have the form:
   *
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>optional string payments_account = 18 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The paymentsAccount.
   */
  java.lang.String getPaymentsAccount();
  /**
   * <pre>
   * Immutable. The resource name of the payments account associated with this
   * billing setup. Payments resource names have the form:
   *
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>optional string payments_account = 18 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for paymentsAccount.
   */
  com.google.protobuf.ByteString
      getPaymentsAccountBytes();

  /**
   * <pre>
   * Immutable. The payments account information associated with this billing
   * setup. When setting up billing, this is used to signup with a new payments
   * account (and then payments_account should not be set). When getting a
   * billing setup, this and payments_account will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the paymentsAccountInfo field is set.
   */
  boolean hasPaymentsAccountInfo();
  /**
   * <pre>
   * Immutable. The payments account information associated with this billing
   * setup. When setting up billing, this is used to signup with a new payments
   * account (and then payments_account should not be set). When getting a
   * billing setup, this and payments_account will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The paymentsAccountInfo.
   */
  com.google.ads.googleads.v19.resources.BillingSetup.PaymentsAccountInfo getPaymentsAccountInfo();
  /**
   * <pre>
   * Immutable. The payments account information associated with this billing
   * setup. When setting up billing, this is used to signup with a new payments
   * account (and then payments_account should not be set). When getting a
   * billing setup, this and payments_account will be populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v19.resources.BillingSetup.PaymentsAccountInfoOrBuilder getPaymentsAccountInfoOrBuilder();

  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format. Only a future time is allowed.
   * </pre>
   *
   * <code>string start_date_time = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the startDateTime field is set.
   */
  boolean hasStartDateTime();
  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format. Only a future time is allowed.
   * </pre>
   *
   * <code>string start_date_time = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The startDateTime.
   */
  java.lang.String getStartDateTime();
  /**
   * <pre>
   * Immutable. The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format. Only a future time is allowed.
   * </pre>
   *
   * <code>string start_date_time = 16 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for startDateTime.
   */
  com.google.protobuf.ByteString
      getStartDateTimeBytes();

  /**
   * <pre>
   * Immutable. The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType start_time_type = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the startTimeType field is set.
   */
  boolean hasStartTimeType();
  /**
   * <pre>
   * Immutable. The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType start_time_type = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for startTimeType.
   */
  int getStartTimeTypeValue();
  /**
   * <pre>
   * Immutable. The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType start_time_type = 10 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The startTimeType.
   */
  com.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType getStartTimeType();

  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format.
   * </pre>
   *
   * <code>string end_date_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endDateTime field is set.
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format.
   * </pre>
   *
   * <code>string end_date_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * Output only. The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss
   * format.
   * </pre>
   *
   * <code>string end_date_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();

  /**
   * <pre>
   * Output only. The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType end_time_type = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTimeType field is set.
   */
  boolean hasEndTimeType();
  /**
   * <pre>
   * Output only. The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType end_time_type = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for endTimeType.
   */
  int getEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType end_time_type = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTimeType.
   */
  com.google.ads.googleads.v19.enums.TimeTypeEnum.TimeType getEndTimeType();

  com.google.ads.googleads.v19.resources.BillingSetup.StartTimeCase getStartTimeCase();

  com.google.ads.googleads.v19.resources.BillingSetup.EndTimeCase getEndTimeCase();
}
