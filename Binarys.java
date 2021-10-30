/* 
Binary search algo
*/

public class Binarys {
    public static int bs(int [] nums,int target){
        int start=0; int end = nums.length;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid] > target){
                end = mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {-1,0,3,5,9,12};
        System.out.println(bs(arr,3));
    }
}
