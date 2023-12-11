package LibraryReader;

import java.time.LocalDate;

public class LibraryReaderMain {
    public static void main(String[] args) {
        LibraryReader reader = new LibraryReader("John Doe", "12345", "Computer Science", "555-1234", LocalDate.of(2004, 5, 1));

        // Creating some books
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Testing takeBook methods
        reader.takeBook(3);
        reader.takeBook("Introduction to Java", "Data Structures", "Algorithms");
        reader.takeBook(book1, book2);

        // Testing returnBook methods
        reader.returnBooks(2);
        reader.returnBooks("Introduction to Java", "Data Structures");
        reader.returnBooks(book1, book2);
    }
}