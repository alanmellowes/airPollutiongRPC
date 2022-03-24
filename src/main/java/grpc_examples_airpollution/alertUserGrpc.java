package grpc_examples_airpollution;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: alertService.proto")
public final class alertUserGrpc {

  private alertUserGrpc() {}

  public static final String SERVICE_NAME = "alertService.alertUser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc_examples_airpollution.WorstRequest,
      grpc_examples_airpollution.WorstResponse> getWorstAirPollutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WorstAirPollution",
      requestType = grpc_examples_airpollution.WorstRequest.class,
      responseType = grpc_examples_airpollution.WorstResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc_examples_airpollution.WorstRequest,
      grpc_examples_airpollution.WorstResponse> getWorstAirPollutionMethod() {
    io.grpc.MethodDescriptor<grpc_examples_airpollution.WorstRequest, grpc_examples_airpollution.WorstResponse> getWorstAirPollutionMethod;
    if ((getWorstAirPollutionMethod = alertUserGrpc.getWorstAirPollutionMethod) == null) {
      synchronized (alertUserGrpc.class) {
        if ((getWorstAirPollutionMethod = alertUserGrpc.getWorstAirPollutionMethod) == null) {
          alertUserGrpc.getWorstAirPollutionMethod = getWorstAirPollutionMethod = 
              io.grpc.MethodDescriptor.<grpc_examples_airpollution.WorstRequest, grpc_examples_airpollution.WorstResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alertService.alertUser", "WorstAirPollution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc_examples_airpollution.WorstRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc_examples_airpollution.WorstResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new alertUserMethodDescriptorSupplier("WorstAirPollution"))
                  .build();
          }
        }
     }
     return getWorstAirPollutionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static alertUserStub newStub(io.grpc.Channel channel) {
    return new alertUserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static alertUserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new alertUserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static alertUserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new alertUserFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class alertUserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void worstAirPollution(grpc_examples_airpollution.WorstRequest request,
        io.grpc.stub.StreamObserver<grpc_examples_airpollution.WorstResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWorstAirPollutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWorstAirPollutionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc_examples_airpollution.WorstRequest,
                grpc_examples_airpollution.WorstResponse>(
                  this, METHODID_WORST_AIR_POLLUTION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class alertUserStub extends io.grpc.stub.AbstractStub<alertUserStub> {
    private alertUserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private alertUserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected alertUserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new alertUserStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void worstAirPollution(grpc_examples_airpollution.WorstRequest request,
        io.grpc.stub.StreamObserver<grpc_examples_airpollution.WorstResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWorstAirPollutionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class alertUserBlockingStub extends io.grpc.stub.AbstractStub<alertUserBlockingStub> {
    private alertUserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private alertUserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected alertUserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new alertUserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public grpc_examples_airpollution.WorstResponse worstAirPollution(grpc_examples_airpollution.WorstRequest request) {
      return blockingUnaryCall(
          getChannel(), getWorstAirPollutionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class alertUserFutureStub extends io.grpc.stub.AbstractStub<alertUserFutureStub> {
    private alertUserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private alertUserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected alertUserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new alertUserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc_examples_airpollution.WorstResponse> worstAirPollution(
        grpc_examples_airpollution.WorstRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWorstAirPollutionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WORST_AIR_POLLUTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final alertUserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(alertUserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WORST_AIR_POLLUTION:
          serviceImpl.worstAirPollution((grpc_examples_airpollution.WorstRequest) request,
              (io.grpc.stub.StreamObserver<grpc_examples_airpollution.WorstResponse>) responseObserver);
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

  private static abstract class alertUserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    alertUserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc_examples_airpollution.airPollutionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("alertUser");
    }
  }

  private static final class alertUserFileDescriptorSupplier
      extends alertUserBaseDescriptorSupplier {
    alertUserFileDescriptorSupplier() {}
  }

  private static final class alertUserMethodDescriptorSupplier
      extends alertUserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    alertUserMethodDescriptorSupplier(String methodName) {
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
      synchronized (alertUserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new alertUserFileDescriptorSupplier())
              .addMethod(getWorstAirPollutionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
