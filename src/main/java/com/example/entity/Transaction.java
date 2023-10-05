package com.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	private String transactionId;
	
	private String transactionType;
	
	private String amount;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
