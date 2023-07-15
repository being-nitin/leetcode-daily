class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int dif=target-nums[i];
            if(map.containsKey(dif)){
                ans[0] = i;
                ans[1] = map.get(dif);
                return ans;
            }
            else{
                map.put(nums[i],i);
            }
        }
          return null;
    }
}
