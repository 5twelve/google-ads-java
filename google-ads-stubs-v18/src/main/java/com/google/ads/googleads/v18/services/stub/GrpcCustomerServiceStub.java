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

package com.google.ads.googleads.v18.services.stub;

import com.google.ads.googleads.v18.services.CreateCustomerClientRequest;
import com.google.ads.googleads.v18.services.CreateCustomerClientResponse;
import com.google.ads.googleads.v18.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v18.services.ListAccessibleCustomersResponse;
import com.google.ads.googleads.v18.services.MutateCustomerRequest;
import com.google.ads.googleads.v18.services.MutateCustomerResponse;
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
 * gRPC stub implementation for the CustomerService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCustomerServiceStub extends CustomerServiceStub {
  private static final MethodDescriptor<MutateCustomerRequest, MutateCustomerResponse>
      mutateCustomerMethodDescriptor =
          MethodDescriptor.<MutateCustomerRequest, MutateCustomerResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.ads.googleads.v18.services.CustomerService/MutateCustomer")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MutateCustomerResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersMethodDescriptor =
          MethodDescriptor
              .<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.CustomerService/ListAccessibleCustomers")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAccessibleCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAccessibleCustomersResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientMethodDescriptor =
          MethodDescriptor.<CreateCustomerClientRequest, CreateCustomerClientResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.CustomerService/CreateCustomerClient")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateCustomerClientResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<MutateCustomerRequest, MutateCustomerResponse> mutateCustomerCallable;
  private final UnaryCallable<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersCallable;
  private final UnaryCallable<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCustomerServiceStub create(CustomerServiceStubSettings settings)
      throws IOException {
    return new GrpcCustomerServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCustomerServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcCustomerServiceStub(
        CustomerServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCustomerServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCustomerServiceStub(
        CustomerServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCustomerServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCustomerServiceStub(
      CustomerServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcCustomerServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCustomerServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCustomerServiceStub(
      CustomerServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<MutateCustomerRequest, MutateCustomerResponse>
        mutateCustomerTransportSettings =
            GrpcCallSettings.<MutateCustomerRequest, MutateCustomerResponse>newBuilder()
                .setMethodDescriptor(mutateCustomerMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
        listAccessibleCustomersTransportSettings =
            GrpcCallSettings
                .<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>newBuilder()
                .setMethodDescriptor(listAccessibleCustomersMethodDescriptor)
                .build();
    GrpcCallSettings<CreateCustomerClientRequest, CreateCustomerClientResponse>
        createCustomerClientTransportSettings =
            GrpcCallSettings.<CreateCustomerClientRequest, CreateCustomerClientResponse>newBuilder()
                .setMethodDescriptor(createCustomerClientMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();

    this.mutateCustomerCallable =
        callableFactory.createUnaryCallable(
            mutateCustomerTransportSettings, settings.mutateCustomerSettings(), clientContext);
    this.listAccessibleCustomersCallable =
        callableFactory.createUnaryCallable(
            listAccessibleCustomersTransportSettings,
            settings.listAccessibleCustomersSettings(),
            clientContext);
    this.createCustomerClientCallable =
        callableFactory.createUnaryCallable(
            createCustomerClientTransportSettings,
            settings.createCustomerClientSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<MutateCustomerRequest, MutateCustomerResponse> mutateCustomerCallable() {
    return mutateCustomerCallable;
  }

  @Override
  public UnaryCallable<ListAccessibleCustomersRequest, ListAccessibleCustomersResponse>
      listAccessibleCustomersCallable() {
    return listAccessibleCustomersCallable;
  }

  @Override
  public UnaryCallable<CreateCustomerClientRequest, CreateCustomerClientResponse>
      createCustomerClientCallable() {
    return createCustomerClientCallable;
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
