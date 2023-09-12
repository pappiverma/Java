 import java.util.Scanner;// Scanner package
class Markseet{ //  class Name
   public static void main(String[]args){ // main method


     int math,phy,chem, hindi, english; 
      Scanner p=new Scanner(System.in); // Scanner object package

   
     System.out.println("Enter your math number  ");
            math = p.nextInt();
      
     System.out.println("Enter your phy number  ");
              phy = p.nextInt();
       
     System.out.println("Enter your chem number  ");
             chem= p.nextInt();  
      
     System.out.println("Enter your hindi number  ");
        hindi = p.nextInt();
       
     System.out.println("Enter your english number "); 
          english = p.nextInt();// int type mathad

     int s= ( math+phy+chem+hindi+english); // total no in int type
        int per= (s/5);
System.out.println("your tatal Number");
     System.out.println(s);
     System.out.println("your total parsent ");
     System.out.println(per);
      
if (per> 80 ){// control statement
   

       System.out.println( "you got A grade");
   }
    else if (per>80 && per<60 ){

    System.out.println(" you got B grade");
     }
     else if  ( per>50 && per<45){
    
    System.out.println("you got  C grade" );

}
else if ( per> 45 && per< 25){
System.out.println(" you got D grade" );
}

else {
System.out.println("you got e grade" );

}
} 

}
