package edu.mu.library.app;

import edu.mu.library.*;

/**
 * This class tests the Library system by adding, searching, and removing books.
 */
public class LibraryApp {
    public static void main(String[] args) {
        // Step 1: Create a Library object
        Library library = new Library();

        // Step 2: Create Book objects (Love these books, give them a read if you haven't)
        Book book1 = new Book("The Martian", "Andy Weir", "1234567890", 12.99);
        Book book2 = new Book("Project Hail Mary", "Andy Weir", "0987654321", 9.99);

        // Step 3: Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Step 4: Display all books in the library
        System.out.println("\nCurrent Library Books:");
        library.displayBooks();

        // Step 5: Search for a book by title
        System.out.println("\nSearching for 'Project Hail Mary'...");
        Book foundBook = library.searchByTitle("Project Hail Mary");

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Step 6: Remove a book by ISBN
        System.out.println("\nRemoving 'Project Hail Mary'...");
        library.removeBook("0987654321");

        // Step 7: Display books again to confirm removal
        System.out.println("\nLibrary after removal:");
        library.displayBooks();
    }
}

