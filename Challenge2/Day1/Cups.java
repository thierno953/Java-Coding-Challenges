package Challenge2.Day1;

import java.util.Scanner;

public class Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cups bought: ");
        int cups = scanner.nextInt();
        scanner.close();

        System.out.println("The total number of cups you can get is: " + totalCups(cups));
    }

    private static int totalCups(int cups) {
        return (cups / 6) + cups;
    }
}
