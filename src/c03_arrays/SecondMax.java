package c03_arrays;

public class SecondMax {
	public static void main(String[] args) {
		
		int arr[] = {1, 4, 2, 5, 7};
		int max = arr[0];
		int secondmax = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				secondmax = max;
				max = arr[i];
			}
		}
		System.out.println(secondmax);
	}
}
