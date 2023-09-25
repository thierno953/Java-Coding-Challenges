package Challenge2.Day1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a height for a triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Enter a base for the triangle: ");
        double base = scanner.nextDouble();
        scanner.close();

        System.out.println("Area of the triangle: " + triArea(height, base));
    }

    private static double triArea(double height, double base) {
        return (height + base) / 2;
    }
}
