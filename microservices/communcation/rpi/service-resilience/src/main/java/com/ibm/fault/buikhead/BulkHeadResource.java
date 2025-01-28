package com.ibm.fault.buikhead;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.Bulkhead;
import org.eclipse.microprofile.faulttolerance.Fallback;

@Path("bulkhead")
public class BulkHeadResource {

    @GET
    @Bulkhead(value = 5, waitingTaskQueue = 5)
    @Fallback(fallbackMethod = "fallback")
    public Response dontOverload() {
        System.out.println("Api is called");
        return Response.ok("bulk").build();
    }

    public Response fallback() {
        System.out.println("Sorry service is too busy!");
        return Response.ok("sorry service is too busy").build();
    }
}
