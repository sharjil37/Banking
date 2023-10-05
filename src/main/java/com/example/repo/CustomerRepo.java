package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.example.entity.Customer;

import com.example.exceptions.CustomerAlreadyExistException;
import com.example.exceptions.CustomerDetailNotFoundException;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
//	public String createCustomer(Customer c) throws CustomerAlreadyExistException;
	
//	public Customer getCustomer(String customerId) throws CustomerDetailNotFoundException {
//		return null;
//	}
//	
//	public String updateCustomer(Customer c) throws CustomerDetailNotFoundException {
//		return null;
//	}
//	
//	public String deleteCustomer(Customer c) throws CustomerDetailNotFoundException {
//		return null;
//	}

}
