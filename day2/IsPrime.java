package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// create a method and called out in the main function
		IsPrime obj = new IsPrime();
		String isPrimenumber=obj.isPrime(5);
		System.out.println(isPrimenumber);
	  }
	public String isPrime(int num) {
		if (num ==0 || num == 1) {
			return(num+" is either a prime or composite number");
		}
	    boolean isPrime = false;
	    for (int i = 2; i <= num-1; i++) {
	      
	      if (num % i == 0) {
	        isPrime = true;
	        break;
	      }
	    }

	    if (!isPrime)
	      return (num+" is a prime number");
	    else
	      return (num+" is a not prime number");
	}
}


