package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] result = transpose(matrix);

        for(int[] mat: result ){
            System.out.println(Arrays.toString(mat));
        }

    }

    public static int[][] transpose(int[][] matrix) {
        int noOfRows = matrix.length;
        int noOfCols = matrix[0].length;

        int[][] transposeMatrix = new int[noOfCols][noOfRows];

        for(int i = 0; i < noOfRows; i++){
            for(int j = 0; j < noOfCols; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }


        }
        return transposeMatrix;

    }
}
