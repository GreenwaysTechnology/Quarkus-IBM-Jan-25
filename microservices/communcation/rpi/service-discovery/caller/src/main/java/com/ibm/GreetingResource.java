package com.ibm;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("greet")
public class GreetingResource {

    @Inject
    @RestClient
    GreetingResourceRestClient greetingResourceRestClient;

    @GET
    public String greet() {
        return greetingResourceRestClient.sayHello();
    }
}
