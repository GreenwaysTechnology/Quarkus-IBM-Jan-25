package com.ibm.cdi.services.lifecycles;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("lifecycles")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public List<String> users() {
        return userService.getUsers();
    }
}
