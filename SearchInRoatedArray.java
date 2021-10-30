package com.company;

public class SearchInRoatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 1};
        int target = 1;
        int answer = search(arr, target);
        System.out.println(answer);

    }

    public static int search(int[] arr, int target) {
        int ans = Pivotelement(arr);
        int s1 = 0,e1 = ans,s2=ans+1,e2=arr.length-1;int ans1= -1;
        while(s1 <= e1){
            int mid = s1+(e1-s1)/2;
            if(arr[mid] == target){
                ans1 = mid;
                break;
            }
            if(arr[mid] > target)e1 =mid-1;
            if(arr[mid] < target)s1= mid+1;
        }
        while(s2<=e2){
            int mid1 = s2 + (e2-s2)/2;
            if(arr[mid1] == target){
                ans1 = mid1;
                break;
            }
            if(arr[mid1] > target)e2 =mid1-1;
            if(arr[mid1] < target)s2= mid1+1;
        }

        return ans1;

    }

    public static int Pivotelement(int[] arr){
        int start = 0; int end = arr.length-1;
        while(start <= end){
           int mid = start + (end - start) / 2;
           if(mid < end && arr[mid] > arr[mid+1])return mid;
           if(mid > start && arr[mid] < arr[mid-1])return mid-1;
           if(arr[mid] > arr[0]){
               start = mid+1;
           }else{
               end = mid-1;
           }
        }
        return -1;
    }


}
