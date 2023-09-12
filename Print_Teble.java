import java.util.Scanner; 
class Print_Table{
public static void main(String[]args){
	System.out.println( "Enter the num you want to print table");

Scanner s= new Scanner(System.in);
 int num = s.nextInt(); 
for(int i=1; i<=10; i++){
System.out.println(num+"*" +i+ "="+num*i);
}
}
}