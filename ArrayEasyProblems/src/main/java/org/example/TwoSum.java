package org.example;

//1. Two Sum
//https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));


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
