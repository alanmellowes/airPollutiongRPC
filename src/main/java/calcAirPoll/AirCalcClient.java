package calcAirPoll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import calcAirPoll.AirCalcServiceGrpc.AirCalcServiceBlockingStub;
import calcAirPoll.AirCalcServiceGrpc.AirCalcServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class AirCalcClient {

	private static AirCalcServiceBlockingStub blockingStub;
	private static AirCalcServiceStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50094)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = AirCalcServiceGrpc.newBlockingStub(channel);

		asyncStub = AirCalcServiceGrpc.newStub(channel);


		
		calculate();
		
		
		generateRandomNumbersAsyn();
		generateRandomNumbersBlocking();

				
		averageValues();

		

	}


	//unary rpc
	public static void calculate() {
		int num1 = 5;
		int num2 = 2;

		CalculateRequest req = CalculateRequest.newBuilder().setNumber1(num1).setNumber2(num2).build();

		CalculateResponse response = blockingStub.calculate(req);

		System.out.println("Air Pollution level in Ireland: " + response.getResult() + " mes: " + response.getMessage());
	}

	//blocking server-streaming
	public static void generateRandomNumbersBlocking() {
		RandomRequest request = RandomRequest.newBuilder()
				.setNumbers(5).setMin(0).setMax(100).build();

		try {
			Iterator<NumberResponse> responces = blockingStub.generateRandomNumbers(request);

			while(responces.hasNext()) {
				NumberResponse temp = responces.next();
				System.out.println(temp.getNumber());				
			}

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}

	}


	public static void generateRandomNumbersAsyn() {

		RandomRequest request = RandomRequest.newBuilder()
				.setNumbers(1).setMin(0).setMax(15).build();
		
		


		StreamObserver<NumberResponse> responseObserver = new StreamObserver<NumberResponse>() {

			int count =0 ;

			@Override
			public void onNext(NumberResponse value) {
				System.out.println("receiving random air pollution levels: " + value.getNumber());
				count = 1;
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("stream is completed ... received "+ count+ " random AP levels");
			}

		};

		asyncStub.generateRandomNumbers(request, responseObserver);

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void averageValues() {

		StreamObserver<CalculateResponse> responseObserver = new StreamObserver<CalculateResponse>() {

			@Override
			public void onNext(CalculateResponse msg) {
				System.out.println("receiving average air pollution level " + msg.getResult() );
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println("stream is completed ... receiveing converted numbers");
			}

		};

	}
}