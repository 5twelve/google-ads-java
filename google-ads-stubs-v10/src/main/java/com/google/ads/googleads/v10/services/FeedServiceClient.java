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

import com.google.ads.googleads.v10.services.stub.FeedServiceStub;
import com.google.ads.googleads.v10.services.stub.FeedServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage feeds.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<FeedOperation> operations = new ArrayList<>();
 *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the FeedServiceClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of FeedServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * FeedServiceSettings feedServiceSettings =
 *     FeedServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedServiceClient feedServiceClient = FeedServiceClient.create(feedServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * FeedServiceSettings feedServiceSettings =
 *     FeedServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedServiceClient feedServiceClient = FeedServiceClient.create(feedServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class FeedServiceClient implements BackgroundResource {
  private final FeedServiceSettings settings;
  private final FeedServiceStub stub;

  /** Constructs an instance of FeedServiceClient with default settings. */
  public static final FeedServiceClient create() throws IOException {
    return create(FeedServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedServiceClient create(FeedServiceSettings settings) throws IOException {
    return new FeedServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(FeedServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedServiceClient create(FeedServiceStub stub) {
    return new FeedServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected FeedServiceClient(FeedServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedServiceClient(FeedServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FeedError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]() [ListOperationError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<FeedOperation> operations = new ArrayList<>();
   *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose feeds are being modified.
   * @param operations Required. The list of operations to perform on individual feeds.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedsResponse mutateFeeds(String customerId, List<FeedOperation> operations) {
    MutateFeedsRequest request =
        MutateFeedsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeeds(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FeedError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]() [ListOperationError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   MutateFeedsRequest request =
   *       MutateFeedsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateFeedsResponse response = feedServiceClient.mutateFeeds(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedsResponse mutateFeeds(MutateFeedsRequest request) {
    return mutateFeedsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes feeds. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FeedError]() [FieldError]()
   * [FieldMaskError]() [HeaderError]() [IdError]() [InternalError]() [ListOperationError]()
   * [MutateError]() [NewResourceCreationError]() [NotEmptyError]() [NullError]() [OperatorError]()
   * [QuotaError]() [RangeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
   *   MutateFeedsRequest request =
   *       MutateFeedsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<FeedOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateFeedsResponse> future =
   *       feedServiceClient.mutateFeedsCallable().futureCall(request);
   *   // Do something.
   *   MutateFeedsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateFeedsRequest, MutateFeedsResponse> mutateFeedsCallable() {
    return stub.mutateFeedsCallable();
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
