package org.howard.edu.lsp.exam.problem52;

public class PayPalPayment implements PaymentStrategy {
	private String emailAddress;
	
	public PayPalPayment(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void pay(double pay) {
		System.out.println("Paid " + pay + " using Paypal account " + this.emailAddress);
	}
}
