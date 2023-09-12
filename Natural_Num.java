import java.util.Scanner;
class Natural_Num{
public static void main(String[]args){
int sum=0,total=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number for addition");
int num =sc.nextInt();
System.out.println("natural number is :"+"\n"+sum);//0
for(int i=1; i<=num; i++){//11
	sum=sum+1;
	System.out.println(sum); //1
	total=total+i;//1 , 3
//	System.out.println(total);//0
	
}
	System.out.println("total of natural number is :"+total);

}
}
