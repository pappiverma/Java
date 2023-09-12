 /*
 ******* 
  *****
   ***
    *

 */  
 
 public class StarPattern9 {
    public static void main(String[] args) {
    
        for(int i= 1; i<=7;i++){ 
            for (int j=1; j<=i; j++){
                System.out.print(" ");

            }
            for(int k=4; k>=i; k--){
                System.out.print("*");
            }
            for(int h=3;h>=i; h--){
          System.out.print("*");

            }
       System.out.println(" ");
        }

        
    }
    
}
