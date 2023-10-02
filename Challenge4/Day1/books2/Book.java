package Challenge4.Day1.books2;

public class Book {
    private String bookName;
    private double price;
    private int publishYear;
    private Author author;

    public Book(String bookName, double price, int publishYear, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // methods

    public void printBookName() {
        System.out.println(this.bookName);
    }

    public boolean checkSamePublishYear(Book otherBook) {
        return this.publishYear == otherBook.publishYear;
    }

    public double priceAfterDiscount(double discountAmount) {
        return this.price * (1 - discountAmount / 100);
    }
}