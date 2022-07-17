class Solution {
    public int kInversePairs(int n, int k) {
     if(k>n * (n - 1) / 2){
            return 0;
     }  
        if (k == n * (n - 1) / 2 || k == 0){
            return 1;
        }
        
        int mod = 1000000007;
        int[][] dp = new int[n + 1][k + 1];
        
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = 1; // deal with j = 0
            for (int j = 1; j < Math.min(k, i * (i - 1) / 2) + 1; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j] - (j >= i ? dp[i - 1][j - i] : 0)) % mod;
                // all dp[i][j] modulo 10^9 + 7
                // so dp[i - 1][j - 1] might bigger than dp[i][j - 1] + dp[i - 1][j]
                if (dp[i][j] < 0) 
                    dp[i][j] += mod;
            }
        }
        return dp[n][k];
    }
}