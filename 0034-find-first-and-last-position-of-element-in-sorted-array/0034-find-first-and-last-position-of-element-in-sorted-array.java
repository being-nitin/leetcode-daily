class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        return new int[]{first(nums,target),second(nums,target)};
        
        
        
       
    }
    private static int first(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
                
            }
        }
        return ans;
    }
     private static int second(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                low = mid+1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
                
            }
        }
        return ans;
    }
    
}