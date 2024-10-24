public class Longest_Subarray {
   public static int check(int []arr,int k)
   {
     int n=arr.length;
     int max=0;
     for(int i=0;i<n;i++)
     {
        int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            if(sum==k)
            {
                max= Math.max(max, j-i+1);
            }
        }
     }
     return max;
   }
    public static void main(String[] args) {
        int []arr={3,2,1,8,9,6,7};
        System.out.println(check(arr, 11));
        
    }
    
}
