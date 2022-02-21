package c04_strings;

public class VowelsConsonants {

	public static void main(String[] args) {

		String s = "coding maxima";
		int vCount = 0, cCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				vCount++;
				
			} else if(ch >= 97 && ch <= 127){
				
				cCount++;
			}
		}

		System.out.println("No of vowels in a string is " +  vCount);
		System.out.println("No of consonants in a string is " + cCount);
	}
}
