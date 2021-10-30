
public class SmallestLettreGreaterthanTarget {
	
	public static void main(String[] args) {
		char[] arr = {'c','d','e','h','k','p','t'};
		char target = 'c'; char ans = SmallgreaterthanTarget(arr,target);
		System.out.print(ans);
	}
	
	
	public static char SmallgreaterthanTarget(char [] arr,char target) {
		int end  = arr.length-1; int start = 0;
		char P_ans = arr[0];
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(arr[mid] <= target) start = mid+1;
			if(arr[mid] > target) {P_ans = arr[mid];end = mid-1;}
			if(mid == arr.length-1) return P_ans;
		}
		
		return P_ans;
		
	}

}
