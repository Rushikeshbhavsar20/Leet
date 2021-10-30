public class ArrangeCoin {
   public static void main(String[] args){
	   int n = 57698; 
	   int ans = arrangeCoins(n); System.out.print(ans);
	   
   }
   public static int arrangeCoins(int n) {
   long start=1; long end =n;
       while(start <= end){
           long mid = start+(end-start)/2;
           long sum = (mid*(mid+1))/2;
           if(sum == n){
             return (int)mid;
           }
           if( sum < n){
               start = mid+1;
           }else{
              end = mid-1;
           }
           
       }
       
       return (int)end;
       
   }
   
   
   
   
   
}
