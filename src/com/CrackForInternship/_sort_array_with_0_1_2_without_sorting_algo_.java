package com.CrackForInternship;
import java.lang.reflect.Array;
import java.util.*;

public class _sort_array_with_0_1_2_without_sorting_algo_ {
    public static void sort(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=i;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
