class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = binarySearch1(nums,target);
        res[1] = binarySearch2(nums,target);
        return res;
        
    }
    public static int binarySearch1(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return ans;
    }
    public static int binarySearch2(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return ans;
    }
}