package com.company;
public class Maxsum{
        public static void main(String[] args) {
            int[] arr = {5,1,-2,-1,-1,8,1};
            int max_sum = arr[0];
            int c_sum = arr[0];

            for(int i=1;i<arr.length;i++){
                c_sum = Math.max(arr[i] + c_sum,arr[i]);
                max_sum = Math.max(c_sum,max_sum);
            }

            System.out.println(max_sum);
        }
}

