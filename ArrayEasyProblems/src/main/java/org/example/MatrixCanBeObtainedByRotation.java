package org.example;

//1886. Determine Whether Matrix Can Be Obtained By Rotation
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

public class MatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
      int[][]  mat = {{0, 1},{
            1, 0
        }};
      int[][] target = {{
            1, 0
        },{
            0, 1
        }};

      boolean isFind = findRotation(mat, target);
        System.out.println(isFind);

    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int k = 0; k < 4; k++) { // Check initial state and up to 3 rotations
            if (equals(mat, target)) {
                return true;
            }
            rotate(mat); // Rotate mat for the next check
        }
        return false; // No match found after all rotations
    }

    private static void rotate(int[][] matrix){
        int n = matrix.length;

//        transpose
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

//        reverse each row
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }


    }

    private static boolean equals(int[][] mat1, int[][] target){
        int n = mat1.length;

        for(int i = 0; i <n; i++){
            for(int j = 0; j < n; j++){
                if(mat1[i][j] != target[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
