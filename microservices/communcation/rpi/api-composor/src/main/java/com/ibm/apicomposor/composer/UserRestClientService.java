package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.user.User;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("users")
@RegisterRestClient(configKey = "user-service")
public interface UserRestClientService {

    @GET
    @Path("/users/{userId}")
    User getUser(@PathParam("userId") String userId);
}
