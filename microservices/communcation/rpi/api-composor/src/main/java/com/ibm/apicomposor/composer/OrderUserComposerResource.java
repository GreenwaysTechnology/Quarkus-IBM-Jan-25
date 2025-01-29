package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.order.Order;
import com.ibm.apicomposor.user.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("composit")
public class OrderUserComposerResource {
    @Inject
    @RestClient
    UserRestClientService userService;

    @Inject
    @RestClient
    OrderRestClientService orderService;

    @GET

    public CompositeResponse getOrdersAndUser() {
        User user = userService.getUser();
        Order order = orderService.getOrders();
        return new CompositeResponse(user, List.of(order,order,order));
    }
}
