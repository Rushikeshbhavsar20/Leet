package com.company;

import java.util.Arrays;

public class TwoArraySum {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,18};
        int[] ans = twoSum(arr,11) ;
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] arr, int target) {
        int start = 0 ; int end = arr.length-1;
        int[] arrr = {-1,-1};
        while(start < end){
            if(arr[start] + arr[end] == target){
                arrr[0] = start+1 ; arrr[1] = end+1;
                break;
            }
            if(arr[start] + arr[end] > target) end--;
            if(arr[start] + arr[end] < target) start++;

        }

        return arrr;

    }
}
