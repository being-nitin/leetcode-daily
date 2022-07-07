class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int min =1;
        for(int i=1;i<=(set.size()+1);i++){
            if(!set.contains(i)){
                min = i;
                break;
            }
        }
        return min;
        }
}