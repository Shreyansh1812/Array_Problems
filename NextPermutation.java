// We start iterating from the second last element, looking for the first element that is smaller than its next neighbor. When we find it, we stop.
// Next, we find the smallest element to the right of this element that is larger than it, and swap their positions.
// Finally, we reverse the portion of the array after the swapped element to get the smallest possible permutation.
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first element that is smaller than the next one from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such an element is found, find the next larger element and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the part after the swapped element to get the smallest arrangement
        reverse(nums, i + 1, n - 1);
    }

    // Swap function to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse function to reverse a part of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 7, 4};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
