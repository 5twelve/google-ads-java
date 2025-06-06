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

import com.google.ads.googleads.v18.resources.OfflineUserDataJobMetadata;
import com.google.ads.googleads.v18.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v18.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v18.services.CreateOfflineUserDataJobRequest;
import com.google.ads.googleads.v18.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v18.services.RunOfflineUserDataJobRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the OfflineUserDataJobService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcOfflineUserDataJobServiceStub extends OfflineUserDataJobServiceStub {
  private static final MethodDescriptor<
          CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobMethodDescriptor =
          MethodDescriptor
              .<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.OfflineUserDataJobService/CreateOfflineUserDataJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CreateOfflineUserDataJobResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsMethodDescriptor =
          MethodDescriptor
              .<AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.OfflineUserDataJobService/AddOfflineUserDataJobOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      AddOfflineUserDataJobOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      AddOfflineUserDataJobOperationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobMethodDescriptor =
          MethodDescriptor.<RunOfflineUserDataJobRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v18.services.OfflineUserDataJobService/RunOfflineUserDataJob")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RunOfflineUserDataJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable;
  private final UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable;
  private final UnaryCallable<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobCallable;
  private final OperationCallable<RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
      runOfflineUserDataJobOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcOfflineUserDataJobServiceStub create(
      OfflineUserDataJobServiceStubSettings settings) throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcOfflineUserDataJobServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(
        OfflineUserDataJobServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcOfflineUserDataJobServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcOfflineUserDataJobServiceStub(
        OfflineUserDataJobServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcOfflineUserDataJobServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcOfflineUserDataJobServiceStub(
      OfflineUserDataJobServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcOfflineUserDataJobServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcOfflineUserDataJobServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcOfflineUserDataJobServiceStub(
      OfflineUserDataJobServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
        createOfflineUserDataJobTransportSettings =
            GrpcCallSettings
                .<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>newBuilder()
                .setMethodDescriptor(createOfflineUserDataJobMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("customer_id", String.valueOf(request.getCustomerId()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<
            AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
        addOfflineUserDataJobOperationsTransportSettings =
            GrpcCallSettings
                .<AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
                    newBuilder()
                .setMethodDescriptor(addOfflineUserDataJobOperationsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource_name", String.valueOf(request.getResourceName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<RunOfflineUserDataJobRequest, Operation>
        runOfflineUserDataJobTransportSettings =
            GrpcCallSettings.<RunOfflineUserDataJobRequest, Operation>newBuilder()
                .setMethodDescriptor(runOfflineUserDataJobMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource_name", String.valueOf(request.getResourceName()));
                      return builder.build();
                    })
                .build();

    this.createOfflineUserDataJobCallable =
        callableFactory.createUnaryCallable(
            createOfflineUserDataJobTransportSettings,
            settings.createOfflineUserDataJobSettings(),
            clientContext);
    this.addOfflineUserDataJobOperationsCallable =
        callableFactory.createUnaryCallable(
            addOfflineUserDataJobOperationsTransportSettings,
            settings.addOfflineUserDataJobOperationsSettings(),
            clientContext);
    this.runOfflineUserDataJobCallable =
        callableFactory.createUnaryCallable(
            runOfflineUserDataJobTransportSettings,
            settings.runOfflineUserDataJobSettings(),
            clientContext);
    this.runOfflineUserDataJobOperationCallable =
        callableFactory.createOperationCallable(
            runOfflineUserDataJobTransportSettings,
            settings.runOfflineUserDataJobOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobCallable() {
    return createOfflineUserDataJobCallable;
  }

  @Override
  public UnaryCallable<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsCallable() {
    return addOfflineUserDataJobOperationsCallable;
  }

  @Override
  public UnaryCallable<RunOfflineUserDataJobRequest, Operation> runOfflineUserDataJobCallable() {
    return runOfflineUserDataJobCallable;
  }

  @Override
  public OperationCallable<RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
      runOfflineUserDataJobOperationCallable() {
    return runOfflineUserDataJobOperationCallable;
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
