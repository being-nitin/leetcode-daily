class Solution {
    public int countOdds(int low, int high) {
     int noOfOdds = (high-low)/2;
        
        if((low%2)!=0 || (high%2)!=0){
            noOfOdds++;
        }
        return noOfOdds;
    }
} 