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

package com.google.ads.googleads.v20.services.stub;

import com.google.ads.googleads.v20.services.ListPaymentsAccountsRequest;
import com.google.ads.googleads.v20.services.ListPaymentsAccountsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the PaymentsAccountService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcPaymentsAccountServiceStub extends PaymentsAccountServiceStub {
  private static final MethodDescriptor<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>
      listPaymentsAccountsMethodDescriptor =
          MethodDescriptor.<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v20.services.PaymentsAccountService/ListPaymentsAccounts")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPaymentsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPaymentsAccountsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>
      listPaymentsAccountsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcPaymentsAccountServiceStub create(
      PaymentsAccountServiceStubSettings settings) throws IOException {
    return new GrpcPaymentsAccountServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcPaymentsAccountServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcPaymentsAccountServiceStub(
        PaymentsAccountServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcPaymentsAccountServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcPaymentsAccountServiceStub(
        PaymentsAccountServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcPaymentsAccountServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcPaymentsAccountServiceStub(
      PaymentsAccountServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcPaymentsAccountServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcPaymentsAccountServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcPaymentsAccountServiceStub(
      PaymentsAccountServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>
        listPaymentsAccountsTransportSettings =
            GrpcCallSettings.<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>newBuilder()
                .setMethodDescriptor(listPaymentsAccountsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.listPaymentsAccountsCallable =
        callableFactory.createUnaryCallable(
            listPaymentsAccountsTransportSettings,
            settings.listPaymentsAccountsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListPaymentsAccountsRequest, ListPaymentsAccountsResponse>
      listPaymentsAccountsCallable() {
    return listPaymentsAccountsCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
