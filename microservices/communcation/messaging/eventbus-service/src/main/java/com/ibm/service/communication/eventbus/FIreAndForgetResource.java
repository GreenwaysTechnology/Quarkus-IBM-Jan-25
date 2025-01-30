package com.ibm.service.communication.eventbus;

import io.vertx.mutiny.core.eventbus.EventBus;
import io.vertx.mutiny.core.eventbus.Message;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("fireandforget")
public class FIreAndForgetResource {

    @Inject
    EventBus eventBus;

    @GET
    @Path("{payload}")
    public Response process(@PathParam("payload") String payload) {
        eventBus.<String>requestAndForget("sink", payload);
        return Response.ok().entity("message processed").build();
    }
}
