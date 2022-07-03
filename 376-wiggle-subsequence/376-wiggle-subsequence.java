class Solution {
    public int wiggleMaxLength(int[] nums) { 
        if(nums.length==1){
            return 1;
        }
    int prevSign = nums[1]-nums[0];
    int length = prevSign!=0?2:1;
        for(int i=2;i<nums.length;i++){
            int currSign = nums[i]-nums[i-1];
            if((prevSign<=0 && currSign>0) || (prevSign>=0 && currSign<0)){
                length++;
                prevSign = currSign;
            }
        }
        return length;
        }
}