import java.util.Scanner;// java scanner package 

    class Rectangle { // class name
  public static void main(String [] args){// main method
     System.out.println("Enter your  cheak rectangle "); 

 int length , breath; // Rectangle value 
Scanner s = new Scanner(System.in);// Scanner object 

length = s.nextInt();// input method 
breath = s.nextInt();
int  R = length *breath;// Square falmula = length * breath 
System.out.println("Rectangle is :"+R);



}



    }   