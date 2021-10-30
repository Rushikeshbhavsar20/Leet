package com.company;

public class UniqueIntegers {
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2 == 0){
            int no = -1; int no1 = 1;
            for(int i=0;i<n/2;i++){arr[i] = no;no += -1;}
            for(int i=n/2;i<n;i++){arr[i] = no1;no1++;}
        }else{
            int no = -1; int no1 = 1;
            for(int i=0;i<n-1/2;i++){arr[i] = no;no += -1;}
            arr[(n-1)/2] = 0;
            for(int i=((n-1)/2)+1;i<n;i++){arr[i] = no1;no1++;}
        }

        return arr;
    }

    public static void main(String[] args) {
         int[] arr =  sumZero(2);
         for (int elem : arr){
             System.out.print(elem+" ");
         }
    }
}
