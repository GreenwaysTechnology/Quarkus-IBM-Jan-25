package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.order.Order;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("orders")
@RegisterRestClient(configKey = "order-service")
public interface OrderRestClientService {
    @GET
    public Order getOrders();
}
