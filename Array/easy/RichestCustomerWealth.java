//https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)//outer array 
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)//inner array for inner values 
            {
                sum+=accounts[i][j];
            }
             max=Math.max(max,sum);
        }
       
        return max;
    }
}