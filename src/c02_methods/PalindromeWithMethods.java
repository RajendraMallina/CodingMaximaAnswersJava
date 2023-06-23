package c02_methods;

public class PalindromeWithMethods {

	public static void main(String[] args) {

		int number = 1185811;

		int reverse = reverseOfNumber(number);
		
		if(isPalindrome(number, reverse)) {
			System.out.println(number + " is a palindrome number.");
		}else {
			System.out.println(number + " is a palindrome number.");
		}
	}

	public static boolean isPalindrome(int number, int reverse) {
		return number == reverse;
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
