package edu.mu.library;

import java.util.ArrayList;

/**
 * The Library class manages a collection of books.
 */
public class Library {
    private ArrayList<Book> books;

    /**
     * Default constructor initializes an empty library.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    /**
     * Removes a book by its ISBN number.
     *
     * @param ISBN The ISBN of the book to remove.
     * @return true if the book was removed, false if not found.
     */
    public boolean removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                books.remove(i);
                System.out.println("Book removed successfully: ISBN " + ISBN);
                return true;
            }
        }
        System.out.println("Error: Book with ISBN " + ISBN + " not found.");
        return false;
    }

    /**
     * Searches for a book by its title.
     *
     * @param title The title to search for.
     * @return The book if found, otherwise null.
     */
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Book not found: " + title);
        return null;
    }

    /**
     * Displays all books in the library.
     */
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

