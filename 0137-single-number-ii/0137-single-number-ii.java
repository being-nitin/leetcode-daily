class Solution {
    public int singleNumber(int[] nums) {
        long ans = 0;
        int p =0;
        int setBits = 0;
        for(int i=0;i<32;i++){
            setBits = 0;
            for(int j=0;j<nums.length;j++){
                setBits = setBits+(nums[j]&1);
                nums[j] = nums[j]>>1;
            }
            setBits = setBits%3;
            ans = ans + (setBits)*(long)Math.pow(2,p);
            p++;
        }
        return (int)ans;
    }
}