package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Customer;
import com.example.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Long>{
	
}
