package com.ibm;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("hello")
@RegisterRestClient(configKey = "hello-api")
public interface GreetingResourceRestClient {

    @GET
    public String sayHello();
}
