//leetcode question 1672
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int person = 0; person < accounts.length; person++){
            int current = 0;
            for(int wealth = 0; wealth < accounts[person].length; wealth++){
                current += accounts[person][wealth];
            }
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
