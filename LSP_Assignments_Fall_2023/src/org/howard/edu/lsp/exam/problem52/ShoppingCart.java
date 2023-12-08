package org.howard.edu.lsp.exam.problem52;

public class ShoppingCart {
	private PaymentStrategy payment;
	
	public ShoppingCart(PaymentStrategy payment) {
		this.payment = payment;
	}
	
	public void checkout(double pay) {
		payment.pay(pay);
	}
}
