package com.Methods;

import java.util.Scanner;

public class MiddleNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input String");

        String num=sc.nextLine();
        System.out.println(" the middle caracter in String:"+middle(num)+"\n");

    }   
       public  static  String middle(String num){
    int lenth;
    int position;
    if (num.length()%2==0){
        position=num.length() / 2-1;
        lenth=2;
    }
    else {
        position= num.length()-2;
        lenth=1;

    }
 return num.substring(position, position+lenth);
    }
    


    }
    



