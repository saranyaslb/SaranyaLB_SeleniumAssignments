package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// Declaration
		int num1=0;
		int num2=1;
		int count=10;
		System.out.println("The Fiboinocci series of first 11 numbers are:");
		System.out.print(num1+" "+num2);
		for (int i=2;i<=count;i++) {
			int num3 = num1+num2;//sum of the two preceding numbers
			num1=num2;
			num2=num3;
			System.out.print(" "+num3);
		}
	}

}
