package org.example;
//https://leetcode.com/problems/build-array-from-permutation/description/
//1920. Build Array from Permutation

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] result  = buildArray(nums);
        System.out.println(Arrays.toString(result)); //output==>  [0, 1, 2, 4, 5, 3]

    }

    public static int[] buildArray(int[] nums){
//        Creating new array with same length of nums.
        int[] ans = new int[nums.length];

//        get value of each nums[nums[i]] and store in new ans array
        for(int i = 0; i<= nums.length-1; i++){
            ans[i]=nums[nums[i]];
        }

//        return the new created array
        return ans;
    }
}

/**
 Explaination of this problem.

 1. Suppose this is my array
    nums = [5, 0, 1, 2, 3, 4]

 2. Let's compute ans
     ans[0] = nums[nums[0]] = nums[5] = 4

     ans[1] = nums[nums[1]] = nums[0] = 5

     ans[2] = nums[nums[2]] = nums[1] = 0

     ans[3] = nums[nums[3]] = nums[2] = 1

     ans[4] = nums[nums[4]] = nums[3] = 2

     ans[5] = nums[nums[5]] = nums[4] = 3

 3. so the final output is.
    [4, 5, 0, 1, 2, 3]


 */