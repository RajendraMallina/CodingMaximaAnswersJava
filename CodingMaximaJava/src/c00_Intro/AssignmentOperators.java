package c00_Intro;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int value = 10;
		
		value += 10; // is equal to value = value + 10 -> 10 + 10
		System.out.println("Value after addition assignment -> " + value);
		
		value -= 10; // is equal to value = value - 10 -> 20 - 10
		System.out.println("Vlaue after subtraction assignment -> " + value);
		
		value *= 10; // is equal to value = value * 10 -> 10 * 10
		System.out.println("Value after multiplication assignment -> " + value);
		
		value /= 10; // is equal to value = value / 10 -> 100 / 10
		System.out.println("Value after division assignment -> " + value);
		
		value %= 10; // is equal to value = value % 10 -> 10 % 10 //remainder is 0
		System.out.println("Value after modulo assignment -> " + value);
	}
}
