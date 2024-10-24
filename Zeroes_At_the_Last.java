import java.util.Arrays;

public class Zeroes_At_the_Last {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        // Copy non-zero elements to the temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        // Copy elements from temp back to arr
        // The following loop is kept as is, but you need to handle zeroes correctly
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Place zeros in the remaining positions
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }
}
