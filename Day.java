import java.util.Scanner;
class Day{
public static void main(String[] args){
System.out.println("enter The weekday number");
int day ;
Scanner s= new Scanner(System.in);
day = s.nextInt();
switch (day){
	case 1: 
	System.out.println(" Monday ");
	break;
	case 2:
	System.out.println(" tuesday ");
	
	break;
	case 3:
	System.out.println(" wednsday ");
	break;
	case 4: 
	System.out.println(" thusday ");
	break;
	case 5:
	System.out.println(" friday ");
	break;
	case 6:
	System.out.println(" Saturday ");
	
	break;
	case 7:
	System.out.println(" sunday ");
	break;
	default:
	System.out.println( "this is not valid day");
}

 

}
}