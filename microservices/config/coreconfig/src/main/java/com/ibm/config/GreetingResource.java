package com.ibm.config;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("greet")
public class GreetingResource {

    @ConfigProperty(name = "greeting.message", defaultValue = "This is default value")
    String message;

    @GET
    public String greet() {
        return message;
    }

    @GET
    @Path("config")
    public String sayGreet() {
        return ConfigProvider.getConfig()
                .getOptionalValue("greeting.message", String.class).orElse("This is default value");
    }
}
