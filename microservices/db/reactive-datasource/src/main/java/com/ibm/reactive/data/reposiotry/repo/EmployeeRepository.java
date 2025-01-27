package com.ibm.reactive.data.reposiotry.repo;


import com.ibm.reactive.data.reposiotry.entity.Employee;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

}