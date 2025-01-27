package com.ibm;

import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import io.smallrye.mutiny.Uni;
@Path("customers")
@RegisterRestClient(configKey = "customerservice")
public interface CustomerRestClientService {
    //all callee rest api declarations
    //api declaration of callee
    @GET
    String findAll();

    @GET
    @Path("{id}")
    String findById(@PathParam("id") Long id);

    @GET
    @Path("reactive")
    Uni<String> findByReactive();


    @POST
    String create(String payload);

    @PUT
    @Path("{id}")
    String update(@PathParam("id") Long id);

    @DELETE
    @Path("{id}")
    public String remove(@PathParam("id") Long id);
}
