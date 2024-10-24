import java.util.Arrays;

public class Merge_Sort {
    public static void divide(int [] arr, int low, int high) {
        if(low<high)
        {
            int mid=low+(high-low)/2;
            divide(arr,low,mid);
            divide(arr, mid+1, high);
            conquer(arr,low,high,mid);
        }
    }
        public static void conquer(int []arr,int start,int end,int mid)
        {
            int merge[]=new int[end-start+1];
            int x=0;
            int idx1=start;
            int idx2=mid+1;
            while(idx1<=mid &&  idx2<=end)
            {
                if(arr[idx1]<=arr[idx2])
                {
                    merge[x++]=arr[idx1++];
                }
                else
                {
                    merge[x++]=arr[idx2++];
                }
            }
            while(idx1<=mid)
            {
                merge[x++]=arr[idx1++];
            }
            while(idx2<=end)
            {
                merge[x++]=arr[idx2++];
            }
            for(int i=0,j=start;i<merge.length;i++,j++)
            {
               arr[j]=merge[i];
            }

        } 
        public static void main(String[] args) {
            int  arr[]={5,2,8,1,9};
            int n=arr.length;
            divide(arr, 0, n-1);
           System.out.println(Arrays.toString(arr));
        }
}
