package org.example;

import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class KidWithTheGreatestNumberOfCandy {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> ans = new ArrayList<>(kidsWithCandy(candies, extraCandies));

        System.out.println(ans);

    }

    public static List<Boolean> kidsWithCandy(int[] candies, int extraCandies){
        int maxCandies = 0;

//        find max candy
        for(int candy: candies){
            if(candy > maxCandies){
                maxCandies = candy;
            }
        }

//        now create a Boolean list to store result
        List<Boolean> result = new ArrayList<>();

        for(int candy: candies){
            if(candy+extraCandies >= maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}

/**
 Approach:
 Find the Maximum:
    First, determine the maximum number of candies any kid currently possesses.
    This will serve as the benchmark for comparison.
 Iterate and Check:
     Iterate through the candies array. For each kid, calculate their potential candy
     count by adding extraCandies to their current candies[i].
 Compare and Store:
    Compare this potential candy count with the maximum candy count found in step 1.
    If the potential count is greater than or equal to the maximum, the kid can have
    the greatest number of candies, so add true to your result list. Otherwise, add false.
 */
