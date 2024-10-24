import java.util.ArrayList;
import java.util.List;

public class Reverse_Pair {

    // To store the pairs
    public static List<List<Integer>> result = new ArrayList<>();

    // Optimized function to count reverse pairs using merge sort
    public static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right);

        // Count reverse pairs while merging
        count += countWhileMerging(arr, left, mid, right);

        // Perform the merge step
        merge(arr, left, mid, right);

        return count;
    }

    // Function to count reverse pairs during the merge step
    public static int countWhileMerging(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        // Count reverse pairs such that arr[i] > 2 * arr[j]
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2L * arr[j]) {
                count++;
                // Store the reverse pair
                result.add(List.of(arr[j], arr[i]));
                j++;
            }
        }

        return count;
    }

    // Function to merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge the two sorted halves
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] SKILL = {4, 1, 2, 3, 1};

        // Use merge sort to count reverse pairs
        int reversePairsCount = mergeSortAndCount(SKILL, 0, SKILL.length - 1);

        System.out.println("Number of reverse pairs: " + reversePairsCount);
        System.out.println("Reversed pairs: " + result);
    }
}
