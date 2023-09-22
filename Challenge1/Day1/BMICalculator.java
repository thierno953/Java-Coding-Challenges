package Challenge1.Day1;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height (m): ");
        double height = scanner.nextDouble();
        scanner.close();

        System.out.println("Your BMI: " + calculateBMI(weight, height));
    }

    private static double calculateBMI(double weight, double height) {
        return (weight / (height * height));
    }
}
