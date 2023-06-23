package c04_strings;

public class SwapFirstAndLastLetter {

	public static void main(String[] args) {
		
		String str = "coding";
		
		//add last character at first
		String temp = "" + str.charAt(str.length()-1);
		
		//repeat loop from second character to last but one character
		for(int i = 1; i < str.length()-1; i++) {
			temp += str.charAt(i);
		}
		
		//add first character at end
		temp += str.charAt(0);
		
		System.out.println(temp);
	}
}
