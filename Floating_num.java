import java.util.Scanner;
class Floating_num{
public static void main(String[]args){
float  a;
float b;

Scanner s= new Scanner(System.in);

System.out.println(" Input the floating value:");
a= s.nextFloat();
System.out.println("input the another floating value:");
b=s.nextFloat();

if (a==b||b==a){
	System.out.println("They are the same number in floating point");	
}
else {
System.out.println(" They are different num: ");
}
}
}


