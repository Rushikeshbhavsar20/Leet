/*
Just small tweaks in binary search algorithm

 */

public class FindFirstandLastPositionofElementinSortedArray {
    public static int first(int[] nums, int target) {
        int start=0; int end=nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if((mid == 0 || nums[mid-1] != target) && nums[mid] == target)return mid;
            if(nums[mid] < target){
                start=mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }

    public static int last(int[] nums, int target) {
        int start=0; int end=nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if( (mid == nums.length-1 || nums[mid+1] != target) && nums[mid] == target)return mid;
            if(nums[mid] > target){
                end = mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first_pos = first(nums,target);
        int last_pos = last(nums,target);

        return new int[] {first_pos,last_pos};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,6,7,9};
        int[] ans = searchRange(arr,3);
        for(int i:ans) System.out.print(i+" ");

    }
}
