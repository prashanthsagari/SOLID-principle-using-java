package com.principles.after.dip;

public class CreditCardPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// process credit card payment
		System.out.println("Credit card payment processed");
	}

}
