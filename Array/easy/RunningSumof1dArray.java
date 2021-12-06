//Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/

//brute force apprach
class Solution {
    public int[] runningSum(int[] nums) {
       
        int n=nums.length;
         int ans[]=new int[n];
       for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){
               ans[i]+=nums[j];
           }
       } 
        
        return ans;
    }
}

//optimized approach
class Solution {
    public int[] runningSum(int[] nums) {
       
        int n=nums.length;
      
       for(int i=1;i<n;i++){
       nums[i]+=nums[i-1];    
       } 
        
        return nums;
    }
}