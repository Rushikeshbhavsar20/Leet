        /*Approach
        *
        * If the right most element in matrix is >=0
        * that means element in that row are positive
        * because row are sorted in decreasing order 
        * for e.g [5,4,3,2,1] 1 is right most element
        * which is >= 0 so every element before it is
        * positive so we do row++ and delete whole row
        * 
        * 
        * If the right most element in matrix less than 0
        * that means element below it (in col) are negative
        * for e.g  [4,3,2,-1]
        *          [3,2,1,-1]
        *          [1,1,-1,-2]
        *         [-1,-1,-2,-3]
        *  right most element is -1  and as matrix columns are
        *  sorted in decreasing order, every element below
        *  it will be negative so we count all element below it
        *  including rightmost element itself and then we 
        *  decrease the column col--; 
        *
        *  
        *  At last we get the last row and then we apply 
        *  simple for loop and count negative no in that row;
        */
       
public class CountNegativeNosinMatrix {
       public static void main(String [] args) {
        
    	int arr[][] =
    		   {{1,-1},
    			{-1,-1}};

    	   int ans = solve(arr);
    	   System.out.print(ans);
       }
       
 
       public static int solve(int [][] arr) {
    	   int l =0 ; int r = arr[0].length-1;
    	   int s = 0; int e = arr.length-1;
    	   int cnt = 0;
    	   while(l<=r && s<e) {
    		   
    		   if(arr[s][r] < 0) {
    			   cnt += (e-s)+1;r--;
    			   continue;
    		   }
    		   
    		   
    		   if(arr[s][r] > 0) {
    			   s++;
    			   continue;
    		   }
    		   
    	   }
    	   
    	   for(int i=l;i<=r;i++) {
    		   if(arr[s][i] < 0) cnt++;
    	   }
    	   
    	   
    	   return cnt;
    	
       }
          
       /*
        * Time Complexity 
        * A while loop (O(n));
        * A for loop at last (O(m));
        * Total O(n+m) == O(n);
        * 
        * 
        */
       
         
       
}
