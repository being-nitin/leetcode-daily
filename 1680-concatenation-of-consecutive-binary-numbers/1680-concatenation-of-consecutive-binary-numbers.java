class Solution {
    public int concatenatedBinary(int n) {
        int modulo = 1000000007;
        
        long ans =0;
        for(int i=1; i<=n; i++){
            ans = (((ans<<(1+(int)(Math.log(i) / Math.log(2))))%modulo)+i)%modulo;
        }
        return (int)ans;
    }
}