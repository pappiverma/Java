import java.util.Scanner;
class Reverse_Num {
public static void main(String[] args){
int  num;
int reverse=0;
Scanner sc=new Scanner(System.in);
System.out.println("Number");
num =sc.nextInt();
int num1=num;//    variable changed in second varible 
 while (num1!=0){ // num1=1200  
 
	int remainder= num1%10;// 1200%10= 0 ( remainder)
	 reverse  =reverse*10+remainder;// rev = 0*10*0=0
	 num1=num1/10;// 1200/10=120 
 }
  System.out.println( "The input num is :" +num);		
    System.out.println( "num1 :" +num1);
  System.out.println( "The reverse num is  :" + reverse);
  
 
 	 	
}
}
