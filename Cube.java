import java.util.Scanner;
class Cube{
public static void main(String[]args){
System.out.println("Enter the cube Number");
int num,cube=1,cube1=1, cube2=1, cube3= 1;
Scanner sc= new Scanner(System.in);
num= sc.nextInt();

for(int i=1; i<=num; i++){
   cube = num*num*num;//	
 cube1 =1*1*1;// 1*1*1=1
  cube2 = 2*2*2;//8
  cube3 = 3*3*3;//27

}
System.out.println("  num is :num  cube number is: " + cube);//
System.out.println(" 1 num is  : 1 and cube number 1 is: " + cube1);//1
System.out.println(" 2 num is :2 and  cube number 2 is: " + cube2);//8
System.out.println(" 3  num is  :3  and number 3 is: " + cube3);//27


}
}
