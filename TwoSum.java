package Java_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums={-1,2,3,4,5,7,8,9,0,0};

        //Printing the arrays
        System.out.println(Arrays.toString(nums));
        //Printing indexes of the target numbers
        System.out.println(Arrays.
                toString(findPairs(nums,9))
        );

    }

    public static int[] findPairs(int[] nums,int target)
    {
        //Map -> key = numbers , value= It's index
        Map<Integer,Integer> map = new HashMap<>();

        //If not found return negative indexes
        int[] ans = {-1,-1};

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i};
            else map.put(nums[i],i);

        }

        return  ans;

    }
}