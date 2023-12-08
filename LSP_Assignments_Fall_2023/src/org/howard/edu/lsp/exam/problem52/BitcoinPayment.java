package org.howard.edu.lsp.exam.problem52;

public class BitcoinPayment implements PaymentStrategy {
	private String bitcoinAddress;
	
	public BitcoinPayment(String bitcoinAddress) {
		this.bitcoinAddress = bitcoinAddress;
	}
	
	public void pay(double pay) {
		System.out.println("Paid " + pay + " using Bitcoin address " + this.bitcoinAddress);
	}
}
