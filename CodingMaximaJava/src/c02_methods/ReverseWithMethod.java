package c02_methods;

public class ReverseWithMethod {

	public static void main(String[] args) {

		int number = 1185;

		int reverse = reverseOfNumber(number);

		System.out.println("The reverse of " + number + " is = " + reverse);

	}

	public static int reverseOfNumber(int number) {

		int rev = 0, rem;

		while (number != 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		return rev;
	}
}
