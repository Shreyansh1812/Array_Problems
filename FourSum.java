import java.util.*;

public class FourSum {

    // Brute Force Solution (O(n^4))
    // Logic:
    // 1. Iterate through all possible quadruplets using four nested loops.
    // 2. Check if the sum of the quadruplet is equal to the target (k).
    // 3. If the sum matches the target, check if the quadruplet is already in the result list.
    // 4. If not, add the quadruplet to the result list.
    // Time Complexity: O(n^4) due to four nested loops.
    public static List<List<Integer>> fourSumBruteForce(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);  // Optional sorting to make checking for duplicates easier

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int s = j + 1; s < n - 1; s++) {
                    for (int l = s + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[s] + nums[l] == k) {
                            List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[s], nums[l]);
                            if (!result.contains(quad)) {  // Check for duplicate quadruplets
                                result.add(quad);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    // Optimized Solution using Two Pointers (O(n^3))
    // Logic:
    // 1. First, sort the array.
    // 2. Fix two elements using nested loops.
    // 3. Use two pointers (left and right) to find the remaining two elements whose sum matches the target.
    // 4. Skip duplicates for both the first and second elements, as well as for the two-pointer elements.
    // Time Complexity: O(n^3), because for each fixed pair, we use a two-pointer approach.
    public static List<List<Integer>> fourSumOptimized(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);  // Sort the array to handle duplicates and use two-pointer

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {  // Skip duplicates for the first element
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {  // Skip duplicates for the second element
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];  // Avoid overflow with long

                    if (sum == k) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third element (left)
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // Skip duplicates for the fourth element (right)
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < k) {
                        left++;  // Move left pointer to increase the sum
                    } else {
                        right--;  // Move right pointer to decrease the sum
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 7, 8, 9, 10, 25, 63, 12, 45, 78, 96, 45, 780};
        int k = 150;

        // Using brute force solution
        List<List<Integer>> bruteForceResult = fourSumBruteForce(nums, k);
        System.out.println("Brute Force Result: " + bruteForceResult);

        // Using optimized solution
        List<List<Integer>> optimizedResult = fourSumOptimized(nums, k);
        System.out.println("Optimized Result: " + optimizedResult);
    }
}
