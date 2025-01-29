package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.user.User;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("users")
@RegisterRestClient(configKey = "user-service")
public interface UserRestClientService {

    @GET
    public User getUser();
}
