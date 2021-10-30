package com.company;

public class SetMatrixzero {

    public static void setZeroes(int[][] m) {
        int r = m.length; int c = m[0].length;
        boolean[] row = new boolean[r]; boolean[] col = new boolean[c];
        for(int i=0;i<r;i++)row[i] = false;
        for(int i=0;i<c;i++)col[i] = false;


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            if(m[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
            }
        }

        for(int i=0;i<row.length;i++){
            if(row[i] == true){
                for(int j=0;j<c;j++)m[i][j] = 0;
            }
        }
        for(int i=0;i<col.length;i++){
            if(col[i] == true){
                for(int j=0;j<r;j++)m[j][i] = 0;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }








    }



    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);

    }
}
