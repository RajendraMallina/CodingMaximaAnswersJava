package c04_strings;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s2 = sc.nextLine();
		String s1 = sc.next();
		
		String s = "hello";
		
		for(int i = 0; i < s.length(); i++) {
			
			
			System.out.println((int)s.charAt(i));
		}
	}
}
