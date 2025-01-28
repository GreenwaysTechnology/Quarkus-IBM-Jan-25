package com.ibm;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("hello")
public class GreetingResource {
    @GET
    public String sayHello(){
        return  "Hello From Remote Service";
    }
}
