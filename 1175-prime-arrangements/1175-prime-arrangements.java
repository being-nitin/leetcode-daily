class Solution {
    private static final int mod = 1_000_000_007;
public int numPrimeArrangements(int n) {
    int totalPrime = 0;
    for(int i=1;i<=n;i++){
        if(prime(i)){
            totalPrime = totalPrime+1;
        }
    }
    int totalNonPrime = n-totalPrime;
    long fact = (factorial(totalPrime)*factorial(totalNonPrime))%mod;
    return (int)fact;
        
    }
    private long factorial(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result = (result*i)%mod;
        }
        return result;
    }
        
    private boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
};