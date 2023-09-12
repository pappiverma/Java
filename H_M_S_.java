import java.util.Scanner;
class H_M_S_{
int a,b,c;
public static void main(String[] args){
H_M_S_ d=new H_M_S_();
Scanner s= new Scanner(System.in);
System.out.println("Enter first number");

d.a  =s.nextInt();
System.out.println("Enter second number");

d.b   = s. nextInt();
System.out.println("Enter third number");
d.c = s.nextInt();

d.Greater();
d.Middle();
d.Smallest();
}

public void Greater(){
//int greater; 
if (a>b){
        if (a>c){
	System.out.println("Greater is : "+a);
				
		}
		 else {
			System.out.println("Greater is : "+c);
		 }
		
		}else {
	 if (b>c){
		 System.out.println("Greater is : "+b);
	 }
	 else{
		 System.out.println("Greater is : "+c);
 
	    }
		
		}
}
public  void Smallest(){
// smallest
if (a<b){
	      if (a<c){
      System.out.println("smallest is : "+a);
	   
		  }
		else{
       System.out.println("smallest is : "+c);
		}
}else { 
		  
       if(c<b){
          System.out.println("smallest is : "+c);
        }
	   else{
		  System.out.println("smallest is : "+b);
	   }

		}
	}
	  // Middle
 public  void Middle(){
if(a>=b && a<=c||a<=b && a>=c){
	System.out.println("middle is : "+a);
//return a;
}else if (b>=a && b<=c||b<=c && b>=a){
			System.out.println("middle is : "+b);
			//return b;

		}else{
			//return c;
			System.out.println("middle is : "+c);
			}
		
		
}

}

