package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;

import com.example.exceptions.CustomerAlreadyExistException;
import com.example.exceptions.CustomerDetailNotFoundException;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
	

}
