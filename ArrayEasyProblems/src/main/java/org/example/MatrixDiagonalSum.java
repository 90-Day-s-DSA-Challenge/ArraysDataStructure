package org.example;

//1572. Matrix Diagonal Sum
//https://leetcode.com/problems/matrix-diagonal-sum/description/

public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int result = diagonalSum(matrix);

        System.out.println(result);

    }

    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++){
//            count first diagonal
            totalSum += mat[i][i];

//            filter diagonal already selected
//            here i = 0, 1, 2 already selected so filtering here
//            [n-1-i] => required formula to calculate another diagonal
            if(i != (n-1-i)){
                totalSum += mat[i][n-1-i];

            }
        }

        return totalSum;

    }
}
