import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

//    34. Find First and Last Position of Element in Sorted Array
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = {-1, -1};

        int firstHalf = findIndex(nums, target, true);

        if(firstHalf != -1){
            result[0] = firstHalf;
            result[1] = findIndex(nums, target, false);
        }

        System.out.println(Arrays.toString(result));

    }

    public static int findIndex(int[] nums, int target, boolean isFirstHalf){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid+1;

            }else if(target < nums[mid]){
                end = mid-1;
            }else{
//                result found
                ans=mid; // return index of result
                if(isFirstHalf){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;

    }
}

/**
 Explanation

 1. In this question provided array is sorted in increasing order so i have used binary search
 2. And second thing i have to find two indexes so i run twise binary search with firstHalf and secondHalf.
 */
