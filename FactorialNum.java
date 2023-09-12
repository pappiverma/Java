import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println("Any Factorial num");
        int fact = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial num" + fact);
    }
}
