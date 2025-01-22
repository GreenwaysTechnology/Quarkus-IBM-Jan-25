package com.ibm.cdi.resources;

import com.ibm.cdi.services.UserService;
import io.smallrye.mutiny.Uni;
import io.vertx.ext.auth.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("users")
public class UserResource {
    //    private UserService userService = new UserService();
//    @Inject
//    private UserService userService;
    @Inject
    UserService userService;

    @GET
    public List<String> findAll() {
        return userService.users();
    }

    @GET
    @Path("async")
    public Uni<List<String>> getUsersAsync() {
        return userService.usersUni();
    }
}
