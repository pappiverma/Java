 import java .util.Scanner;
 class Odd_natural_Num{
public static void main(String[]args){
	System.out.println("The term of odd number");
int  n  ;// number 
int sum=0;
int num=1;
Scanner sc= new Scanner(System.in);
n =sc.nextInt();
System.out.println("Odd number is :" +sum);//0

for(int i=1; i<=n; i++){

int  a=i%2;//1/2,2/2, 3/2.....
	if(i%2!=0){ // control statement																																																																																																																																																																																																																																																																																																																																																																																																					
	System.out.println(i);
	sum= sum+i;//1
	}
}
	
System.out.println("the addition of total odd num:" +sum);
}
 }