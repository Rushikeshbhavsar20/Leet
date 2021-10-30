package com.company;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        boolean ans = isPerfectSquare(16);
    }
    public static boolean isPerfectSquare(int x) {
        long start = 0; long end  = x;

        while(start <= end){
            long mid = start + (end-start)/2;
            if(mid*mid == (long)x ) return true;
            if(mid*mid > x) end = mid-1;
            if(mid*mid < x) start = mid+1;
        }


        return false;



    }
}
