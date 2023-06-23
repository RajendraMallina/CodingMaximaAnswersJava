package c04_strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		
		for(int i = str.length()-1 ; i >=0; i--) {
			
			rev += str.charAt(i);
		}

		if(rev.equals(str)) {
			System.out.println(str + " is a plindrome string");
		}else {
			System.out.println(str + " is not a plindrome string");
		}
	}
}
