package OOP_Assignment1.LibraryReader;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryReader reader1 = new LibraryReader("John Doe", "12345", "Computer Science", "555-1234", LocalDate.of(2004, 5, 1));
        LibraryReader reader2 = new LibraryReader("Mark", "1234", "Software Engineering", "444-1234", LocalDate.of(2004, 5, 1));
        LibraryReader[] readers = {reader1, reader2};

        // Creating some books
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Testing takeBook methods
        readers[0].takeBook(3);
        readers[0].takeBook("Introduction to Java", "Data Structures", "Algorithms");
        readers[0].takeBook(book1, book2);

        // Testing returnBook methods
        readers[1].returnBooks(2);
        readers[1].returnBooks("Introduction to Java", "Data Structures");
        readers[1].returnBooks(book1, book2);
    }
}