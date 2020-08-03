package com.bank.Banking.exceptions;
//import com.bank.Banking.*;


public class InvalidCustomerArgumentException extends RuntimeException {
	public  InvalidCustomerArgumentException(String msg) {
		super(msg);
	}
}
