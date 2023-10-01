package Challenge3.Day2;

public class CheckSix {
    public static void main(String[] args) {
        int[] a = { 6, 6, 2 };
        int[] b = { 6, 6, 2, 6 };
        int[] c = { 6, 7, 2, 6 };

        System.out.println(array667(a));
        System.out.println(array667(b));
        System.out.println(array667(c));
    }

    private static int array667(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 6 && (a[i + 1] == 6 || a[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }
}
