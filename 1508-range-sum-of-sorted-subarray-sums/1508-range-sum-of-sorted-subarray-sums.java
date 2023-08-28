class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sums = new int[n*(n+1)/2];
        int ind = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum+nums[j];
                sums[ind++] = sum;
            }
        }
        Arrays.sort(sums);
        int mod = (int)1e9+7;
        int ansSum = 0;
        for(int i=left-1;i<right;i++){
            ansSum = (ansSum+sums[i])%mod;
        }
        return ansSum%mod;
    }
}