/*
The question is to find if arr[i]*2 is present in array
First we sort the array so we can use binary search
Then we loop through all the elements present in array to see if its double is also present in the array
If the element is negative then its double would be present at back of the ith position.
If the element is positive then its double would be present at front of the ith position.
 */






import java.util.Arrays;

public class CheckN {
    public static boolean bs(int[] arr,int target,int start,int end) {
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == target) return true;
            if(arr[mid] < target) start = mid+1;
            if(arr[mid] > target) end = mid-1;
        }
        return false;

    }

    public  static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] >=0 && i != arr.length){
                if( bs(arr,arr[i]*2,i+1,arr.length-1) == true) return true;
            }else if(arr[i] < 0 && i != 0){
                if( bs(arr,arr[i]*2,0,i-1) == true) return true;

            }

        }


        return false;


    }
    public static void main(String[] args) {
        int arr[] = {-766,259,203,601,896,-226,-844,168,126,-542,159,-833,950,-454,-253,824,-395,155,94,894,-766,-63,836,-433,-780,611,-907,695,-395,-975,256,373,-971,-813,-154,-765,691,812,617,-919,-616,-510,608,201,-138,-669,-764,-77,-658,394,-506,-675,523};
        Arrays.sort(arr);
        System.out.println(checkIfExist(arr));

    }


}
