package c03_arrays;

public class ReverseEachElementInArray {

	public static void main(String[] args) {
		
		int array[] = { 69, 45, 67 };
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = getReverseOfNumber(array[i]);
			System.out.print(array[i] + " ");
		}
	}

	public static int getReverseOfNumber(int number) {
		int reverse = 0;
		int rem = 0;
		while (number != 0) {
			rem = number % 10;
			reverse = (reverse * 10) + rem;
			number = number / 10;
		}
		return reverse;
	}
}
