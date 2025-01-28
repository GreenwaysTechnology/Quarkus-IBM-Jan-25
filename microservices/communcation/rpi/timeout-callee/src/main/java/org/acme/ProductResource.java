package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("products")
public class ProductResource {

    @Inject
    ProductService productService;

    @GET
    public List<String> getProducts() throws InterruptedException {
        return productService.getProducts();
    }
}
