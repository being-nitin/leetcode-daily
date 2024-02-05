class Solution {
    public int singleNonDuplicate(int[] nums) {
          // Violation Process will give me my answer
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                low = mid+2;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
        
    }
}