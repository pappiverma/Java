import java.util.Scanner;

class Factorial_num {
    public static void main(String[] args) {
        System.out.println("Enter the factorial number");
        int num;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println("factorial no is: " + fact);
    }
}
