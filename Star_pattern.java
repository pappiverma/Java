 import java.util.Scanner;
 class Star_pattern {
public static void main(String[]args){
	System.out.println(" Enter the star num"); 
int num;
Scanner sc= new Scanner(System.in);
num=sc.nextInt();
for(int i=1;i<=num;i++){ 
for (int j=1;j<=i;j++){
System.out.print("*");	
}
System.out.println();	
}	
}


}