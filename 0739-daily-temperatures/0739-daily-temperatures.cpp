class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        int len = temperatures.size();
        vector<int>ans(len,0);
        stack<int>stk{};
        
        for(int i=len-1;i>=0;i--){
            while(!stk.empty() && temperatures[stk.top()]<=temperatures[i])
                stk.pop();
            
            if(!stk.empty())
                ans[i] = stk.top()-i;
            
            stk.push(i);
               
        }
        return ans;
    }
};