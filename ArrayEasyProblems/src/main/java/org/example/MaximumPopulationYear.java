package org.example;
//asked by ==> Google, Bloomberg, microsoft
//https://leetcode.com/problems/maximum-population-year/description/
//1854. Maximum Population Year

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][]  logs = {{1993, 1999}, {2000, 2010}};
        int result = maximumPopulation(logs);
        System.out.println(maximumPopulation(logs));

    }

    public static int maximumPopulation(int[][] logs){
        final int MIN_YEAR = 1950;
        final int MAX_YEAR = 2050;

        int[] populationChanges = new int[MAX_YEAR + 1];
//        System.out.println(populationChanges.length);


        for(int[] log: logs){
            int birth = log[0];
            int death = log[1];

            populationChanges[birth]++;
            populationChanges[death]--;
        }
//        System.out.println(Arrays.toString(populationChanges));


        int maxPopulation = 0;
        int currentPopulation = 0;
        int maxPopulationYear = MIN_YEAR; // Initialize with the earliest possible year

        // Calculate running population and find the maximum
        for (int year = MIN_YEAR; year <= MAX_YEAR; year++) {
            currentPopulation += populationChanges[year];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxPopulationYear = year;
            }
        }
        return maxPopulationYear;

    }
}

/**
 Explanation

 1. Initialise a array of length 101 (2050 + 1)
 2. Iterate a loop in all logs if from 1950 to 2050 and a birth year is exists then set +1 and on death year set -1
    for example [0, 0, 1, 0, 0, 0, -1, 0, 0] like that.

     Suppose logs = [[1950, 1955], [1952, 1960], [1955, 1965]]

     Yearly changes:
         +1 at 1950
         -1 at 1955
         +1 at 1952
         -1 at 1960
         +1 at 1955
         -1 at 1965

 3. If year is comes and have populationChanges 1 then add it like

     Population:
         1950: 1
         1951: 1
         1952: 2
         1953: 2
         1954: 2
         1955: 2 (since 1 person dies, 1 is born)
         1956–1959: 2
         1960: 1
         1961–1964: 1
         1965: 0

     Result: 1952 — highest population was first seen in 1952.

 */
