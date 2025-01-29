package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.order.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("orders")
@RegisterRestClient(configKey = "order-service")
public interface OrderRestClientService {
    //    @GET
//    public Order getOrders();
    @GET
    @Path("{userId}")
    List<Order> getOrders(@PathParam("userId") String userId);
}
