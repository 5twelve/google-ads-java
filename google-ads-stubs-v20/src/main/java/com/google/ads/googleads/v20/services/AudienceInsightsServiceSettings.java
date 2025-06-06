/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.services.stub.AudienceInsightsServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AudienceInsightsServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (googleads.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of generateInsightsFinderReport:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AudienceInsightsServiceSettings.Builder audienceInsightsServiceSettingsBuilder =
 *     AudienceInsightsServiceSettings.newBuilder();
 * audienceInsightsServiceSettingsBuilder
 *     .generateInsightsFinderReportSettings()
 *     .setRetrySettings(
 *         audienceInsightsServiceSettingsBuilder
 *             .generateInsightsFinderReportSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * AudienceInsightsServiceSettings audienceInsightsServiceSettings =
 *     audienceInsightsServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class AudienceInsightsServiceSettings
    extends ClientSettings<AudienceInsightsServiceSettings> {

  /** Returns the object with the settings used for calls to generateInsightsFinderReport. */
  public UnaryCallSettings<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .generateInsightsFinderReportSettings();
  }

  /** Returns the object with the settings used for calls to listAudienceInsightsAttributes. */
  public UnaryCallSettings<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .listAudienceInsightsAttributesSettings();
  }

  /** Returns the object with the settings used for calls to listInsightsEligibleDates. */
  public UnaryCallSettings<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .listInsightsEligibleDatesSettings();
  }

  /** Returns the object with the settings used for calls to generateAudienceCompositionInsights. */
  public UnaryCallSettings<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .generateAudienceCompositionInsightsSettings();
  }

  /** Returns the object with the settings used for calls to generateSuggestedTargetingInsights. */
  public UnaryCallSettings<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .generateSuggestedTargetingInsightsSettings();
  }

  /** Returns the object with the settings used for calls to generateAudienceOverlapInsights. */
  public UnaryCallSettings<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .generateAudienceOverlapInsightsSettings();
  }

  /** Returns the object with the settings used for calls to generateTargetingSuggestionMetrics. */
  public UnaryCallSettings<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsSettings() {
    return ((AudienceInsightsServiceStubSettings) getStubSettings())
        .generateTargetingSuggestionMetricsSettings();
  }

  public static final AudienceInsightsServiceSettings create(
      AudienceInsightsServiceStubSettings stub) throws IOException {
    return new AudienceInsightsServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AudienceInsightsServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AudienceInsightsServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AudienceInsightsServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AudienceInsightsServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AudienceInsightsServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AudienceInsightsServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AudienceInsightsServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AudienceInsightsServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AudienceInsightsServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<AudienceInsightsServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(AudienceInsightsServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(AudienceInsightsServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AudienceInsightsServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(AudienceInsightsServiceStubSettings.newBuilder());
    }

    public AudienceInsightsServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((AudienceInsightsServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to generateInsightsFinderReport. */
    public UnaryCallSettings.Builder<
            GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
        generateInsightsFinderReportSettings() {
      return getStubSettingsBuilder().generateInsightsFinderReportSettings();
    }

    /** Returns the builder for the settings used for calls to listAudienceInsightsAttributes. */
    public UnaryCallSettings.Builder<
            ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
        listAudienceInsightsAttributesSettings() {
      return getStubSettingsBuilder().listAudienceInsightsAttributesSettings();
    }

    /** Returns the builder for the settings used for calls to listInsightsEligibleDates. */
    public UnaryCallSettings.Builder<
            ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
        listInsightsEligibleDatesSettings() {
      return getStubSettingsBuilder().listInsightsEligibleDatesSettings();
    }

    /**
     * Returns the builder for the settings used for calls to generateAudienceCompositionInsights.
     */
    public UnaryCallSettings.Builder<
            GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
        generateAudienceCompositionInsightsSettings() {
      return getStubSettingsBuilder().generateAudienceCompositionInsightsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to generateSuggestedTargetingInsights.
     */
    public UnaryCallSettings.Builder<
            GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
        generateSuggestedTargetingInsightsSettings() {
      return getStubSettingsBuilder().generateSuggestedTargetingInsightsSettings();
    }

    /** Returns the builder for the settings used for calls to generateAudienceOverlapInsights. */
    public UnaryCallSettings.Builder<
            GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
        generateAudienceOverlapInsightsSettings() {
      return getStubSettingsBuilder().generateAudienceOverlapInsightsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to generateTargetingSuggestionMetrics.
     */
    public UnaryCallSettings.Builder<
            GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
        generateTargetingSuggestionMetricsSettings() {
      return getStubSettingsBuilder().generateTargetingSuggestionMetricsSettings();
    }

    @Override
    public AudienceInsightsServiceSettings build() throws IOException {
      return new AudienceInsightsServiceSettings(this);
    }
  }
}
