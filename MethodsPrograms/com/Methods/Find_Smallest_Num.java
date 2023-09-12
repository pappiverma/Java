package com.Methods;

import java.util.Scanner;

public class Find_Smallest_Num {
static void smallestnum(){
    System.out.println("Enter the num");
int num1, num2,num3;
        Scanner num=new Scanner(System.in);
       // Scanner in=new Scanner(System.in);
 System.out.println(" the firstnum");
        num1=num.nextInt();

        System.out.println("the second num");  
        num2=num.nextInt();

           System.out.println("the thirdnum");
           num3=num.nextInt();
           
if(num1<num2 && num1<num3 ){
    System.out.println( num1+" .is smallest");
}
    else if(num2<num1&& num2<num3){
        
        System.out.println(num2+":is smallest");
        }
    

else{
    System.out.println(num3 +" :is smallest");
}


        
    }


    public static void main(String[] args) {

        smallestnum();


    }

}
