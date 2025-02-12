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
	
	/**
	 * Parameterized constructor which sets each variable to the given variable
	 * 
	 * @param title
	 * 			Given string title to be assigned into this variable title
	 * @param author
	 * 			Given string author to be assigned into this variable author
	 * @param ISBN
	 * 			Given string ISBN to be assigned into this variable ISBN
	 * @param price
	 * 			Given double price to be assigned into this variable price
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
}	
