class Solution {
    int max=0;
    public int bestTeamScore(int[] scores, int[] ages) {
        int[][] arr = new int[scores.length][2];

        for(int i=0;i<scores.length;i++)
            arr[i]=new int[]{scores[i],ages[i]};
        //we sort by age and solve the tie by the score 
        Arrays.sort(arr,new java.util.Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    if(a[1]==b[1])
                        return Integer.compare(a[0],b[0]);
                    return Integer.compare(a[1], b[1]);
                        }
                });
        
        int[] dp = new int[scores.length];
        for(int i=scores.length-1;i>=0;i--)
            solve(i,arr,dp);
        return max;
    }

    public void solve(int i,int[][] arr,int[] dp)
    {
        
        int curr=arr[i][0];
        int score=curr;
        int currAge=arr[i][1];
        // we check all the following players 
        //if they are of the same age or 
        //have a higher score or equal score to our current score we add it 
        //to the score of this player and update the current total score if it is greater
        for(int j=i+1;j<dp.length;j++)
        {
            int tscore = arr[j][0];
            int age = arr[j][1];

            if(age==currAge || tscore>=curr)
                score = Math.max(score,curr+dp[j]);
        }
        dp[i]=score;
        
        max = Math.max(dp[i],max);
    }
}