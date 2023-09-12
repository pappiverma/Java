import java.util.Scanner;
class Alphabet{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
String a, b;
System.out.println("Enter the vovel");
 a= in.nextString();
 System.out.println("Enter the consonant");
 b =in.nextString(); 
if ( b>a){
	System.out.println(" The alphabet in consonant:" +b);
}

else {
	System.out.println(" The alphabet in vovel:" +a); 
}
}
}
