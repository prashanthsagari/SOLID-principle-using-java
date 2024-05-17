package com.principles.after.ocp;

public class PayPalPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// process paypal payment
		System.out.println("Paypal payment processed");
	}

}
