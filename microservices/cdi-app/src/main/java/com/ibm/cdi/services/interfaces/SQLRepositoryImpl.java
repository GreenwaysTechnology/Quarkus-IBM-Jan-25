package com.ibm.cdi.services.interfaces;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("sqlrepo")
public class SQLRepositoryImpl implements Repository{

    @Override
    public String findAll() {
        return "sql";
    }
}
