class Solution {
    public int jump(int[] nums) {
     int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i = 1;i<nums.length;i++){
            for(int j=i;j<i+nums[i-1]&&j<nums.length;j++){
                dp[j] = Math.min(dp[j],dp[i-1]+1);
            }
        }
        return dp[nums.length-1];
           
        
    }
}