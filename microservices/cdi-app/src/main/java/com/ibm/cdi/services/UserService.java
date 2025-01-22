package com.ibm.cdi.services;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class UserService {
    public List<String> users() {
        return List.of("Subramanian", "Murugan");
    }

    public Uni<List<String>> usersUni() {
        return Uni.createFrom().item(List.of("Subramanian", "Murugan"));
    }

}
