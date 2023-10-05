package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.exceptions.AccountNotFoundException;

@Service
public interface AccountService {

	Account getAccountInfo(Long accountNo) throws AccountNotFoundException;

	Account createAccount(Long customerId, Account c);

}
