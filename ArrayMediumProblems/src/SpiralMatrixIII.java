import java.util.Arrays;

public class SpiralMatrixIII {

//    885. Spiral Matrix III
//    https://leetcode.com/problems/spiral-matrix-iii/description/

    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int rStart = 1;
        int cStart = 4;

        int[][] ans = spiralMatrixIII(rows, cols, rStart,cStart);

        for(int[] mat: ans){
            System.out.println(Arrays.toString(mat));
        }



    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int directions[][] = {
                {0, 1}, {1, 0}, {0, -1}, {-1, 0} //Right, Down, Left, Top(Up)
        };
        int n = rows * cols;
        int[][] result = new int[n][2]; //[[r, c], [r1, c1]....]

        result[0][0] = rStart;
        result[0][1] = cStart;

        int count = 1;
        int step = 1;
        int index =0;

        while(count < n){
            for(int times = 0; times < 2; times++){
                int dirR = directions[index%4][0]; // rows
                int dirC = directions[index%4][1]; // cols

                for(int i = 0; i < step; i++){
                    rStart +=dirR;
                    cStart +=dirC;

                    if(rStart >=0 && rStart<rows && cStart >= 0 && cStart<cols){
                        result[count][0] = rStart;
                        result[count][1] = cStart;
                        count++;
                    }

                }
                index++; //change direction


            }
            step++;
        }

        return result;


    }



}

/**
 Explaination

 Explore more for that
 Right, Down, left, Top => that operations are required
 */
