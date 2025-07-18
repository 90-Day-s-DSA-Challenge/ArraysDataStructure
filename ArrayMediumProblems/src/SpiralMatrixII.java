import java.util.Arrays;

//59. Spiral Matrix II
//https://leetcode.com/problems/spiral-matrix-ii/description/

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 5;
        int[][] result = generateMatrix(n);

        for(int[] res: result){
            System.out.println(Arrays.toString(res));
        }

    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n - 1;


        while(top <= bottom && left <= right){
            // traverse left to right
            for(int r = left; r <= right; r++){
                result[top][r] = num++;
                System.out.println("---left to right---");
                System.out.println(r);
                System.out.println(left);
                System.out.println(right);
            }
            top++;

            // traverse right to bottom
            for(int c = top; c <= bottom; c++){
                result[c][right] = num++;
                System.out.println("---right to bottom---");

                System.out.println(c);
                System.out.println(top);
                System.out.println(bottom);
            }
            right--;

            // traverse bottom to left
            if(top <= bottom){
                for(int r = right; r >= left; r--){
                    result[bottom][r] = num++;
                    System.out.println("---bottom to left---");

                    System.out.println(r);
                    System.out.println(left);
                    System.out.println(right);
                }
            }
            bottom--;

            // traverse bottom to top
            if(left <= right){
                for(int c = bottom; c >= top; c--){
                    result[c][left] = num++;
                    System.out.println("---bottom to top---");

                    System.out.println(c);
                    System.out.println(top);
                    System.out.println(bottom);
                }
            }
            left++;


        }

        return result;



    }
}

/**

 Algorithm Explanation:
     The core idea is to simulate the spiral traversal by maintaining four boundary pointers: rowStart, rowEnd, colStart, and colEnd. These pointers define the current layer of the matrix being filled. The algorithm proceeds in layers, filling each layer in a clockwise manner and then shrinking the boundaries inwards.
     Initialization:
 Create an n x n integer matrix, result, initialized with zeros.
 Initialize rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1.
 Initialize a counter num = 1.
 Spiral Traversal Loop:
    The loop continues as long as rowStart <= rowEnd and colStart <= colEnd. This ensures that there are still elements to fill.

 Fill Top Row (Left to Right):
     Iterate j from colStart to colEnd.
     Set result[rowStart][j] = num++.
     Increment rowStart.

 Fill Right Column (Top to Bottom):
     Iterate i from rowStart to rowEnd.
     Set result[i][colEnd] = num++.
     Decrement colEnd.

 Fill Bottom Row (Right to Left):
     Check if rowStart <= rowEnd (to handle cases where only a single row remains).
     Iterate j from colEnd down to colStart.
     Set result[rowEnd][j] = num++.
     Decrement rowEnd.

 Fill Left Column (Bottom to Top):
     Check if colStart <= colEnd (to handle cases where only a single column remains).
     Iterate i from rowEnd down to rowStart.
     Set result[i][colStart] = num++.
     Increment colStart.

 Return:
 Return the result matrix.
 */
