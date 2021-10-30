package com.company;

public class SqrtofX {
    public static void main(String[] args) {
          int ans = mySqrt(234234);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        long start = 0; long end  = x;

        while(start < end){
            long mid = start + (end-start)/2;
            if(mid*mid == x) return (int)mid;
            if(mid*mid > x) end = mid-1;
            if(mid*mid < x) start = mid+1;
        }

        if(start*start > x) return (int)start-1;

        return (int)start;

    }
}
