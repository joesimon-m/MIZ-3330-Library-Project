package edu.mu.library;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * Default constructor that sets each string to Unknown
	 * and sets the price to 0.0
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
}	
