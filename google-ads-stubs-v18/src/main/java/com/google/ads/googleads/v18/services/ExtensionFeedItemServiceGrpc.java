package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage extension feed items.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/extension_feed_item_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExtensionFeedItemServiceGrpc {

  private ExtensionFeedItemServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.ExtensionFeedItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateExtensionFeedItems",
      requestType = com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest,
      com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> getMutateExtensionFeedItemsMethod;
    if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        if ((getMutateExtensionFeedItemsMethod = ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod) == null) {
          ExtensionFeedItemServiceGrpc.getMutateExtensionFeedItemsMethod = getMutateExtensionFeedItemsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest, com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateExtensionFeedItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtensionFeedItemServiceMethodDescriptorSupplier("MutateExtensionFeedItems"))
              .build();
        }
      }
    }
    return getMutateExtensionFeedItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtensionFeedItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ExtensionFeedItemServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingV2Stub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtensionFeedItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceBlockingStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceBlockingStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtensionFeedItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtensionFeedItemServiceFutureStub>() {
        @java.lang.Override
        public ExtensionFeedItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtensionFeedItemServiceFutureStub(channel, callOptions);
        }
      };
    return ExtensionFeedItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateExtensionFeedItems(com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateExtensionFeedItemsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExtensionFeedItemService.
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static abstract class ExtensionFeedItemServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExtensionFeedItemServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExtensionFeedItemService.
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExtensionFeedItemServiceStub> {
    private ExtensionFeedItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateExtensionFeedItems(com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExtensionFeedItemService.
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ExtensionFeedItemServiceBlockingV2Stub> {
    private ExtensionFeedItemServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse mutateExtensionFeedItems(com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExtensionFeedItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ExtensionFeedItemService.
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExtensionFeedItemServiceBlockingStub> {
    private ExtensionFeedItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse mutateExtensionFeedItems(com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateExtensionFeedItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExtensionFeedItemService.
   * <pre>
   * Service to manage extension feed items.
   * </pre>
   */
  public static final class ExtensionFeedItemServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExtensionFeedItemServiceFutureStub> {
    private ExtensionFeedItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExtensionFeedItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtensionFeedItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes extension feed items. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [CountryCodeError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [ExtensionFeedItemError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [ImageError]()
     *   [InternalError]()
     *   [LanguageCodeError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse> mutateExtensionFeedItems(
        com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateExtensionFeedItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_EXTENSION_FEED_ITEMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_EXTENSION_FEED_ITEMS:
          serviceImpl.mutateExtensionFeedItems((com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateExtensionFeedItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateExtensionFeedItemsRequest,
              com.google.ads.googleads.v18.services.MutateExtensionFeedItemsResponse>(
                service, METHODID_MUTATE_EXTENSION_FEED_ITEMS)))
        .build();
  }

  private static abstract class ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtensionFeedItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.ExtensionFeedItemServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtensionFeedItemService");
    }
  }

  private static final class ExtensionFeedItemServiceFileDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier {
    ExtensionFeedItemServiceFileDescriptorSupplier() {}
  }

  private static final class ExtensionFeedItemServiceMethodDescriptorSupplier
      extends ExtensionFeedItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExtensionFeedItemServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExtensionFeedItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtensionFeedItemServiceFileDescriptorSupplier())
              .addMethod(getMutateExtensionFeedItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
