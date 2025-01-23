package com.ibm.cdi.resources;

import com.ibm.cdi.services.HaiService;
import com.ibm.cdi.services.HelloService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("greet")
public class GreeterResource {

    @Inject
    HelloService helloService;
    @Inject
    HaiService haiService;

    @GET
    public String greet() {
        return helloService.hello() + haiService.sayHai();
    }
}
