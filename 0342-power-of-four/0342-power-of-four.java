class Solution {
    public boolean isPowerOfFour(int n) {
        if((n&(n-1))==0 && n%3==1){
            return true;
        }
        return false;  
    }
}