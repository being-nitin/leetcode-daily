class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();

	// Base case
	if(s3.length() != a+b) {
		return false;
	}
	if(s1.length() == 0) {
		return s2.equals(s3);
	} 
	if(s2.length() == 0) {
		return s1.equals(s3);
	}

	// dp[i][j] represents can we use i characters from s1 and j characters from s2 
	// to form the first i+j characters from s3
	boolean[][] dp = new boolean[a+1][b+1];

	// base case using 0 characters from both means yes. 
	dp[0][0] = true;

	for(int i = 1; i < a+1; i++) {
		dp[i][0] = dp[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1);
	}

	for(int i = 1; i < b+1; i++) {
		dp[0][i] = dp[0][i-1] && s2.charAt(i-1) == s3.charAt(i-1);
	}

	// the recursive relationship
	for(int i = 1; i < a+1; i++) {
		for(int j = 1; j < b+1; j++) {
			dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j-1)) 
					|| (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j-1));
		}
	}

	return dp[a][b];
}
}