class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length < 4)return false;
        
        int sum = 0 ;
        for(int a:matchsticks)sum+=a;
        
        if(sum % 4 != 0)return false;
        
        int side[] = {sum/4 , sum/4 , sum/4 , sum/4}; // 2 2 2 2 
        
        Arrays.sort(matchsticks);
        
        return dfs(matchsticks , side , matchsticks.length - 1);
    
    }
    
    private boolean dfs(int[] match , int[] sides , int idx){
        
        if(idx == -1)return sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3];
        
        for(int i = 0 ; i < sides.length ; i++)
        {
            if(match[idx] <=sides[i])
            {
                sides[i]-=match[idx]; // 0 2 2 2 //0  0 2  2 // 0 0 0 2 // 0 0 0 0 
                if(dfs(match , sides , idx - 1))return true;
                sides[i]+=match[idx];
            }
        }return false;
    }
}