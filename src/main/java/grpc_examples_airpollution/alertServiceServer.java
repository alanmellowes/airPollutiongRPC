package grpc_examples_airpollution;

import java.io.IOException;
import java.util.logging.Logger;

import grpc_examples_airpollution.alertUserGrpc.alertUserImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class alertServiceServer extends alertUserImplBase {

	private static final Logger logger = Logger.getLogger(alertServiceServer.class.getName());

	public static void main(String[] args) {
		
		alertServiceServer greeterserver = new alertServiceServer();
		
		int port = 50059;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(greeterserver)
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
	public void WorstAirPollution(WorstRequest request,  StreamObserver<WorstResponse> responseObserver) {
		    
		System.out.println("receiving hello request");
		
		WorstResponse reply = WorstResponse.newBuilder().setCountryInfo("Hello " + request.getCountryName()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	


}
