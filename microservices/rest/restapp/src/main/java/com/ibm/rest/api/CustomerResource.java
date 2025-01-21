package com.ibm.rest.api;

import jakarta.ws.rs.*;

@Path("customers")
public class CustomerResource {

    //methods
    @GET
    public String findAll() {
        return "Customers FindAll";
    }

    @GET
    @Path("comments")
    public String findComments(){
        return  "Customer Comments";
    }

    @POST
    public String save() {
        return "Customers Save";
    }

    @DELETE
    public String remove() {
        return "Customers Remove";
    }

    @PUT
    public String update() {
        return "Customers Update";
    }


}
