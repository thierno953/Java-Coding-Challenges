package Challenge1;

public class ConvertCurrency {

    private static final float CONVERSION_RATE = 99.91f;

    public static void main(String[] args) {

        int eurValue = 10;
        float npr = eurValue * CONVERSION_RATE;

        System.out.println(eurValue + " EUR equals to " + npr + " NPR");
    }
}
