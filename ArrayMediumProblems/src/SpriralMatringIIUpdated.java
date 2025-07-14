import java.util.Arrays;

//59. Spiral Matrix II
//https://leetcode.com/problems/spiral-matrix-ii/description/

public class SpriralMatringIIUpdated {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = spiralMatrixII(n);

        for (int[] matrix: ans){
            System.out.println(Arrays.toString(matrix));
        }

    }

    public static int[][] spiralMatrixII(int n){
        int noOfRows = n;
        int noOfCols = n;

        int left = 0, right = noOfCols - 1;
        int top = 0, bottom = noOfRows - 1;
        int num = 1;

        int[][] result = new int[n][n]; // [rows][cols]

        while (left <= right && top <= bottom){
            //        right ==>
            for(int r = left; r <= right; r++ ){
                result[top][r] = num++; //top row is constant column is increasing
            }
            top++;

//        bottom ==>
            for(int c = top; c <= bottom; c++){
                result[c][right] = num++; //right column is constant row is increasing
            }
            right--;

//        left ==>
            if(left <= right){ //only run when left is less than equals to right if left is greater than right then loop is not executing
                for(int r = right; r >= left; r--){
                    result[bottom][r] = num++; // here bottom row is constant and column is decreasing
                }
                bottom--;
            }


//        top ==>
            if(top<=bottom){
                for(int c = bottom; c >= top; c--){
                    result[c][left] = num++; // here left column is constant and row is decreasing
                }
                left++;
            }
        }

        return result;


    }


}

/**

 Logic is:

 right ==> bottom ==> left ==> top

 this thing run in a loop

 1. right ==>
    a. row constant column increase.
    b. top++

 2. Bottom ||
    a. column constant row increases
    b. right--

 3. left <==
    a. row is constant column increases
    b. bottom--

 4. top ^
    a. row constant column increase.
    b. left++
 */
