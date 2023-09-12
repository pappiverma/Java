 import java.util.Scanner;
 class Statement{
public static void main(String[]args){

Scanner s= new Scanner(System.in);
System.out.println("Enter the first num");

int a=s.nextInt();

System.out.println("Enter the second num");
int b=s.nextInt();

System.out.println("Enter the  third num");
int c =s.nextInt();

int gratest;
if (a>b && a>c && c>b){
					
System.out.println("tha gratest num :" +a);
System.out.println(" the middle num :" +c);

System.out.println(" the smalest  num :" +b);

 if(( b>c) && (b>a) && (a>c)){
System.out.println("tha gratest num :" +b);
System.out.println(" the middle num :" +a);
System.out.println(" the smalest  num :" +c);

 if( c>b && c>a && a>b){
System.out.println("tha gratest num :" +c);
System.out.println(" the middle num :" +a);
System.out.println(" the smalest  num :" +b);
 
 } else {
System.out.println("tha gratest num :" +a);
System.out.println(" the middle num :" +b);
System.out.println(" the smalest  num :" +c);
 
 }
 else {
	 System.out.println("tha gratest num :" +a);
System.out.println(" the middle num :" +b);
System.out.println(" the smalest  num :" +c);
 
 }

 	 
 }	 
 }
 }
 }

 


