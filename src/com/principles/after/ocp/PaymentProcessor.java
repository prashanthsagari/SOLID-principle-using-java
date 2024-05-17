package com.principles.after.ocp;

public class PaymentProcessor {

	public void processPayment(PaymentMethod paymentMethod) {
		paymentMethod.processPayment();
	}
	
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		processor.processPayment(new CreditCardPayment());
		processor.processPayment(new PayPalPayment());
	}
}
