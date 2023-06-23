package c04_strings;

import java.util.Scanner;

public class FindLetter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char key = sc.next().charAt(0);
		boolean found = false;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == key) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(key + " - present in the string - " + str);
		}else {
			System.out.println(key + " - not present in the string - " + str);
		}
	}
}
