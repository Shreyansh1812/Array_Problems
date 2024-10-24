public class Search_Algos {
    public static boolean linear_search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }

    public static int binary_search(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) { // Target Element moto chhe so we Look at the right side of the array
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9, 96};
        // System.out.println(linear_search(arr, 95));
        int result = binary_search(arr, 95);
        if (result == -1) {
            System.out.println("Halkat Dekhe Element Daal");
        } else {
            System.out.println("Miracle Miracle Element Mil Gaya " + result);
        }
    }
}
