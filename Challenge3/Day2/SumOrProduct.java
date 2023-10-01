package Challenge3.Day2;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int input2 = scanner.nextInt();
        scanner.close();

        System.out.println(sumOrProduct(input1, input2));
    }

    private static int sumOrProduct(int a, int b) {
        if (a == b) {
            return (a * b);
        }
        return a + b;
    }
}
