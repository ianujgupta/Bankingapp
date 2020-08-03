package com.bank.Banking.entities;
import com.bank.Banking.*;

public class Customer {
	private int id;
	private String name;
	private double balance;
	private Account account;
	//public String pancard;
	

	Customer(int id,String name,double balance,Account account){
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.account=account;
		
	}
	
public Customer() {
	this(1,"",00,null);
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
//	@Override
//	public boolean equals(Object arg) {
//		if(this==arg) {
//			return true;
//		}
//		if(arg==null||!(arg instanceof Customer)) {
//			return false;
//		}
//		Customer that=(Customer)arg;
//		boolean isequal= this.id==that.id;
//		return isequal;
//		
//	}
	
	
	
	@Override
	
	public String toString(){
		String str = name+" "+id+" "+balance;
		return str;
	}
}
