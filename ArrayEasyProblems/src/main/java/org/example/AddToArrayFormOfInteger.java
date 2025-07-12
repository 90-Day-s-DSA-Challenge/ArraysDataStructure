package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//989. Add to Array-Form of Integer
//https://leetcode.com/problems/add-to-array-form-of-integer/description/

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {

       int[] num = {2,7,4};
       int k = 181;

       List<Integer> result = new ArrayList<>(addToArrayForm(num, k));
        System.out.println(result);

    }

    public static List<Integer> addToArrayForm(int[] num, int k){
        int n = num.length-1;
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        System.out.println("Carry:"+carry);

        while(n >= 0 || k > 0 || carry > 0){
            System.out.println("------n-------"+ n);
            System.out.println("n val=="+num[n]);
            int valNum = 0;
            System.out.println("valNum:"+valNum);

            if( n >= 0){
                valNum = num[n];
            }

            int kDigit = k % 10; // last digits of k
            System.out.println("last digits of k:"+kDigit);


            int sum = valNum + kDigit +carry;
            System.out.println("sum = (valNum + kDigit +carry):"+sum);

            int digit = sum % 10;
            System.out.println("digit:"+digit);

            carry = sum /10;
            System.out.println("carry 2:"+carry);


            ans.add(digit);
            n--;
            k/=10;

        }
        System.out.println("ans:"+ans);

        Collections.reverse(ans);
        System.out.println("ans:"+ans);

        return ans;


    }
}
