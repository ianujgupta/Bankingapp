package com.bank.Banking.exceptions;

public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
