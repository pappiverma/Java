/*
 
    *
   * *
  *   *
 *     *
*       *


 */
public class StarPattern8 {
    public static void main(String[] args) {
        // System.out.println("Enter the number");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");

            }
            System.out.print("*");
            // if (i == 3) {
            //     System.out.print(" ");
            // }
            // if (i == 4) {
            //     System.out.print("  ");
            // }
            // if (i == 5) {
            //     System.out.print("   ");
            // }

            for (int k = 3; k <= i*2-1; k++) {
                // System.out.print(" ");
                //if (i >= 2 && k <= i*2- 1) {
                    System.out.print(" ");

                }// else {
                    if(i!=1){
                        System.out.print("*");
                    }
                    
                    System.out.println();                }

                // for (int l=2; l<=i;l++){

                // System.out.print("*");

                // }
                // System.out.println(" ");
                // }

            }
            
        }

    