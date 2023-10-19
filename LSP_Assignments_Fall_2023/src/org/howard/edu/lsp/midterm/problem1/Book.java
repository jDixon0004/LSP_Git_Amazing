package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String toString() {
		return title + " | " + author + " | " + Integer.toString(year);
	}
	
	public boolean equals(Object o) {
		if(o instanceof Book) {
			Book otherBook = (Book)o;
			
			if(this.title.equals(otherBook.title) && 
					this.author.equals(otherBook.author) && 
					this.year == otherBook.year) {
				return true;
			}
		}
		
		return false;
	}
}
