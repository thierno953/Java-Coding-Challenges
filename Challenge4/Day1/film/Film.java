package Challenge4.Day1.film;

public class Film {
    private String filmNation;
    private int producerYear;
    private Producer producer;
    private double price;
    private Date date;

    public Film(String filmNation, int producerYear, Producer producer, double price, Date date) {
        this.filmNation = filmNation;
        this.producerYear = producerYear;
        this.producer = producer;
        this.price = price;
        this.date = date;
    }

    public String getFilmNation() {
        return filmNation;
    }

    public void setFilmNation(String filmNation) {
        this.filmNation = filmNation;
    }

    public int getProducerYear() {
        return producerYear;
    }

    public void setProducerYear(int producerYear) {
        this.producerYear = producerYear;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // methods

    public boolean checkCheaperFilm(Film otherFilm) {
        return this.price < otherFilm.price;
    }

    public String getFilmProducerName() {
        return this.producer.getProducerName();
    }

    public double getPriceAfterDiscount(double discountPercentage) {
        return this.price * (1 - discountPercentage / 100);
    }
}
