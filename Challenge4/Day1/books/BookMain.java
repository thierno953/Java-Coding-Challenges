package Challenge4.Day1.books;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J. K. Rowling", 1994));
        books.add(new Book("Lord of the Rings", "John. R. R. Tolkien", 1992));
        books.add(new Book("Red Rising", "Pierce Brown", 2014));

        printBooksAfterYear(books, 2000);
    }

    private static void printBooksAfterYear(ArrayList<Book> books, int year) {
        for (Book book : books) {
            if (book.getYearPublished() > year) {
                System.out.println(book.getTitle());
            }
        }
    }
}
