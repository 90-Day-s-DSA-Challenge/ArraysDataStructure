package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//companies => oracle, cisco
//1380. Lucky Numbers in a Matrix
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
       int[][] matrix = {{3, 7, 8},{
            9, 11, 13
        },{
            15, 16, 17
        }};

       List<Integer> result = new ArrayList<>(luckyNumbers(matrix));

       for(int ans: result){
           System.out.println(ans);
       }

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumber = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> rowMin = new HashSet<>();
        for(int i = 0; i < m; i++){
            int minVal = matrix[i][0];
            for(int j = 1; j < n; j++){
                if(matrix[i][j] < minVal){
                    minVal = matrix[i][j];
                }
            }
            rowMin.add(minVal);
        }

        Set<Integer> colMax = new HashSet<>();
        for(int j = 0; j < n; j++){
            int maxVal = matrix[0][j];
            for(int i = 1; i < m; i++){
                if(matrix[i][j] > maxVal){
                    maxVal = matrix[i][j];
                }
            }

            colMax.add(maxVal);
        }

        for(int num: rowMin){
            if(colMax.contains(num)){
                luckyNumber.add(num);
            }
        }

        return luckyNumber;

    }
}
