class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int a = 0, b=0, currSum = 0;
    int min = Integer.MAX_VALUE;
    for(b=0;b<nums.length;b++){
        currSum = currSum + nums[b];
        while(currSum>=target){
            min = Math.min(min,b-a+1);
            currSum = currSum-nums[a];
            a++;
        }
    }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}