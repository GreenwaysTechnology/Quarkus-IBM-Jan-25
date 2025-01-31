package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/hello")
public class GreetingResource {


    @Inject
    @Channel("words-out")
    Emitter<String> emitter;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("{name}")
    public String publish(@PathParam("name") String name) {
        //publish message into kafka
         emitter.send(name);
        return "Message Processed";
    }
}
