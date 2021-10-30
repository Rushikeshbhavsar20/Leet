package com.company;

public class FindMissingPositive {
    public static void main(String[] args) {
       int[] arr = {1,4,5,6,2}; int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == i+1 || nums[i] > nums.length || nums[i] <= 0  ){
                continue;
            }
            if(nums[nums[i]-1] != nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
                if(i != nums.length-1)i--;

            }

        }

        int ans = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                ans = i ; break;
            }
        }

        return ans+1;
    }









}
