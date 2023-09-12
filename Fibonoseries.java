import java.util.Scanner;

public class Fibonoseries {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        int a = 0;
        int b = 1;

        // System.out.println(a+b);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
         System.out.println(a);
        for (int i = 1; i <= num; i++) {
            
            int c = a + b;
            a = b;
            b = c;
        
            System.out.println(c);
        }

    }

}
