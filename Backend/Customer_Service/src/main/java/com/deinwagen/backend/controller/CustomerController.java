package com.deinwagen.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deinwagen.backend.entities.Customer;
import com.deinwagen.backend.service.CustomerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/purchase")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		Customer customerResponse=customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(customerResponse,HttpStatus.OK);
	}
	

}
