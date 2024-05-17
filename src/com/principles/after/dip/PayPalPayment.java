package com.principles.after.dip;

public class PayPalPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// process paypal payment
		System.out.println("Paypal payment processed");
	}

}
