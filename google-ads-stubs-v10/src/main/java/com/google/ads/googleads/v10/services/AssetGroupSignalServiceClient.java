/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v10.services;

import com.google.ads.googleads.v10.services.stub.AssetGroupSignalServiceStub;
import com.google.ads.googleads.v10.services.stub.AssetGroupSignalServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage asset group signal.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (AssetGroupSignalServiceClient assetGroupSignalServiceClient =
 *     AssetGroupSignalServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<AssetGroupSignalOperation> operations = new ArrayList<>();
 *   MutateAssetGroupSignalsResponse response =
 *       assetGroupSignalServiceClient.mutateAssetGroupSignals(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetGroupSignalServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * AssetGroupSignalServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * AssetGroupSignalServiceSettings assetGroupSignalServiceSettings =
 *     AssetGroupSignalServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetGroupSignalServiceClient assetGroupSignalServiceClient =
 *     AssetGroupSignalServiceClient.create(assetGroupSignalServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * AssetGroupSignalServiceSettings assetGroupSignalServiceSettings =
 *     AssetGroupSignalServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetGroupSignalServiceClient assetGroupSignalServiceClient =
 *     AssetGroupSignalServiceClient.create(assetGroupSignalServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AssetGroupSignalServiceClient implements BackgroundResource {
  private final AssetGroupSignalServiceSettings settings;
  private final AssetGroupSignalServiceStub stub;

  /** Constructs an instance of AssetGroupSignalServiceClient with default settings. */
  public static final AssetGroupSignalServiceClient create() throws IOException {
    return create(AssetGroupSignalServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetGroupSignalServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AssetGroupSignalServiceClient create(AssetGroupSignalServiceSettings settings)
      throws IOException {
    return new AssetGroupSignalServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetGroupSignalServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AssetGroupSignalServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AssetGroupSignalServiceClient create(AssetGroupSignalServiceStub stub) {
    return new AssetGroupSignalServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetGroupSignalServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AssetGroupSignalServiceClient(AssetGroupSignalServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AssetGroupSignalServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AssetGroupSignalServiceClient(AssetGroupSignalServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetGroupSignalServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AssetGroupSignalServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes asset group signals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetGroupSignalServiceClient assetGroupSignalServiceClient =
   *     AssetGroupSignalServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<AssetGroupSignalOperation> operations = new ArrayList<>();
   *   MutateAssetGroupSignalsResponse response =
   *       assetGroupSignalServiceClient.mutateAssetGroupSignals(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose asset group signals are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual asset group
   *     signals.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAssetGroupSignalsResponse mutateAssetGroupSignals(
      String customerId, List<AssetGroupSignalOperation> operations) {
    MutateAssetGroupSignalsRequest request =
        MutateAssetGroupSignalsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAssetGroupSignals(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes asset group signals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetGroupSignalServiceClient assetGroupSignalServiceClient =
   *     AssetGroupSignalServiceClient.create()) {
   *   MutateAssetGroupSignalsRequest request =
   *       MutateAssetGroupSignalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AssetGroupSignalOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateAssetGroupSignalsResponse response =
   *       assetGroupSignalServiceClient.mutateAssetGroupSignals(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAssetGroupSignalsResponse mutateAssetGroupSignals(
      MutateAssetGroupSignalsRequest request) {
    return mutateAssetGroupSignalsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or removes asset group signals. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (AssetGroupSignalServiceClient assetGroupSignalServiceClient =
   *     AssetGroupSignalServiceClient.create()) {
   *   MutateAssetGroupSignalsRequest request =
   *       MutateAssetGroupSignalsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<AssetGroupSignalOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateAssetGroupSignalsResponse> future =
   *       assetGroupSignalServiceClient.mutateAssetGroupSignalsCallable().futureCall(request);
   *   // Do something.
   *   MutateAssetGroupSignalsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateAssetGroupSignalsRequest, MutateAssetGroupSignalsResponse>
      mutateAssetGroupSignalsCallable() {
    return stub.mutateAssetGroupSignalsCallable();
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
