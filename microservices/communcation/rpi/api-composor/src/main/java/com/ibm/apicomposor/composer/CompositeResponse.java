package com.ibm.apicomposor.composer;

import com.ibm.apicomposor.order.Order;
import com.ibm.apicomposor.user.User;

import java.util.List;


public class CompositeResponse {
    public User user;
    public CompositeResponse(User user, List<Order> orders) {
        this.user = user;
        this.user.orders = orders;
    }

}
