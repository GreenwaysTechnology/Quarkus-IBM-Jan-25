package org.acme.service;

import io.quarkus.vertx.ConsumeEvent;
import io.vertx.mutiny.core.eventbus.Message;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    @ConsumeEvent("greeting")
    public String sayHello(String name) {
        return "Hello" + name.toUpperCase();
    }
}
