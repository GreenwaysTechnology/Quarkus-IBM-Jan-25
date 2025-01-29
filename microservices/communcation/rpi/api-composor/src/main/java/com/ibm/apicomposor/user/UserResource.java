package com.ibm.apicomposor.user;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("users")
public class UserResource {

    @GET
    public User getUser() {
        return new User(1, "Subramanian");
    }
}
