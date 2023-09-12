 import java.util.Scanner;  // Scanner package
 class AbsoluteValue{

public static void main(String []args){   // main method

  int absolutevalue; // Identifier
  
  Scanner s =new Scanner(System.in);// Scanner object
  
  absolutevalue=s.nextInt(); // input method
  
if (absolutevalue<0){  //if (|-absolutevalue|==absolutevalue)
System.out.println("absolutevalue:"+(-1*absolutevalue));

}

else{
System.out.println("absolutevalue:"+absolutevalue);
}

}









}
