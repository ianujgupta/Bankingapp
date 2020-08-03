package com.bank.Banking.dao;
import java.util.List;
import com.bank.Banking.entities.Customer;

public interface ICustomerDao {
	
	Customer findById(int id);
	
	List <Customer> findAll();
	
	Customer updateName(int id,String newName);
	
	void add(Customer customer);
	
	Customer Update(Customer customer);
	
	void delete(int id);
	

}
