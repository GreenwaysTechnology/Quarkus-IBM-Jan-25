package com.ibm.reactive.data.reposiotry;

import com.ibm.reactive.data.reposiotry.entity.Employee;
import com.ibm.reactive.data.reposiotry.repo.EmployeeRepository;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("employees")
public class EmployeeResource {
    @Inject
    EmployeeRepository repository;

    @GET
    public Uni<List<Employee>> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("{id}")
    public Uni<Response> getEmployeeById(@PathParam("id") Long id) {
        return repository.findById(id).onItem().transform(entity -> {
            if (entity == null) {
                throw new WebApplicationException("Employee with ID Of " + id + "does not  exits", 404);
            }
            return Response.ok(entity).status(200).build();
        });
    }


}
