package com.deinwagen.backend.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.deinwagen.backend.dao.CustomerRepository;
import com.deinwagen.backend.entities.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

}
