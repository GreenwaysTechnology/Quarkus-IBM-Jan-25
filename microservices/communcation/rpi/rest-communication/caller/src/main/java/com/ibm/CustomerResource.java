package com.ibm;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("customerproxy")
public class CustomerResource {

    @Inject
    @RestClient
    CustomerRestClientService client;

    @GET
    public String findAll() {
        return client.findAll();
    }

    @GET
    @Path("{id}")
    public String findById(@PathParam("id") Long id) {
        return client.findById(id);
    }

    @GET
    @Path("reactive")
    public Uni<String> findByReactive() {
        return client.findByReactive();
    }

    @POST
    public String create(String payload) {
        return client.create(payload);
    }

    @PUT
    @Path("{id}")
    public String update(@PathParam("id") Long id) {
        return client.update(id);
    }

    @DELETE
    @Path("{id}")
    public String remove(@PathParam("id") Long id) {
        return client.remove(id);
    }
}
