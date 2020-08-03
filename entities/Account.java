package com.bank.Banking.entities;
import com.bank.Banking.*;

public class Account {
	private double balance;
	private String pancard;
	
	 public Account(double balance,String Pancard) {
		this.balance=balance;
		this.pancard=Pancard;
		
	}
	
	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public double getBalance() {
		return balance;
	}

	void setBalance( double balance){
		this.balance=balance;		
	}
	
	double getbalance() {
		return balance;
		
	}
	/*
	@Override
	public String hashCode(){
		return pancard;
	}
	*/
//	@Override
//	public boolean equals(Object arg) {
//		if(this==arg) {
//			return true;
//		}
//		if(arg==null||!(arg instanceof Customer)) {
//			return false;
//		}
//		Customer that=(Customer)arg;
//		boolean isequal= this.pancard==that.pancard;
//		return isequal;
//		
//	}

}
