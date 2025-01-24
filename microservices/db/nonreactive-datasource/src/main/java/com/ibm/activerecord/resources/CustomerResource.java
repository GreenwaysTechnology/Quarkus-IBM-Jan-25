package com.ibm.activerecord.resources;

import com.ibm.activerecord.entity.Customer;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("customers")
public class CustomerResource {

    //findAll
    @GET
    public List<Customer> findAll() {
        return Customer.listAll();
    }

    @GET
    @Path("{id}")
    public Customer findById(@PathParam("id") Integer id) {
        Customer customer = Customer.findById(id);
        if (customer == null) {
            throw new WebApplicationException("Customer with Id of " + id + " does not exists");
        }
        return customer;
    }

    @POST
    @Transactional
    public Response save(Customer customer) {
        if (customer.id != null) {
            throw new WebApplicationException("Id was invalidly set on Request", 422);
        }
        customer.persist();
        return Response.ok(customer).status(201).build();
    }
    //update

    @PUT
    @Path("{Id}")
    @Transactional
    public Customer update(@PathParam("Id") Integer Id, Customer customer) {
        //find the customer is avaiable in the table
        Customer customerEntity = Customer.findById(Id);
        if (customerEntity == null) {
            throw new WebApplicationException("Customer with Id of " + Id + " does not exists");
        }
        if (customer.name == null) {
            throw new WebApplicationException("Customer payload  does not exists");
        }
        //update logic
        customerEntity.name = customer.name;
        customerEntity.city = customer.city;
        return customerEntity;
    }

    //remove
    @DELETE
    @Path("{Id}")
    @Transactional
    public Response remove(@PathParam("Id") Integer id) {
        Customer customerEntity = Customer.findById(id);
        if (customerEntity == null) {
            throw new WebApplicationException("Customer with Id of " + id + " does not exists");
        }
        //delete
        customerEntity.delete();
        return Response.status(204).build();

    }
}
