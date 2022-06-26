class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int num:cardPoints){
            sum = sum+num;
        }
            int ans = 0,window = 0;
           int n = cardPoints.length;
            if(n==k){
                return sum;
            }
            for(int i=0;i<n-k-1;i++){
                window = window+cardPoints[i];
            }
            for(int i=n-k-1;i<n;i++){
                window +=cardPoints[i];
                ans = Math.max(ans,sum-window);
                window = window-cardPoints[i-(n-k-1)];
            }
         return ans;
        }
}