package com.ibm.rest.response.thread;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("workerThread")
public class WorkerThreadResource {

    @GET
    public String testThread() {
        System.out.println(Thread.currentThread().getName());
        return "Hello";
    }
}
