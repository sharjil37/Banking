package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.entity.Customer;
import com.example.exceptions.AccountNotFoundException;
import com.example.repo.AccountRepo;
import com.example.repo.CustomerRepo;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	CustomerRepo custRepo;
	
	@Override
	public Account getAccountInfo(Long accountNo) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountRepo.findById(accountNo).get();
		
	}

	@Override
	public Account createAccount(Long custId, Account account) {
		// TODO Auto-generated method stub
		Customer c = custRepo.findById(custId).get();
		account.setCustomer(c);
		c.getAccount().add(account);
		custRepo.save(c);
		return accountRepo.save(account);
	}
	

}
