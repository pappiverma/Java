import java.util.Scanner;
class Loop_Example{
public static void main(String[]args){
	System.out.println("Enter any natural number");
Scanner sc=new Scanner(System.in);
int sum=0 ,total=0; double average=0;	
 int num=sc.nextInt();
System.out.println("Addition any natural num:" +sum);//0
for(int i=1; i<=num; i++){
sum=sum+1;//1
total=sum+total;//1
 average=total/num;//1/1	
System.out.println( +sum);//2,3,....
}
System.out.println("total any natural num: " + total);//1+2+3..
System.out.println(" Average  any num:" + average);//	
}
}
