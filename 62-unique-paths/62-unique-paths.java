class Solution {
    public int uniquePaths(int m, int n) {
            return comb(m+n-2, n-1);
    }
       private int comb(int n, int r){
        long ans = 1;
        for (int i=r+1; i <= n; i++){
            ans = (ans * i)/(i-r);
        }
        return (int)ans;
    }
}