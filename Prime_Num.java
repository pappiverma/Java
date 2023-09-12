import java.util.Scanner;

public class Prime_Num {
   public static void main(String[] args) {
    System.out.println("Enter the prime num");
    int num; int temp=0;
    Scanner cs =new Scanner(System.in);
    num=cs.nextInt();


for(int i=2; i<=num-1;i++){
if(num%i==0){
 temp= temp +1;
}

}
if (temp>0){
    System.out.println("num is not prime" );
}  
  
    else 
  {                                                                                           
   System.out.println("num is prime"); 
}   
   }
}