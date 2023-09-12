import java.util.Scanner;
class BMI {
public static void main(String[]args){
double weight, height;
Scanner s = new Scanner(System.in);
System.out.println("enter the weight");
weight=s.nextDouble();
System.out.println("enter the height");
height=s.nextDouble();
//BMI=weight(kg)/height(m*m);
// 1pound= 1/2.2046 kg
// 1inch=1/39.37m
 double BMI =((452)*(703.06)/ 5184);
System.out.println("Body mass index is :" + BMI + "kg/m*m  + in pound and inch");
}
}
