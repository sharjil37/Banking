package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long>{

}
