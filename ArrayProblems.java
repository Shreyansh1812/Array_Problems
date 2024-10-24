import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems {

    // Selection sort algorithm
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Check if array is sorted
    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Cyclic sort for elements from 1 to n
    public static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> missingElements = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missingElements.add(arr[i]);
            }
        }
        return missingElements;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Rotate array by one position to the left
    public static void rotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    // Rotate array by 'x' positions to the right
    public static void rotateRight(int[] arr, int x) {
        int n = arr.length;
        x = x % n; // Effective rotation if x > n
        int[] temp = new int[x];
        for (int i = 0; i < x; i++) {
            temp[i] = arr[n - x + i];
        }
        for (int i = n - 1; i >= x; i--) {
            arr[i] = arr[i - x];
        }
        for (int i = 0; i < x; i++) {
            arr[i] = temp[i];
        }
    }

    // Move all non-zero elements to the front, push zeroes to the back
    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill the remaining array with zeroes
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        // Test example for moving zeroes
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}
