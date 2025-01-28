package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ProductService {
    public List<String> getProducts() throws InterruptedException {
        Thread.sleep(1000);
        return List.of("Product1", "Product2", "Product3");
    }
}
