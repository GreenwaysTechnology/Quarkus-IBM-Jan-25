package com.ibm.rest.client.registry;

import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.runtime.StartupEvent;
import io.vertx.core.Vertx;
import io.vertx.ext.consul.ConsulClient;
import io.vertx.ext.consul.ConsulClientOptions;
import io.vertx.ext.consul.ServiceOptions;
import jakarta.enterprise.event.Observes;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class BeanRegistry {
    //Consul server Host
    @ConfigProperty(name = "consul.host")
    String host;
    @ConfigProperty(name = "consul.port")
    int port;
    //service host and port
    @ConfigProperty(name = "hello-service-port", defaultValue = "8081")
    int helloPort;

    public void init(@Observes StartupEvent startupEvent, Vertx vertx) {
        //service bean registration into service registry.
        ConsulClient client = ConsulClient.create(vertx,
                new ConsulClientOptions().setHost(host).setPort(port));
        //Register service with Consul Server
//        client.registerService(new ServiceOptions()
//                .setId("hello")
//                .setName("hello-service")
//                .setAddress("localhost")
//                .setPort(helloPort));

        //Register service with Consul Server
//        ServiceOptions serviceOptions1 = new ServiceOptions()
//                .setId("hello1")
//                .setName("hello-service")
//                .setAddress("localhost")
//                .setPort(helloPort);
//
//        ServiceOptions serviceOptions2 = new ServiceOptions()
//                .setId("hello2")
//                .setName("hello-service")
//                .setAddress("localhost")
//                .setPort(helloPort);
//
//        client.registerService(serviceOptions1);
//        client.registerService(serviceOptions2);
        for (int i = 1; i <= 10; i++) {
            ServiceOptions serviceOptions = new ServiceOptions()
                    .setId("hello-" + i)
                    .setName("hello-service")
                    .setAddress("localhost")
                    .setPort(helloPort);

            client.registerService(serviceOptions);
        }

    }


}
