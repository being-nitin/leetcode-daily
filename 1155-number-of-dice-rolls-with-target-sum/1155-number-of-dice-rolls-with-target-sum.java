class Solution {
    public int numRollsToTarget(int n, int k, int target) {
                dp=new Long[n+1][target+1];
        return (int)util(n, target, k);
    }
    private final long MOD=(long)1e9+7; 
    private Long dp[][];
    private long util(int dicesLeft, int sum, int K) {
        if(sum<0) return 0;
        if(dicesLeft==0) {
            return sum==0?1:0;
        }
        if(dp[dicesLeft][sum]!=null) return dp[dicesLeft][sum];
        
        long ret=0;
        for(int i=1;i<=K;i++) {
            ret=(ret+util(dicesLeft-1, sum-i, K))%MOD;
        }
        return dp[dicesLeft][sum]=ret;
    }
}