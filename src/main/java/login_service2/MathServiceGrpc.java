package login_service2;

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
    comments = "Source: secondUser.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "MathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<login_service2.CalculateRequest,
      login_service2.CalculateResponse> getCalculateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculate",
      requestType = login_service2.CalculateRequest.class,
      responseType = login_service2.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<login_service2.CalculateRequest,
      login_service2.CalculateResponse> getCalculateMethod() {
    io.grpc.MethodDescriptor<login_service2.CalculateRequest, login_service2.CalculateResponse> getCalculateMethod;
    if ((getCalculateMethod = MathServiceGrpc.getCalculateMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getCalculateMethod = MathServiceGrpc.getCalculateMethod) == null) {
          MathServiceGrpc.getCalculateMethod = getCalculateMethod = 
              io.grpc.MethodDescriptor.<login_service2.CalculateRequest, login_service2.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "calculate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.CalculateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("calculate"))
                  .build();
          }
        }
     }
     return getCalculateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<login_service2.RandomRequest,
      login_service2.NumberResponse> getGenerateRandomNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateRandomNumbers",
      requestType = login_service2.RandomRequest.class,
      responseType = login_service2.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<login_service2.RandomRequest,
      login_service2.NumberResponse> getGenerateRandomNumbersMethod() {
    io.grpc.MethodDescriptor<login_service2.RandomRequest, login_service2.NumberResponse> getGenerateRandomNumbersMethod;
    if ((getGenerateRandomNumbersMethod = MathServiceGrpc.getGenerateRandomNumbersMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getGenerateRandomNumbersMethod = MathServiceGrpc.getGenerateRandomNumbersMethod) == null) {
          MathServiceGrpc.getGenerateRandomNumbersMethod = getGenerateRandomNumbersMethod = 
              io.grpc.MethodDescriptor.<login_service2.RandomRequest, login_service2.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "generateRandomNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.RandomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.NumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("generateRandomNumbers"))
                  .build();
          }
        }
     }
     return getGenerateRandomNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<login_service2.NumberMessage,
      login_service2.CalculateResponse> getAverageValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "averageValues",
      requestType = login_service2.NumberMessage.class,
      responseType = login_service2.CalculateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<login_service2.NumberMessage,
      login_service2.CalculateResponse> getAverageValuesMethod() {
    io.grpc.MethodDescriptor<login_service2.NumberMessage, login_service2.CalculateResponse> getAverageValuesMethod;
    if ((getAverageValuesMethod = MathServiceGrpc.getAverageValuesMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getAverageValuesMethod = MathServiceGrpc.getAverageValuesMethod) == null) {
          MathServiceGrpc.getAverageValuesMethod = getAverageValuesMethod = 
              io.grpc.MethodDescriptor.<login_service2.NumberMessage, login_service2.CalculateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "averageValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.CalculateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("averageValues"))
                  .build();
          }
        }
     }
     return getAverageValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<login_service2.ConvertMessage,
      login_service2.ConvertResponse> getConvertBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertBase",
      requestType = login_service2.ConvertMessage.class,
      responseType = login_service2.ConvertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<login_service2.ConvertMessage,
      login_service2.ConvertResponse> getConvertBaseMethod() {
    io.grpc.MethodDescriptor<login_service2.ConvertMessage, login_service2.ConvertResponse> getConvertBaseMethod;
    if ((getConvertBaseMethod = MathServiceGrpc.getConvertBaseMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getConvertBaseMethod = MathServiceGrpc.getConvertBaseMethod) == null) {
          MathServiceGrpc.getConvertBaseMethod = getConvertBaseMethod = 
              io.grpc.MethodDescriptor.<login_service2.ConvertMessage, login_service2.ConvertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "MathService", "convertBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.ConvertMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  login_service2.ConvertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("convertBase"))
                  .build();
          }
        }
     }
     return getConvertBaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculate(login_service2.CalculateRequest request,
        io.grpc.stub.StreamObserver<login_service2.CalculateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateMethod(), responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(login_service2.RandomRequest request,
        io.grpc.stub.StreamObserver<login_service2.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateRandomNumbersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<login_service2.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<login_service2.CalculateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageValuesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<login_service2.ConvertMessage> convertBase(
        io.grpc.stub.StreamObserver<login_service2.ConvertResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertBaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                login_service2.CalculateRequest,
                login_service2.CalculateResponse>(
                  this, METHODID_CALCULATE)))
          .addMethod(
            getGenerateRandomNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                login_service2.RandomRequest,
                login_service2.NumberResponse>(
                  this, METHODID_GENERATE_RANDOM_NUMBERS)))
          .addMethod(
            getAverageValuesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                login_service2.NumberMessage,
                login_service2.CalculateResponse>(
                  this, METHODID_AVERAGE_VALUES)))
          .addMethod(
            getConvertBaseMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                login_service2.ConvertMessage,
                login_service2.ConvertResponse>(
                  this, METHODID_CONVERT_BASE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculate(login_service2.CalculateRequest request,
        io.grpc.stub.StreamObserver<login_service2.CalculateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateRandomNumbers(login_service2.RandomRequest request,
        io.grpc.stub.StreamObserver<login_service2.NumberResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateRandomNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<login_service2.NumberMessage> averageValues(
        io.grpc.stub.StreamObserver<login_service2.CalculateResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageValuesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<login_service2.ConvertMessage> convertBase(
        io.grpc.stub.StreamObserver<login_service2.ConvertResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConvertBaseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public login_service2.CalculateResponse calculate(login_service2.CalculateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<login_service2.NumberResponse> generateRandomNumbers(
        login_service2.RandomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateRandomNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<login_service2.CalculateResponse> calculate(
        login_service2.CalculateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE = 0;
  private static final int METHODID_GENERATE_RANDOM_NUMBERS = 1;
  private static final int METHODID_AVERAGE_VALUES = 2;
  private static final int METHODID_CONVERT_BASE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE:
          serviceImpl.calculate((login_service2.CalculateRequest) request,
              (io.grpc.stub.StreamObserver<login_service2.CalculateResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RANDOM_NUMBERS:
          serviceImpl.generateRandomNumbers((login_service2.RandomRequest) request,
              (io.grpc.stub.StreamObserver<login_service2.NumberResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<login_service2.CalculateResponse>) responseObserver);
        case METHODID_CONVERT_BASE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertBase(
              (io.grpc.stub.StreamObserver<login_service2.ConvertResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return login_service2.MathServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getCalculateMethod())
              .addMethod(getGenerateRandomNumbersMethod())
              .addMethod(getAverageValuesMethod())
              .addMethod(getConvertBaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
