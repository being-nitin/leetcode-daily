class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = binarySearch1(nums,target);
        result[1] = binarySearch2(nums,target);
        return result;
        }
    public static int binarySearch1(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                result = mid;
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return result;
        }
    public static int binarySearch2(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                result = mid;
                start = mid+1;
                }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            
        }
        return result;
    }
    }