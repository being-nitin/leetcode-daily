class Solution {
    public int findPeakElement(int[] nums) {
     // Modified Binary Search
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        
    }
}