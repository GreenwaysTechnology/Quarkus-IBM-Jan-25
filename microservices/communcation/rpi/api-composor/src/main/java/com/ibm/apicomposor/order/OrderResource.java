package com.ibm.apicomposor.order;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;

//@Path("orders")
//public class OrderResource {
//
//    @GET
//    public Order getOrders() {
//       // return new Order("1", "IPHONE 16", 10000.00f);
//    }
//}
@Path("/orders")
public class OrderResource {

    @GET
    @Path("/{userId}")
    public List<Order> getOrders(@PathParam("userId") Long userId) {
        return Order.list("userId", userId);
    }
}
