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
//    @Inject
//    UserService userService;

     UserService userService;

//    public UserService getUserService() {
//        return userService;
//    }
//
//    @Inject
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }


    public UserResource() {
    }

    @Inject
    public UserResource(UserService userService) {
        this.userService = userService;
    }

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
