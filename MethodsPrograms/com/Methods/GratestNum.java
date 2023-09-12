package com.Methods;

import java.util.Scanner;

public class GratestNum {
    public static void main(String[] args) {
     GratestNum r=new GratestNum();
       r. gratestnum();
       
    }
    
     void gratestnum(){

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first num");
        int a=in.nextInt();
        System.out.println("Enter the second num");
        int b=in.nextInt();
        System.out.println("enter the third num");
        int c= in.nextInt();
        if (a>b&&a>c){
            System.out.println(" the gratest num:"+a);

        }
        else if (b>a&& b>c){

            System.out.println(" the gratest num:"+b);

        }
        else {
            System.out.println(" the gratest num:"+ c);
        }

    }
    
}
