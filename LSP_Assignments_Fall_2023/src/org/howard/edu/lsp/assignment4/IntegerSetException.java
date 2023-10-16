package org.howard.edu.lsp.assignment4;

public class IntegerSetException extends Exception {
	
	/**
	 * Constructs an IntegerSetException with no detail message.
	 */
	public IntegerSetException() {
		super();
	}
	
	/**
	 * Constructs an IntegerSetException with the specified detail message.
	 * @param s the detail message
	 */
	public IntegerSetException(String s) {
		super(s);
	}
}
