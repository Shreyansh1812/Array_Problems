public class MajorityElement {
    public static int major(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > k / 2) {
                return arr[i];
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 6, 2, 3, 2, 1, 2, 2};
       System.out.println(major(arr, 2));
    }
}


