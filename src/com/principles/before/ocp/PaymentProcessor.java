package com.principles.before.ocp;

public class PaymentProcessor {

	public void processPayment(String paymentType) {
		if (paymentType.equals("CreditCard")) {
			// Process credit card payment
		} else if (paymentType.equals("PayPal")) {
			// Process PayPal payment
		}
	}
}