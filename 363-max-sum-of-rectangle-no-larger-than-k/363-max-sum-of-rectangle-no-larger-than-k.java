class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxK = Integer.MIN_VALUE;
        for(int i = 0; i < cols; i++){
            int dp[] = new int[rows];
            for(int j = i; j < cols; j++){
                for(int l = 0; l < rows; l++){
                    dp[l] += matrix[l][j];
                }
                int currSum = maxSubArray(dp, k);
                maxK = Math.max(maxK, currSum);                 
                if(maxK == k)
                    return k;
            }
        }
        return maxK;
    }
    public int maxSubArray(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            Integer ceilValue = set.ceiling(currSum - k);
            if(ceilValue != null) {
                max = Math.max(max, currSum - ceilValue);
            }
            set.add(currSum);
        }
        return max;
    }
}