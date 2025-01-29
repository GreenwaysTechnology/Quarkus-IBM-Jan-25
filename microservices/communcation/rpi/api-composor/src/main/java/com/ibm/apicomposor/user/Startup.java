package com.ibm.apicomposor.user;


import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.ext.Provider;

public class Startup {
    @Transactional
    public void init(@Observes StartupEvent ev) {
        // Clear existing data
        User.deleteAll();

        // Add sample users
        User user1 = new User();
        user1.name = "John Doe";
        user1.email = "john.doe@example.com";
        user1.persist();

        User user2 = new User();
        user2.name = "Jane Smith";
        user2.email = "jane.smith@example.com";
        user2.persist();
    }
}