package com.bank.Banking.service;
import java.util.*;
import com.bank.Banking.dao.*;
import com.bank.Banking.entities.*;
import com.bank.Banking.exceptions.*;

import com.bank.Banking.entities.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerDao dao = new CustomerDaoImpl();

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		checkId(id);
		Customer customer = dao.findById(id);
		return customer;
	}
	
	
/*
	private void checkId(String id) {
		// TODO Auto-generated method stub
		if(id < 1) {
			throw new InvalidCustomerArgumentException("id cant be negative, id passed="+id);

		}
	}
	*/

	private void checkId(int id) {
		// TODO Auto-generated method stub
		if(id<1) {
			throw new InvalidCustomerArgumentException("id cant be negative, id passed="+id);
		}

	}


	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		List<Customer> list =dao.findAll();
		return list;
	}

	@Override
	public Customer updateName(int id, String newName) {
		// TODO Auto-generated method stub
		checkId(id);
		checkName(newName);
		Customer customer = dao.updateName(id, newName);
		return customer;
	}

	private void checkName(String name) {
		// TODO Auto-generated method stub
		if(name==null||name.isEmpty()) {
			throw new InvalidCustomerArgumentException("name can't be null or empty");

		}
		
	}

	private void checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customer==null) {
			throw new InvalidCustomerArgumentException("Customer can't be null or empty");
		}
		
	}
	
	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		checkCustomer(customer);
		dao.add(customer);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		checkCustomer(customer);
		customer=dao.Update(customer);
		return customer;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		checkId(id);
		dao.delete(id);	
		
	}


	
	
}
