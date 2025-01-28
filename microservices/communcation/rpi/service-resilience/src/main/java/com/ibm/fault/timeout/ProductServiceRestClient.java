package com.ibm.fault.timeout;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("products")
@RegisterRestClient(configKey = "productservice")
public interface ProductServiceRestClient {

    @GET
    public List<String> getProducts() throws InterruptedException;
}
