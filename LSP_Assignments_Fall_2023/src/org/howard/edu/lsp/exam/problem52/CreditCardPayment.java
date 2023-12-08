package org.howard.edu.lsp.exam.problem52;

public class CreditCardPayment implements PaymentStrategy {
	private String creditCardNumber;
	
	public CreditCardPayment(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public void pay(double pay) {
		System.out.println("Paid " + pay + " using credit card " + this.creditCardNumber);
	}
}
