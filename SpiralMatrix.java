package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    public static  List<Integer> spiralOrder(int[][] matrix) {
        int top = 0; int bottom = matrix.length-1;
        int l = 0; int r = matrix[0].length-1;
        List<Integer> ans = new ArrayList<Integer>();
        int size = matrix.length*matrix[0].length;

        int dir = 0;
        while(l<=r && top <=bottom){
            if(dir == 0){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[top][i]);
                }
                top++;
                dir++;
            }else if(dir == 1){
                for(int i=top;i<=bottom;i++){
                    ans.add(matrix[i][r]);
                }
                r--;
                dir++;
            }else if(dir == 2){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
                dir++;
            }else if(dir == 3){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][l]);
                }
                l++; dir++;
                dir = dir%4;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int matr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       List<Integer> arr = spiralOrder(matr);
       for(int i=0;i<arr.size();i++){
           System.out.print(arr.get(i) + " ");
       }
    }

}
