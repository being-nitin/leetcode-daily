class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int ans = nums[0];
        int minval = nums[0];
        int maxval = nums[0];
        int n = nums.size();
        
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                swap(maxval,minval);
            }
            maxval = max(nums[i],maxval*nums[i]);
            minval = min(nums[i],minval*nums[i]);
            ans = max(ans,maxval);
        }
        return ans;
        
    }
};