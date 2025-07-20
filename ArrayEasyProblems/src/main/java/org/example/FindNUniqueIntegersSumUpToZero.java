package org.example;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = sumZero(n);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        for(int i = 1 ; i <= n / 2; i++){
            result[index++] = i;
            result[index++] = -i;
        }

        if(n % 2 == 1){
            result[index++] = 0;
        }

        return result;

    }
}
