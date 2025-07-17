import java.util.Arrays;

public class ProductOfArrayExceptSelf {

//    238. Product of Array Except Self
//    https://leetcode.com/problems/product-of-array-except-self/description/

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] ans = productExceptSelf(nums); // [0, 0, 0, 0]

        System.out.println(Arrays.toString(ans));


    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int prodLeft = 1;
        int prodRight = 1;

        for(int i = 0; i < n; i++){
            result[i] = prodLeft; // 1, 1 = 1, 1 * 2 = 2, 1 * 2 * 3 = 6
            prodLeft *= nums[i];  // [1, 0, 0, 0], [1, 1, 0, 0], [1, 1, 2, 0], [1, 1, 2, 6],
        }

        for(int i = n-1; i >= 0; i--){
            result[i] *= prodRight; //1, 4, 3 * 4 = 12, 2 * 3 * 4 = 24
            prodRight *= nums[i]; // [1, 1, 2, 6], [1, 1, 2 * 4 = 8, 6], [1, 1 * 12 = 12, 8, 6], [1 * 24 = 24, 12, 8, 6]
        }

        return result;
    }
}

/**
 Explanation

 nums:     [ 1,  2,  3,  4 ]
 left:     [ 1,  1,  2,  6 ]   ← product to the left
 right:    [24, 12,  4,  1 ]   ← product to the right
 result:   [24, 12,  8,  6 ]   ← left[i] * right[i]




 */

