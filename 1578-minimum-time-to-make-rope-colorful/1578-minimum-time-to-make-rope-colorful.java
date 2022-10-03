class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] str = colors.toCharArray();
	  int n = str.length;        
	  int lastIdx=0;
	  int ans=0;
	  for(int i=1; i<n; i++)
	  {
		if(str[i]==str[lastIdx])
		{
		  if(neededTime[i]<neededTime[lastIdx])
		   {
			ans+=neededTime[i];
		   }
		else{
			 ans+=neededTime[lastIdx];
			 lastIdx=i;
		}
	 }
	  else{
		 lastIdx=i;
	   }
	  }
	 return ans;
	}
}