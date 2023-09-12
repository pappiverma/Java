package com.Methods;

import java.util.Scanner;

public class AverageNum {
      public static int averagenum (int a, int b,int b1){


        if(a>=b && a<=b1|| a<=b&& a>=b1 ){
            return a;
        }
          else  if (b<=b1 && b>=a|| b>=b1 &&b<=a ){
            return b;
          }
            else {
                return b1;
            }
     
          }
    public static void main(String[] args) {
 System.out.println(" Enter the number");

        Scanner c= new Scanner(System.in);
        System.out.println("1 st num");
        int a=c.nextInt();
        System.out.println("2nd num");
        int b=c.nextInt();
        System.out.println("3 rd num");
        int b1=c.nextInt();
         int midd=averagenum(a,b,b1);
        

System.out.println(" the average num is:" + midd);
    }
   


        }
    

        
        
                
            

            

        

    



    
    

