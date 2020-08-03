package com.bank.Banking.entities;
import com.bank.Banking.*;

public class RegularCustomer extends Customer{
	
	String houseAddress;
	
	public RegularCustomer(String houseAddress,int id,String name,double balance,Account account){
		super(id,name,balance,account);
		this.houseAddress=houseAddress;
	}
	public String getHouseAddress(){
		return houseAddress;	}
	
	void setHouseAddress(String houseAddress){
		this.houseAddress=houseAddress;

	}
}
