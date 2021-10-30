
public class FindKthePositiveNo {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,7,8,12};
		System.out.print(findKthPositive(arr,2));		
	}
	/* Brute Force Approach*/
	public static int missing(int[] arr, int k) {
		int size = arr.length-1; 
		if(arr[0] > k) return k; 
		int m =arr[0]-1;int p_m = m;
		
		for(int i=1;i<=size;i++) {
			m += (arr[i]-arr[i-1])-1;
			if(k <= m) {
			return (k-p_m)+arr[i-1];
			}			
			p_m = m;
		}
		
		return (k-p_m)+arr[size];
		
	}
	/* optimized Soln */
    public static int findKthPositive(int[] arr, int k) {
		int start=0;
		
        int end=arr.length-1;
		
        while(start<=end){
		
            int mid=start+(end-start)/2;
			
            if(arr[mid]-mid-1<k)start=mid+1;
			
            else end=mid-1;
        
		}
		
        return k+start;
    }
     
	

}
