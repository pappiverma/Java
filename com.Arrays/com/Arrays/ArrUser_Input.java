package com.Arrays;

import java.util.Scanner;

public class ArrUser_Input {
    public static void main(String[] args) {
        
       // int marks []= {40,60,67,66};
        Scanner s=new Scanner(System.in);
         int marks=s.nextInt();
        int  num  []=new int[marks] ;
        // input
        for(int i=0; i<marks; i++){
            num [i] =s.nextInt();

        }
        // output
        for(int i=0; i<marks; i++){
            System.out.println(num[i]);
        }

    }
     
}
 