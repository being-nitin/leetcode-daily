class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,"",0,0,n);
        return ans;
    }
    public void backtrack(List<String> ans,String curr,int open,int close,int max){
        if(curr.length()==max*2){
            ans.add(curr);
            return;
        }
        if(open<max){
            backtrack(ans,curr+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(ans,curr+")",open,close+1,max);
        }
    }
}