class Solution {
        public long mod = (int)1e9 + 7 ;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] dp = new long[m+1][n+1][maxMove+1] ;
        for(long[][] row1 : dp){
            for(long[] row : row1){
            Arrays.fill(row,-1) ;
        }
        }
        return (int)solve(m,n,maxMove,startRow,startColumn,dp) ;
    }
    
    public long solve(int m, int n, int maxMove, int i, int j,long[][][] dp){
        if(i < 0 || j < 0 || i >= m || j >= n){
            return 1 ;
        }
        if(maxMove == 0){
            return 0 ;
        }
        if(dp[i][j][maxMove] != -1){
            return dp[i][j][maxMove] ;
        }
        long up = solve(m,n,maxMove-1,i-1,j,dp) ;
        long down = solve(m,n,maxMove-1,i+1,j,dp) ;
        long left = solve(m,n,maxMove-1,i,j-1,dp) ;
        long right = solve(m,n,maxMove-1,i,j+1,dp) ;
        return dp[i][j][maxMove] = (up + down + left + right) % mod ;
    }
}