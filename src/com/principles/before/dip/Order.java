package com.principles.before.dip;

import com.principles.after.ocp.CreditCardPayment;

public class Order {

	private CreditCardPayment payment;
	
	public Order(CreditCardPayment payment) {
        this.payment = payment;
    }

    public void processOrder() {
        payment.processPayment();
    }
}
