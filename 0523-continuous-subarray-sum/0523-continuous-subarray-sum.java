class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        int currSum=0,prevSum=0;
        for(int n:nums){
            currSum+=n;
            if(set.contains(currSum%k))
                return true;
            currSum%=k;
            set.add(prevSum);
            prevSum = currSum;
        }
        return false;
    }
}