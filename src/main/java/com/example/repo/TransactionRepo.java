package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Customer;
import com.example.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long>{
	
//	public String createCustomer(Customer c) {
//		return null;
//	}
//	
//	public Customer getCustomer(String customerId) {
//		return null;
//	}
//	
//	public String updateCustomer(Customer c) {
//		return null;
//	}
//	
//	public String deleteCustomer(Customer c) {
//		return null;
//	}

}
