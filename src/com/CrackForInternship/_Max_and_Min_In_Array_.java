package com.CrackForInternship;

public class _Max_and_Min_In_Array_ {
    public static int max(int[] nums){
        int max=nums[0];
        for(int i=0;i< nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static int min(int[] nums){
        int min = nums[0];
        for(int i=0;i< nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,7,9,3,2};
        System.out.println(min(nums)+" "+max(nums));
    }

}
