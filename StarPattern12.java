 /*
        
      * 
       *
        *
         *
          *


  */
 
 public class StarPattern12 {
    public static void main(String[] args) {
    
        for(int i=1; i<=5; i++){
            for(int j=6; j>=i; j--){
          System.out.print(" ");
            }
           // System.out.print("*");
            for(int k=2; k<=(i*2);k++){
         //System.out.print("*"); 
          if(k<(i*2) && k>1){
          System.out.print(" ");
           }
           else{
            System.out.print("*");
           }

        } 
          //for(int l=2; l<=i; l++){


           // System.out.print("*");
          
           // System.out.print(" ");
        
          
         System.out.println(" ");
    }
} 
}
