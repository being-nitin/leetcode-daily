package com.CrackForInternship;
import java.lang.reflect.Array;
import java.util.*;

public class _Kth_max_and_min_ {
    public static int kthSmall(int[] nums,int k){
        Arrays.sort(nums);
        return nums[k-1];
    }
    public static int kthLarge(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] nums = {9,4,1,6,5,7};
        System.out.println(kthSmall(nums,2)+" "+kthLarge(nums,2));
    }
}
