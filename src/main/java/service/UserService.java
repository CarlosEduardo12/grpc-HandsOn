package service;

import generated.APIResponse;
import generated.Empty;
import generated.LoginRequest;
import generated.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase{

    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        APIResponse.Builder response = APIResponse.newBuilder();
        if (username.equals(password)){
            response.setResponseMessage("Sucessp").setResponseCode(200);
        } else {
            response.setResponseMessage("Falha ao efetuar o login").setResponseCode(400);
        }
    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
    }
}
