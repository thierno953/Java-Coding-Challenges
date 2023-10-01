package Challenge3.Day2;

public class CheckTen {
    public static void main(String[] args) {
        System.out.println(makes(9, 10));
        System.out.println(makes(9, 9));
        System.out.println(makes(1, 9));
    }

    private static boolean makes(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
