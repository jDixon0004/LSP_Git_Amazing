package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
		ShoppingCart cart2 = new ShoppingCart(new PayPalPayment("user@example.com"));
		ShoppingCart cart3 = new ShoppingCart(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
		
		cart1.checkout(100.0);
		cart2.checkout(50.0);
		cart3.checkout(75.0);
	}
}
