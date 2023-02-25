class Solution {
    public int maxProfit(int[] prices) {
 int minSofar=prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            minSofar = Math.min(minSofar,prices[i]);
            int profit = prices[i] - minSofar;
            maxProfit = Math.max(maxProfit,profit);
            }
        return maxProfit;
        }
}