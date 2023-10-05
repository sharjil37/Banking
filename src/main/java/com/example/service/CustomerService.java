package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;

@Service
public interface CustomerService {

	Long deleteCustomer(Long c);

	Long createCustomer(Customer c);

	Customer getCustomer(Long customerId);

	Long updateCustomer(Customer c);

}
