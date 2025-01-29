package com.ibm.apicomposor.user;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

//@Path("users")
//public class UserResource {
//
//    @GET
//    public User getUser() {
//        return new User(1, "Subramanian");
//    }
//}

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("userId") Long userId) {
        return User.findById(userId);
    }
}