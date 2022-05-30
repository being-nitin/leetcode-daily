package com.CrackForInternship;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Optimised way to reverse an array:
	 */
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
