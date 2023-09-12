 import java.util.Scanner;
 
 class Inch{
	 
public static void main(String[]args){
	System.out.println("Enter any value convert to Inch");
	double inch ;
	Scanner s= new Scanner(System.in);
 double meter = 0.0254;

inch= s.nextDouble();
double M =meter*inch;
System.out.println(" inch to convert meter:"+M);
}
}