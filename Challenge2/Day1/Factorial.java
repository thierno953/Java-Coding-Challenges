package Challenge2.Day1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        scanner.close();

        for (int i = 1; i <= number; i++) {
            factorial *= 1;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
