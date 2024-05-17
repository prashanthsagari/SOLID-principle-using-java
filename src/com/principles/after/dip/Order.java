package com.principles.after.dip;

public class Order {
	private PaymentMethod paymentMethod;

	public Order(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void processOrder() {
		paymentMethod.processPayment();
	}
	
	public static void main(String[] args) {
		Order order = new Order(new CreditCardPayment());
		order.processOrder();
	}
}