package com.Arrays;

public class Example_3DArray {
    public static void main(String[] args) {
        int [][][]  a ={{{90,60},{10,30, 70},{40,80 ,69,88}, {55,66,88}}};
       //int [][][] a= new  int [6][][]; 
      // System.out.println(a.length);//.length);
       for(int i=0; i<a.length; i++){
        for (int j=0; j<a[i].length;j++) {
            for ( int k = 0; k<a [i][j].length ; k++) {
                System.out.print(a[i][j][k]+" ");
                
            }
            System.out.println();
            
       }
    }

    }
}
