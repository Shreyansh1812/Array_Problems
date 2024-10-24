import java.util.*;

public class Count_Subarray {
    public static int countSubarraysWithSumK(int[] arr, int K) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {  // Keep j starting from i to include single element subarrays
                sum += arr[j];
                if (sum == K) {
                    count++;
                }
            }
        }
        return count;  // Don't forget to return the count
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int K = 5; // Example K value
        System.out.println("Number of subarrays with sum " + K + " is " + countSubarraysWithSumK(arr, K));
    }
}
