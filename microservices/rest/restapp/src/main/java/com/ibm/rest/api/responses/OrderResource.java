package com.ibm.rest.api.responses;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("orders")
public class OrderResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Order findOrder() {
        return new Order(1, 3434.5656, true);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public List<Order> list() {
        List<Order> orders = List.of(
                new Order(1, 3434.5656, true),
                new Order(2, 3.34, false)
        );
        return orders;
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        System.out.println("Removed");
    }

}
