import java.util.Scanner;// Scanner package
class LeapYear2{  // class name


public static void main(String[]args){  // main method 

System.out.println("Enter any year"); 
int year;  // local variable

Scanner s = new Scanner(System.in); // Scanner object
year = s.nextInt();  // input method 

 if ((year%4==0)&& !(year%100==0)||year%400==0){
	
	 System.out.println("leap year");
	 }else if (year%100==0){
		 	System.out.println("This is century year :"+year);
	 }
	 else {
		 System.out.println("This is not leap  year");
	 }
			 
	 

	
	 }
	 }
	 
 











