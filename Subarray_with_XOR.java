import java.util.*;;
public class Subarray_with_XOR {
    public static int subarraysWithXORK(int[] a, int b) {
        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor ^= a[j];
                if (xor == b) {
                    count++;
                }
            }
        }
        return count;
    }
    public static List<List<Integer>> check(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
    
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    result.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        // int[] nums={1,2,3,2};
        // System.out.println(subarraysWithXORK(nums, 2));
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        List<List<Integer>> a = check(arr, k);
        for(List<Integer> pair: a)
        {
             System.out.println(pair);
        }

    }
}
