import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
       // System.out.println("The num is ");
        Scanner s = new Scanner(System.in);
    System.out.println("One to hundrend");

        int num = s.nextInt();
                

        for (int i = 1; i <= num; i++) {

            int t1 = i;// t1=155;
            int lenth = 0;
            while (t1 != 0) { // 155!=0;
                lenth = lenth + 1; // lenth =1;
                t1 = t1 / 10; // t1= 15; // t1=1;

            }

            int t2 = i;
            int rem; int arm = 0;
            while (t2 != 0) {
                rem = t2 % 10;
                int mul = 1;
                for (int j = 1; j <= lenth; j++) {
                    mul = mul * rem;

                }

                arm = arm + mul;
                t2 = t2 / 10;
            }
        
                if (i == arm) {
            
                    System.out.println("Num is a Armstrong "+i);

                }
            
        }
       // System.out.println("the number is");
        // else {
        // System.out.println("Num is not a Armstrong");

        // }

    }

}
