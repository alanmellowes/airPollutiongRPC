package grpc_examples_airpollution;

import java.io.IOException;
import java.util.logging.Logger;

import grpc_examples_airpollution.alertUserGrpc.alertUserImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class alertServiceServer1 extends alertUserImplBase {

	private static final Logger logger = Logger.getLogger(alertServiceServer1.class.getName());

	public static void main(String[] args) {
		
		alertServiceServer1 badpollutionserver = new alertServiceServer1();
		
		int port = 50014;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(badpollutionserver)
			    .build()
			    .start();
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	@Override
	public void worstAirPollution(WorstRequest request,  StreamObserver<WorstResponse> responseObserver) {
		    
		System.out.println("receiving country with bad air pollution request");
		
		WorstResponse reply = WorstResponse.newBuilder().setCountryInfo("Country with bad air pollution: " + request.getCountryName()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	


}
