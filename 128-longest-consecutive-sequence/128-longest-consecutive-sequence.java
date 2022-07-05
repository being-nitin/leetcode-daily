class Solution {
    public int longestConsecutive(int[] nums) {
        // we will use hash table in it , and for that we will use hashset.
        int res=0,curr=1;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                curr=1;
            while(set.contains(nums[i]+curr)){
                curr++;
            }
            res = Math.max(res,curr);
        }
        }
        return res;
    }
}