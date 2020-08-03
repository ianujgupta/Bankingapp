package com.bank.Banking.entities;
//import com.bank.Banking.*;

public class BusinessCustomer extends Customer {
	String businessAddress;

	public BusinessCustomer(String businessAddress,int id,String name,double balance,Account account){
		super(id,name,balance,account);
		this.businessAddress=businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;

	}
}