package c03_arrays;

import java.util.Scanner;

public class ExcludeNumberWhileReadingArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int length = scanner.nextInt();
		int array[] = new int[length];

		System.out.println("Enter Array values : ");
		for (int i = 0; i < length; i++) {
			
			int input = scanner.nextInt();
			if (input != 22) {
				array[i] = input;
			} else {
				i = i - 1;
			}
		}

		System.out.println("Array values are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}
}

