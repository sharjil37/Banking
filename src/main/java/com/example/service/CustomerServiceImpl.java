package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Customer;
import com.example.exceptions.CustomerAlreadyExistException;
import com.example.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Long createCustomer(Customer c) {
		Customer customer = customerRepo.save(c);		
		return customer.getCustomerId();
	}
	
	public Customer getCustomer(Long customerId) {
		Optional<Customer> custOpt = customerRepo.findById(customerId);
        if (custOpt.isPresent()) {
            return custOpt.get();
        }
		return new Customer(); 
	}
	
	public Long updateCustomer(Customer c) {
		Customer customer = customerRepo.save(c);		
		return customer.getCustomerId();
	}
	
	public Long deleteCustomer(Long customerId) {
		Optional<Customer> custOpt = customerRepo.findById(customerId);
        if (custOpt.isPresent()) {
            customerRepo.delete(custOpt.get());
        }
        return customerId;
	}

}
