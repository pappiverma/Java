import java .util.Scanner;
class Type {
public static void main(String[]args){
System.out.println("Enter the floating point number");
float num;
Scanner s= new Scanner(System.in);
num=s.nextFloat();

if ( num>0){

System.out.println(" number is a positive  Small : " +num);

}

else if (num<1 && num<0){
System.out.println("number is a nagative small :" + num);

	
}
else if (num>1000000 ){
	System.out.println("num is a positive  large num :" +num);
}
else if (num>100000){
	System.out.println("num is a nagative  large num :" +num);
}
else {
	System.out.println("number is a Zero");
	
}
}
}

 





