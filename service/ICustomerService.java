package com.bank.Banking.service;

import java.util.List;

import com.bank.Banking.entities.Customer;

public interface ICustomerService {
	
	Customer findById(int id);

	List<Customer> findAll();

	Customer updateName(int id, String newName);

	void add(Customer customer);

	Customer update(Customer customer);

	void delete(int id);

	//Customer findById(String String);

}
