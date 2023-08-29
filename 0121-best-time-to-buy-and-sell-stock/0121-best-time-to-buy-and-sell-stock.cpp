class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxP = 0;
        int minS = prices[0];
        for(int i=0;i<prices.size();i++){
            minS = min(minS,prices[i]);
            int p = prices[i]-minS;
            maxP = max(maxP,p);
        }
        return maxP;
    }
};