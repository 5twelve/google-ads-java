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

import com.google.ads.googleads.v18.services.stub.UserListServiceStub;
import com.google.ads.googleads.v18.services.stub.UserListServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage user lists.
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
 * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<UserListOperation> operations = new ArrayList<>();
 *   MutateUserListsResponse response =
 *       userListServiceClient.mutateUserLists(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the UserListServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> MutateUserLists</td>
 *      <td><p> Creates or updates user lists. Operation statuses are returned.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [CollectionSizeError]()   [DatabaseError]()   [DistinctError]()   [FieldError]()   [FieldMaskError]()   [HeaderError]()   [InternalError]()   [MutateError]()   [NewResourceCreationError]()   [NotAllowlistedError]()   [NotEmptyError]()   [OperationAccessDeniedError]()   [QuotaError]()   [RangeError]()   [RequestError]()   [StringFormatError]()   [StringLengthError]()   [UserListError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> mutateUserLists(MutateUserListsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> mutateUserLists(String customerId, List&lt;UserListOperation&gt; operations)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> mutateUserListsCallable()
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
 * <p>This class can be customized by passing in a custom instance of UserListServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * UserListServiceSettings userListServiceSettings =
 *     UserListServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * UserListServiceClient userListServiceClient =
 *     UserListServiceClient.create(userListServiceSettings);
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
 * UserListServiceSettings userListServiceSettings =
 *     UserListServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * UserListServiceClient userListServiceClient =
 *     UserListServiceClient.create(userListServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class UserListServiceClient implements BackgroundResource {
  private final UserListServiceSettings settings;
  private final UserListServiceStub stub;

  /** Constructs an instance of UserListServiceClient with default settings. */
  public static final UserListServiceClient create() throws IOException {
    return create(UserListServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of UserListServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final UserListServiceClient create(UserListServiceSettings settings)
      throws IOException {
    return new UserListServiceClient(settings);
  }

  /**
   * Constructs an instance of UserListServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(UserListServiceSettings).
   */
  public static final UserListServiceClient create(UserListServiceStub stub) {
    return new UserListServiceClient(stub);
  }

  /**
   * Constructs an instance of UserListServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected UserListServiceClient(UserListServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((UserListServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected UserListServiceClient(UserListServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final UserListServiceSettings getSettings() {
    return settings;
  }

  public UserListServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates user lists. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotAllowlistedError]() [NotEmptyError]() [OperationAccessDeniedError]() [QuotaError]()
   * [RangeError]() [RequestError]() [StringFormatError]() [StringLengthError]() [UserListError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<UserListOperation> operations = new ArrayList<>();
   *   MutateUserListsResponse response =
   *       userListServiceClient.mutateUserLists(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose user lists are being modified.
   * @param operations Required. The list of operations to perform on individual user lists.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateUserListsResponse mutateUserLists(
      String customerId, List<UserListOperation> operations) {
    MutateUserListsRequest request =
        MutateUserListsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateUserLists(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates user lists. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotAllowlistedError]() [NotEmptyError]() [OperationAccessDeniedError]() [QuotaError]()
   * [RangeError]() [RequestError]() [StringFormatError]() [StringLengthError]() [UserListError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
   *   MutateUserListsRequest request =
   *       MutateUserListsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserListOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateUserListsResponse response = userListServiceClient.mutateUserLists(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateUserListsResponse mutateUserLists(MutateUserListsRequest request) {
    return mutateUserListsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or updates user lists. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [CollectionSizeError]() [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]()
   * [HeaderError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotAllowlistedError]() [NotEmptyError]() [OperationAccessDeniedError]() [QuotaError]()
   * [RangeError]() [RequestError]() [StringFormatError]() [StringLengthError]() [UserListError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (UserListServiceClient userListServiceClient = UserListServiceClient.create()) {
   *   MutateUserListsRequest request =
   *       MutateUserListsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<UserListOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateUserListsResponse> future =
   *       userListServiceClient.mutateUserListsCallable().futureCall(request);
   *   // Do something.
   *   MutateUserListsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateUserListsRequest, MutateUserListsResponse>
      mutateUserListsCallable() {
    return stub.mutateUserListsCallable();
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
