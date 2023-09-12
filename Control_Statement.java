 import java.util.Scanner;
 class Statement{
public static void main(String[]args){

Scanner s= new Scanner(System.in);
System.out.println("Enter the first num");

int a=s.nextInt();

System.out.println("Enter the second num");
int b=s.nextInt();

System.out.println("Enter the  third num");
int c =s.nextInt();

if (a>b){
if (a>c){
System.out.println("tha gratest num :" +a);
System.out.println("The gratest num :" +c);
}
}

else if (b>a&& b>c){
System.out.println(" the middle num :" +b);
}

else if (c>a && c>b ){
	System.out.println(" the smallest num :" +c);
}
else {
System.out.println("this  not found value");
}
}
}
