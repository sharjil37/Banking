package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getCustomer")
	ResponseEntity<Customer> getCustomer(Long custId) {
		Customer customer = customerService.getCustomer(custId);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@PostMapping("/createCustomer")
	ResponseEntity<Long> create(Customer customer) {
		Long id = customerService.createCustomer(customer);
		return new ResponseEntity<Long>(id, HttpStatus.OK);
	}

}
