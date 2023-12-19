class Solution {
    public boolean search(int[] nums, int target) {
    int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            while(low<mid && nums[low]==nums[mid]){
                low++;
            }
            while(high>mid && nums[high]==nums[mid]){
                high--;
            }
            if(nums[low]<=nums[mid]){
                if((target>=nums[low] && target<nums[mid])){
                    high = mid-1;
                }
                   else{
                       low = mid+1;
                   }
                   }
                   else{
                       if(target>nums[mid] && target<=nums[high]){
                           low = mid+1;
                       }
                       else{
                           high = mid-1;
                       }
                       
                   }
    }
                   return false;
    
    }
}