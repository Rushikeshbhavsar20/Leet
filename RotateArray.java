package com.company;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
      if(nums.length > 1) {
          int i = 0;
          int j = nums.length - 1;
          while (i < j) {
              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
              i++;
              j--;
          }
          int p = 0;
          int q = k - 1;
          while (p < q) {
              int temp1 = nums[p];
              nums[p] = nums[q];
              nums[q] = temp1;
              p++;
              q--;
          }
          int r = k;
          int s = nums.length - 1;
          while (r < s) {
              int temp2 = nums[r];
              nums[r] = nums[s];
              nums[s] = temp2;
              r++;
              s--;
          }
      }
        System.out.print(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 3;
        rotate(arr,k);
    }
}
