package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.exceptions.CustomerAlreadyExistException;
import com.example.repo.CustomerRepo;
@Service
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
        Customer c = new Customer();
        c.setMailId(customerId.toString());
        return c;
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
