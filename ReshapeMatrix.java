package com.company;

public class ReshapeMatrix {
    public static  int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length; int col = mat[0].length;
        if(row*col != r*c){
            return mat;
        }else{
            int[] arr = new int[r*c];
            int t = 0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    arr[t] = mat[i][j];
                    t++;
                }
            }
            int p=0;
            int[][] ans = new int[r][c];

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    ans[i][j] = arr[p];
                    p++;
                }
            }


            return ans;

        }

    }
    public static void main(String[] args) {
       int mat[][] = {
               {1,2,4,6},
               {3,4,3,8},
               {7,4,6,9},
       } ;
        int[][] ans = matrixReshape(mat,6,2);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
