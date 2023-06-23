package c00_Intro;

public class ArithmeticOperators {
	public static void main(String[] args) {	
		
		int a = 10, b = 20;
		double value1 = 22.85, value2 = 22.60;	
		//Additions
		int c = a + b;
		double value = value1 + value2;
		
		//Subtraction
		int d = b - a;
		double subValue = value1 - value2;	
		
		//Multiplication
		int e = a * b;
		double mulValue = value1 * value2;
		
		//Division
		int f = b / a;
		double divValue = value1 / value2;
		
		//Modulo Operation
		int remainder = b % a;
		int remainder2 = a % b;
		
		System.out.println("Integer Addtion is :- " + c + ", Double Addtion is :- " + value);		
		System.out.println("Integer Subtraction is :- " + d + ", Double Subtraction is :- " + subValue);
		System.out.println("Integer Multiplication is :- " + e + ", Double Multiplication is :- " + mulValue);	
		System.out.println("Integer Division is :- " + f + ", Double Division is :- " + divValue);	
		System.out.println("Remainders are  :- " + remainder + ",  " + remainder2);	
	}
}
