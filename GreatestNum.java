 import java.util.Scanner;
 class GreatestNum{
public static void main(String[]args){

int num3, num1,num2;
Scanner s = new Scanner(System.in);
System.out.println (" 1 st num");
num1 =s.nextInt();

System.out.println("2 nd num");
num2 =s.nextInt();

System.out.println("3 rd num ");
num3 =s.nextInt();
if(num1>num2){
	if(num2>num3){
	System.out.println( "the greatest num " +num1);	
System.out.println("3 rd  is  :" +  num3);
System.out.println("the 1 st num is : " + num1);
System.out.println(" the 2nd num is : " + num2);

}
}
if ( num2>num1){
	if(num2>num3){
	System.out.println(" the Gratest num: "  + num2);
	
	}
}
	if (num3>num1){
	if	(num3>num2){
		System.out.println("the greatest num" +num3);
			
	}
	}
}
}

	


	


