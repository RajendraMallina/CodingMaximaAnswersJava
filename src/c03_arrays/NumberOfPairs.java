package c03_arrays;

public class NumberOfPairs {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 20, 10, 10, 40 };
		boolean isPaired[] = new boolean[arr.length];
		int pairs = 0;

		for (int i = 0; i < arr.length; i++) {

			if (isPaired[i] == false) {
				
				for (int j = i + 1; j < arr.length; j++) {

					if(arr[i] == arr[j]) {
						isPaired[j] = true;
						pairs++;
						break;
					}	
				}
			}
		}
		System.out.println("the number of pairs are : " + pairs);
	}
}
