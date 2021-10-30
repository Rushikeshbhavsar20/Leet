package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class luckyno {
    public static void main(String[] args) {
      int[][] arr=  {{3,7,8},{9,11,13},{15,16,17}};
        int col = 0;
        for(int p=0;p<arr.length;p++){
            int min = arr[p][0];
            for(int j=1;j<arr[p].length;j++){
                if(arr[p][j] < min){
                    min = arr[p][j];
                    col = j;
                }
            }
            int max = min; int flag = 1;
            for(int i=0;i<arr.length;i++){
                if(arr[i][col] > max)flag = 0;
            }
            if(flag == 1){
                System.out.println(max);
                break;
            }


        }


      }

}


