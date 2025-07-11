package org.example;

//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers2(nums);
        System.out.println(result);

    }

//    first method
//    it takes 1ms to execute
    public static int findNumbers(int[] numbers){
        int n = numbers.length;
        int countEven = 0;

        for(int i = 0;i < n; i++){
            int nums = numberOfDigits(numbers[i]);

            if(nums % 2 == 0){
                countEven++;
            }
        }

        return countEven;
    }

    public static int numberOfDigits(int num){
        int count = 0;

        if(num==0){
            return 1;
        }else{
            int tempNum = Math.abs(num);
            while(tempNum > 0 ){
                tempNum /= 10;
                count++;
            }
        }
        return count;
    }

//    second method
//    it takes 2ms to execute
    public static int findNumbers2(int[] nums){
        int n = nums.length;
        int countEven = 0;

        for(int i = 0; i < n; i++){
            if(String.valueOf(nums[i]).length() % 2 ==0){
                countEven++;
            }
        }
        return countEven;
    }
}
