package com.Methods;

import java.util.Scanner;

public class Sum_to_Digits {
    public static void main(String[] args) {
        System.out.println("Input num of sum");
        Scanner sc= new Scanner(System.in);
       // System.out.println(" 1st num");
        int digits =sc.nextInt();//
        //long rem=0;
        
        
      // Sum_to_Digits s= new Sum_to_Digits();
        // s.sumOfdigits(n);
System.out.println("The sum is " +sumOfDigits(digits));
    }
        public  static int sumOfDigits(long n){
         int rem=0;
        while(n>0){
              rem += n%10; 
             n/=10;
             //int sum=rem+div;
        }
        //System.out.println();
        //System.out.println(rem);
         return rem;
        }
      }
        
       // System.out.println("second num");
      //  int num2 =sc.nextInt();

        //int sum =num1+num2;
       // System.out.println(sum);
    
    













































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































