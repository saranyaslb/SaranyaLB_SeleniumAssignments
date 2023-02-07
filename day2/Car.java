package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car obj = new Car();
		int registrationNumber=obj.getRegistrationNumber();
		System.out.println("My Car Registration Number is :"+registrationNumber);
		
		String OwnerName=obj.getOwnerName();
		System.out.println("My name is :"+OwnerName);
		
		obj.carModel();
		
		boolean isPunctured=obj.isCarPunctured();
		System.out.println("Whether my car is punctured:"+isPunctured);
		
		int difference=obj.subtract(5, 7);
		System.out.println("Difference of two numbers: "+difference);
		
		int multiplication = obj.multiply(4, 3, 2);
		System.out.println("Multiplication of three numbers:"+multiplication);
		
		int division = obj.divide(20, 4);
		System.out.println("Division of two numbers:"+division);
				
	}
 
public int getRegistrationNumber() {
	int carRegistrationNumber = 4256;//
	return carRegistrationNumber;
}
private String getOwnerName() {
	//String ownerName = "Saranya";
	return "Saranya";
}
/**wrongString carModel() {
	String carModel ="Swift";
	return carModel;**/
void carModel() {
	System.out.println("Swift");
}
public boolean isCarPunctured() {
	boolean isCarPunctured=true;
	return isCarPunctured;
}
public int subtract(int num1, int num2) {
	return num1-num2;
}
public int multiply(int num1, int num2,int num3) {
	return num1*num2*num3;
}
public int divide(int num1, int num2) {
	return num1/num2;
}

}
