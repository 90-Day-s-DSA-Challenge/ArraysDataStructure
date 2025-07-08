package org.example;

import java.util.Arrays;

//1470. Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/description/

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] ans = shuffle(nums, n);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] shuffle(int[] nums, int n){
        int[] result = new int[2 * n]; // let the size is 2n

        for(int i = 0; i < n; i++){
            result[2 * i] = nums[i]; // it takes index 0, 2, 4, 6....
            result[2 * i + 1] = nums[i + n]; // it takes 2 * i +1: 1, 3, 5,...
        }

        return  result;
    }
}

/**

 A common and straightforward approach involves creating a new array to store the shuffled result.
 Initialize a new array:
    Create a new integer array, let's call it result, with a size of 2n to store the shuffled elements.
 Iterate and populate:
    Use a loop that iterates n times (from i = 0 to n - 1). In each iteration:
    Place the i-th element from the first half of nums (which is nums[i]) into the result array at an even index (2 * i).
    Place the i-th element from the second half of nums (which is nums[i + n]) into the result array at the next odd index (2 * i + 1).
 Return the result:
    After the loop completes, the result array will contain the shuffled elements in the desired order. Return this result array.

 */
