package org.example;

import java.util.Arrays;

//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/description/


public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for(int i=1; i < n; i++){
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;

    }
}

/**
 The core idea is to iterate through the input array and update each element (except the first one) by adding it to the value of the previous element. This effectively accumulates the sum as you traverse the array.
 Consider the input array nums = [1, 2, 3, 4].
 First element:
    runningSum[0] is simply nums[0], which is 1.
 Second element:
    runningSum[1] is nums[0] + nums[1], which is 1 + 2 = 3. This can be expressed as runningSum[0] + nums[1].
 Third element:
    runningSum[2] is nums[0] + nums[1] + nums[2], which is 1 + 2 + 3 = 6. This can be expressed as runningSum[1] + nums[2].
 Fourth element:
    runningSum[3] is nums[0] + nums[1] + nums[2] + nums[3], which is 1 + 2 + 3 + 4 = 10. This can be expressed as runningSum[2] + nums[3].
 This pattern reveals that for any index i > 0, runningSum[i] can be calculated as runningSum[i-1] + nums[i].
 */
