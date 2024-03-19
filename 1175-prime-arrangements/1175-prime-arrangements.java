class Solution {
    private static final int mod = 1000000007;
    public int numPrimeArrangements(int n) {
    int totalP = 0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                totalP = totalP+1;
            }
        }
        int nonP = n-totalP;
        long fact = (factorial(totalP)*factorial(nonP))%mod; 
        return (int)fact;
    }
    private long factorial(int a){
        long res = 1;
        for(int i=2;i<=a;i++){
            res = (res*i)%mod;
        }
        return res;
    }
    
    private boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
};