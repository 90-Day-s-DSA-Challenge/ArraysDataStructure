import java.util.Arrays;

//73. Set Matrix Zeroes
//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrixZero {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        int[][] result = setZeroes(matrix);

        for(int[] mat: result){
            System.out.println(Arrays.toString(mat));
        }


    }

    public static int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowHaveZero = new boolean[m];
        boolean[] colHaveZero = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j <matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowHaveZero[i] = true;
                    colHaveZero[j] = true;
                }
            }
        }
//        System.out.println(Arrays.toString(rowHaveZero));
//        System.out.println(Arrays.toString(colHaveZero));

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(rowHaveZero[i] || colHaveZero[j]){
                    matrix[i][j] = 0;
                }
            }

        }

        return matrix;
    }
}

/**
 Explanation
 Step 0:
    Find length of rows and cols, and initialise a boolean array of rows and cols to store their is zero exist or not in row and col.
 Step 1:
    Taking a loop to iterate 2D matrix, and if row or in column there is exist a zero then set to true

 Step 2:
    Again create a loop to iterate a 2D matrix & compare it with haveZeroInRow or haveZeroInCol array if its true then set to 0.


 */
