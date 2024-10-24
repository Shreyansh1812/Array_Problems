public class Selection_Sort {
    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {  // Start the array with i+1 rather than 1 One Place will be not be done correctly
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

    public static void main(String[] args) {
        int[] nums = {79, 56, 23, 10, 8};
        Sort(nums);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
