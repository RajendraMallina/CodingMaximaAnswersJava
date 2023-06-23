package c03_arrays;

public class MaxNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 60, 22, 11, 85, 7 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Maximum value of arrays is : " + max);
	}
}