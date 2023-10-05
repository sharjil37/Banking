package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Account;
import com.example.entity.Customer;
import com.example.service.AccountService;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/getAccountInfo")
	ResponseEntity<Account> getAccountInfo(@RequestBody Long accountNo) {
		try {
			Account account = accountService.getAccountInfo(accountNo);
			return new ResponseEntity<Account>(account, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Account>(new Account(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/createAccount/{custId}")
	ResponseEntity<Long> createAcount(@PathVariable Long custId, @RequestBody Account account) {
	accountService.createAccount(custId, account);
			return new ResponseEntity<Long>(HttpStatus.OK);
			// TODO: handle exception
	}

}
