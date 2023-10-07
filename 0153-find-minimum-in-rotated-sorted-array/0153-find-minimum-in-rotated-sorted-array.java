class Solution {
        public int findMin(int[] nums) {
    int l = 0;
    int r = nums.length - 1;

    while (l < r) {
      final int m = (l + r) / 2;
      if (nums[m] < nums[r])
        r = m;
      else
        l = m + 1;
    }

    return nums[l];
  }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int low = 0;
        // int high = nums.length-1;
        // if(nums[low]<=nums[high]){
        //     return nums[0];
        // }
        // while(low<=high){
        //     int mid = low + (high-low)/2;
        //     if(nums[mid]>nums[mid+1]){
        //         return 
        //     }
        // }
    // }
}