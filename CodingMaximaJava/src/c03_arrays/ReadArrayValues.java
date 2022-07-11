package c03_arrays;

import java.util.Scanner;

public class ReadArrayValues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Default values of array");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + ",  ");
		}
		
		System.out.println("\n\nEnter values into array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Printing the array.");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = " + arr[i] + ",  ");
		}
	}
}
