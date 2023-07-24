package c15_files;

public class InvalidNameExceptionExample {

	public static void main(String[] args) {

		String name = "Raj1endra@";

		try {
			for (int i = 0; i < name.length(); i++) {

				char ch = name.charAt(i);
				if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 123))) {

					throw new InvalidName("Special characters or numbers present in the name");

				}
			}
		} catch (InvalidName e) {
			System.out.println(e);
		}

	}

}
