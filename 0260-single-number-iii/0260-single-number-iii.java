class Solution {
    public int[] singleNumber(int[] nums) {
        int xorTotal = 0;
       for(int num:nums){
           xorTotal = xorTotal^num;
       }
        int rightBit = xorTotal&(-xorTotal);//2's compliment;
        int[] res = new int[2];
        for(int num:nums){
            if((rightBit&num)==0){
                res[0] = res[0]^num;
            }
            else{
                res[1] = res[1]^num;
            }
        }
        return res;
    }
}