class Solution {
    public int uniquePaths(int m, int n) {
            return comb(m+n-2, n-1);
    }
       private int comb(int x, int y){
        long ans = 1;
        for (int i=y+1; i <= x; i++){
            ans = (ans * i)/(i-y);
        }
        return (int)ans;
    }
}