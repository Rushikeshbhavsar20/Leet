package com.company;

public class JumpGame {
    public static  boolean canJump(int[] nums) {
        boolean ans = false;
        if(nums.length == 1){ans = true;return ans;}
        if(nums[0] == 0 )return ans;
        int j = nums.length-2;
        int jump = 1; int pos = nums.length-2;
        while( j >= 0){
            if(nums[j] >= jump && nums[j] != 0){
                pos = j;j--; jump = 1;
            }else{
                j--;jump++;
            }
        }
        if(pos <= 1 && pos>=0)ans = true;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        boolean ans =  canJump(arr);
        System.out.println(ans);
    }
}
