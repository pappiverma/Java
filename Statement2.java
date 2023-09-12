import java.util.Scanner;

class Statement2 {
public static void main(String[]args){
Scanner s= new Scanner(System.in);
System.out.println("Enter first number");

int a  =s.nextInt();
System.out.println("Enter second number");

int b   = s. nextInt();
System.out.println("Enter third number");

int c = s.nextInt();

 if(a>b && a>c){

System.out.println("a is gratest :");

if (b>c){
	System.out.println( " b is middle and c is smallest");
}
 }
 
else if (b>c){
    System.out.println(" b is gratest ");
}
	else{
		System.out.println( " a is middle and c is smallest");
	
	}
		
		if ( a>c){
			System.out.println(" a is middle and c is smallest");
			
		
		if(c>a){
			System.out.println(" c  is gratest  and a is smallest");
		}
		else {
			System.out.println(" c is gratest");
		}
	}
		else {
			System.out.println(" a is middle b is smallest");
		}
	
		}

	}

