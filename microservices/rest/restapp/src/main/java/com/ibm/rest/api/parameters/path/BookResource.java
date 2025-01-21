package com.ibm.rest.api.parameters.path;

import jakarta.ws.rs.*;

@Path("books")
public class BookResource {
    @GET
    public String findAll() {
        return "Books";
    }

    //getBooks by id
    @GET
    @Path("{Id}")
    public String findById(@PathParam("Id") Integer id) {
        return "Books By " + id;
    }
    //delete by id
    @DELETE
    @Path("{Id}")
    public String delete(@PathParam("Id") Integer id) {
        return "Books Delete By Id " + id;
    }
    @PUT
    @Path("{Id}")
    public String update(@PathParam("Id") Integer id) {
        return "Books Update By Id " + id;
    }
}
