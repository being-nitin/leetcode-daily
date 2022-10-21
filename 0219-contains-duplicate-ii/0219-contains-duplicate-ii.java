class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     if(k == 0)
         return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            if(i >= k)
                set.remove(nums[i-k]);
            set.add(nums[i]);
            
        }
        return false;
    }
}