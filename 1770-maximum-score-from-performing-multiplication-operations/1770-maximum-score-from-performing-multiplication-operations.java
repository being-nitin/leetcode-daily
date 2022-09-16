class Solution {
    public int solve(int[] nums,int[] mul,int left,int index,int right,Integer[][] dp){
        if(index==mul.length)return 0;
        if(dp[index][left]!=null)return dp[index][left];
        int res=Math.max(
         nums[left]*mul[index]+solve(nums,mul,left+1,index+1,right,dp),
            nums[right]*mul[index]+solve(nums,mul,left,index+1,right-1,dp)
        );
        dp[index][left]=res;
        return res;
    }
    public int maximumScore(int[] nums, int[] multipliers) {
        int n=nums.length-1;
        int m=multipliers.length;
        return solve(nums,multipliers,0,0,n,new Integer[m][m]);
            
        
    }
}