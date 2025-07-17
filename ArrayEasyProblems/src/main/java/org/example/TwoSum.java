package org.example;

//1. Two Sum
//https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        int[] ans = twoSum2(nums, target);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            System.out.println(complement);
            System.out.println(map.containsKey(complement));

            // Check if the complement already exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        // If no solution is found
        return new int[] { -1, -1 };
    }
    public static int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int[] result = {-1, -1};

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((nums[i]+nums[j] == target)){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }



}
