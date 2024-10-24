import java.util.*;
public class Find_Pairs {
    public static List<List<Integer>> find(int[]nums,int k)
    {
        List<List<Integer>> a = new ArrayList<>();
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]*nums[j]==k)
                {
                    a.add(Arrays.asList(nums[i],nums[j]));
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,1,7,8,9};
        int k=12;
        System.out.println(find(nums,k));
        
    }
}
