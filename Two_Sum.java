import java.util.*;;
public class Two_Sum {
    public static void check(int []arr,int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    System.out.println(arr[i]+" "+arr[j]);  // O(n^2)
                }
            }
        }
    }
    public static boolean check2(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;                        // O(n)
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={7,8,9,3,2,1};
        System.out.println(check2(arr, 17));
    }
}
