package com.company;

public class FindPeakelement {
    public static void main(String[] args) {
       int arr[] = {1,2,3,2,1,0,-1,-2,-3,-4};
       Peakelement(arr);
    }
    public static void Peakelement(int[] arr){
        int start = 0; int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1])start = mid+1;
            if(arr[mid] > arr[mid+1])end=mid;
        }
        System.out.println(arr[end]);
    }






}
