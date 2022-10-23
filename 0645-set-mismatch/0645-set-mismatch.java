class Solution {
    public int[] findErrorNums(int[] nums) {
                int dup = 0, miss = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; ++i){
            if(set.contains(nums[i]))   dup = nums[i];
            set.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; ++i){
            if(set.contains(i) == false){
                miss = i;
                break;
            }
        }
        
        return new int[]{dup, miss};
    }
}