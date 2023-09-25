package Challenge2.Day1;

import java.util.Scanner;

public class HourToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer hours: ");
        int hour = scanner.nextInt();
        scanner.close();

        // System.out.println("Total number of seconds: " + hour * 3600);
        System.out.println("Total number of seconds: " + convert(hour));
    }

    private static int convert(int hour) {
        return hour * 3600;
    }
}
