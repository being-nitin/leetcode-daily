class Solution {
    private static final int mod = 1000000007;
    public int numPrimeArrangements(int n) {
        int totalPrime = 0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                totalPrime = totalPrime+1;
            }
        }
        int nonPrime = n- totalPrime;
        long fact = (factorial(totalPrime)*factorial(nonPrime))%mod;
        return (int)fact;
        
    }
    // to calculate factorial 
    
    private long factorial(int n){
        long res = 1;
        for(int i=2;i<=n;i++){
            res = (res*i)%mod;
        }
        return res;
    }
    
    // to calculate that it is a prime number or not
    private boolean isPrime(int n){
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