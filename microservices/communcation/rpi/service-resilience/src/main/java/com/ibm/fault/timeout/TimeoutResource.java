package com.ibm.fault.timeout;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("timeout")
public class TimeoutResource {

//    @Inject
//    TimeoutService timeoutService;

    @Inject
    @RestClient
    ProductServiceRestClient productServiceRestClient;

    @GET
    @Timeout(500)
    @Fallback(fallbackMethod = "fallback")
    public List<String> timeout() throws InterruptedException {
        // return timeoutService.getProducts();
        return productServiceRestClient.getProducts();
    }

    public List<String> fallback() {
        return List.of("OOPS! Sorry Timed out");
    }
}
