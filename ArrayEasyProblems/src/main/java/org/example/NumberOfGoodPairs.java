package org.example;

import java.util.HashMap;
import java.util.Map;

//1512. Number of Good Pairs
//https://leetcode.com/problems/number-of-good-pairs/description/

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = numIdenticalPairs(nums);

        System.out.println(result);


    }

    public static int numIdenticalPairs(int[] nums){
//        creating a hashmap map to store the frequency
        Map<Integer, Integer> counts = new HashMap<>();

        /**
         frequency will store like that way => {1=3, 2=1, 3=2}
         that meaning is
         {
             1 => 3,   // number 1 appears 3 times
             2 => 1,   // number 2 appears 1 time
             3 => 2    // number 3 appears 2 times
         }

         */

        for(int num:nums){
            counts.put(num, counts.getOrDefault(num, 0)+1); // here +1 for increment the count for loop
        }

        /**
         counts.getOrDefault(num, 0) returns the current count (or 0 if it’s not in the map yet).

         You add 1 to the count and put it back in the map.
         */

        int goodPairs = 0;

        for(int count: counts.values()){
            if(count > 1){
                goodPairs += (count * (count-1)/2);
            }
        }

        /**
         This uses the combinatorics formula:

             Number of ways to choose 2 items from n:
                nC2 = n * (n - 1) / 2

             Let's calculate for each number:
                 For number 1 (appears 3 times):
                 3 * (3 - 1) / 2 = 3 good pairs
                 ((0,3), (0,4), (3,4))

             For number 3 (appears 2 times):
                 2 * (2 - 1) / 2 = 1 good pair
                 ((2,5))

             For number 2 (appears only once):
                No pairs

         Total = 3 + 1 = 4 good pairs
         */

        return goodPairs; //output is 4

    }
}
