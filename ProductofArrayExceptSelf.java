package com.company;

import java.util.Arrays;

public class ProductofArrayExceptSelf {


    public static int[] productExceptSelf(int[] n) {
      int[] ans = new int[n.length];
      ans[0] = 1;
      for(int i=1;i< ans.length;i++){
          ans[i] = ans[i-1]*n[i-1];
      }
      int right = 1;
      for(int i=ans.length-1;i>=0;i--){
          ans[i] *= right;
          right *= n[i];
      }
      return ans;
    }







    public static void main(String[] args) {
      int[] nums ={1,2,3,4};
      int[] anss = productExceptSelf(nums);

      System.out.println(Arrays.toString(anss));

    }
}
