package org.example;

//1252. Cells with Odd Values in a Matrix
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

public class CellWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        int result = oddCells(m, n, indices);

        System.out.println(result);



    }

    public static int oddCells(int m, int n, int[][] indices){
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // [[0,1],[1,1]]
        for(int[] index: indices){

            // each index 0th address is row & 1st index is colo
            int r = index[0]; // 0, 1 [false, true]
            int c = index[1]; // 1, 1 [true, true]

            rows[r] = !rows[r]; // 1, 0 [true, false]
            cols[c] = !cols[c]; // 0, 0 [false, false]
        }

        int oddCellsCount = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // If rows[i] is true (odd increments) AND cols[j] is false (even increments)
                // OR rows[i] is false (even increments) AND cols[j] is true (odd increments)
                // Then the cell (i, j) will have an odd value.
                if(rows[i] ^ cols[j]){
                    oddCellsCount++;
                }
            }
        }

        return oddCellsCount;
    }
}
