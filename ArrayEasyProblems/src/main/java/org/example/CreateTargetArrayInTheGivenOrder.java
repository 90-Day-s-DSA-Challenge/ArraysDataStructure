package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1389. Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] result = createTargetArray(index, nums);
        System.out.println(Arrays.toString(result));

    }

    public static int[] createTargetArray(int[] index, int[] nums){
//        todo: research why we take nums length
        int n = nums.length;

        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < n; i++){
            target.add(index[i], nums[i]);
        }

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = target.get(i);
        }

        return ans;
    }
}

//Todo: solve this again after 7 days to day 10 july 2025;
