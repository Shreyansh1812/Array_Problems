public class MaxProductSubarray {

    public static int maxProductSubarray(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        // Brute-force approach with two nested loops
        for (int i = 0; i < n; i++) {
            int currentProduct = 1;  // Initialize product for each subarray starting at i
            for (int j = i; j < n; j++) {
                currentProduct *= nums[j];  // Multiply the next element to the current product
                maxProduct = Math.max(maxProduct, currentProduct);  // Update maxProduct if needed
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product of subarray: " + maxProductSubarray(nums));
    }
}
