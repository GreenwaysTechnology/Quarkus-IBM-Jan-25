package com.ibm;

import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Uni;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.ext.web.client.HttpResponse;
import io.vertx.mutiny.ext.web.client.WebClient;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("api/webclient")
public class CustomerWebClientResource {

    @Inject
    Vertx vertx;

    WebClient webClient;

    //create WebClient Object
    public void init(@Observes StartupEvent startupEvent) {
        //create webClient object
        this.webClient = WebClient.create(vertx, new WebClientOptions().setDefaultHost("localhost").setDefaultPort(8081));
    }


    @GET
    public Uni<String> findAll() {
        return webClient.get("/customers").send().onItem().transform(HttpResponse::bodyAsString);
    }
}
