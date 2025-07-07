package org.example;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/description/
//1929. Concatenation of Array


public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i<=n-1; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}

/**
 Todo: Explanation
 If nums = [1, 2, 1]:
     n will be 3.
     ans will be initialized as new int[6].
 The loop will iterate three times:
     i = 0: ans[0] = nums[0] (which is 1), ans[0 + 3] = nums[0] (which is 1). So, ans becomes [1, 0, 0, 1, 0, 0].
     i = 1: ans[1] = nums[1] (which is 2), ans[1 + 3] = nums[1] (which is 2). So, ans becomes [1, 2, 0, 1, 2, 0].
     i = 2: ans[2] = nums[2] (which is 1), ans[2 + 3] = nums[2] (which is 1). So, ans becomes [1, 2, 1, 1, 2, 1].
     The array [1, 2, 1, 1, 2, 1] is returned.
 Time and Space Complexity:
     Time Complexity: O(n), where n is the length of the nums array. This is because the solution involves a single loop that iterates n times.
     Space Complexity: O(n), as a new array ans of size 2n is created to store the result.


 */
