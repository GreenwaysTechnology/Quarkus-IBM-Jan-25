package com.ibm.service.communication.eventbus;

import io.quarkus.vertx.ConsumeEvent;
import io.vertx.mutiny.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FireAndForgetService {

    @ConsumeEvent("sink")
    public void process(Message<String> message) {
        String msg = message.body();
        String address = message.address();
        System.out.println("Message " + msg + " " + "Address " + address);
    }
}
