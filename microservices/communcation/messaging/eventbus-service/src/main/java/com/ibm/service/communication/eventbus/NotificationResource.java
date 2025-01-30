package com.ibm.service.communication.eventbus;

import io.vertx.mutiny.core.eventbus.EventBus;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("pubsub")
public class NotificationResource {

    @Inject
    EventBus eventBus;

    @GET
    @Path("{message}")
    public void publish(@PathParam("message") String message) {
        eventBus.publish("notification", message);
    }
}
