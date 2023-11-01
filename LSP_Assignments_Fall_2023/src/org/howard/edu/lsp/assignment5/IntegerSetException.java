package org.howard.edu.lsp.assignment5;

/**
 * Thrown when an exception condition results from an implementation of the IntegerSet class. For example, if an "Empty set" is found 
 * in certain operations, this exception is thrown.
 * 
 * @author Jaelen Dixon
 */
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
