package Challenge4.Day1.film;

public class Producer {
    private String producerName;
    private String nation;

    public Producer(String producerName, String nation) {
        this.producerName = producerName;
        this.nation = nation;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}