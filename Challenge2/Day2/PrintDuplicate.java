public class PrintDuplicate {
    public static void main(String[] args) {

        int[] arr = { 1, 8, 4, 5, 8, 7, 4 };
        String duplicates = "";

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    if (!duplicates.contains("" + arr[i])) {
                        duplicates += "" + arr[i];
                    }
                }
            }
        }
        char[] duplicatedChar = duplicates.toCharArray();
        for (int i = 0; i < duplicatedChar.length; i++) {
            System.out.println(duplicatedChar[i]);
        }
    }
}
