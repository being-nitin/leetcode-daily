class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int i=0,j=0,zeroc = 0,ans = INT_MIN,n=nums.size();
        while(j<n){
            if(nums[j]==0){
                zeroc++;
            }
            while(zeroc>k){
                if(nums[i]==0){
                    zeroc--;
                }
                i++;
            }
            ans = max(ans,j-i+1);
            j++;
            
            
            
        }
        return ans;  
    }
};