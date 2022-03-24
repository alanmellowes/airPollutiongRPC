package grpc_examples_airpollution;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc_examples_airpollution.alertUserGrpc.alertUserBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


public class alertServiceClient {

	private static final Logger logger = Logger.getLogger(alertServiceClient.class.getName());

		  
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		alertUserBlockingStub  blockingStub = alertUserGrpc.newBlockingStub(channel);
				
		alertServiceClient client = new alertServiceClient();
	    
	    try {
	    	 String countryName = "Paul";
	    	 WorstRequest request = WorstRequest.newBuilder().setCountryName(countryName).build();
	    	 
	    	 WorstResponse response = blockingStub.worstAirPollution(request);
	    	 
	    	 logger.info("Greeting: " + response.getCountryInfo());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
