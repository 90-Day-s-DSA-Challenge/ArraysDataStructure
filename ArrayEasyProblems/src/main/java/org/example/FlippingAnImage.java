package org.example;

import java.util.Arrays;

//832. Flipping an Image
//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] myArr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flippingArray(myArr);

        for(int[] row: result){
            System.out.println(Arrays.toString(row));
        }

    }

    public static int[][] flippingArray(int[][] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int left = 0;

//            take length of each rows
            int right = arr[i].length-1;

            while(left <= right){
//                handle when left == right
//                flipping the array
                if(left==right){
                    arr[i][left] ^= 1;
                }else{
                    int temp = arr[i][left] ^ 1;
                    arr[i][left] = arr[i][right] ^ 1;
                    arr[i][right] = temp;
                }

                left++;
                right--;

            }
        }

        return arr;
    }

//    this is traditional way of reversing the array
    public static int[] reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if(left == right){
                arr[left] ^= 1;
            }else{
                int temp = arr[left] ^ 1;
                arr[left] = arr[right] ^ 1;
                arr[right] = temp;
            }

            left++;
            right--;
        }

        return arr;
    }
}

/**
 Conclusion:
    This problem contains a 2d array, i am reversing array by using traditional temp method and
    by using xor ^ operator i am reverse the 1 to 0, 0 to 1.
 */

