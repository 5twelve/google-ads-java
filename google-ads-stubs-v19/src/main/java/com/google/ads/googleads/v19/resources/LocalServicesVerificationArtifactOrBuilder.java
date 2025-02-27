// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/local_services_verification_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.resources;

public interface LocalServicesVerificationArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.LocalServicesVerificationArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Local Services Verification.
   * Local Services Verification resource names have the form:
   *
   * `customers/{customer_id}/localServicesVerificationArtifacts/{verification_artifact_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Local Services Verification.
   * Local Services Verification resource names have the form:
   *
   * `customers/{customer_id}/localServicesVerificationArtifacts/{verification_artifact_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the verification artifact.
   * </pre>
   *
   * <code>optional int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the verification artifact.
   * </pre>
   *
   * <code>optional int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The timestamp when this verification artifact was created.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationDateTime.
   */
  java.lang.String getCreationDateTime();
  /**
   * <pre>
   * Output only. The timestamp when this verification artifact was created.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for creationDateTime.
   */
  com.google.protobuf.ByteString
      getCreationDateTimeBytes();

  /**
   * <pre>
   * Output only. The status of the verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactStatusEnum.LocalServicesVerificationArtifactStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactStatusEnum.LocalServicesVerificationArtifactStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactStatusEnum.LocalServicesVerificationArtifactStatus getStatus();

  /**
   * <pre>
   * Output only. The type of the verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactTypeEnum.LocalServicesVerificationArtifactType artifact_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for artifactType.
   */
  int getArtifactTypeValue();
  /**
   * <pre>
   * Output only. The type of the verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactTypeEnum.LocalServicesVerificationArtifactType artifact_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The artifactType.
   */
  com.google.ads.googleads.v19.enums.LocalServicesVerificationArtifactTypeEnum.LocalServicesVerificationArtifactType getArtifactType();

  /**
   * <pre>
   * Output only. A background check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BackgroundCheckVerificationArtifact background_check_verification_artifact = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the backgroundCheckVerificationArtifact field is set.
   */
  boolean hasBackgroundCheckVerificationArtifact();
  /**
   * <pre>
   * Output only. A background check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BackgroundCheckVerificationArtifact background_check_verification_artifact = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The backgroundCheckVerificationArtifact.
   */
  com.google.ads.googleads.v19.resources.BackgroundCheckVerificationArtifact getBackgroundCheckVerificationArtifact();
  /**
   * <pre>
   * Output only. A background check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BackgroundCheckVerificationArtifact background_check_verification_artifact = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.BackgroundCheckVerificationArtifactOrBuilder getBackgroundCheckVerificationArtifactOrBuilder();

  /**
   * <pre>
   * Output only. An insurance verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.InsuranceVerificationArtifact insurance_verification_artifact = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the insuranceVerificationArtifact field is set.
   */
  boolean hasInsuranceVerificationArtifact();
  /**
   * <pre>
   * Output only. An insurance verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.InsuranceVerificationArtifact insurance_verification_artifact = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The insuranceVerificationArtifact.
   */
  com.google.ads.googleads.v19.resources.InsuranceVerificationArtifact getInsuranceVerificationArtifact();
  /**
   * <pre>
   * Output only. An insurance verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.InsuranceVerificationArtifact insurance_verification_artifact = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.InsuranceVerificationArtifactOrBuilder getInsuranceVerificationArtifactOrBuilder();

  /**
   * <pre>
   * Output only. A license verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.LicenseVerificationArtifact license_verification_artifact = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseVerificationArtifact field is set.
   */
  boolean hasLicenseVerificationArtifact();
  /**
   * <pre>
   * Output only. A license verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.LicenseVerificationArtifact license_verification_artifact = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseVerificationArtifact.
   */
  com.google.ads.googleads.v19.resources.LicenseVerificationArtifact getLicenseVerificationArtifact();
  /**
   * <pre>
   * Output only. A license verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.LicenseVerificationArtifact license_verification_artifact = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.LicenseVerificationArtifactOrBuilder getLicenseVerificationArtifactOrBuilder();

  /**
   * <pre>
   * Output only. A business registration check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BusinessRegistrationCheckVerificationArtifact business_registration_check_verification_artifact = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the businessRegistrationCheckVerificationArtifact field is set.
   */
  boolean hasBusinessRegistrationCheckVerificationArtifact();
  /**
   * <pre>
   * Output only. A business registration check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BusinessRegistrationCheckVerificationArtifact business_registration_check_verification_artifact = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The businessRegistrationCheckVerificationArtifact.
   */
  com.google.ads.googleads.v19.resources.BusinessRegistrationCheckVerificationArtifact getBusinessRegistrationCheckVerificationArtifact();
  /**
   * <pre>
   * Output only. A business registration check verification artifact.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.BusinessRegistrationCheckVerificationArtifact business_registration_check_verification_artifact = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.resources.BusinessRegistrationCheckVerificationArtifactOrBuilder getBusinessRegistrationCheckVerificationArtifactOrBuilder();

  com.google.ads.googleads.v19.resources.LocalServicesVerificationArtifact.ArtifactDataCase getArtifactDataCase();
}
