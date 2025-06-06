// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface SurfaceTargetingCombinationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.SurfaceTargetingCombinations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Default surface targeting applied to the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.SurfaceTargeting default_targeting = 1;</code>
   * @return Whether the defaultTargeting field is set.
   */
  boolean hasDefaultTargeting();
  /**
   * <pre>
   * Default surface targeting applied to the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.SurfaceTargeting default_targeting = 1;</code>
   * @return The defaultTargeting.
   */
  com.google.ads.googleads.v20.services.SurfaceTargeting getDefaultTargeting();
  /**
   * <pre>
   * Default surface targeting applied to the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.services.SurfaceTargeting default_targeting = 1;</code>
   */
  com.google.ads.googleads.v20.services.SurfaceTargetingOrBuilder getDefaultTargetingOrBuilder();

  /**
   * <pre>
   * Available surface target combinations for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.SurfaceTargeting available_targeting_combinations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v20.services.SurfaceTargeting> 
      getAvailableTargetingCombinationsList();
  /**
   * <pre>
   * Available surface target combinations for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.SurfaceTargeting available_targeting_combinations = 2;</code>
   */
  com.google.ads.googleads.v20.services.SurfaceTargeting getAvailableTargetingCombinations(int index);
  /**
   * <pre>
   * Available surface target combinations for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.SurfaceTargeting available_targeting_combinations = 2;</code>
   */
  int getAvailableTargetingCombinationsCount();
  /**
   * <pre>
   * Available surface target combinations for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.SurfaceTargeting available_targeting_combinations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.services.SurfaceTargetingOrBuilder> 
      getAvailableTargetingCombinationsOrBuilderList();
  /**
   * <pre>
   * Available surface target combinations for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.services.SurfaceTargeting available_targeting_combinations = 2;</code>
   */
  com.google.ads.googleads.v20.services.SurfaceTargetingOrBuilder getAvailableTargetingCombinationsOrBuilder(
      int index);
}
