public class CheckLength {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3, 1 };
        int[] c = { 1, 2, 1 };

        System.out.println(sameFirstLast(a));
        System.out.println(sameFirstLast(b));
        System.out.println(sameFirstLast(c));
    }

    public static boolean sameFirstLast(int[] arr) {
        return (arr.length > 1 && arr[0] == arr[arr.length - 1]);
    }
}