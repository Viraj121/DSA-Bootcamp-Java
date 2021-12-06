//Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/)

//brute force approach.
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int j=0;
     for(int i=0;i<ans.length;i+=2)
     {
        ans[i]=nums[j];
         ans[i+1]=nums[j+n];
         j++;
     }
        return ans;
    }
}

//optimized approach
class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=0;i<n;i++){
            nums[i+n]+=nums[i]*10000;
        }
        
        for(int i=0;i<n;i++){
            nums[2*i]=nums[i+n]/10000;
            nums[2*i+1]=nums[i+n]%10000;
        }
        
        return nums;
    }
}