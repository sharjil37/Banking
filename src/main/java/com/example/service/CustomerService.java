package com.example.service;

import com.example.entity.Customer;

public interface CustomerService {

	Long deleteCustomer(Long c);

	Long createCustomer(Customer c);

	Customer getCustomer(Long customerId);

	Long updateCustomer(Customer c);

}
