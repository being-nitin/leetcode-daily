class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int l = 0;
        int r = 0;
        for(int weight : weights){
            l = Math.max(weight, l);
            r += weight;
        }

        while(l < r){
            int mid = (l + r)/2;
            if(isValid(weights, days, mid))
                r = mid;
            else
                l = mid+1;
        }
        return r;
    }
    private boolean isValid(int[] weights, int days, int capacity){
        int currWeight = 0;
        int countDays = 0;

        for(int weight : weights){
            if(weight + currWeight > capacity){
                currWeight = 0;
                countDays++;
            }
            currWeight += weight;
        }
        return countDays < days;
    }
}