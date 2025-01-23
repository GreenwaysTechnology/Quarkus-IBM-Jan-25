package com.ibm.cdi.services.lifecycles;

import io.quarkus.runtime.StartupEvent;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.List;

@ApplicationScoped
public class UserService {
    List<String> users;
//
//    @PostConstruct
//    public void init() {
//        users = List.of("Subramanian", "Murugan");
//    }

    public void start(@Observes StartupEvent startupEvent) {
        users = List.of("Subramanian", "Murugan");

    }

    public List<String> getUsers() {
        return users;
    }

}
