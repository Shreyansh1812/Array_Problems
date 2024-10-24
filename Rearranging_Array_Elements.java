import java.util.*;;
public class Rearranging_Array_Elements {
    public static void rearrange(int []arr)
    {
        int n=arr.length;
        int positive [] = new int[n];
        int negative [] = new int[n];
        int positive_index=0;
        int negative_index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negative[negative_index++]=arr[i];
            }
            else
            {
                positive[positive_index++]=arr[i];
            }
        }
        int index=0;
        for(int i=0;i<negative_index;i++)
        {
            arr[index++]=negative[i];
        }
        for(int i=0;i<positive_index;i++)
        {
            arr[index++]=positive[i];
        }
      
    }
    public static void main(String[] args) {
        int [] arr={8,9,10,-3,-2,-98};
        rearrange(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
