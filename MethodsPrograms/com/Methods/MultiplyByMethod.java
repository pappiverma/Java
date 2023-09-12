package com.Methods;

import java.util.Scanner;

public class MultiplyByMethod {

    static int multiplycalculation(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
        int y =sc.nextInt();
        multiplycalculation(5,7);
System.out.println("multiply the two number:"+ x * y );
    }

}
