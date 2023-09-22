package Challenge1.Day1;

public class CurrencyConverter {
    private static final float CONVERSION_RATE = 99.91f;
    public static void main(String[] args) {
        int eur = 10;
        float npr = eur * CONVERSION_RATE;

        System.out.println(eur + " EUR equals to " + npr + " NPR");
    }
}
