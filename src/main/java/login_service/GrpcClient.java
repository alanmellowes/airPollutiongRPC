package login_service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;
import io.grpc.StatusRuntimeException;
import login_service.User.APIResponse;
import login_service.User.LoginRequest;
import login_service.userGrpc.userBlockingStub;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GrpcClient {
	
	private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());

	public static void main(String[] args) throws Exception {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50094).usePlaintext().build();
		
		// stubs - generate from proto
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		try {
			String name = "distributedSystems"; // test to see if success, if both values are equal should return success.
			String password = "distributedSystems";
		LoginRequest loginrequest = 
				LoginRequest.newBuilder()
				.setUsername(name)
				.setPassword(password)
				.build();
		
		APIResponse response = userStub.login(loginrequest);
		
		logger.info(response.getResponsemessage());
		
		} catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    return;		
		    
	    } finally {
		
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS); 
	    }
	}

}
