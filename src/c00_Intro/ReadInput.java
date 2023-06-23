package c00_Intro;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int a = sc.nextInt();
		
		System.out.println("Please enter decimal value");
		double d = sc.nextDouble();
		
		System.out.println("Please enter long number");
		long l = sc.nextLong();
		
		System.out.println("Please enter character");
		char c = sc.next().charAt(0);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(l);
		System.out.println(c);
	}
}
