package org.howard.edu.lsp.midterm.problem1;

public class Driver {
	public static void main(String[] args) {
		Book book1 = new Book("To Kill a MockingBird", "Harper Lee", 1960);
		Book book2 = new Book("To Kill a MockingBird", "Harper Lee", 1960);
		Book book3 = new Book("1984", "George Orwell", 1960);
		Book book4 = new Book("Animal Farm", "George Orwell", 1945);
		
		System.out.println("Book 1: " + book1.toString());
		System.out.println("Book 2: " + book2.toString());
		System.out.println("Book 3: " + book3.toString());
		System.out.println("Book 4: " + book4.toString());
		
		System.out.println("Book 1 equals Book 2: " + book1.equals(book2));
		System.out.println("Book 2 equals Book 1: " + book2.equals(book1));
		System.out.println("Book 1 equals Book 3: " + book1.equals(book3));
		System.out.println("Book 3 equals Book 4: " + book3.equals(book4));
	}
}
