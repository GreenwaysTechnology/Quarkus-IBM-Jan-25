package com.ibm.apicomposor.order;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.ext.Provider;

public class Startup {
    @Transactional
    public void init(@Observes StartupEvent ev) {
        // Clear existing data
        Order.deleteAll();

        // Add sample orders
        Order order1 = new Order();
        order1.userId = 1L;
        order1.productName = "Laptop";
        order1.price = 1200.0;
        order1.persist();

        Order order2 = new Order();
        order2.userId = 1L;
        order2.productName = "Smartphone";
        order2.price = 800.0;
        order2.persist();
    }
}