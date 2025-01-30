package com.ibm.service.communication.eventbus;

import io.quarkus.vertx.ConsumeEvent;
import io.vertx.mutiny.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificationService {

    @ConsumeEvent("notification")
    public void subscriberOne(Message<String> message) {
        System.out.println("Subscriber One" + message.address() + " " + message.body());
    }

    @ConsumeEvent("notification")
    public void subscriberTwo(Message<String> message) {
        System.out.println("Subscriber Two" + message.address() + " " + message.body());

    }

    @ConsumeEvent("notification")
    public void subscriberThree(Message<String> message) {
        System.out.println("Subscriber Three" + message.address() + " " + message.body());

    }
}
