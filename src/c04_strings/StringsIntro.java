package c04_strings;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args) {
	
		String s = "coding maxima";
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			System.out.println("Character " + i + " = " + c);
		}
	}
}
