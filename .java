import java.util.Scanner;
 class Number1{
public static void main(String[]args){
int num1 ,num2,num3;

Scanner s = new Scanner(System.in);

System.out.println("Enter first num");  
  num1=s.nextInt();

System.out.println("Enter Second num");
   num2=s.nextInt();
   
 System.out.println("enter third num");
 num3 =s.nextInt();

if((num1>num2) && (num2>num3)&& (num1>num3) && !(num2>num1) && !(num3>num2)){
		System.out.println(" gratest num is:"+num1);
		System.out.println("middle num is :"+num2);
		System.out.println("smalest num is :"+ num3);
		
	}

else{
	    System.out.println(" gratest num is:"+num1);
		System.out.println("middle num is :"+num2);
		System.out.println("smalest num is :"+ num3);
}
}
}
	



 
 