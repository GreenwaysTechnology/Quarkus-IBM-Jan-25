package com.ibm.cdi.services.interfaces;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("nosqlrepo")
public class NOSQLRepositoryImpl implements Repository {
    @Override
    public String findAll() {
        return "nosql";
    }
}
