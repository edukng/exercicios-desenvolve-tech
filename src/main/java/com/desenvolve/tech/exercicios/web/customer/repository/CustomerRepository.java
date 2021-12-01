package com.desenvolve.tech.exercicios.web.customer.repository;

import com.desenvolve.tech.exercicios.web.customer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
