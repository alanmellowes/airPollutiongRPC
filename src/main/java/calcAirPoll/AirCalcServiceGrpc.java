package calcAirPoll;

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
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calcAirService.proto")
public final class AirCalcServiceGrpc {

  private AirCalcServiceGrpc() {}

  public static final String SERVICE_NAME = "calcAirService.AirCalcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<calcAirPoll.CalculateRequest,
      calcAirPoll.CalculateResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = calcAirPoll.CalculateRequest.class,
      responseType = calcAirPoll.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<calcAirPoll.CalculateRequest,
      calcAirPoll.CalculateResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<calcAirPoll.CalculateRequest, calcAirPoll.CalculateResponse> getCalculateMethod;
    if ((getCalculateMethod = AirCalcServiceGrpc.getCalculateMethod) == null) {
      synchronized (AirCalcServiceGrpc.class) {
        if ((getCalculateMethod = AirCalcServiceGrpc.getCalculateMethod) == null) {
          AirCalcServiceGrpc.getCalculateMethod = getCalculateMethod = 
              io.grpc.MethodDescriptor.<calcAirPoll.CalculateRequest, calcAirPoll.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calcAirService.AirCalcService", "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirCalcServiceMethodDescriptorSupplier("calculate"))
                  .build();
          }
        }
     }
     return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calcAirPoll.RandomRequest,
      calcAirPoll.NumberResponse> getGenerateRandomNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateRandomNumbers",
      requestType = calcAirPoll.RandomRequest.class,
      responseType = calcAirPoll.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<calcAirPoll.RandomRequest,
      calcAirPoll.NumberResponse> getGenerateRandomNumbersMethod() {
    io.grpc.MethodDescriptor<calcAirPoll.RandomRequest, calcAirPoll.NumberResponse> getGenerateRandomNumbersMethod;
    if ((getGenerateRandomNumbersMethod = AirCalcServiceGrpc.getGenerateRandomNumbersMethod) == null) {
      synchronized (AirCalcServiceGrpc.class) {
        if ((getGenerateRandomNumbersMethod = AirCalcServiceGrpc.getGenerateRandomNumbersMethod) == null) {
          AirCalcServiceGrpc.getGenerateRandomNumbersMethod = getGenerateRandomNumbersMethod = 
              io.grpc.MethodDescriptor.<calcAirPoll.RandomRequest, calcAirPoll.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calcAirService.AirCalcService", "generateRandomNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.RandomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirCalcServiceMethodDescriptorSupplier("generateRandomNumbers"))
                  .build();
          }
        }
     }
     return getGenerateRandomNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<calcAirPoll.NumberMessage,
      calcAirPoll.CalculateResponse> getAverageValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "averageValues",
      requestType = calcAirPoll.NumberMessage.class,
      responseType = calcAirPoll.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<calcAirPoll.NumberMessage,
      calcAirPoll.CalculateResponse> getAverageValuesMethod() {
    io.grpc.MethodDescriptor<calcAirPoll.NumberMessage, calcAirPoll.CalculateResponse> getAverageValuesMethod;
    if ((getAverageValuesMethod = AirCalcServiceGrpc.getAverageValuesMethod) == null) {
      synchronized (AirCalcServiceGrpc.class) {
        if ((getAverageValuesMethod = AirCalcServiceGrpc.getAverageValuesMethod) == null) {
          AirCalcServiceGrpc.getAverageValuesMethod = getAverageValuesMethod = 
              io.grpc.MethodDescriptor.<calcAirPoll.NumberMessage, calcAirPoll.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "calcAirService.AirCalcService", "averageValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  calcAirPoll.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirCalcServiceMethodDescriptorSupplier("averageValues"))
                  .build();
          }
        }
     }
     return getAverageValuesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirCalcServiceStub newStub(io.grpc.Channel channel) {
    return new AirCalcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirCalcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirCalcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirCalcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirCalcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AirCalcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(calcAirPoll.CalculateRequest request,
        io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(calcAirPoll.RandomRequest request,
        io.grpc.stub.StreamObserver<calcAirPoll.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateRandomNumbersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<calcAirPoll.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageValuesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                calcAirPoll.CalculateRequest,
                calcAirPoll.CalculateResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getGenerateRandomNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                calcAirPoll.RandomRequest,
                calcAirPoll.NumberResponse>(
                  this, METHODID_GENERATE_RANDOM_NUMBERS)))
          .addMethod(
            getAverageValuesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                calcAirPoll.NumberMessage,
                calcAirPoll.CalculateResponse>(
                  this, METHODID_AVERAGE_VALUES)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirCalcServiceStub extends io.grpc.stub.AbstractStub<AirCalcServiceStub> {
    private AirCalcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirCalcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirCalcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirCalcServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(calcAirPoll.CalculateRequest request,
        io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(calcAirPoll.RandomRequest request,
        io.grpc.stub.StreamObserver<calcAirPoll.NumberResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateRandomNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<calcAirPoll.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageValuesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirCalcServiceBlockingStub extends io.grpc.stub.AbstractStub<AirCalcServiceBlockingStub> {
    private AirCalcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirCalcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirCalcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirCalcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public calcAirPoll.CalculateResponse calculate(calcAirPoll.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<calcAirPoll.NumberResponse> generateRandomNumbers(
        calcAirPoll.RandomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateRandomNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirCalcServiceFutureStub extends io.grpc.stub.AbstractStub<AirCalcServiceFutureStub> {
    private AirCalcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirCalcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirCalcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirCalcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<calcAirPoll.CalculateResponse> calculate(
        calcAirPoll.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_GENERATE_RANDOM_NUMBERS = 1;
  private static final int METHODID_AVERAGE_VALUES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirCalcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirCalcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((calcAirPoll.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RANDOM_NUMBERS:
          serviceImpl.generateRandomNumbers((calcAirPoll.RandomRequest) request,
              (io.grpc.stub.StreamObserver<calcAirPoll.NumberResponse>) responseObserver);
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
        case METHODID_AVERAGE_VALUES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageValues(
              (io.grpc.stub.StreamObserver<calcAirPoll.CalculateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AirCalcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirCalcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return calcAirPoll.CalculateAirPollutionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirCalcService");
    }
  }

  private static final class AirCalcServiceFileDescriptorSupplier
      extends AirCalcServiceBaseDescriptorSupplier {
    AirCalcServiceFileDescriptorSupplier() {}
  }

  private static final class AirCalcServiceMethodDescriptorSupplier
      extends AirCalcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirCalcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirCalcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirCalcServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getGenerateRandomNumbersMethod())
              .addMethod(getAverageValuesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
