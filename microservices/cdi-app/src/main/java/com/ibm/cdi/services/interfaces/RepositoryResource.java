package com.ibm.cdi.services.interfaces;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("repository")
public class RepositoryResource {

    @Inject
    @Named("sqlrepo")
    Repository repository;

    @GET
    public String getRepository() {
        return repository.findAll();
    }
}
