class Solution {
public:
    int nthMagicalNumber(int n, int a, int b) {
     long long l = min(a,b);
        long long h = l*n;
        long long lcm = (a*b)/__gcd(a,b);
        long long mid,factor;
        while(l<h){
            mid = l+(h-l)/2;
            factor = mid/a + mid/b -mid/lcm;
            if(factor<n)
                l = mid+1;
            else
                h = mid;
        }
        int mod = 1e9+7;
        return l%mod;
    }
};