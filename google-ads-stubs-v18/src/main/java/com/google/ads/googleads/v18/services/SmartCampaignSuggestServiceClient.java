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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.services.stub.SmartCampaignSuggestServiceStub;
import com.google.ads.googleads.v18.services.stub.SmartCampaignSuggestServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to get suggestions for Smart Campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create()) {
 *   SuggestSmartCampaignBudgetOptionsRequest request =
 *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .build();
 *   SuggestSmartCampaignBudgetOptionsResponse response =
 *       smartCampaignSuggestServiceClient.suggestSmartCampaignBudgetOptions(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SmartCampaignSuggestServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> SuggestSmartCampaignBudgetOptions</td>
 *      <td><p> Returns BudgetOption suggestions.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> suggestSmartCampaignBudgetOptions(SuggestSmartCampaignBudgetOptionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> suggestSmartCampaignBudgetOptionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SuggestSmartCampaignAd</td>
 *      <td><p> Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points such as targeting and the business to advertise.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> suggestSmartCampaignAd(SuggestSmartCampaignAdRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> suggestSmartCampaignAd(String customerId, SmartCampaignSuggestionInfo suggestionInfo)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> suggestSmartCampaignAdCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SuggestKeywordThemes</td>
 *      <td><p> Suggests keyword themes to advertise on.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> suggestKeywordThemes(SuggestKeywordThemesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> suggestKeywordThemes(String customerId, SmartCampaignSuggestionInfo suggestionInfo)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> suggestKeywordThemesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * SmartCampaignSuggestServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SmartCampaignSuggestServiceSettings smartCampaignSuggestServiceSettings =
 *     SmartCampaignSuggestServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create(smartCampaignSuggestServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SmartCampaignSuggestServiceSettings smartCampaignSuggestServiceSettings =
 *     SmartCampaignSuggestServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
 *     SmartCampaignSuggestServiceClient.create(smartCampaignSuggestServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SmartCampaignSuggestServiceClient implements BackgroundResource {
  private final SmartCampaignSuggestServiceSettings settings;
  private final SmartCampaignSuggestServiceStub stub;

  /** Constructs an instance of SmartCampaignSuggestServiceClient with default settings. */
  public static final SmartCampaignSuggestServiceClient create() throws IOException {
    return create(SmartCampaignSuggestServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final SmartCampaignSuggestServiceClient create(
      SmartCampaignSuggestServiceSettings settings) throws IOException {
    return new SmartCampaignSuggestServiceClient(settings);
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(SmartCampaignSuggestServiceSettings).
   */
  public static final SmartCampaignSuggestServiceClient create(
      SmartCampaignSuggestServiceStub stub) {
    return new SmartCampaignSuggestServiceClient(stub);
  }

  /**
   * Constructs an instance of SmartCampaignSuggestServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SmartCampaignSuggestServiceClient(SmartCampaignSuggestServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((SmartCampaignSuggestServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected SmartCampaignSuggestServiceClient(SmartCampaignSuggestServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SmartCampaignSuggestServiceSettings getSettings() {
    return settings;
  }

  public SmartCampaignSuggestServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns BudgetOption suggestions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignBudgetOptionsRequest request =
   *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   SuggestSmartCampaignBudgetOptionsResponse response =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignBudgetOptions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestSmartCampaignBudgetOptionsResponse suggestSmartCampaignBudgetOptions(
      SuggestSmartCampaignBudgetOptionsRequest request) {
    return suggestSmartCampaignBudgetOptionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns BudgetOption suggestions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignBudgetOptionsRequest request =
   *       SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .build();
   *   ApiFuture<SuggestSmartCampaignBudgetOptionsResponse> future =
   *       smartCampaignSuggestServiceClient
   *           .suggestSmartCampaignBudgetOptionsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   SuggestSmartCampaignBudgetOptionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsCallable() {
    return stub.suggestSmartCampaignBudgetOptionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points
   * such as targeting and the business to advertise.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   SmartCampaignSuggestionInfo suggestionInfo = SmartCampaignSuggestionInfo.newBuilder().build();
   *   SuggestSmartCampaignAdResponse response =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignAd(customerId, suggestionInfo);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param suggestionInfo Required. Inputs used to suggest a Smart campaign ad. Required fields:
   *     final_url, language_code, keyword_themes. Optional but recommended fields to improve the
   *     quality of the suggestion: business_setting and geo_target.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestSmartCampaignAdResponse suggestSmartCampaignAd(
      String customerId, SmartCampaignSuggestionInfo suggestionInfo) {
    SuggestSmartCampaignAdRequest request =
        SuggestSmartCampaignAdRequest.newBuilder()
            .setCustomerId(customerId)
            .setSuggestionInfo(suggestionInfo)
            .build();
    return suggestSmartCampaignAd(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points
   * such as targeting and the business to advertise.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignAdRequest request =
   *       SuggestSmartCampaignAdRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   SuggestSmartCampaignAdResponse response =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignAd(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestSmartCampaignAdResponse suggestSmartCampaignAd(
      SuggestSmartCampaignAdRequest request) {
    return suggestSmartCampaignAdCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests a Smart campaign ad compatible with the Ad family of resources, based on data points
   * such as targeting and the business to advertise.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestSmartCampaignAdRequest request =
   *       SuggestSmartCampaignAdRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<SuggestSmartCampaignAdResponse> future =
   *       smartCampaignSuggestServiceClient.suggestSmartCampaignAdCallable().futureCall(request);
   *   // Do something.
   *   SuggestSmartCampaignAdResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdCallable() {
    return stub.suggestSmartCampaignAdCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests keyword themes to advertise on.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   SmartCampaignSuggestionInfo suggestionInfo = SmartCampaignSuggestionInfo.newBuilder().build();
   *   SuggestKeywordThemesResponse response =
   *       smartCampaignSuggestServiceClient.suggestKeywordThemes(customerId, suggestionInfo);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer.
   * @param suggestionInfo Required. Information to get keyword theme suggestions. Required fields:
   *     <ul>
   *       <li>suggestion_info.final_url
   *       <li>suggestion_info.language_code
   *       <li>suggestion_info.geo_target
   *     </ul>
   *     <p>Recommended fields:
   *     <ul>
   *       <li>suggestion_info.business_setting
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestKeywordThemesResponse suggestKeywordThemes(
      String customerId, SmartCampaignSuggestionInfo suggestionInfo) {
    SuggestKeywordThemesRequest request =
        SuggestKeywordThemesRequest.newBuilder()
            .setCustomerId(customerId)
            .setSuggestionInfo(suggestionInfo)
            .build();
    return suggestKeywordThemes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests keyword themes to advertise on.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestKeywordThemesRequest request =
   *       SuggestKeywordThemesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   SuggestKeywordThemesResponse response =
   *       smartCampaignSuggestServiceClient.suggestKeywordThemes(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SuggestKeywordThemesResponse suggestKeywordThemes(
      SuggestKeywordThemesRequest request) {
    return suggestKeywordThemesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Suggests keyword themes to advertise on.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SmartCampaignSuggestServiceClient smartCampaignSuggestServiceClient =
   *     SmartCampaignSuggestServiceClient.create()) {
   *   SuggestKeywordThemesRequest request =
   *       SuggestKeywordThemesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setSuggestionInfo(SmartCampaignSuggestionInfo.newBuilder().build())
   *           .build();
   *   ApiFuture<SuggestKeywordThemesResponse> future =
   *       smartCampaignSuggestServiceClient.suggestKeywordThemesCallable().futureCall(request);
   *   // Do something.
   *   SuggestKeywordThemesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
      suggestKeywordThemesCallable() {
    return stub.suggestKeywordThemesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
