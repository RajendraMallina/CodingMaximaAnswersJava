package c04_strings;

public class DifferentCharCount {

	public static void main(String[] args) {

		String s = "@Coding1185!";
		int charCount = 0, numCount = 0, spCount = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if ((ch >= 97 && ch <= 127) || (ch >= 65 && ch <= 90)) {

				System.out.println(ch + " is Letters");
				charCount++;

			} else if (ch >= 47 && ch <= 57) {
				System.out.println(ch + " is Numbers");
				numCount++;
			}else {
				System.out.println(ch + " is Special Characters");
				spCount++;
			}
		}
		System.out.println("Count Of Letters in String is : " + charCount);
		System.out.println("Count Of Numbers in String is : " + numCount);
		System.out.println("Count Of Special Characters in String is : " + spCount);
	}
}
