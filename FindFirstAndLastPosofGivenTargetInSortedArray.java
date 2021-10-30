package com.company;

import java.util.Arrays;

public class FindFirstAndLastPosofGivenTargetInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int i = 0; int j = nums.length - 1;
        int pos1 = -1; int pos2 = -1; int flag = -1;
        while (i <= j) {
            if(pos1 != -1 && pos2 != -1){
                flag = 1 ; break;
            }
            if (nums[i] != target){
                i++;
            }else{
                pos1 = i;
            }
            if(nums[j] != target){
                j--;
            }else{
                pos2 = j;
            }

        }
        int[] ans = {-1,-1};
        if(flag != -1){
           ans[0] = pos1;
           ans[1] = pos2;
        }

     return ans;

    }







    public static void main(String[] args) {
        int[] nums = {5,9,7,9,9,10};
        int[] ans = searchRange(nums,8);
        System.out.println(Arrays.toString(ans));
    }
}
