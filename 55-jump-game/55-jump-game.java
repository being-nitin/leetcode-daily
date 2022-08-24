class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        if(l==1){
            return true;
        }
        int max=0;
        for(int i=0;i<l-1 && max>=i;i++){
            if((i+nums[i])>max){
                max = i+nums[i];
            }
            if(max>=l-1){
                return true;
            }
        }
        return false;
        
    }
}