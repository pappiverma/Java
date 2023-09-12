package com.Methods;

import java.util.Scanner;

public class FactorialNum {
    static void  printfactorialnum( int n){

        if(n<0){
            System.out.println("Invalid num");

        }
       int     factorialnum=1;

        for(int i=1; i<=n;i++){
          factorialnum=factorialnum*i;

        }
        System.out.println(factorialnum);
return ;


    }
public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
printfactorialnum(n);
    




}

    }
    

