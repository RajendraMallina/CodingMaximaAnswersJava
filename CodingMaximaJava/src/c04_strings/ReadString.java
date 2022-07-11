package c04_strings;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence");
		//To read sentence - it will read string until user click on enter
		String str = sc.nextLine();
		
		System.out.println("Enter word");
		//To read word - it will read string until user enter space
		String str1 = sc.next();
		
		System.out.println("The Sentence is :- " + str);
		System.out.println("The Word is :- " + str1);
	}
}
