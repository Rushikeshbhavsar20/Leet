/*
Approach :- Binary search

1.First we check ,if the element before and after middle element are different and if they are ,That means we got our answer.
2.If element (before or after) middle element is equal to middle element then we check how many elements are to the right and left of the middle element.
3.If element to right are even that means we will find our answer in left side and viceversa.
Then we repeat all the step again and again till start<=end.
 */









public class SingleElementinSortedarray {
    public static int BS(int[] nums) {
        int start=0; int end=nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])return nums[mid];
            if(mid >=0 && nums[mid] ==  nums[mid+1]){
                if((mid-1) % 2 == 0){
                    end = mid-1;
                }else{
                    start = mid+2;
                }

            }else if(mid>=0 && nums[mid] == nums[mid-1]){

                if( ((nums.length-1)-mid)%2 == 0 ){
                    end = mid-2;
                }else{
                    start=mid+1;
                }

            }

        }
        return -1;
    }

    public static int singleNonDuplicate(int[] nums) {
        return BS(nums);
    }

    public static void main(String[] args) {
        int arr[] = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicate(arr);
    }
}
