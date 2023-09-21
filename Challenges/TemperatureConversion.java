package Challenges;

public class TemperatureConversion {
    public static void main(String[] args) {
        double tempInCelsius = 17;

        double tempInFahrenheit = (tempInCelsius * 9 / 5) + 32;

        System.out.println(tempInCelsius + "C is equal to " + tempInFahrenheit + "F");
    }
}
