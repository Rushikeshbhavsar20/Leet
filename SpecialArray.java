/*
  The answer will lie from 0 to n. where n is the size of the array
  We loop from O to array.length for(int i:array) to see we get element <= current i.
  We sort the array and then we apply binary search on it so we can get first occurence of possible i.
  If element is not present we can get next highest and calculate element which is > i.
  If element count and i are equal then i is the ans as we get exactly i no greater than equal to i.
 */

import java.util.Arrays;

public class SpecialArray {
    public static int search(int[] arr,int target) {
        int start = 0; int end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if( (mid == 0 || arr[mid-1] < target ) && arr[mid] == target)return arr.length-mid;
            if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return arr.length-start;

    }





    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length; int i=0;
        while(i<=size){
            if(search(nums,i) == i)return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,3,2,4,2,4};
        System.out.println(specialArray(arr));
    }












}
