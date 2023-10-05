package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.entity.Transaction;
import com.example.service.CustomerService;
import com.example.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/deposit")
	ResponseEntity<Transaction> deposit(@RequestBody Transaction transaction) {
		try {
			transactionService.deposit(transaction);
			return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
		
	
	@PostMapping("/withdraw")
	ResponseEntity<Transaction> withdraw(@RequestBody Transaction transaction) {
		
		try {
			transactionService.withdraw(transaction);
			return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

}
