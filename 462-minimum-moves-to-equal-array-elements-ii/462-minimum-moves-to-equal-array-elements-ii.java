class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int operations=0,mid = nums[nums.length/2];
        for(int ele:nums){
            operations = operations+Math.abs(mid-ele);
        }
        return operations;
        }
}