package org.acme;

import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.core.eventbus.EventBus;
import io.vertx.mutiny.core.eventbus.Message;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.GreetingService;

@Path("/hello")
public class GreetingResource {

    @Inject
    EventBus eventBus;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{name}")
    public Uni<String> hello(@PathParam("name") String name) {
        //publish message into event bus
       return eventBus.<String>request("greeting", name).onItem().transform(Message::body);
    }
}
