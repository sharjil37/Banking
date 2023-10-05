package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long>{
	
//	public String createAccount(Account a) {
//		return null;
//	}
//	
////	public Customer getCustomer(String customerId) {
////		return null;
////	}
////	
////	public String updateCustomer(Customer c) {
////		return null;
////	}
//	
//	public String deleteAccount(Account a) {
//		return null;
//	}

}
