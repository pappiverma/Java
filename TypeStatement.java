 import java.util.Scanner;
 
 class TypeStatement{
public static void main(String[]args){
	
System.out.println("Enter the value of Quadratic eqution");
Scanner s = new Scanner(System.in);
System.out.println(": a ");

double a=s.nextDouble();

System.out.println(": b");
double b=s.nextDouble();
System.out.println(": c ");

double c=s.nextDouble();


 double d= b*b-4.0*a*c;// discriminant==d

if (d>0.0){
	double r1 = (-b+Math.pow(d,0.5))/(2.0*a);
	double r2 = (-b-Math.pow(d,0.5))/(2.0*a);
	
	System.out.println("Root all real and difrent");
		System.out.println("Root1: " +r1);
		System.out.println("Root2: " +r2);

}
	
else if (d==0.0){
	double root =-b/(2.0*a);
System.out.println("root all real and equal");
System.out.println("Root: " + root);
}

else {
System.out.println("The equation has no real roots");
}
	
}
}
