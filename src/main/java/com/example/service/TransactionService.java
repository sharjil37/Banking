package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Transaction;
import com.example.exceptions.TransactionFailedException;

@Service
public interface TransactionService {

	public boolean deposit(Transaction t) throws TransactionFailedException;
	
	public boolean withdraw(Transaction t) throws TransactionFailedException;
}
