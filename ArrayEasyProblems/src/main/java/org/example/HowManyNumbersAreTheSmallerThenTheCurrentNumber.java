package org.example;

import java.util.Arrays;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
//1365. How Many Numbers Are Smaller Than the Current Number

public class HowManyNumbersAreTheSmallerThenTheCurrentNumber {
    public static void main(String[] args) {
        int[] myArr = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrentNumber(myArr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] smallerNumbersThanCurrentNumber(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

//        iterating nums
        for(int i = 0; i <= n-1; i++){
            int count = 0;

            for(int j = 0; j <= n-1; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

//Todo: Optimise this solution is a task