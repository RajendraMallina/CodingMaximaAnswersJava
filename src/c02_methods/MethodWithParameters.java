package c02_methods;

public class MethodWithParameters {

	public static void main(String[] args) {
		
		int value1 = 11, value2 = 85;
		
		//calling method with two parameters
		addNumbers(value1, value2);
		
		//calling method with one parameter
		printNumber(value1);		
	}

	public static void printNumber(int value1) {
		
		System.out.println("The received value is  " + value1);
		
	}

	public static void addNumbers(int value1, int value2) {
		
		System.out.println("The addtion of " + value1 + " and " + value2 + " is = " + (value1 + value2));
	}
}
