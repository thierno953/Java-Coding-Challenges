package Challenge4.Day1.film;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(10, 1, 2000);
        Date date2 = new Date(15, 2, 2001);
        Date date3 = new Date(20, 12, 2005);

        Producer producer1 = new Producer("company A", "UE");
        Producer producer2 = new Producer("company B", "Viet Nam");

        Film film1 = new Film("Avenger", 2010, producer1, 100, date3);
        Film film2 = new Film("Avatar", 2013, producer2, 70, date1);
        Film film3 = new Film("Titanic", 2002, producer1, 120, date2);

        System.out.println("Compare film 1 is cheaper than film 2: " + film1.checkCheaperFilm(film2));
        System.out.println("Compare film 2 is cheaper than film 3: " + film2.checkCheaperFilm(film3));

        System.out.println("Producer Name film 1: " + film1.getFilmProducerName());

        System.out.println("file 2 discount 20% : " + film2.getPriceAfterDiscount(20));
    }
}
