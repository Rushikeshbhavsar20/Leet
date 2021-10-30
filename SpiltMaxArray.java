package com.company;

public class SpiltMaxArray {
    public static void main(String[] args) {
          int[] arr = {1,4,4};
          int ans = splitArray(arr,3);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int m) {
        int sum = 0; int maxx = nums[0];
        for(int i=0;i<nums.length;i++){
            maxx = Math.max(maxx,nums[i]);sum+=nums[i];
        }
        int start=maxx; int end = sum;
        while(start<end){
            int mid = start+(end-start)/2;
            int summ = 0; int part = 1;
            for(int i=0;i<nums.length;i++){
                summ+=nums[i];
                if(summ > mid){
                    i--;summ=0;part++;
                }

            }
            if(part <= m)end = mid;
            if(part > m)start = mid+1;

        }


        return end;

    }

}
