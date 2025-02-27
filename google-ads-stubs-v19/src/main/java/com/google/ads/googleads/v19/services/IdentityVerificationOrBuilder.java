// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v19.services;

public interface IdentityVerificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.IdentityVerification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The verification program type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 1;</code>
   * @return The enum numeric value on the wire for verificationProgram.
   */
  int getVerificationProgramValue();
  /**
   * <pre>
   * The verification program type.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 1;</code>
   * @return The verificationProgram.
   */
  com.google.ads.googleads.v19.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram getVerificationProgram();

  /**
   * <pre>
   * The verification requirement for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationRequirement identity_verification_requirement = 2;</code>
   * @return Whether the identityVerificationRequirement field is set.
   */
  boolean hasIdentityVerificationRequirement();
  /**
   * <pre>
   * The verification requirement for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationRequirement identity_verification_requirement = 2;</code>
   * @return The identityVerificationRequirement.
   */
  com.google.ads.googleads.v19.services.IdentityVerificationRequirement getIdentityVerificationRequirement();
  /**
   * <pre>
   * The verification requirement for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationRequirement identity_verification_requirement = 2;</code>
   */
  com.google.ads.googleads.v19.services.IdentityVerificationRequirementOrBuilder getIdentityVerificationRequirementOrBuilder();

  /**
   * <pre>
   * Information regarding progress for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationProgress verification_progress = 3;</code>
   * @return Whether the verificationProgress field is set.
   */
  boolean hasVerificationProgress();
  /**
   * <pre>
   * Information regarding progress for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationProgress verification_progress = 3;</code>
   * @return The verificationProgress.
   */
  com.google.ads.googleads.v19.services.IdentityVerificationProgress getVerificationProgress();
  /**
   * <pre>
   * Information regarding progress for this verification program for this
   * customer.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.services.IdentityVerificationProgress verification_progress = 3;</code>
   */
  com.google.ads.googleads.v19.services.IdentityVerificationProgressOrBuilder getVerificationProgressOrBuilder();
}
