package c01_basicproblems;
import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :- ");
		int a = input.nextInt(); //int a = 10;
		System.out.println("Your Number is " + a);
		
		System.out.println("Enter a double value : -");
		double d = input.nextDouble();
		System.out.println("You entered " + d);
		
		System.out.println("Enter a long value");
		long l = input.nextLong();
		System.out.println("long value is " + l);
		
		System.out.println("Plese enter a single character");
		char ch = input.next().charAt(0);
		System.out.println("The character is " + ch);

	}

}
