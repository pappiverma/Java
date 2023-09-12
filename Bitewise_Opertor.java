   import java.util.Scanner;
   class Bitewise_Opertor{
	   	public static void main(String[] args){
			int num =12;
		int num1=25;
		int n=~num;
		int n2 = ~num1;
		//128 64 32 16 8 4 2 1 
		// 0 0 0 1 1 0 0 1
		// 1 1 1 0 0 1 1 0
		// 1 1 1 0 0 1 1 1 
		// -128+64+32+4+2+1
		// 103-128
		// -25 
		// 0 0 0 0 1 1 0 0
		// 1 1 1 1 0 0 1 1 
		// 1 1 1 1 0 0 1 1
		// 0 0 0 1 0 0 
		//-128+64+32+8+4+2+1
		// 111-128
		// 1 1 0 0 1  
		
		System.out.println(n);
		System.out.println(n2);
		
		}
		
   }
