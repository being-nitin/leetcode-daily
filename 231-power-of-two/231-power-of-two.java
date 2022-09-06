class Solution {
    public boolean isPowerOfTwo(int n) {
        long x = n;
        if(x==0){
            return false;
        }
        return (x&(x-1))==0;
    }
}