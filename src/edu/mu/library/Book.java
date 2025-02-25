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
	
	/**
	 * Copy constructor which copies the values of each variable inside the Book object 
	 * and stores them to the variables of this object
	 * 
	 * @param book
	 * 			Object of type Books that contains the values we want copied
	 */
	public Book(Book book) {
		if(book == null) {
			System.out.println("Fatal Error. Book object was null.");
			System.exit(0);
		} else {
			this.title = book.getTitle();
			this.author = book.getAuthor();
			this.ISBN = book.getISBN();
			this.price = book.getPrice();
		}
	}
	
	/**
	 * Getter method for the title
	 * 
	 * @return
	 * 			String value of this variable title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Setter method for the title
	 * 
	 * @param title
	 * 			title variable to be assigned to this variable title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Getter method for the author
	 * 
	 * @return
	 * 			String value of this variable author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Setter method for the author
	 * 
	 * @param author
	 * 			author variable to be assigned to this author variable
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Getter method for the ISBN
	 * 
	 * @return
	 * 			String value of this variable ISBN
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * Setter method for the ISBN
	 * 
	 * @param ISBN
	 * 			ISBN variable to be assigned to this ISBN variable
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	/**
	 * Getter method for the price
	 * 
	 * @return
	 * 			Double value of this variable price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Setter method for the price
	 * 
	 * @param price
	 * 			price variable to be assigned to this price variable
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Changes the default way any object book is sent into output 
	 * when called
	 * 
	 * @return
	 * 			String in which contains the way we want each book to be printed
	 */
	@Override
	public String toString() {
		return this.title + " by " + this.author + " (ISBN: " + this.ISBN + ", $" + this.price + ")";
	}
	
	/**
	 * Compares a given Object to this object. True is returned if each variable is the same,
	 * and false is returned otherwise
	 * 
	 * @param other
	 * 		Object to be compared with this book object
	 * @return
	 * 		type boolean indicating whether the given
	 * 		object is equal to this object
	 */
	@Override
	public boolean equals(Object other) {
	    if (other == null || !(other instanceof Book)) { // Added instanceof check
	        return false;
	    }
	    Book book = (Book) other;
	    return this.title.equals(book.getTitle()) &&
	           this.author.equals(book.getAuthor()) &&
	           this.ISBN.equals(book.getISBN()) &&
	           this.price == book.getPrice();
		}
	}
