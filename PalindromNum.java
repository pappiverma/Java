import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        int no, rev=0; int rem;
        System.out.println("Enter the num");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        int temp=no;
       
        while(temp!=0){
          
       rem=temp%10;
       rev=rev*10+rem;
       temp=temp/10;
        }
if(no==rev){
    System.out.println(no+" is a  palindrom num");
}
else {
    System.out.println(no+" is not palindrom num");
}
    }
    
}
