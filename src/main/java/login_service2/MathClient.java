package login_service2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import login_service2.MathServiceGrpc.MathServiceBlockingStub;
import login_service2.MathServiceGrpc.MathServiceStub;


public class MathClient {

	private static MathServiceBlockingStub blockingStub;
	private static MathServiceStub asyncStub;


	public static void main(String[] args) throws Exception {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 60151)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = MathServiceGrpc.newBlockingStub(channel);

		asyncStub = MathServiceGrpc.newStub(channel);
		
	}
}