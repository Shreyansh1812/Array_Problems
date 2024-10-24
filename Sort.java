import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sort {

    public static int check(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return 1;
            }
        }
        return 0;
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int[] temp = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            temp[i] = arr1[i];
        }
        
        for (int i = 0; i < n; i++) {
            temp[m + i] = arr2[i];
        }
        
        Arrays.sort(temp);
        
        for (int i = 0; i < m + n; i++) {
            arr1[i] = temp[i];
        }
    }
    public static int[] remove(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int index = 0;

        for (int num : nums) {
            if (unique.add(num)) {
                nums[index++] = num;
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }

        return result;
    }


    public static void main(String[] args) {
        // int[] nums = {1, 2, 3, 4, 5, 6};
        // int[] nums1 = {7, 8, 9, 10, 11, 12};

        // int m = nums.length;
        // int n = nums1.length;

        // int[] merged = new int[m + n];
        // System.arraycopy(nums, 0, merged, 0, m);
        // System.arraycopy(nums1, 0, merged, m, n);

        // System.out.println("Original nums: " + Arrays.toString(nums));
        // System.out.println("Original nums1: " + Arrays.toString(nums1));
        
        // merge(merged, nums1, m, n);
        // System.out.println("Merged and sorted array: " + Arrays.toString(merged));
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] result = remove(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
   
    

