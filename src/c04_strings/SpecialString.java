package c04_strings;

public class SpecialString {

	public static void main(String[] args) {
		
		String s = "cool";
		boolean flag = false;

		for (int i = 0; i < s.length() - 1; i++) {
			char first = s.charAt(i);
			char second = s.charAt(i + 1);
			if (isOwel(first) && isOwel(second)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(s + " : is a special string");
		} else {
			System.out.println(s + " : is not a special string");
		}
	}

	private static boolean isOwel(char letter) {

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			return true;
		} else {
			return false;
		}
	}
}
