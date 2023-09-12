class String_method_example
{
public static void main(String[]args){
	System.out.println("Enter your name");
	// lower case method 
	String name = "Annu (Pagal)  ";
	 name =   name.toLowerCase();
	System.out.println(name);
	
	// Upper case method 
	name =name.toUpperCase();
	System.out.println(name);
	// replace method add  underscore 
	String Address = "  Adderss+ = khla gali ( pagl khane ke pas)   khategaon ";
    Address = Address.replace(" ", "_");
		System.out.println(Address);
		
		// replace method
		 
		String letter = "Dear < |name| >, Thanks a lot ";
	letter=  letter.replace (" < |name| >"," bharti ");	
	System.out.println(letter);	
		
   
   String Myletter= " Dear Bharti,\n\t shi is good program \n\t Thank !";
   System.out.println(Myletter);
}	
	
	
}
