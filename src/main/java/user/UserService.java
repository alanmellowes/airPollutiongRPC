package user;

import io.grpc.stub.StreamObserver;
import login_service.User.APIResponse;
import login_service.User.Empty;
import login_service.User.LoginRequest;
import login_service.userGrpc.userImplBase;

public class UserService extends userImplBase {
	
	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {

		System.out.println("User login");

		String username = request.getUsername();
		String password = request.getPassword();

		APIResponse.Builder response = APIResponse.newBuilder();
		if (username.equals(password)) {

			// return success message

			response.setResponseCode(0).setResponsemessage("Login successful");

		} else {
			response.setResponseCode(100).setResponsemessage("Incorrect password");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {

	}

}
