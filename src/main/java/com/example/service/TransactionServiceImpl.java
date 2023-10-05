package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.entity.Transaction;
import com.example.exceptions.TransactionFailedException;
import com.example.repo.TransactionRepo;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepo transRepo;
	
	@Override
	public boolean deposit(Transaction t) throws TransactionFailedException {
		// TODO Auto-generated method stub
		try {
			transRepo.save(t);
			return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
	}

	@Override
	public boolean withdraw(Transaction t) throws TransactionFailedException {
		// TODO Auto-generated method stub
		try {
		transRepo.save(t);
		return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	

}
