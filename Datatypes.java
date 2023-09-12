import java.util.Scanner;

class DataTypes{
	public static void main(String []args){
		System.out.println("Convert to any Minite");
		int mintoyear;
		int min=60*24*365;
         
		int Min=3456789;
		Scanner input= new Scanner(System.in);
		mintoyear=input.nextInt();
		
		long year=mintoyear/min;
		int Day =  (mintoyear/24/60)%365;
		int Month=  (mintoyear/60/24);
	System.out.println("3456789 minutes is approximately  Year:" +year +" and  Day: "+ Day + " Month : "+  Month);                                                                                                                                                                                                                                                                                                                                                                                                  
	                                                                                                                                                                                                                                                                                                                                                                                                             
	

	} 
} 

