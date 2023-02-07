package week1.day2;

public class PrintOddNumbers {

	public static void main(String[] args) {
		String value="";
		// Printing odd numbers using control flow statements
		for (int i=1; i<=20; i=i+1) {
			if (i%2==1) {
			 value += i+" ";
				
			
		}
			

	}
		System.out.println("The odd numbers are: "+value);
		
	}
	

}
//Methods and variable
//accessmodifier returntype methodname(args)
//accessmodifier - public, private, package -no modifier, protected