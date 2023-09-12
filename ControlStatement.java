import java.util.Scanner;

class ControlStatement{
public static void main(String[]args){
 System.out.println("Enter Any positive or nagative number");
  
  int positivenum;
   Scanner s = new Scanner(System.in);
   
   positivenum=s.nextInt();
   
   
 if(0<positivenum ) {
 
 System.out.println("positive number: " +positivenum);
 	
 }
 else if (positivenum<0){
	System.out.println("nagative number");

 }
 
 
 
 else{
	 

 	System.out.println("num is Zeero");
  
 }





}

}


