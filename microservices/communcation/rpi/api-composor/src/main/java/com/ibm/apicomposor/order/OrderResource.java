package com.ibm.apicomposor.order;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("orders")
public class OrderResource {

    @GET
    public Order getOrders() {
        return new Order("1", "IPHONE 16", 10000.00f);
    }
}
