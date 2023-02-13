package com.deinwagen.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.deinwagen.backend.entities.Customer;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	Customer findByIdAndFirstNameAndLastName(@RequestParam("id") Long id, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName);

}
