package org.example;
//566. Reshape the Matrix
//https://leetcode.com/problems/reshape-the-matrix/description/

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},{ 3, 4}};
        int r = 1;
        int c = 4;

        int[][] ans = reshapeMatrix(mat, r, c);

        for(int[] item: ans){
            System.out.println(Arrays.toString(item));
        }

    }

    public static int[][] reshapeMatrix(int[][] mat, int r, int c){
//        check if reshape is possible if not then return original matrix
        if((mat.length * mat[0].length) != (r * c)){
            return mat;
        }
        //        create transpose matrix
        int[][] result = new int[r][c];

//        initialise row and col counter
        int row = 0;
        int col = 0;

//        iterate given matrix
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                result[row][col] = mat[i][j];
                col++;

//                if col is reach end then increment row
                if(col==c){
                    row++;
                    col = 0;
                }

            }
        }

        return result;
    }
}
