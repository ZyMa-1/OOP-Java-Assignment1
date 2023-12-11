package LibraryReader;

import java.time.LocalDate;

public class LibraryReader {
    public String fullName, cardNumber, faculty, phoneNumber;
    public LocalDate dateOfBirth;

    public LibraryReader(String fullName,
                         String cardNumber,
                         String faculty,
                         String phoneNumber,
                         LocalDate dateOfBirth) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public void takeBook(int numberOfBooks) {
        String formattedOutput = String.format("%s took %d books", fullName, numberOfBooks);
        System.out.println(formattedOutput);
    }

    public void takeBook(String... bookTitles) {
        StringBuilder booksTitlesMerged = new StringBuilder();
        for (String bookTitle : bookTitles) {
            if (!booksTitlesMerged.isEmpty()) {
                booksTitlesMerged.append(", ");
            }
            booksTitlesMerged.append(bookTitle);
        }
        String formattedOutput = String.format("%s took books: %s", fullName, booksTitlesMerged);
        System.out.println(formattedOutput);
    }

    public void takeBook(Book... books) {
        StringBuilder booksMerged = new StringBuilder();
        for (Book book : books) {
            if (!booksMerged.isEmpty()) {
                booksMerged.append(", ");
            }
            booksMerged.append(String.format("%s (author: %s)", book.name, book.author));
        }
        String formattedOutput = String.format("%s took books: %s", fullName, booksMerged);
        System.out.println(formattedOutput);
    }

    public void returnBooks(int numberOfBooks) {
        String formattedOutput = String.format("%s returned %d books", fullName, numberOfBooks);
        System.out.println(formattedOutput);
    }

    public void returnBooks(String... bookTitles) {
        StringBuilder booksTitlesMerged = new StringBuilder();
        for (String bookTitle : bookTitles) {
            if (!booksTitlesMerged.isEmpty()) {
                booksTitlesMerged.append(", ");
            }
            booksTitlesMerged.append(bookTitle);
        }
        String formattedOutput = String.format("%s returned books: %s", fullName, booksTitlesMerged);
        System.out.println(formattedOutput);
    }

    public void returnBooks(Book... books) {
        StringBuilder booksMerged = new StringBuilder();
        for (Book book : books) {
            if (!booksMerged.isEmpty()) {
                booksMerged.append(", ");
            }
            booksMerged.append(String.format("%s (author: %s)", book.name, book.author));
        }
        String formattedOutput = String.format("%s returned books: %s", fullName, booksMerged);
        System.out.println(formattedOutput);
    }
}
