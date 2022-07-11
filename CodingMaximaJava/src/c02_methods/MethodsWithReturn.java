package c02_methods;

import java.util.Scanner;

public class MethodsWithReturn {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int value = getIntegerData();
		System.out.println("Given Interger value = " + value);
		
		double dValue = getDoubleData();
		System.out.println("Given Double value = " + dValue);
		
		char ch = getCharacter();
		System.out.println("Given Character is = " + ch);
		
		boolean b = getBooleanData();
		System.out.println("Given Boolean value = " + b);
	}

	public static boolean getBooleanData() {
		
		System.out.println("please enter boolean value(true/false)");
		boolean input = sc.nextBoolean();
		return input;
	}

	public static char getCharacter() {
		System.out.println("please enter single character");
		char input = sc.next().charAt(0);
		return input;
	}

	public static double getDoubleData() {
		System.out.println("please enter double value");
		double input = sc.nextDouble();
		return input;
	}

	public static int getIntegerData() {
		System.out.println("please enter number");
		int input = sc.nextInt();
		return input;
	}

}
