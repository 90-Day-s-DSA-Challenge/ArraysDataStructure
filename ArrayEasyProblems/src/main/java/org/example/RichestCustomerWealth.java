package org.example;

//1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int result = maximumWealth(accounts);
        System.out.println(result);

    }

    public static int maximumWealth(int[][] accounts){
        int n = accounts.length;
        int maxWealth = 0; // initialize max wealth

        for(int i = 0; i <= n-1; i++){
            int currentWealth = 0; // initialise current wealth

//            for handle out of bound we use from 0 to accounts[i].length total length
            for(int j = 0; j < accounts[i].length; j++){
                currentWealth += accounts[i][j];

                if(currentWealth>=maxWealth){
                    maxWealth=currentWealth;
                }
            }
        }
        return maxWealth;
    }
}

/**
 Goal:
    The objective is to calculate the total wealth for each customer and then return the maximum of these total wealth values.
 Algorithm:
     Initialize a variable maxWealth to 0.
     This variable will store the maximum wealth found so far.

     Iterate through each customer's accounts using an outer loop. For each customer i:
     Initialize a variable currentCustomerWealth to 0.

     Iterate through each bank account of the current customer using an inner loop. For each account j of customer i:
     Add the amount accounts[i][j] to currentCustomerWealth.

     After summing all accounts for the current customer, compare currentCustomerWealth with maxWealth. If currentCustomerWealth is greater than maxWealth, update maxWealth to currentCustomerWealth.
     After iterating through all customers, maxWealth will hold the maximum wealth among all customers. Return maxWealth
 */
