package com.ibm.cdi.services.interfaces;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ISBNGeneratorImpl implements  NumberGenerator{
    @Override
    public String generateISBNGenerator() {
        return "ISBN-199992323";
    }
}
