class Solution {
     public int[] shuffle(int[] nums, int n) {
        int cnt = 0;
        int[] ans = new int[2*n];
        for(int i=0; i< n;i++){
           ans[cnt] = nums[i];
           ans[cnt+1]=nums[i+n];
           cnt +=2;
        }
        return ans;  
    }
}