//Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

//brute force approach 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean test=false;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                  test=true;
                    break;
                }
            }
            if(test){
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
      return ans;  
    }
}

//optmized approach
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans=new ArrayList<>(candies.length);
         
        int max=Integer.MIN_VALUE;
        
        // for(int i:candies){
        //     max=Math.max(max,candies[i]);
        // }
        
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i:candies){
            ans.add(i>=max-extraCandies);
        }
      return ans;       
    }
}