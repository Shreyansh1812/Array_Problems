import java.util.*;
public class Majority_Element {
    // Brute Force Solution
    public static List<Integer> majority_elem(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (n / 3) && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }
    // Time Complexity: O(n^2)
    public static List<Integer> majority_2(int [] nums) 
    {
        int n=nums.length;
        int count1=0;
        int count2=0;
        int candidate1=0;
        int candidate2=0;
        for(int num:nums)
        {
            if(num==candidate1)
            {
                count1++;
            }
            else if(num==candidate2)
            {
                count2++;
            }
            else if(count1==0)
            {
                candidate1=num;
                count1=1;
            }
            else if(count2==0)
            {
                candidate2=num;
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(num==candidate1)
            {
                count1++;
            }
            else if(num==candidate2)
            {
                count2++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(count1>n/3)
        {
            result.add(candidate1);
        }
        if(count2>n/3)
        {
            result.add(candidate2);
        }
return result;

    } 
    public static void main(String[] args) {
        int nums[] ={2,1,1,1,8,8,8,7};
        System.out.println(majority_2(nums));
        
    }
}
