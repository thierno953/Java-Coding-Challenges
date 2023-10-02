package Challenge4.Day1.books2;

public class Main {

    public static void main(String[] args) {

        Date date1 = new Date(15, 4, 2021);
        Date date2 = new Date(14, 1, 2022);
        Date date3 = new Date(20, 4, 2023);

        Author author1 = new Author("Thierno", date1);
        Author author2 = new Author("Axel", date2);
        Author author3 = new Author("Sylvain", date3);

        Book book1 = new Book("JavaScript programming", 100, 2000, author1);
        Book book2 = new Book("Java programming", 100, 2010, author2);
        Book book3 = new Book("DevOps", 100, 2000, author3);

        book1.printBookName();
        book2.printBookName();
        book3.printBookName();

        System.out.println("Campare publised year book 1 & book 2: " + book1.checkSamePublishYear(book3));
        System.out.println("Campare publised year book 1 & book 3: " + book1.checkSamePublishYear(book3));
        System.out.println("Price book 1 after discount 10%: " + book1.priceAfterDiscount(10));
    }
}