package org.example;
//53. Maximum Subarray
//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums){
        int localMax = nums[0];
        int globalMax = nums[0];

        for(int i = 1; i < nums.length; i++){
            localMax = Math.max(nums[i], localMax + nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;

    }
}

/**
 Kadane's Algorithm Steps:
    1. Initialize two variables: current_max and global_max, both initially set to the first element of the array.
    2. Iterate through the array starting from the second element.
    3. For each element, update current_max by comparing current_max + nums[i] with nums[i]. Choose the larger value.
    4. Update global_max by comparing it with current_max.
    5. Return global_max
 */
